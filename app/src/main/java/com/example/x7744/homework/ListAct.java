package com.example.x7744.homework;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListAct extends Activity {
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(null!=data)
            wordFromList.setText(data.getExtras().getString(KEY_TOTAL.LIST_CHOSEN));
        else
            wordFromList.setText("未選擇");
    }

    private View.OnClickListener toList_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intnt=new Intent(ListAct.this,List.class);
            startActivityForResult(intnt,KEY_TOTAL.INTENT_TO_LISTACT);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initialComponent();
    }


    private void initialComponent() {
        wordFromList=(TextView)findViewById(R.id.txt_wordFromList);
        toList=(Button)findViewById(R.id.btn_toList);
        toList.setOnClickListener(toList_Click);
    }
    TextView wordFromList;
    Button toList;
}
