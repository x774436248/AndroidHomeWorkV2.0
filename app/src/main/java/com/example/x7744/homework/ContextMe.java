package com.example.x7744.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ContextMe extends AppCompatActivity {
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add(0,0,1,"選項一");
        menu.add(0,1,2,"選項二");
        menu.add(0,2,3,"選項三");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()){
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
        return super.onContextItemSelected(item);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_me);
        initialComponent();
    }

    private void initialComponent() {
        txt_chosen=(TextView)findViewById(R.id.txtChosen);
        txt_press=(TextView)findViewById(R.id.press);
        registerForContextMenu(txt_press);
    }
    TextView txt_chosen;
    TextView txt_press;
}
