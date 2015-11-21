package com.unknown.gkmohit.rpa;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
                Intent homePage = new Intent(SignInActivity.this, HomePageActivity.class);
                String username = mUserNameEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();
                //model.Person a;
                int i = 0;
//                int size = Persons_List.persons.size();
                Iterator<Person> it = Persons_List.persons.iterator();
                   while (it.hasNext()) {
                       if (it.next().getLogin().get_username().equals(username)) {
                           SignInActivity.this.startActivity(homePage);
                       }
                   }
                }
        });

    }


}
