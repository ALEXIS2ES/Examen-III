package com.example.alexis.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alexis on 4/06/2017.
 */

public class Tab01Favorite extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View view = inflater.inflate(R.layout.tab01_favorites,container,false);
        return view;
    }

}

