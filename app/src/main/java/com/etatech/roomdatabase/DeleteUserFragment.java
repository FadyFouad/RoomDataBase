package com.etatech.roomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteUserFragment extends Fragment {


    public DeleteUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_user, container, false);
        final EditText userIdET = view.findViewById(R.id.user_id_et);
        Button confirmDel = view.findViewById(R.id.confirm_delete_btn);
        confirmDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                int id  = Integer.parseInt(userIdET.getText().toString());
                user.setId(id);
                MainActivity.usersDataBase.userDao().delete(user);
                userIdET.setText("");
                Toast.makeText(getActivity(), "Usre "+user.getName()+" Deleted ", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
