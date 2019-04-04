package com.etatech.roomdatabase;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager manager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();

        if (findViewById(R.id.fragment_container)!=null){
            if (savedInstanceState!=null){
                return;
            }
            manager.beginTransaction()
                    .add(R.id.fragment_container,new MainFragment())
                    .commit();
        }
    }
}
