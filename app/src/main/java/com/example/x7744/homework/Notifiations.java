package com.example.x7744.homework;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notifiations extends AppCompatActivity {

    private View.OnClickListener btn_Notification_Click=new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        @Override
        public void onClick(View v) {
            Notification not=new Notification.Builder(Notifiations.this)
                    .setSmallIcon(android.R.drawable.stat_sys_warning)
                    .setContentTitle("Notification")
                    .setContentText("這是Notification")
                    .build();
            NotificationManager mana=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
            mana.notify(1,not);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        initialComponent();
    }

    private void initialComponent() {
        btn_Notification=(Button) findViewById(R.id.btnNot);
        btn_Notification.setOnClickListener(btn_Notification_Click);
    }
    Button btn_Notification;
}
