package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/**
 * 作者： hiram on 2017/3/24
 */

public class HelloObservable {
    // Populate beer collection
    static List<Beer> loadCellar(){
        List<Beer> beerStock = new ArrayList<>();

        beerStock.add(new Beer("Obolon", "Ukraine", 4.00f));
        beerStock.add(new Beer("Stella", "Belgium", 7.75f));
        beerStock.add(new Beer("Sam Adams", "USA", 7.00f));
        beerStock.add(new Beer("Bud Light", "USA", 5.00f));
        beerStock.add(new Beer("Yuengling", "USA", 5.50f));
        beerStock.add(new Beer("Leffe Blonde", "Belgium", 8.75f));
        beerStock.add(new Beer("Chimay Blue", "Belgium", 10.00f));
        beerStock.add(new Beer("Brooklyn Lager", "USA", 8.25f));

        return beerStock;
    }
    private static long start = System.currentTimeMillis();
    public static Boolean isSlowTickTime() {
        return (System.currentTimeMillis() - start) % 60000 >= 30000;
    }
    public static void main(String[] args) {

//        List<Beer> beers = loadCellar();  // populate the beer collection
//
//        Observable<Beer> observableBeer =
//                Observable.fromIterable(beers);   // Create Observable from a List
//
//        observableBeer.subscribe(
//                aaaa -> System.out.println(aaaa)    // onNext handler
//        );

//        Observable.range(1, 5).subscribe(System.out::println);
        List<String> words = Arrays.asList(
                "the",
                "quick",
                "brown",
                "fox",
                "jumped",
                "over",
                "the",
                "lazy",
                "dogs"
        );
//        Observable.fromIterable(words)
//                .zipWith(Observable.range(10, 5),
//                        (string, count)->String.format("%2d. %s", count, string))
//                .subscribe(System.out::println);


//        Observable.fromIterable(words)
//                .flatMap(word -> Observable.fromArray(word.split("")))
//                .distinct()
//                .sorted()
//                .zipWith(Observable.range(1, Integer.MAX_VALUE),
//                        (string, count) -> String.format("%2d. %s", count, string))
//
//                .subscribe(System.out::println);

       /* Observable<Long> fast = Observable.interval(1, TimeUnit.SECONDS);
        Observable<Long> slow = Observable.interval(3, TimeUnit.SECONDS);
        Observable<Long> clock = Observable.merge(
                slow.filter(tick-> isSlowTickTime()),
                fast.filter(tick-> !isSlowTickTime())
        );
        clock.subscribe(tick-> System.out.println(new Date()));
        try {
            Thread.sleep(60_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

//        Observable<Integer> observable=Observable.create(new ObservableOnSubscribe<Integer>() {
//
//            @Override
//            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
//                e.onNext(1);
//                e.onNext(2);
//                e.onComplete();
//            }
//        });
//        Disposable disposable = observable.subscribe(new Consumer<Integer>() {//onNext
//            @Override
//            public void accept(@NonNull Integer integer) throws Exception {
//
//            }
//        }, new Consumer<Throwable>() {//onError
//            @Override
//            public void accept(@NonNull Throwable throwable) throws Exception {
//
//            }
//        }, new Action() {//onComplete
//            @Override
//            public void run() throws Exception {
//
//            }
//        });
//        disposable.dispose();
    }



}
