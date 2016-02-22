package com.yc.startservicett;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =new Button(MainActivity.this);
        button.setText("click");
        setContentView(button);
        String ff = "dd";
        intent = new Intent(MainActivity.this,ServiceToSeeLifCyc.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // startService(intent);
                new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        MainActivity.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                button.setText("yccccccccccccccc");
                            }
                        });
                    }
                }.start();
            }
        });
    }
}
