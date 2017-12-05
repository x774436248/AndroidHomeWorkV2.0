package com.example.x7744.homework;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Progress extends AppCompatActivity {

    private View.OnClickListener btn_Progress_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ProgressDialog pro=new ProgressDialog(Progress.this);
            pro.setTitle(".STYLE_SPINNER");
            pro.setMax(100);
            pro.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            pro.incrementProgressBy(50);
            pro.show();
        }
    };
    private View.OnClickListener btn_Progress2_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ProgressDialog pro=new ProgressDialog(Progress.this);
            pro.setTitle(".STYLE_HORIZONTAL");
            pro.setMax(100);
            pro.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            pro.incrementProgressBy(50);
            pro.show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        initialComponent();
    }

    private void initialComponent() {
        btn_Progress=(Button)findViewById(R.id.btnProgress);
        btn_Progress.setOnClickListener(btn_Progress_Click);
        btn_Progress2=(Button)findViewById(R.id.btnProgress2);
        btn_Progress2.setOnClickListener(btn_Progress2_Click);
    }
    Button btn_Progress;
    Button btn_Progress2;
}
