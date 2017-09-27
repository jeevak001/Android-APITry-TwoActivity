package com.jeevscode.jeeva.twoactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    private static final String EXTRA_THIRD_SEND_BACK = "com.jeevscode.jeeva.twoactivity.third_send_back";
    private TextView third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        third = (TextView) findViewById(R.id.third);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent();
                intent.putExtra(EXTRA_THIRD_SEND_BACK,"This is from Third Activity");
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}
