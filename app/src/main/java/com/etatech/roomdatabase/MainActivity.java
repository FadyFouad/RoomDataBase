package com.etatech.roomdatabase;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager manager ;
    public static UsersDataBase usersDataBase ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        usersDataBase = Room.databaseBuilder(this,UsersDataBase.class,"user_database")
                .allowMainThreadQueries() //TODO : Solve Cannot access database on the main thread since it may potentially lock the UI for a long period of time
                .build();

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
