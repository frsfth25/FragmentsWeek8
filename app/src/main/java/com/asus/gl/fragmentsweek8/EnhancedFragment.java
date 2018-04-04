package com.asus.gl.fragmentsweek8;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class EnhancedFragment extends Fragment {


    public EnhancedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_enhanced, container, false);
        ImageView img =v.findViewById(R.id.imgView);
        img.setImageResource(R.drawable.raichu);
        return v;
    }

}
