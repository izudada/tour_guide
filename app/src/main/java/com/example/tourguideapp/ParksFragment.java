package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        final ArrayList<Guide> guides = new ArrayList<Guide>();

        guides.add(new Guide(
                R.string.finima_nature_park_title,
                R.string.finima_nature_park_description,
                R.string.finima_nature_park_address,
                R.drawable.finima_nature_park
        ));
        guides.add(new Guide(
                R.string.isaac_boro_garden_park_title,
                R.string.isaac_boro_garden_park_description,
                R.string.isaac_boro_garden_park_address,
                R.drawable.isaac_boro_garden_park
        ));
        guides.add(new Guide(
                R.string.garden_city_amusement_park_title,
                R.string.garden_city_amusement_park_description,
                R.string.garden_city_amusement_park_address,
                R.drawable.garden_city_amusement_park
        ));
        guides.add(new Guide(
                R.string.delight_zone_amusement_park_title,
                R.string.delight_zone_amusement_park_description,
                R.string.delight_zone_amusement_park_address,
                R.drawable.delight_zone_amusement_park
        ));
        guides.add(new Guide(
                R.string.cultural_centre_port_parcourt_park_title,
                R.string.cultural_centre_port_parcourt_park_description,
                R.string.cultural_centre_port_parcourt_park_address,
                R.drawable.cultural_centre_port_parcourt_park
        ));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        GuideAdapter adapter = new GuideAdapter(getActivity(), guides);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }
}