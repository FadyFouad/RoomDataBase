package com.etatech.roomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewUsersFragment extends Fragment {


    public ViewUsersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view_users, container, false);
        TextView viewUsers = view.findViewById(R.id.view_users_tv);
        List<User>users = MainActivity.usersDataBase.userDao().getUsers();

        String userInfo = "";

        for (User user : users){
            int id = user.getId();
            String name = user.getName();
            String mail = user.getE_mail();
            userInfo = "\n id  "+ id + "\n name " + name +  "\n E-mail " + mail ;
        }
        viewUsers.setText(userInfo);
        return view ;
    }

}
