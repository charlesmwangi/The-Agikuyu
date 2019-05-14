package com.example.android.theagikuyu.migiro;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.theagikuyu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MigiroExamplesFragment extends Fragment {


    public MigiroExamplesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.details_view, container, false);

        // rest of the code
        TextView details = v.findViewById(R.id.details);
        details.setText(getString(R.string.thahu_migiro));

        return v;
    }
}