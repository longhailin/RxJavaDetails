package com.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 作者： hiram on 2017/3/24
 */

public class BeerClient {
    public static void main(String[] args) {
//        Observable被观察者   Observer 观察者
        Observable<Beer> beerData = BeerServer.getData(); // No streaming just yet

        Observer beerObserver = new Observer<Beer>() {

            public void onSubscribe(Disposable d) {
                System.out.println( " !!! Someone just subscribed to the bear stream!!! ");

                // If the subscriber is less than 21 year old, cancel subscription
                // d.dispose();
            }

            public void onNext(Beer beer) {
                System.out.println("onNext===="+beer);
            }

            public void onError(Throwable throwable) {
                System.err.println("In Observer.onError(): " + throwable.getMessage());
            }

            public void onComplete() {
                System.out.println("*** The stream is over ***");
            }
        };
        //调用后会执行观察者的onSubscribe回调
        beerData
                .subscribe(beerObserver);       // Streaming starts here
    }
}
