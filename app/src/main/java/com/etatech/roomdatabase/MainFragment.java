package com.etatech.roomdatabase;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainFragment extends Fragment implements View.OnClickListener {

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_main, container, false);
        Button btnAdd = view.findViewById(R.id.btn_add_user);
        Button btnView = view.findViewById(R.id.btn_view_user);
        btnAdd.setOnClickListener(this);
        btnView.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_add_user:MainActivity.manager.beginTransaction()
                    .replace(R.id.fragment_container,new AddFragment())
                    .addToBackStack(null)
                    .commit();
            break;
            case R.id.btn_view_user:MainActivity.manager.beginTransaction()
                    .replace(R.id.fragment_container,new ViewUsersFragment())
                    .addToBackStack(null)
                    .commit();
            break;
            case R.id.btn_delete_user:MainActivity.manager.beginTransaction()
                    .replace(R.id.fragment_container,new DeleteUserFragment())
                    .addToBackStack(null)
                    .commit();
            break;
            case R.id.btn_update_user:MainActivity.manager.beginTransaction()
                    .replace(R.id.fragment_container,new ViewUsersFragment())
                    .addToBackStack(null)
                    .commit();
            break;
        }

    }
}
