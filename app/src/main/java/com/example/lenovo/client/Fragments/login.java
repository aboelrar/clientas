package com.example.lenovo.client.Fragments;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lenovo.client.R;
import com.example.lenovo.client.view.verfication;

/**
 * A simple {@link Fragment} subclass.
 */
public class login extends Fragment {
View view;
Button login;

    public login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_login, container, false);
        popUp();
        return view;
    }
    public void popUp()
    {
        login=(Button)view.findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Loading...");
                pd.show();
                goToVerifcation();
            }
        });

    }
    public void goToVerifcation()
    {
        startActivity(new Intent(getActivity(),verfication.class));
    }

}
