package com.example.ege_mathematics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.barteksc.pdfviewer.PDFView;

public class BaseMath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_math);

        ListView variants = findViewById(R.id.list_variants);

        final String[] number = new String[]{"1 Вариант", "2 Вариант", "3 Вариант", "4 Вариант", "5 Вариант",
                "6 Вариант", "7 Вариант", "8 Вариант", "9 Вариант", "10 Вариант", "11 Вариант",
                "12 Вариант", "14 Вариант", "15 Вариант", "16 Вариант",};

        ArrayAdapter adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.text_color, number);

        variants.setAdapter(adapter);

        variants.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {

                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_1_s_resheniem.pdf").load();
                }

                if (position == 1) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya__2.pdf").load();
                }

                if (position == 2) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya__3.pdf").load();
                }

                if (position == 3) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_4.pdf").load();
                }

                if (position == 4) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_5.pdf").load();
                }

                if (position == 5) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_6.pdf").load();
                }
                if (position == 6) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_7.pdf").load();
                }
                if (position == 7) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_8.pdf").load();
                }
                if (position == 8) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_9.pdf").load();
                }
                if (position == 9) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_10.pdf").load();
                }
                if (position == 10) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_11.pdf").load();
                }
                if (position == 11) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_12.pdf").load();
                }
                if (position == 12) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_14.pdf").load();
                }
                if (position == 13) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_15.pdf").load();
                }
                if (position == 14) {
                    setContentView(R.layout.activity_formulas_geometry);

                    PDFView pdfView = findViewById(R.id.pdfViewer);

                    pdfView.fromAsset("bazovaya_16.pdf").load();
                }
            }
        });
    }
}