package com.unknown.gkmohit.rpa;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Iterator;

import butterknife.Bind;
import butterknife.ButterKnife;
import data.Persons_List;
import model.Person;

public class SignInActivity extends AppCompatActivity {

    @Bind(R.id.userNameFA)
    TextView mUserNameFA;
    @Bind(R.id.passwordFA)
    TextView mPasswordFA;
    @Bind(R.id.signInButton)
    Button mSignInButton;

    @Bind(R.id.userNameEditText)
    EditText mUserNameEditText;

    @Bind(R.id.passwordEditText)
    EditText mPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        ButterKnife.bind(this);
        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        mUserNameFA.setTypeface(font);
        mPasswordFA.setTypeface(font);

        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Persons_List.access();

                String username = mUserNameEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();

                for (Person p : Persons_List.persons) {
                    if (p.getLogin().get_username().equalsIgnoreCase(username)) {
                        Intent homePage = new Intent(SignInActivity.this, HomePageActivity.class);
                        SignInActivity.this.startActivity(homePage);
                    }

                }
            }
        });
    }


}
