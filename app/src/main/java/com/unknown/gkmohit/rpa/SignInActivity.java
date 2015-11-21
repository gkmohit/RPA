package com.unknown.gkmohit.rpa;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SignInActivity extends AppCompatActivity {

    @Bind(R.id.userNameFA)
    TextView mUserNameFA;
    @Bind(R.id.passwordFA)
    TextView mPasswordFA;
    @Bind(R.id.signInButton)
    Button mSignInButton;
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
                SignInActivity.this.startActivity(homePage);
            }
        });
    }

}
