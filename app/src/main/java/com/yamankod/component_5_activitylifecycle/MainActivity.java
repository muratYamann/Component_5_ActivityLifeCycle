package com.yamankod.component_5_activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity {
    private Button button;
    private TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView1);
        String msg = "Instructions: \n "
                + "0. New instance (onCreate, onStart, onResume) \n "
                + "1. Back Arrow (onPause, onStop, onDestroy) \n "
                + "2. Finish (onPause, onStop, onDestroy) \n "
                + "3. Home (onPause, onStop) \n ";
        textView.setText(msg);
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Toast.makeText(getApplicationContext(), "onCreate", 1).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", 1).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", 1).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", 1).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", 1).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", 1).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", 1).show();
    }
}
