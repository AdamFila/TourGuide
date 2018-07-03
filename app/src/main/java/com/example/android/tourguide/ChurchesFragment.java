package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ChurchesFragment extends Fragment {

    public ChurchesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.kościół_pw_św_pawła), getString(R.string.staromiejska_11_street)));
        places.add(new Place(getString(R.string.kościół_pw_św_ducha), getString(R.string.opatowska_10_street)));
        places.add(new Place(getString(R.string.kościół_pw_św_józefa), getString(R.string.plac_św_wojciecha_2_street)));
        places.add(new Place(getString(R.string.kościół_pw_św_jakuba), getString(R.string.staromiejska_3_street)));
        places.add(new Place(getString(R.string.bazylika_katedralna), getString(R.string.katedralna_1_street)));
        places.add(new Place(getString(R.string.wyższe_seminarium_duchowe), getString(R.string.stefana_zeromskiego_street)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_churches);

        ListView listView = (ListView)  rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
