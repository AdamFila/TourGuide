package com.example.android.tourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.kasztelanka), getString(R.string.rynek_13_14_street)));
        places.add(new Place(getString(R.string.nat_sushi), getString(R.string.rynek_5_street)));
        places.add(new Place(getString(R.string.cafe_mala), getString(R.string.gen_michala_sokolnickiego_3_street)));
        places.add(new Place(getString(R.string.calimero_cafe), getString(R.string.opatowska_9_street)));
        places.add(new Place(getString(R.string.iluzjon_art_cafe), getString(R.string.rynek_25_26_street)));
        places.add(new Place(getString(R.string.bistro_podwale), getString(R.string.podwale_dolne_8a_street)));
        places.add(new Place(getString(R.string.trattoria), getString(R.string.mickiewicza_36_street)));
        places.add(new Place(getString(R.string.mariano), getString(R.string.kosely_5_street)));
        places.add(new Place(getString(R.string.pizza_zone), getString(R.string.adama_mickiewicza_36_street)));
        places.add(new Place(getString(R.string.don_matteo), getString(R.string.opatowska_9_street)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_restaurants);

        ListView listView = (ListView)  rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
