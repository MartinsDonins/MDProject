package lv.digitalteam.android.socionicscalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.google.firebase.analytics.FirebaseAnalytics;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    // Tipu vārdi
    String nameNr1 = "Dimā";
    String nameNr2 = "Dimā";
    String nameNr3 = "Balzaks";
    String nameNr4 = "Gabēns";
    String nameNr5 = "Dostajevskis";
    String nameNr6 = "Draizers";
    String nameNr7 = "Robespjērs";
    String nameNr8 = "Maksims";
    String nameNr9 = "Hakslijs";
    String nameNr10 = "Napoleons";
    String nameNr11 = "Dons Kihots";
    String nameNr12 = "Žukovs";
    String nameNr13 = "Hamlets";
    String nameNr14 = "Igo";
    String nameNr15 = "Džeks Londons";
    String nameNr16 = "Štirlics";

    //

    String scoreTeamA = "Gaidam rezultātu";

    // varbūt jātaisa ta, ka katram tipam ir kods abcd
    int Intraverts = 0;
    int ekstraverts = 0;
    int racionals = 0;
    int iracionals = 0;
    int etisks = 0;
    int logisks = 0;
    int sensors = 0;
    int intuits = 0;

    private FirebaseAnalytics mFirebaseAnalytics;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Drīzumā šeit būs kaut kāda darbība", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        // Find the View that shows the Pirmais autobuss category
        TextView DetalizētsCalc = (TextView) findViewById(R.id.advanceCalcPoga);

        // Set a click listener on that View
        DetalizētsCalc.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, AdvanceCalcActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Create a new intent to open the {@link NumbersActivity}
            setContentView(R.layout.about);

        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void reset(View v) {
        scoreTeamA = "Gaidam rezultātu";
        Intraverts = 0;
        ekstraverts = 0;
        racionals = 0;
        iracionals = 0;
        etisks = 0;
        logisks = 0;
        sensors = 0;
        intuits = 0;

        displayForTeamF(scoreTeamA);

        RadioGroup rg1 = (RadioGroup) findViewById(R.id.intraEkstraRadioGroup);
        RadioGroup rg2 = (RadioGroup) findViewById(R.id.racionIracionRadioGroup);
        RadioGroup rg3 = (RadioGroup) findViewById(R.id.logisksEtisksRadioGroup);
        RadioGroup rg4 = (RadioGroup) findViewById(R.id.IntuitsSensorsRadioGroup);
        rg1.clearCheck();
        rg2.clearCheck();
        rg3.clearCheck();
        rg4.clearCheck();


    }

    public void addIntraverts(View v) {
        scoreTeamA = "Intraverts";
        if (Intraverts == 0) {
            Intraverts = 1;
            ekstraverts = 0;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addEkstraverts(View v) {
        scoreTeamA = "Ekstraverts";
        if (ekstraverts == 0) {
            ekstraverts = 1;
            Intraverts = 0;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addRacionals(View v) {
        scoreTeamA = "Racionāls";
        if (racionals == 0) {
            racionals = 1;
            iracionals = 0;
            displayForTeamA(scoreTeamA);
        }

    }

    public void addIracionals(View v) {
        scoreTeamA = "Iracionāls";
        if (iracionals == 0) {
            iracionals = 1;
            racionals = 0;
            displayForTeamA(scoreTeamA);
        }

    }

    public void addLogisks(View v) {
        scoreTeamA = "Loģisks";
        if (logisks == 0) {
            logisks = 1;
            etisks = 0;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addEtisks(View v) {
        scoreTeamA = "Ētisks";
        if (etisks == 0) {
            etisks = 1;
            logisks = 0;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addSensors(View v) {
        scoreTeamA = "Sensors";
        if (sensors == 0) {
            sensors = 1;
            intuits = 0;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addIntuits(View v) {
        scoreTeamA = "Intūīts";
        if (intuits == 0) {
            intuits = 1;
            sensors = 0;
            displayForTeamA(scoreTeamA);
        }
    }


    public void displayForTeamA(String score) {
        if (Intraverts == 1) { // A visi varianti
            if (iracionals == 1) { // AC visi varianti
                if (etisks == 1) { // ACE visi varianti
                    if (intuits == 1) {
                        scoreTeamA = nameNr1; // ACEG
                    } else if (sensors == 1) {
                        scoreTeamA = nameNr2; // ACEH
                    } else
                        scoreTeamA = nameNr1 + ", " + nameNr2; // ACE
                } else if (logisks == 1) {  // ACF visi varianti
                    if (intuits == 1) {
                        scoreTeamA = nameNr3; // ACFG
                    } else if (sensors == 1) {
                        scoreTeamA = nameNr4; // ACEFH
                    } else scoreTeamA = nameNr3 + ", " + nameNr4; // ACF
                } else if (intuits == 1) {
                    scoreTeamA = nameNr1 + ", " + nameNr3; // ACG
                } else if (sensors == 1) {
                    scoreTeamA = nameNr2 + ", " + nameNr4; // ACH
                } else
                    scoreTeamA = nameNr1 + ", " + nameNr2 + ", " + nameNr3 + ", " + nameNr4; // AC
            } else if (racionals == 1) { //visi varianti AD

                if (etisks == 1) { // ADE visi varianti
                    if (intuits == 1) {
                        scoreTeamA = nameNr5; // ADEG
                    } else if (sensors == 1) {
                        scoreTeamA = nameNr6; // ADEH
                    } else
                        scoreTeamA = nameNr5 + ", " + nameNr6; // ADE
                } else if (logisks == 1) {  // ADF visi varianti
                    if (intuits == 1) {
                        scoreTeamA = nameNr7; // ADFG
                    } else if (sensors == 1) {
                        scoreTeamA = nameNr8; // ADEFH
                    } else scoreTeamA = nameNr7 + ", " + nameNr8; // AADF
                } else if (intuits == 1) {
                    scoreTeamA = nameNr5 + ", " + nameNr7; // ADG
                } else if (sensors == 1) {
                    scoreTeamA = nameNr6 + ", " + nameNr8; // ADH
                } else
                    scoreTeamA = nameNr5 + ", " + nameNr6 + ", " + nameNr7 + ", " + nameNr8; // AD
            } else if (etisks == 1) {
                if (intuits == 1) {
                    scoreTeamA = nameNr1 + ", " + nameNr5; // AEG
                } else if (sensors == 1) {
                    scoreTeamA = nameNr2 + ", " + nameNr6; // AEH
                } else
                    scoreTeamA = nameNr1 + ", " + nameNr2 + ", " + nameNr5 + ", " + nameNr6; // AE
            } else if (logisks == 1) {
                if (intuits == 1) {
                    scoreTeamA = nameNr3 + ", " + nameNr7; // AFG
                } else if (sensors == 1) {
                    scoreTeamA = nameNr4 + ", " + nameNr8; // AFH
                } else
                    scoreTeamA = nameNr3 + ", " + nameNr4 + ", " + nameNr7 + ", " + nameNr8; // AF
            } else if (intuits == 1) {
                scoreTeamA = nameNr1 + ", " + nameNr5 + ", " + nameNr3 + ", " + nameNr7; // AG
            } else if (sensors == 1) {
                scoreTeamA = nameNr2 + ", " + nameNr6 + ", " + nameNr4 + ", " + nameNr8; // AH
            } else
                scoreTeamA = nameNr1 + ", " + nameNr2 + ", " + nameNr3 + ", " + nameNr4 + ", " + nameNr5 + ", " + nameNr6 + ", " + nameNr7 + ", " + nameNr8; //A
        } else if (ekstraverts == 1) { // B visi variantI
            if (iracionals == 1) { // BC visi varianti
                if (etisks == 1) { // BCE visi varianti
                    if (intuits == 1) {
                        scoreTeamA = nameNr9; // BCEG
                    } else if (sensors == 1) {
                        scoreTeamA = nameNr10; // BCEH
                    } else
                        scoreTeamA = nameNr9 + ", " + nameNr10; // BCE
                } else if (logisks == 1) {  // BCF visi varianti
                    if (intuits == 1) {
                        scoreTeamA = nameNr11; // BCFG
                    } else if (sensors == 1) {
                        scoreTeamA = nameNr12; // BCEFH
                    } else scoreTeamA = nameNr11 + ", " + nameNr12; // BCF
                } else if (intuits == 1) {
                    scoreTeamA = nameNr9 + ", " + nameNr11; // BCG
                } else if (sensors == 1) {
                    scoreTeamA = nameNr10 + ", " + nameNr12; // BCH
                } else
                    scoreTeamA = nameNr9 + ", " + nameNr10 + ", " + nameNr11 + ", " + nameNr12; // BC
            } else if (racionals == 1) { //visi varianti BD

                if (etisks == 1) { // BDE visi varianti
                    if (intuits == 1) {
                        scoreTeamA = nameNr13; // BDEG
                    } else if (sensors == 1) {
                        scoreTeamA = nameNr14; // BDEH
                    } else
                        scoreTeamA = nameNr13 + ", " + nameNr14; // BDE
                } else if (logisks == 1) {  // BDF visi varianti
                    if (intuits == 1) {
                        scoreTeamA = nameNr15; // BDFG
                    } else if (sensors == 1) {
                        scoreTeamA = nameNr16; // BDEFH
                    } else scoreTeamA = nameNr15 + ", " + nameNr16; // BADF
                } else if (intuits == 1) {
                    scoreTeamA = nameNr13 + ", " + nameNr15; // BDG
                } else if (sensors == 1) {
                    scoreTeamA = nameNr14 + ", " + nameNr16; // BDH
                } else
                    scoreTeamA = nameNr13 + ", " + nameNr14 + ", " + nameNr15 + ", " + nameNr16; // BD
            } else if (etisks == 1) {
                if (intuits == 1) {
                    scoreTeamA = nameNr9 + ", " + nameNr13; // AEG
                } else if (sensors == 1) {
                    scoreTeamA = nameNr10 + ", " + nameNr14; // AEH
                } else
                    scoreTeamA = nameNr9 + ", " + nameNr10 + ", " + nameNr13 + ", " + nameNr14; // AE
            } else if (logisks == 1) {
                if (intuits == 1) {
                    scoreTeamA = nameNr11 + ", " + nameNr15; // AFG
                } else if (sensors == 1) {
                    scoreTeamA = nameNr12 + ", " + nameNr16; // AFH
                } else
                    scoreTeamA = nameNr11 + ", " + nameNr12 + ", " + nameNr15 + ", " + nameNr16; // AF
            } else if (intuits == 1) {
                scoreTeamA = nameNr9 + ", " + nameNr13 + ", " + nameNr11 + ", " + nameNr15; // AG
            } else if (sensors == 1) {
                scoreTeamA = nameNr10 + ", " + nameNr14 + ", " + nameNr12 + ", " + nameNr16; // AH
            } else
                scoreTeamA = nameNr9 + ", " + nameNr10 + ", " + nameNr11 + ", " + nameNr12 + ", " + nameNr13 + ", " + nameNr14 + ", " + nameNr15 + ", " + nameNr16; // B
        } else if (iracionals == 1) { // C visi varianti
            if (etisks == 1) {
                if (intuits == 1) {
                    scoreTeamA = nameNr1 + ", " + nameNr9; // CEG
                } else if (sensors == 1) {
                    scoreTeamA = nameNr2 + ", " + nameNr10; // CEH
                } else
                    scoreTeamA = nameNr1 + ", " + nameNr2 + ", " + nameNr9 + ", " + nameNr10; // CE
            } else if (logisks == 1) {
                if (intuits == 1) {
                    scoreTeamA = nameNr3 + ", " + nameNr11; // CFG
                } else if (sensors == 1) {
                    scoreTeamA = nameNr4 + ", " + nameNr12; // CFH
                } else
                    scoreTeamA = nameNr3 + ", " + nameNr4 + ", " + nameNr11 + ", " + nameNr12; // CF
            } else if (intuits == 1) {
                scoreTeamA = nameNr1 + ", " + nameNr3 + ", " + nameNr9 + ", " + nameNr11; // CG
            } else if (sensors == 1) {
                scoreTeamA = nameNr2 + ", " + nameNr4 + ", " + nameNr10 + ", " + nameNr12; // CH
            } else
                scoreTeamA = nameNr1 + ", " + nameNr2 + ", " + nameNr3 + ", " + nameNr4 + ", " + nameNr9 + ", " + nameNr10 + ", " + nameNr11 + ", " + nameNr12; //C
        } else if (racionals == 1) { // D visi varianti
            if (etisks == 1) {
                if (intuits == 1) {
                    scoreTeamA = nameNr5 + ", " + nameNr13; // DEG
                } else if (sensors == 1) {
                    scoreTeamA = nameNr6 + ", " + nameNr14; // DEH
                } else
                    scoreTeamA = nameNr5 + ", " + nameNr6 + ", " + nameNr13 + ", " + nameNr14; // DE
            } else if (logisks == 1) {
                if (intuits == 1) {
                    scoreTeamA = nameNr7 + ", " + nameNr15; // DFG
                } else if (sensors == 1) {
                    scoreTeamA = nameNr8 + ", " + nameNr16; // DFH
                } else
                    scoreTeamA = nameNr7 + ", " + nameNr8 + ", " + nameNr15 + ", " + nameNr16; // DF
            } else if (intuits == 1) {
                scoreTeamA = nameNr5 + ", " + nameNr7 + ", " + nameNr13 + ", " + nameNr15; // DG
            } else if (sensors == 1) {
                scoreTeamA = nameNr6 + ", " + nameNr8 + ", " + nameNr14 + ", " + nameNr16; // DH
            } else
                scoreTeamA = nameNr5 + ", " + nameNr6 + ", " + nameNr7 + ", " + nameNr8 + ", " + nameNr13 + ", " + nameNr14 + ", " + nameNr15 + ", " + nameNr16; //D
        } else if (etisks == 1) { // E visi varianti
            if (intuits == 1) {
                scoreTeamA = nameNr1 + ", " + nameNr9 + ", " + nameNr5 + ", " + nameNr13; //EG
            } else if (sensors == 1) {
                scoreTeamA = nameNr2 + ", " + nameNr10 + ", " + nameNr6 + ", " + nameNr14; // EH
            } else
                scoreTeamA = nameNr1 + ", " + nameNr2 + ", " + nameNr5 + ", " + nameNr6 + ", " + nameNr9 + ", " + nameNr10 + ", " + nameNr13 + ", " + nameNr14; //E
        } else if (logisks == 1) { // F visi varianti
            if (intuits == 1) {
                scoreTeamA = nameNr3 + ", " + nameNr11 + ", " + nameNr7 + ", " + nameNr15; //FG
            } else if (sensors == 1) {
                scoreTeamA = nameNr4 + ", " + nameNr12 + ", " + nameNr8 + ", " + nameNr16; // FH
            } else
                scoreTeamA = nameNr3 + ", " + nameNr4 + ", " + nameNr7 + ", " + nameNr8 + ", " + nameNr11 + ", " + nameNr12 + ", " + nameNr15 + ", " + nameNr16; //F
        } else if (intuits == 1) { // G visi varianti
            scoreTeamA = nameNr1 + ", " + nameNr3 + ", " + nameNr5 + ", " + nameNr7 + ", " + nameNr9 + ", " + nameNr11 + ", " + nameNr13 + ", " + nameNr15; //G
        } else if (sensors == 1) { // H visi varianti
            scoreTeamA = nameNr2 + ", " + nameNr4 + ", " + nameNr6 + ", " + nameNr8 + ", " + nameNr10 + ", " + nameNr12 + ", " + nameNr14 + ", " + nameNr16; //H
        } else scoreTeamA = "Nav loģikas"; //nav loģikas

        displayForTeamF(scoreTeamA);
    }

    public void displayForTeamF(String scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(scoreA));
    }





}
