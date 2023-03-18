package com.example.homewidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int progr=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateProgressBar();
    }

    protected void updateProgressBar(){
        ProgressBar progressBar = findViewById(R.id.pomodoro_progress_bar);
        progressBar.setProgress(progr);
        TextView textView = findViewById(R.id.text_view_progress);
        String displayText = progr + "%";
        textView.setText(displayText);
    }
}