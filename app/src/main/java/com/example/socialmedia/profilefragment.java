package com.example.socialmedia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class profilefragment extends Fragment {



    TextView pfname,psname,ppno,pdob,puname;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profilefragment, container, false);

        pfname = view.findViewById(R.id.profilefullname);
        psname = view.findViewById(R.id.profilesurname);
        ppno = view.findViewById(R.id.profilephone);
        pdob = view.findViewById(R.id.profiledob);
        puname = view.findViewById(R.id.profileusername);

        int index = ArrayListHolder.username.indexOf(ArrayListHolder.current);

        puname.setText(ArrayListHolder.username.get(index));
        pfname.setText(ArrayListHolder.fullname.get(index));
        psname.setText(ArrayListHolder.surname.get(index));
        pdob.setText(ArrayListHolder.dateofbirth.get(index));
        ppno.setText(ArrayListHolder.phoneno.get(index));



        return view;
    }
}