package com.example.ege_mathematics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class formulas_algebr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulas_algebr);

        PDFView pdfView = findViewById(R.id.pdfViewer);

        pdfView.fromAsset("formul_alg.pdf").load();

    }
}