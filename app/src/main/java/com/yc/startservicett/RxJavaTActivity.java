package com.yc.startservicett;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;

public class RxJavaTActivity extends AppCompatActivity {

    private String tag = "bitch";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_java_t2);
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onNext(String s) {
                Log.d("bitch", "Item: " + s);
            }

            @Override
            public void onCompleted() {
                Log.d("bitch", "Completed!");
            }

            @Override
            public void onError(Throwable e) {
                Log.d("bitch", "Error!");
            }
        };
        Observable observable = Observable.just("Hello", "Hi", "Aloha","ycc",new Intent());
        observable.subscribe(observer);
    }
}
