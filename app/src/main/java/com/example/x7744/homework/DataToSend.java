package com.example.x7744.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DataToSend extends AppCompatActivity {

    private View.OnClickListener btn_send_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Intent intent=new Intent();
        Bundle bd_back=new Bundle();
        bd_back.putString(KEY_TOTAL.KEY_OF_VIEW2_TO_VIEW1,wordToSendBack.getText().toString());
        intent.putExtras(bd_back);
        setResult(0,intent);
        finish();
    }
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_to_send);
        initialCompobebt();
    }

    private void initialCompobebt() {
        wordFromView1=(TextView)findViewById(R.id.txt_wordFromView1);
        wordToSendBack=(EditText) findViewById(R.id.etxt_wordsToSendBack);
        send=(Button)findViewById(R.id.btn_send);
        send.setOnClickListener(btn_send_Click);

        Intent intent=this.getIntent();
        wordFromView1.setText(intent.getExtras().get(KEY_TOTAL.KEY_OF_VIEW1_TO_VIEW2).toString());
    }
    TextView wordFromView1;
    EditText wordToSendBack;
    Button send;
}
