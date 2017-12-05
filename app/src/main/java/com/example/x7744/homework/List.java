package com.example.x7744.homework;

import android.app.ListActivity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class List extends ListActivity {
    String[] list={"假的1","假的2","假的3","假的4","假的5","假的6","假的7","假的8","假的9","假的10","假的11","假的12","假的13","假的14","假的15","假的16","假的17"};

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent back_To_View1=new Intent();
        Bundle chosenList=new Bundle();
        chosenList.putString(KEY_TOTAL.LIST_CHOSEN,list[position]);
        back_To_View1.putExtras(chosenList);
        setResult(0,back_To_View1);
        finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialComponent();
    }

    private void initialComponent() {
        ListAdapter l_listAdp=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,list);
        this.setListAdapter(l_listAdp);
    }
}