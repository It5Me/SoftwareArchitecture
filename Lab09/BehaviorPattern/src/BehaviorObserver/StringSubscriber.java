package BehaviorObserver;

import java.util.concurrent.Flow;

public abstract class StringSubscriber implements Flow.Subscriber<String>{


    protected Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(String item) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}