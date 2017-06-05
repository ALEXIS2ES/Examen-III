package com.example.alexis.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Alexis on 4/06/2017.
 */

public class Tab02Contacts extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View view = inflater.inflate(R.layout.tab02_contacts,container,false);

        String [] nombres={"Miguel Osiris","Pedro Miranda","Juan Esteban","Mirian angela"};
        ListView listView = (ListView)view.findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(getActivity().getApplicationContext(),MainActivity.simple,nombres);
        listView.setAdapter(arrayAdapter);

        return view;
    }

}
