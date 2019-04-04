package com.etatech.roomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment {


    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);

        final TextView nameTV = view.findViewById(R.id.edt_txt_name);
        final TextView emailTV = view.findViewById(R.id.edt_txt_email);
        Button saveBtn = view.findViewById(R.id.btn_save);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameTV.getText().toString();
                String email = emailTV.getText().toString();


                User user = new User(name,email);
                MainActivity.usersDataBase.userDao().insert(user);
                Toast.makeText(getContext(), "User Added", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
