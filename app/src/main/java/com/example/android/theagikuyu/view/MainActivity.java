package com.example.android.theagikuyu.view;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.android.theagikuyu.R;
import com.example.android.theagikuyu.view.Marriage.MarriageActivity;
import com.example.android.theagikuyu.view.Stages.StagesActivity;
import com.example.android.theagikuyu.view.migiro.MigiroActivity;
import com.example.android.theagikuyu.view.ngwiko.NgwikoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    View origin, clans, greetings, calendar, migiro,
            stages, second_birth, nyumba, ngwiko,
            uhikania, family_names, thimo, urathi, unduire;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        origin = findViewById(R.id.origin);
        origin.setOnClickListener(this);

        clans = findViewById(R.id.clans);
        clans.setOnClickListener(this);

        greetings = findViewById(R.id.greetings);
        greetings.setOnClickListener(this);

        calendar = findViewById(R.id.calendar);
        calendar.setOnClickListener(this);

        migiro = findViewById(R.id.migiro);
        migiro.setOnClickListener(this);

        stages = findViewById(R.id.stages);
        stages.setOnClickListener(this);


        second_birth = findViewById(R.id.second_birth);
        second_birth.setOnClickListener(this);

        nyumba = findViewById(R.id.nyumba);
        nyumba.setOnClickListener(this);

        ngwiko = findViewById(R.id.ngwiko);
        ngwiko.setOnClickListener(this);

        uhikania = findViewById(R.id.uhikania);
        uhikania.setOnClickListener(this);

        family_names = findViewById(R.id.family_names);
        family_names.setOnClickListener(this);

        thimo = findViewById(R.id.thimo);
        thimo.setOnClickListener(this);

        urathi = findViewById(R.id.urathi_wa_mugo);
        urathi.setOnClickListener(this);

        urathi = findViewById(R.id.mitugo_ya_gikuyu);
        urathi.setOnClickListener(this);

    }
    // Implement the OnClickListener callback
    public void onClick(View v) {
        // do something when the button is clicked
        switch (v.getId()){
            case R.id.origin:
                i = new Intent(this,OriginActivity.class);
                startActivity(i);
                break;
            case R.id.clans:
                i = new Intent(this, ClansActivity.class);
                startActivity(i);
                break;
            case R.id.greetings:
                i = new Intent(this,GreetingsActivity.class);
                startActivity(i);
                break;
            case R.id.calendar:
                i = new Intent(this, CalendarActivity.class);
                startActivity(i);
                break;
            case R.id.migiro:
                i = new Intent(this, MigiroActivity.class);
                startActivity(i);
                break;
            case R.id.stages:
                i = new Intent(this, StagesActivity.class);
                startActivity(i);
                break;
            case R.id.second_birth:
                i = new Intent(this,SecondBirthActivity.class);
                startActivity(i);
                break;
            case R.id.nyumba:
                i = new Intent(this, NyumbaActivity.class);
                startActivity(i);
                break;
            case R.id.ngwiko:
                i = new Intent(this, NgwikoActivity.class);
                startActivity(i);
                break;
            case R.id.uhikania:
                i = new Intent(this, MarriageActivity.class);
                startActivity(i);
                break;
            case R.id.family_names:
                i = new Intent(this, FamilyNamesActivity.class);
                startActivity(i);
                break;
            case R.id.thimo:
                i = new Intent(this,ThimoActivity.class);
                startActivity(i);
                break;
            case R.id.urathi_wa_mugo:
                i = new Intent(this, UrathiWaMugoActivity.class);
                startActivity(i);
                break;
            case R.id.mitugo_ya_gikuyu:
                i = new Intent(this, MitugoActivity.class);
                startActivity(i);
                break;
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // handle button activities
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mybutton) {
            // do something here
        }
        return super.onOptionsItemSelected(item);
    }
}