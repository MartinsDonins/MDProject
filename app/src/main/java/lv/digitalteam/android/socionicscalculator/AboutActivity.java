package lv.digitalteam.android.socionicscalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by MDART on 24.02.2017.
 */

public class AboutActivity extends AppCompatActivity
         {

             private FirebaseAnalytics mFirebaseAnalytics;

             @Override
             protected void onCreate(Bundle savedInstanceState) {
                 super.onCreate(savedInstanceState);

                 // Set the content of the activity to use the activity_main.xml layout file
                 setContentView(R.layout.about);

                 // Obtain the FirebaseAnalytics instance.
                 mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
             }

         }
