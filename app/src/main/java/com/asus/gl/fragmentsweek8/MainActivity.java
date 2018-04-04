package com.asus.gl.fragmentsweek8;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static String WHICH_ONE = "POKEMAN";
    private FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        transaction = getSupportFragmentManager().beginTransaction();
    }

    public void pokedex(View view) {

        if(isLandScape()){

            //get instance of Fragment
            DetailsFragment theFrag =
                    (DetailsFragment)this.getSupportFragmentManager().findFragmentById(R.id.fragmentDetail);

            ImageButton theButton = (ImageButton) view;
            if(theButton.getTag().toString().equals("pikachu")){
                /*transaction.replace(R.id.fragmentDetail, new EnhancedFragment()).commit();

                transaction.addToBackStack(null);
                return;*/
                
            }

            theFrag.setPokeman(theButton.getTag().toString());




        }
        else {
            ImageButton theButton = (ImageButton) view;
            String tagName = theButton.getTag().toString();
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(WHICH_ONE, tagName);
            startActivity(intent);
        }

    }

    private boolean isLandScape(){
       return getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE;
    }
}
