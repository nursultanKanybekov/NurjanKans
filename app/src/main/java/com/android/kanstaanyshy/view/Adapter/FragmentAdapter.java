package com.android.kanstaanyshy.view.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.android.kanstaanyshy.view.LoginFragment;
import com.android.kanstaanyshy.view.RegisterFragment;

public class FragmentAdapter extends FragmentPagerAdapter {

    int tabCounts;

    public FragmentAdapter(@NonNull FragmentManager fm, int tabCounts) {
        super(fm);
        this.tabCounts = tabCounts;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LoginFragment();
            case 1:
                return new RegisterFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCounts;
    }
}
