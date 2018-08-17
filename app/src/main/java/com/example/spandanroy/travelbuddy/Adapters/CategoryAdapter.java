package com.example.spandanroy.travelbuddy.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.spandanroy.travelbuddy.Fragments.AttractionsFragment;
import com.example.spandanroy.travelbuddy.Fragments.HotelsFragment;
import com.example.spandanroy.travelbuddy.Fragments.MallsFragment;
import com.example.spandanroy.travelbuddy.Fragments.NatureFragment;
import com.example.spandanroy.travelbuddy.Fragments.ReligiousFragment;
import com.example.spandanroy.travelbuddy.R;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new NatureFragment();
        } else if (position == 2) {
            return new ReligiousFragment();
        } else if (position == 3) {
            return new MallsFragment();
        } else {
            return new HotelsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_attractions);
        } else if (position == 1) {
            return mContext.getString(R.string.category_nature);
        } else if (position == 2) {
            return mContext.getString(R.string.category_religious);
        } else if (position == 3) {
            return mContext.getString(R.string.category_malls);
        } else {
            return mContext.getString(R.string.category_hotels);
        }

    }
}
