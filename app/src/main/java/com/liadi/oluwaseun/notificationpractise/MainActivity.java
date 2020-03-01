package com.liadi.oluwaseun.notificationpractise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mSendNotification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSendNotification = findViewById(R.id.send_notification);
        mSendNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PractiseNotification.notify(MainActivity.this,"Practise notification");
                finish();
            }
        });
    }
}
