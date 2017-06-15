package com.lodestar.demoexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import net.cachapa.expandablelayout.ExpandableLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class LodestarWayFragment extends Fragment {


    private ExpandableLayout discover_layout, determine_layout, decide_layout;
    private Button discover_button, determine_button, decide_button;
    private boolean expandedState = false;

    public LodestarWayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_lodestar_way, container, false);

        discover_button = (Button) rootView.findViewById(R.id.discover_button);
        discover_layout = (ExpandableLayout) rootView.findViewById(R.id.discover_layout);
        discover_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                discover_layout.toggle();
            }
        });

        determine_button = (Button) rootView.findViewById(R.id.determine_button);
        determine_layout = (ExpandableLayout) rootView.findViewById(R.id.determine_layout);
        determine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                determine_layout.toggle();
            }
        });

        decide_button = (Button) rootView.findViewById(R.id.decide_button);
        decide_layout = (ExpandableLayout) rootView.findViewById(R.id.decide_layout);
        decide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decide_layout.toggle();
            }
        });

        return rootView;
    }

}
