package com.example.android.theagikuyu.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.theagikuyu.R;

import java.util.ArrayList;

public class FamilyNamesActivity extends AppCompatActivity {
    TextView details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.mutumia), "Mûtumia wakwa (lady mine/my wife)"));
        words.add(new Word(getString(R.string.muthuri_wakwa), "Mûthuuri wakwa (elder mine or my husband)"));
        words.add(new Word(getString(R.string.muiru), "mûiru wakwa (my partner or co-wife)"));
        words.add(new Word(getString(R.string.nyakiambi), "Nyakiambi"));
        words.add(new Word(getString(R.string.nyakiamburi), "Nyakiamburi"));
        words.add(new Word(getString(R.string.husband_bother), "Brother of the husband"));
        words.add(new Word(getString(R.string.maramu), "Maramu"));
        words.add(new Word(getString(R.string.husband_parent), "Husband's parents"));
        words.add(new Word(getString(R.string.children_of_the_same_mother), "Children of the same mother "));
        words.add(new Word(getString(R.string.children_of_one_father), "Children of one father"));
        words.add(new Word(getString(R.string.children_of_the_same_mother_and_father), "Children of the same mother and father"));
        words.add(new Word(getString(R.string.fathers_brothers), "Father's bothers"));
        words.add(new Word(getString(R.string.children_of_brothers), "Children of brothers"));
        words.add(new Word(getString(R.string.Sister_of_the_father), "Sister of the father"));
        words.add(new Word(getString(R.string.aunts_children), "Aunt’s children"));
        words.add(new Word(getString(R.string.grandparents), "Grandparents on both sides"));
        words.add(new Word(getString(R.string.mothers_sister), "Mother's sister"));
        words.add(new Word(getString(R.string.mothers_brother), "Mother's brother"));
        words.add(new Word(getString(R.string.relatives_by_marriage), "Relatives by Marriage"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
