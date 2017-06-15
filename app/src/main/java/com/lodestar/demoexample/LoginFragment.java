package com.lodestar.demoexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginFragment extends Fragment {

    private Button login, facebookLogin, googleLogin;
    private TextView signUp, forgotPassword;

    public LoginFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.login_layout, container, false);

        login = (Button) rootView.findViewById(R.id.button_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),
                        "Login",
                        Toast.LENGTH_SHORT).show();
            }
        });

        facebookLogin = (Button) rootView.findViewById(R.id.facebook_button);
        facebookLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),
                        "Facebook Login",
                        Toast.LENGTH_SHORT).show();
            }
        });

        googleLogin = (Button) rootView.findViewById(R.id.google_button);
        googleLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),
                        "Google Login",
                        Toast.LENGTH_SHORT).show();
            }
        });

        signUp = (TextView) rootView.findViewById(R.id.sign_up);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),
                        "Signup",
                        Toast.LENGTH_SHORT).show();
            }
        });

        forgotPassword = (TextView) rootView.findViewById(R.id.forgot_password);
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),
                        "forgot Password",
                        Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
