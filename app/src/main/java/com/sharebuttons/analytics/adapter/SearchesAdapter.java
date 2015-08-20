package com.sharebuttons.analytics.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.sharebuttons.analytics.fragment.SListFragment;
import com.sharebuttons.analytics.fragment.TypeListFragment;
import com.sharebuttons.analytics.R;


/**
 * Created by Monkey D Luffy on 6/6/2015.
 */
public class SearchesAdapter extends FragmentStatePagerAdapter {

    private Context mContext;

    public SearchesAdapter(Context context, FragmentManager manager) {
        super(manager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = TypeListFragment.getInstance("searches");
                break;
            case 1:
                fragment = TypeListFragment.getInstance("searches-keywords");
                break;
            case 2:
                fragment = SListFragment.getInstance("searches-recent");
                break;
            case 3:
                fragment = SListFragment.getInstance("searches-unique");
                break;
            case 4:
                fragment = TypeListFragment.getInstance("searches-rankings");
                break;
            case 5:
                fragment = TypeListFragment.getInstance("searches-local");
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return mContext.getResources().getStringArray(R.array.searches).length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getStringArray(R.array.searches)[position];
    }
}
