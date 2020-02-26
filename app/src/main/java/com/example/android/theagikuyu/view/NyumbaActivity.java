package com.example.android.theagikuyu.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.theagikuyu.R;

public class NyumbaActivity extends AppCompatActivity {
    TextView details;
    ImageView image1,image2;
    View image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_view);

        details = findViewById(R.id.details);
        details.setText(getString(R.string.nyumba_na_thingira));

        image = findViewById(R.id.image_view);
        image.setVisibility(View.VISIBLE);

        image1 = findViewById(R.id.image1);
        image1.setImageResource(R.drawable.nyumba);

        image2 = findViewById(R.id.image2);
        image2.setImageResource(R.drawable.thingira);
    }
}
