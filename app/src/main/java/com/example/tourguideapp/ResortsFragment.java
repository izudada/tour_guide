package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ResortsFragment extends Fragment {


    public ResortsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(
                R.string.juanita_hotels_title,
                R.string.juanita_hotels_description,
                R.string.juanita_hotels_address,
                R.drawable.juanita_hotels
        ));
        words.add(new Word(
                R.string.landmark_hotel_title,
                R.string.landmark_hotel_description,
                R.string.landmark_hotel_address,
                R.drawable.landmark_hotel
        ));
        words.add(new Word(
                R.string.visa_karena_hotels_title,
                R.string.visa_karena_hotels_description,
                R.string.visa_karena_hotels_address,
                R.drawable.visa_karena_hotels
        ));
        words.add(new Word(
                R.string.best_premier_hotel_title,
                R.string.best_premier_hotel_description,
                R.string.best_premier_hotel_address,
                R.drawable.best_premier_hotel
        ));
        words.add(new Word(
                R.string.golden_tulip_hotel_title,
                R.string.golden_tulip_hotel_description,
                R.string.golden_tulip_hotel_address,
                R.drawable.golden_tulip_hotel
        ));
        words.add(new Word(
                R.string.labake_cottage_hotel_title,
                R.string.labake_cottage_hotel_description,
                R.string.labake_cottage_hotel_address,
                R.drawable.labake_ottage_hotel
        ));
        words.add(new Word(
                R.string.bougainvillea_hotels_title,
                R.string.bougainvillea_hotels_description,
                R.string.bougainvillea_hotels_address,
                R.drawable.bougainvillea_hotels
        ));
        words.add(new Word(
                R.string.the_crib_lifestyle_hotel_title,
                R.string.the_crib_lifestyle_hotel_description,
                R.string.the_crib_lifestyle_hotel_address,
                R.drawable.the_crib_lifestyle_hotel
        ));
        words.add(new Word(
                R.string.christine_apartment_hotel_ltd_title,
                R.string.christine_apartment_hotel_ltd_description,
                R.string.christine_apartment_hotel_ltd_address,
                R.drawable.christine_apartment_hotel_ltd
        ));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(getActivity(), words);

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