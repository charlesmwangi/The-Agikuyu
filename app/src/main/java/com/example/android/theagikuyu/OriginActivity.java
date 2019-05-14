package com.example.android.theagikuyu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class OriginActivity extends AppCompatActivity {
    TextView details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_view);

        details = findViewById(R.id.details);
        details.setText(getString(R.string.kihumo));
    }
}
