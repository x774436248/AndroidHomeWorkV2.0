package com.example.x7744.homework;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomeWork extends AppCompatActivity {
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode){
            case KEY_TOTAL.DATA_CONNECTION:
                if(null!=data)
                    txt_getWord.setText(data.getExtras().getString(KEY_TOTAL.KEY_OF_VIEW2_TO_VIEW1));
                else{
                    txt_getWord.setText("未傳輸資料");
                }
                break;
        }
    }

    private View.OnClickListener btn_Color_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(HomeWork.this,ColorChart.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_DataSend_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(HomeWork.this,DataToSend.class);
            Bundle bd_words=new Bundle();
            bd_words.putString(KEY_TOTAL.KEY_OF_VIEW1_TO_VIEW2,etxt_wordToSend.getText().toString());
            intent.putExtras(bd_words);
            startActivityForResult(intent,KEY_TOTAL.DATA_CONNECTION);
        }
    };
    private View.OnClickListener btn_ListAct_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(HomeWork.this,ListAct.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_AlertList_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeWork.this, AltList.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_DatePicker_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(HomeWork.this,DatePicker.class) ;
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_Progress_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(HomeWork.this,Progress.class) ;
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_Toast_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(HomeWork.this,Toasts.class) ;
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_Notification_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(HomeWork.this,Notifiations.class) ;
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_ContextMenu_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(HomeWork.this,ContextMe.class) ;
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_OptionMenu_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(HomeWork.this,OptionMe.class) ;
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_Preference_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(HomeWork.this,SharePre.class) ;
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work);
        inititalComponent();
    }

    private void inititalComponent() {
        txt_getWord=(TextView) findViewById(R.id.getWords);
        etxt_wordToSend=(EditText)findViewById(R.id.wordToSend);
        btn_Color=(Button)findViewById(R.id.btnColor);
        btn_DataSend=(Button)findViewById(R.id.btnDataSend);
        btn_ListAct=(Button)findViewById(R.id.btnListAct);
        btn_AlertList=(Button)findViewById(R.id.btnAlertList);
        btn_DatePicker=(Button)findViewById(R.id.btnDatePicker);
        btn_Progress=(Button)findViewById(R.id.btnProgress);
        btn_Toast=(Button)findViewById(R.id.btnToast);
        btn_Notification=(Button)findViewById(R.id.btnNotification);
        btn_ContextMenu=(Button)findViewById(R.id.btnContextMenu);
        btn_OptionMenu=(Button)findViewById(R.id.btnOptionMenu);
        btn_Preference=(Button)findViewById(R.id.btnSharePreference);

        btn_ListAct.setOnClickListener(btn_ListAct_Click);
        btn_AlertList.setOnClickListener(btn_AlertList_Click);
        btn_Color.setOnClickListener(btn_Color_Click);
        btn_DataSend.setOnClickListener(btn_DataSend_Click);
        btn_DatePicker.setOnClickListener(btn_DatePicker_Click);
        btn_Progress.setOnClickListener(btn_Progress_Click);
        btn_Toast.setOnClickListener(btn_Toast_Click);
        btn_Notification.setOnClickListener(btn_Notification_Click);
        btn_ContextMenu.setOnClickListener(btn_ContextMenu_Click);
        btn_OptionMenu.setOnClickListener(btn_OptionMenu_Click);
        btn_Preference.setOnClickListener(btn_Preference_Click);
    }
    TextView txt_getWord;
    EditText etxt_wordToSend;
    Button btn_Color;
    Button btn_DataSend;
    Button btn_ListAct;
    Button btn_AlertList;
    Button btn_DatePicker;
    Button btn_Progress;
    Button btn_Toast;
    Button btn_Notification;
    Button btn_ContextMenu;
    Button btn_OptionMenu;
    Button btn_Preference;
}
