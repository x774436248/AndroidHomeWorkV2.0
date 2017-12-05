package com.example.x7744.homework;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;

public class SharePre extends AppCompatActivity {
    int count=0;
    private View.OnClickListener btn_Save_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SharedPreferences table=getSharedPreferences("t1",0);
            SharedPreferences.Editor ed=table.edit();
            ed.putString(String.valueOf(count),edt_wordToSave.getText().toString()).commit();
            Toast.makeText(SharePre.this,"Success",Toast.LENGTH_SHORT).show();
            count++;
        }
    };
    private View.OnClickListener btn_Load_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txt_lordWord.setText("");
            SharedPreferences table=getSharedPreferences("t1",0);
            for(int be=0;be<count;be++){
                txt_lordWord.append(table.getString(String.valueOf(be),"NODATA")+"\n");
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_pre);
        initialComponent();
    }

    private void initialComponent() {
        edt_wordToSave=(EditText)findViewById(R.id.edt_wordToSave);
        btn_Save=(Button)findViewById(R.id.btn_save);
        btn_Load=(Button)findViewById(R.id.btn_load);
        txt_lordWord=(TextView) findViewById(R.id.txt_lordWord);

        btn_Save.setOnClickListener(btn_Save_Click);
        btn_Load.setOnClickListener(btn_Load_Click);
    }
    EditText edt_wordToSave;
    Button btn_Save;
    Button btn_Load;
    TextView txt_lordWord;
}
