package com.example.x7744.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Toasts extends AppCompatActivity {

    private View.OnClickListener btn_Toast_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast toa=Toast.makeText(Toasts.this,"Toast",Toast.LENGTH_SHORT);
            toa.show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        initialComponent();
    }

    private void initialComponent() {
        btn_Toast=(Button)findViewById(R.id.btnToastPop);
        btn_Toast.setOnClickListener(btn_Toast_Click);
    }
    Button btn_Toast;
}
