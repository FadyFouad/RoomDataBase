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
public class UpdateFragment extends Fragment {

    private EditText editID , editName ,editEmail;
    private Button confirmEdit ;

    public UpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update, container, false);
        editID = view.findViewById(R.id.new_id_et);
        editName = view.findViewById(R.id.new_name_et);
        editEmail = view.findViewById(R.id.new_email_et);

        confirmEdit = view.findViewById(R.id.confirm_edit_btn);
        confirmEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(editID.getText().toString());
                String name = editName.getText().toString();
                String mail = editEmail.getText().toString();

                User user = new User(name,mail);
                user.setId(id);
                MainActivity.usersDataBase.userDao().update(user);
                Toast.makeText(getActivity(), "User "+user.getName()+" Updated", Toast.LENGTH_SHORT).show();

            }
        });
        return view ;
    }

}
