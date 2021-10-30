package BehaviorObserver;

import java.util.concurrent.Flow;

public class StringPublisher implements Flow.Publisher<String>{

    private StringSubscription subscription;
    StringPublisher(){
        subscription= new StringSubscription();
    }
    @Override
    public void subscribe(Flow.Subscriber<? super String> subscriber) {
        subscriber.onSubscribe(subscription);
    }
    public void publish (String input){
        for(StringSubscriber subscriber : subscription.getSubscribers()){
            subscriber.onNext(input);
        }
    }
}