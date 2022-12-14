package com.example.tourguideapp;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class GuideCategoryAdapter extends FragmentPagerAdapter {
    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link GuideCategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public GuideCategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment();
        } else if (position == 1) {
            return new ResortsFragment();
        } else if (position == 2){
            return new RestaurantsFragment();
        } else {
            return new ParksFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.event_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.resort_fragment);
        } else if (position == 2){
            return mContext.getString(R.string.restaurant_fragment);
        } else {
            return mContext.getString(R.string.park_fragment);
        }
    }
}
