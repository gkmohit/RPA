package com.unknown.gkmohit.rpa;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import butterknife.ButterKnife;

/**
 * Created by Shrey on 11/20/2015.
 */
public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
      //  Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
      //  mUserNameFA.setTypeface(font);
       // mPasswordFA.setTypeface(font);


    }
}
