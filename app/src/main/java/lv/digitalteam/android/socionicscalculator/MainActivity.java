package lv.digitalteam.android.socionicscalculator;

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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    int calcLirikis = 0;
    int calcStarpnieks = 0;
    int calcKritikis = 0;
    int calcMeistars = 0;
    int calcHumanists = 0;
    int calcGlabatajs = 0;
    int calcAnalitikis = 0;
    int calcInspektors = 0;
    int calcPadomdevejs = 0;
    int calcPolitikis = 0;
    int calcMekletajs = 0;
    int calcMarsals = 0;
    int calcAudzinatajs = 0;
    int calcEntuziasts = 0;
    int calcUznemejs = 0;
    int calcAdministrators = 0;

    //paggaidu mainīgais pogu rezultātu izvadīšanai


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
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
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
            // Handle the camera action
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

    String scoreTeamA = "Gaidam rezultātu";
    String scoreTeamB = "Gaidam rezultātu";

    public void reset(View v) {
        scoreTeamA = "Gaidam rezultātu";
        scoreTeamB = "Gaidam rezultātu";
    }


    // varbūt jātaisa ta, ka katram tipam ir kods abcd
    int Intraverts = 0;
    int ekstraverts = 0;

    public void addIntraverts(View v) {
        scoreTeamA = "Intraverts";
        if (Intraverts == 0) {
            Intraverts = 1;
            ekstraverts = 0;
            Aprekins(Intraverts);
            displayForTeamA(scoreTeamA);
        }
    }

    public void addEkstraverts(View v) {
        scoreTeamA = "Ekstraverts";
        if (ekstraverts == 0) {
            ekstraverts = 1;
            Intraverts = 0;
            Aprekins(ekstraverts);
            displayForTeamA(scoreTeamA);
        }
    }

    int racionals = 0;
    int iracionals = 0;

    public void addRacionals(View v) {
        scoreTeamA = "Racionāls";
        if (racionals == 0) {
            racionals = 1;
            iracionals = 0;
            Aprekins(racionals);
            displayForTeamA(scoreTeamA);
        }

    }

    public void addIracionals(View v) {
        scoreTeamA = "Iracionāls";
        if (iracionals == 0) {
            iracionals = 1;
            racionals = 0;
            Aprekins(iracionals);
            displayForTeamA(scoreTeamA);
        }

    }

    int etisks = 0;
    int logisks = 0;

    public void addLogisks(View v) {
        scoreTeamA = "Loģisks";
        if (logisks == 0) {
            logisks = 1;
            etisks = 0;
            Aprekins(logisks);
            displayForTeamA(scoreTeamA);
        }
    }

    public void addEtisks(View v) {
        scoreTeamA = "Ētisks";
        if (etisks == 0) {
            etisks = 1;
            logisks = 0;
            Aprekins(etisks);
            displayForTeamA(scoreTeamA);
        }
    }

    int sensors = 0;
    int intuits = 0;

    public void addSensors(View v) {
        scoreTeamA = "Sensors";
        if (sensors == 0) {
            sensors = 1;
            intuits = 0;
            Aprekins(sensors);
            displayForTeamA(scoreTeamA);
        }
    }

    public void addIntuits(View v) {
        scoreTeamA = "Intūīts";
        if (intuits == 0) {
            intuits = 1;
            sensors = 0;
            Aprekins(intuits);
            displayForTeamA(scoreTeamA);
        }
    }

    public void Aprekins(int number) {
        scoreTeamB = scoreTeamB + number + calcStarpnieks;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(String score) {
        if (Intraverts == 1) {
            if (iracionals == 1) {
                if (etisks == 1) {
                    if (intuits == 1) {
                        scoreTeamA = "Jesēņins";
                    } else if (sensors == 1) {
                        scoreTeamA = "Dimā";
                    } else scoreTeamA = "Jesēņins, Dimā";
                } else if (logisks == 1) {
                    if (intuits == 1) {
                        scoreTeamA = "Balzaks";
                    } else if (sensors == 1) {
                        scoreTeamA = "Gabēns";
                    } else scoreTeamA = "Balzaks, Gabēns";
                } else scoreTeamA = "Jesēņins, Dimā, Balzaks, Gabēns";
            } else if (racionals == 1) {
                scoreTeamA = "Dostajevskis, Draizers, Robespjērs, Maksims";
            } else
                scoreTeamA = "Jesēņins, Dimā, Balzaks, Gabēns, Dostajevskis, Draizers, Robespjērs, Maksims";
        } else if (ekstraverts == 1) {
            scoreTeamA = "Hakslijs, Napoleons, Dons Kihots, Žukovs, Hamlets, Igo, Džeks Londons, Štirlics";
        }
         displayForTeamF(scoreTeamA);
    }



    public void displayForTeamF (String scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(scoreA));
    }


    public void displayForTeamB (String scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(scoreB));
    }
}
