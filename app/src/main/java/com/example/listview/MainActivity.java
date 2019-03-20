package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> countres = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView_id);

        countres.add("Sudan");
        countres.add("Algeria");
        countres.add("Egypt");
        countres.add("Yemen");
        countres.add("Tunisia");
        countres.add("Somalila");
        countres.add("Libya");
        countres.add("Djibouti");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countres);

        listView.setAdapter(adapter);

    }
}
