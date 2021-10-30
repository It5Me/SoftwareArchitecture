package BehaviorObserver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.concurrent.Flow;

public  class SymbolSubscriber extends StringSubscriber {



    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription=subscription;
        ((StringSubscription) subscription).addSubscriber(this);
    }

    @Override
    public void onNext(String item) {
        if (item.matches("(.*)[[^A-Za-z0-9]&&[^\n\t\s]](.*)")) {
            try {
                Path path = Paths.get(System.getProperty("user.dir"),"src","BehaviorObserver","Symbol.txt");
                File file  = new File(path.toString());
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                FileWriter fileWriter = new FileWriter(file, true);

                fileWriter.write(timestamp.toString() + " : " + item + "\n");

                fileWriter.flush();
                fileWriter.close();

                fileWriter = null;
                timestamp = null;
            } catch (IOException err) {
                err.printStackTrace();
            }
        }

    }

}