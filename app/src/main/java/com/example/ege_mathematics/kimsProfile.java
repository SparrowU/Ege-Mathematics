package com.example.ege_mathematics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kimsProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kims_profile);

        PDFView pdfView = findViewById(R.id.pdfViewer);

        pdfView.fromAsset("profilnaya_1.pdf").load();
    }
}