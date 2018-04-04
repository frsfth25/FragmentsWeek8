package com.asus.gl.fragmentsweek8;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {

    private Activity act;
    private View v;

    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_details, container, false);

        act = getActivity();
        //Fill related information in view
        ImageView theImage = v.findViewById(R.id.pokeman_picture);

        theImage.setImageResource(R.drawable.pikachu);

        TextView txtName = v.findViewById(R.id.pokeName);
        txtName.setText("PIKACHU");

        //Set detail
        TextView txtDetail =v.findViewById(R.id.txtDetail);
        txtDetail.setText(R.string.pikachu);

        return v;
    }

    public void setPokeman(String pokeName){
        View v= getView();
        int drawableID= getResources().getIdentifier(
                pokeName,
                "drawable",
                act.getPackageName()
        );

        ImageView thePokePicture =(ImageView) v.findViewById(R.id.pokeman_picture);
        thePokePicture.setImageResource(drawableID);

        //name

        TextView pokeNametxt= v.findViewById(R.id.pokeName);
        pokeNametxt.setText(pokeName.toUpperCase());

        //details
        int detailID= getResources().getIdentifier(pokeName,
                "string",
                act.getPackageName());

        TextView txtDetail= v.findViewById(R.id.txtDetail);
        txtDetail.setText(detailID);
    }

}
