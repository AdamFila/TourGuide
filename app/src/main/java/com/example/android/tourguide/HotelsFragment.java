package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.pod_ciżemką), getString(R.string.rynek_street)));
        places.add(new Place(getString(R.string.basztowy), getString(R.string.pl_ks_j_poniatowskiego_street)));
        places.add(new Place(getString(R.string.sarmata), getString(R.string.zawichojska_street)));
        places.add(new Place(getString(R.string.korona), getString(R.string.slowackiego_street)));
        places.add(new Place(getString(R.string.mały_rzym), getString(R.string.okrzei_treet)));
        places.add(new Place(getString((R.string.grodzki)), getString(R.string.mickiewicza_street)));
        places.add(new Place(getString(R.string.imperial_residence), getString(R.string.różana_street)));
        places.add(new Place(getString(R.string.dwór_dwikozy), getString(R.string.spółdzielcza_street)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_hotels);

        ListView listView = (ListView)  rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
