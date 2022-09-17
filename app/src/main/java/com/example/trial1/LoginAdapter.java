package com.example.trial1;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.trial1.LoginFragment;
import com.example.trial1.SignupFragment;

public class LoginAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;

    public  LoginAdapter (FragmentManager fm, Context context, int totalTabs){
        super(fm);
        this.context= context;
        this.totalTabs= totalTabs;

    }
    @Override
    public int getCount() {
        return totalTabs;
    }
    public Fragment getItem(int position){
        switch (position){
            case 0:
                LoginFragment loginFragment= new LoginFragment();
                return loginFragment;
            case 1:
                SignupFragment signupFragment = new SignupFragment();
                return signupFragment;
            default:
                return null;



        }

    }


}
