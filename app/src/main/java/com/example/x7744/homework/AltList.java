package com.example.x7744.homework;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class AltList extends AppCompatActivity {
    String[] popList = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十"};

    private DialogInterface.OnClickListener list_Chosen = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            chosen.setText(popList[which]);
        }
    };
    private View.OnClickListener btn_pop_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            android.app.AlertDialog.Builder l_builder = new android.app.AlertDialog.Builder(AltList.this);
            l_builder.setTitle(".setTitle");
            //l_builder.setMessage(".setMessage");
            l_builder.setItems(popList, list_Chosen);
            Dialog dialog = l_builder.create();
            dialog.show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alt_list);
        initialComponent();
    }

    private void initialComponent() {
        pop=(Button)findViewById(R.id.btn_pop);
        chosen=(TextView)findViewById(R.id.txt_chosen);
        pop.setOnClickListener(btn_pop_Click);
    }
    Button pop;
    TextView chosen;
}
