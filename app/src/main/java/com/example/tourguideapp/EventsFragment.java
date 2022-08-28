package com.example.tourguideapp;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Guide> words = new ArrayList<Guide>();

        words.add(new Guide(
                R.string.abc_event_title,
                R.string.abc_event_description,
                R.string.abc_event_address,
                R.drawable.abc_event
        ));
        words.add(new Guide(
                R.string.bigdealparty_event_title,
                R.string.bigdealparty_event_description,
                R.string.bigdealparty_event_address,
                R.drawable.bigdealparty_event
        ));
        words.add(new Guide(
                R.string.the_medicine_event_title,
                R.string.the_medicine_event_description,
                R.string.the_medicine_event_address,
                R.drawable.the_medicine_event
        ));
        words.add(new Guide(
                R.string.travel_indoors_event_title,
                R.string.travel_indoors_event_description,
                R.string.travel_indoors_event_address,
                R.drawable.travel_indoors_event
        ));
        words.add(new Guide(
                R.string.race_and_equity_event_title,
                R.string.race_and_equity_event_description,
                R.string.race_and_equity_event_address,
                R.drawable.race_and_equity_event
        ));
        words.add(new Guide(
                R.string.online_dance_party_event_title,
                R.string.online_dance_party_event_description,
                R.string.online_dance_party_event_address,
                R.drawable.online_dance_party_event
        ));
        words.add(new Guide(
                R.string.love_and_sex_in_christianity_event_title,
                R.string.love_and_sex_in_christianity_event_description,
                R.string.love_and_sex_in_christianity_event_address,
                R.drawable.love_and_sex_in_christianity_event
        ));
        words.add(new Guide(
                R.string.international_leadership_summit_event_title,
                R.string.the_wok_chinese_restaurant_description,
                R.string.international_leadership_summit_event_address,
                R.drawable.international_leadership_summit_event
        ));
        words.add(new Guide(
                R.string.abc_event_title,
                R.string.abc_event_description,
                R.string.abc_event_address,
                R.drawable.abc_event
        ));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        GuideAdapter adapter = new GuideAdapter(getActivity(), words);

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