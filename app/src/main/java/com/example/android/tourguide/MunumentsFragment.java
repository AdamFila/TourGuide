package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MunumentsFragment extends Fragment {

    public MunumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        /*I do not have the right to the images used.
        I used them for the task.
        Their owners are Wikipedia.org, and Zabytek.pl*/

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.starówka), getString(R.string.rynek_5_street), R.drawable.starowka));
        places.add(new Place(getString(R.string.piwnice_podziemnej_trasy), "", R.drawable.podziemne_trasy));
        places.add(new Place(getString(R.string.brama_opatowska), getString(R.string.opatowska_street), R.drawable.brama_opatowska));
        places.add(new Place(getString(R.string.kamienica_oleśnickich), getString(R.string.rynek_10_street), R.drawable.kamienica_oles));
        places.add(new Place(getString(R.string.rynek_starego_miasta), getString(R.string.town_square), R.drawable.rynek_starego_miasta));
        places.add(new Place(getString(R.string.collegium_gostomianum), getString(R.string.jana_długosza_street), R.drawable.collegium_gostomianum));
        places.add(new Place(getString(R.string.the_castle), getString(R.string.zamkowa_12_street), R.drawable.zamek));
        places.add(new Place(getString(R.string.dom_długosza), getString(R.string.jana_długosza_9_street), R.drawable.dom_dlugosza));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_monuments);

        ListView listView = (ListView)  rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
