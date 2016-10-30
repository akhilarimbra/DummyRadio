package me.akhilarimbra.devslopesradio.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.akhilarimbra.devslopesradio.R;
import me.akhilarimbra.devslopesradio.fragments.DetailsFragment;
import me.akhilarimbra.devslopesradio.fragments.MainFragment;
import me.akhilarimbra.devslopesradio.model.Station;

public class MainActivity extends AppCompatActivity {
    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    private static MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.setMainActivity(this);

        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) fm.findFragmentById(R.id.containerMain);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance("blah", "clah");
            fm.beginTransaction().add(R.id.containerMain, mainFragment).commit();
        }
    }

    public void loadDetailsScreen(Station selectedStation) {
        getSupportFragmentManager().beginTransaction().replace(R.id.containerMain, new DetailsFragment()).addToBackStack(null).commit();
    }
}
