package com.example.android.theagikuyu.view.Marriage;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.android.theagikuyu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StagesFragment extends Fragment {


    public StagesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.details_view, container, false);

        //Populate the spinner in the fragment
        Spinner spinner = v.findViewById(R.id.spinner);
        spinner.setVisibility(View.VISIBLE);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(v.getContext(), R.array.stages,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                              @Override
                                              public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                                                  String selected = parentView.getItemAtPosition(position).toString();
                                                  Context context = parentView.getContext();
                                                  CharSequence text = selected;

                                                  TextView bk =v.findViewById(R.id.details);
                                                  switch (position) {
                                                      case 0:
                                                          bk.setText(getResources().getString(R.string.marriage_stage1));
                                                          break;
                                                      case 1:
                                                          bk.setText(getResources().getString(R.string.marriage_stage2));
                                                          break;
                                                      case 2:
                                                          bk.setText(getResources().getString(R.string.marriage_stage3));
                                                          break;
                                                      case 3:
                                                          bk.setText(getResources().getString(R.string.marriage_stage4));
                                                          break;
                                                  }
                                              }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


//        // rest of the code
//        TextView details = v.findViewById(R.id.details);
//        details.setText(getString(R.string.thahu_migiro));
//
        return v;
    }
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//
//        View v = inflater.inflate(R.layout.manual, container, false);
//
//        String [] values =
//                {"Time at Residence","Under 6 months","6-12 months","1-2 years","2-4 years","4-8 years","8-15 years","Over 15 years",};
//        Spinner spinner = (Spinner) v.findViewById(R.id.spinner1);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
//        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
//        spinner.setAdapter(adapter);
//
//        return v;
//
//    }

}
