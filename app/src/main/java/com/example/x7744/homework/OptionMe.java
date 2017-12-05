package com.example.x7744.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OptionMe extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 0:
                txt_chosen.setText("選項一");
                break;
            case 1:
                txt_chosen.setText("選項二");
                break;
            case 2:
                txt_chosen.setText("選項三");
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_me);
        initialComponent();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,1,"選項一");
        menu.add(0,1,2,"選項二");
        menu.add(0,2,3,"選項三");
        return super.onCreateOptionsMenu(menu);
    }

    private void initialComponent() {
        txt_chosen=(TextView)findViewById(R.id.txt_option);
    }
    TextView txt_chosen;

}
