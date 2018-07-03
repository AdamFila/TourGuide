package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{

    /** Context of the app */
    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1){
            return new HotelsFragment();
        } else if (position == 2){
            return new ChurchesFragment();
        } else {
            return new MunumentsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    } //Number of pages

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.category_hotels);
        } else if (position == 2) {
            return mContext.getString(R.string.category_churches);
        } else {
            return mContext.getString(R.string.category_monuments);
        }
    }

}
