package com.example.ege_mathematics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class theoretitics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theoretitics);

        ListView stuff = (ListView) findViewById(R.id.listView1);

        // определяем массив типа String
        final String[] themes = new String[]{"Основные формулы по алгебре", "Формулы по геометрии"};

        // используем адаптер данных


       ArrayAdapter adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.text_size, themes);

        stuff.setAdapter(adapter);

        stuff.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    startActivity(new Intent(getApplicationContext(), formulas_algebr.class));
                }
                if (position == 1) {
                    startActivity(new Intent(getApplicationContext(), formulas_geometry.class));
                }
            }
        });




    }
}