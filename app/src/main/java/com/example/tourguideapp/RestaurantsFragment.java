package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        final ArrayList<Guide> guides = new ArrayList<Guide>();

        guides.add(new Guide(
                R.string.piazza_restaurant_title,
                R.string.race_and_equity_event_description,
                R.string.piazza_restaurant_address,
                R.drawable.piazza_restaurant
        ));
        guides.add(new Guide(
                R.string.south_66_restaurant_title,
                R.string.south_66_restaurant_description,
                R.string.south_66_restaurant_address,
                R.drawable.south_66_restaurant
        ));
        guides.add(new Guide(
                R.string.asia_town_restaurant_title,
                R.string.asia_town_restaurant_description,
                R.string.asia_town_restaurant_address,
                R.drawable.asia_town_restaurant
        ));
        guides.add(new Guide(
                R.string.yogurberry_restaurant_title,
                R.string.yogurberry_restaurant_description,
                R.string.yogurberry_restaurant_address,
                R.drawable.yogurberry_restaurant
        ));
        guides.add(new Guide(
                R.string.spice_route_restaurant_title,
                R.string.spice_route_restaurant_description,
                R.string.spice_route_restaurant_address,
                R.drawable.spice_route_restaurant
        ));
        guides.add(new Guide(
                R.string.woodhouse_cafe_restaurant_title,
                R.string.woodhouse_cafe_restaurant_description,
                R.string.woodhouse_cafe_restaurant_address,
                R.drawable.woodhouse_cafe_restaurant
        ));
        guides.add(new Guide(
                R.string.buns_and_batter_restaurant_title,
                R.string.buns_and_batter_restaurant_description,
                R.string.buns_and_batter_restaurant_address,
                R.drawable.buns_and_batter_restaurant
        ));
        guides.add(new Guide(
                R.string.genesis_sky_bar_restaurant_title,
                R.string.genesis_sky_bar_restaurant_description,
                R.string.genesis_sky_bar_restaurant_address,
                R.drawable.genesis_sky_bar_restaurant
        ));
        guides.add(new Guide(
                R.string.the_coffee_shop_restaurant_title,
                R.string.the_coffee_shop_restaurant_description,
                R.string.the_coffee_shop_restaurant_address,
                R.drawable.the_coffee_shop_restaurant
        ));
        guides.add(new Guide(
                R.string.the_wok_chinese_restaurant_title,
                R.string.the_wok_chinese_restaurant_description,
                R.string.the_wok_chinese_restaurant_address,
                R.drawable.the_wok_chinese_restaurant
        ));
        guides.add(new Guide(
                R.string.cornerstore_cafe_restaurant_title,
                R.string.cornerstore_cafe_restaurant_description,
                R.string.cornerstore_cafe_restaurant_address,
                R.drawable.cornerstore_cafe_restaurant
        ));
        guides.add(new Guide(
                R.string.crinkles_n_cream_restaurant_title,
                R.string.crinkles_n_cream_restaurant_description,
                R.string.crinkles_n_cream_restaurant_address,
                R.drawable.crinkles_n_cream_restaurant
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