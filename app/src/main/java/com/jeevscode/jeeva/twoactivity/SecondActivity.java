package com.jeevscode.jeeva.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Intent receivedIntent;
    private TextView secondTextView;
    private static final String EXTRA_SHARE_WORLD = "com.jeevscode.jeeva.share_world";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receivedIntent = getIntent();
        secondTextView = (TextView) findViewById(R.id.second);
        secondTextView.setText(receivedIntent.getStringExtra(EXTRA_SHARE_WORLD));






    }
}
