package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {
    public BookMetadataFormatter formatter;
    {
        try{
            formatter = initFormatter();
        }catch (ParserConfigurationException | IOException e){
            e.printStackTrace();
        }
    }

    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see fit.
        stream.println(formatter.getMetadataString());
    }
    public abstract BookMetadataFormatter initFormatter() throws ParserConfigurationException, IOException;
}
