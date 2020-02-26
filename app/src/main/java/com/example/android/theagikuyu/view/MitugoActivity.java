package com.example.android.theagikuyu.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.theagikuyu.R;

public class MitugoActivity extends AppCompatActivity {
    TextView details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_view);

        details = findViewById(R.id.details);
        details.setText(getString(R.string.unduire));
    }
}
