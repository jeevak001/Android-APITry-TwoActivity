package com.jeevscode.jeeva.twoactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView main;
    private TextView third;
    private String dataFromThird;
    private static final String EXTRA_SHARE_WORLD = "com.jeevscode.jeeva.share_world";
    private static final String EXTRA_THIRD_SEND_BACK = "com.jeevscode.jeeva.twoactivity.third_send_back";
    private static final int REQUEST_THIRD_ACTIVITY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = (TextView) findViewById(R.id.main);
        third = (TextView) findViewById(R.id.main_to_third);
        main.setText(R.string.activity_main);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra(EXTRA_SHARE_WORLD , "The world may never know !");
                startActivity(intent);
            }
        });


        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
                startActivityForResult(intent,0);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {


        if (resultCode != Activity.RESULT_OK){
            return;
        }

        if(requestCode == 0){

            Toast.makeText(MainActivity.this,"Inside OnActivity for THIRD" , Toast.LENGTH_SHORT).show();

            if(data == null){
                return;
            }
            dataFromThird = data.getStringExtra(EXTRA_THIRD_SEND_BACK);
            third.setText(dataFromThird);

        }
    }
}
