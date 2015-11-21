package com.unknown.gkmohit.rpa;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Shrey on 11/20/2015.
 */


public class SignUpActivity extends AppCompatActivity {

    @Bind(R.id.signUpButton)
    Button mSignUpButton;

    @Bind(R.id.checkBox)
    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_up);


        ButterKnife.bind(this);

        //mSignUpButton.setVisibility(View.INVISIBLE);
        mSignUpButton.setActivated(false);

        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mSignUpButton.setVisibility(View.VISIBLE);
                mSignUpButton.setActivated(true);
            }
        });
        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homePage = new Intent(SignUpActivity.this, HomePageActivity.class);
                SignUpActivity.this.startActivity(homePage);
            }
        });
    }

}

