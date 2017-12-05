package com.example.x7744.homework;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class DatePicker extends Activity {

    private View.OnClickListener btn_Date_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Calendar todat=Calendar.getInstance();
            Dialog datePicker=new DatePickerDialog(DatePicker.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
                    txt_date.setText(String.valueOf(year)+"/"+String.valueOf(month)+"/"+String.valueOf(dayOfMonth));
                }
            },todat.get(Calendar.YEAR),todat.get(Calendar.MONTH),todat.get(Calendar.DATE));
            datePicker.show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        initialComponent();
    }

    private void initialComponent() {
        txt_date=(TextView)findViewById(R.id.date);
        btn_Date=(Button)findViewById(R.id.brntDate);
        btn_Date.setOnClickListener(btn_Date_Click);
    }
    TextView txt_date;
    Button btn_Date;
}
