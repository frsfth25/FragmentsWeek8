package com.asus.gl.fragmentsweek8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String whichPokeman= intent.getStringExtra(MainActivity.WHICH_ONE);

        int drawableID= getResources().getIdentifier(
                whichPokeman,
                "drawable",
                getPackageName()
        );

        ImageView thePokePicture =(ImageView) findViewById(R.id.pokeman_picture);
        thePokePicture.setImageResource(drawableID);

        //name

        TextView pokeNametxt= findViewById(R.id.pokeName);
        pokeNametxt.setText(whichPokeman.toUpperCase());

        //details
        int detailID= getResources().getIdentifier(whichPokeman,
                "string",
                getPackageName());

        TextView txtDetail= findViewById(R.id.txtDetail);
        txtDetail.setText(detailID);
    }
}
