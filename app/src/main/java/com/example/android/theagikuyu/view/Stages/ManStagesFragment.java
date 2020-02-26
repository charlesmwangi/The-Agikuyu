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
public class ManStagesFragment extends Fragment {


    public ManStagesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_list_view, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.gakenge), "Gakenge"));
        words.add(new Word(getString(R.string.kahii), "Kahīī"));
        words.add(new Word(getString(R.string.kihii), "Kīhīī"));
        words.add(new Word(getString(R.string.mumo), "Mumo – Kiumīri (sing)"));
        words.add(new Word(getString(R.string.mwanake), "Mwanake"));
        words.add(new Word(getString(R.string.muthuri), "Mūthuuri – Karabai"));
        words.add(new Word(getString(R.string.muthuri_kiama), "Mūthuri wa Kīama "));

        words.add(new Word(getString(R.string.council_stage1), "The council of junior warriors(njama ya anake a mumo)"));
        words.add(new Word(getString(R.string.council_stage2), "The council of senior warriors(njama ya ita)"));
        words.add(new Word(getString(R.string.council_stage3), "The council of junior elders (Kamatimo)"));
        words.add(new Word(getString(R.string.council_stage4), "The council of peace (kiama kia mataathi)"));
        words.add(new Word(getString(R.string.council_stage5), "The religious or sacrificial council (kiama Kia maturanguru)"));

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
