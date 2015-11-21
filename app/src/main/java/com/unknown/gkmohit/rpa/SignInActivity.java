package com.unknown.gkmohit.rpa;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SignInActivity extends AppCompatActivity {

    @Bind(R.id.userNameFA)
    TextView mUserNameFA;
    @Bind(R.id.passwordFA)
    TextView mPasswordFA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        ButterKnife.bind(this);
        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        mUserNameFA.setTypeface(font);
        mPasswordFA.setTypeface(font);
    }

}
