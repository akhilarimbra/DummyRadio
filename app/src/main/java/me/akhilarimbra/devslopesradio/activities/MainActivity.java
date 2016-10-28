package me.akhilarimbra.devslopesradio.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.akhilarimbra.devslopesradio.R;
import me.akhilarimbra.devslopesradio.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) fm.findFragmentById(R.id.containerMain);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance("blah", "clah");
            fm.beginTransaction().add(R.id.containerMain, mainFragment).commit();
        }
    }
}
