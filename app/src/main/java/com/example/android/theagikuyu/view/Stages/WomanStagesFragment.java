package com.example.android.theagikuyu.view.Stages;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.theagikuyu.R;
import com.example.android.theagikuyu.view.Word;
import com.example.android.theagikuyu.view.WordAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class WomanStagesFragment extends Fragment {


    public WomanStagesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_list_view, container, false);
// Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("a girl child. A baby is a gakenge.", "Kaana"));
        words.add(new Word("a young innocent girl not yet circumcised.  (Kĩrĩgũ – A big girl beginning to be naughty.)", "Karĩgũ"));
        words.add(new Word("A maiden after circumcision and before marriage.", "Mũiritu"));
        words.add(new Word("A bride for the first year after marriage. If she goes beyond this one year without getting pregnant she begins to raise concern. A few more years without getting pregnant and she undergoes a resurrection ceremony called Kũriũkio  kwa mũhiki which is intended to awaken her.  (Kũriũkio – to be resurrected)", "Mũhiki"));
        words.add(new Word("A primipara with only one child.", "Mũhiki wa rwara rũmwe"));
        words.add(new Word("An older married woman who can join in the wedding dance when food is taken to the village of the groom. (Wabai – a class term for mature matrons.)", "Mũtumia wa kang’ei"));
        words.add(new Word("A mother of at least three circumcised daughters or sons and is hence entitled to drink (kunyua) beer.", "Mũtumia wa nyakĩnyua"));
        words.add(new Word("A woman past child-bearing but who is still active.", "Mũtumia wa makanga"));
        words.add(new Word("An old woman who resides at home unable to leave her homestead.", "Kĩheti"));
        words.add(new Word(getString(R.string.woman_stages_details), ""));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = v.findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return listView;
    }


}
