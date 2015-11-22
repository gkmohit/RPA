package com.unknown.gkmohit.rpa;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;

public class MoneyNetworthActivity extends AppCompatActivity {

    @Bind(R.id.creditButton)
    Button mCreditButton;

    @Bind(R.id.checkingsButton)
    Button mCheckingsButton;

    @Bind(R.id.stockTextView)
    TextView mStockTextView;

    @Bind(R.id.cashTextView)
    TextView mCashTextView;

    @Bind(R.id.estateTextView)
    TextView mEstateTextView;

    @Bind(R.id.retirementTextView)
    TextView mRetirementTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_networth);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        mStockTextView.setTypeface(font);
        mCashTextView.setTypeface(font);
        mEstateTextView.setTypeface(font);
        mRetirementTextView.setTypeface(font);

        mCashTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(MoneyNetworthActivity.this, MoneyCreditActivity.class);
                MoneyNetworthActivity.this.startActivity(nextPage);
            }
        });

        mCreditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(MoneyNetworthActivity.this, MoneyNetworthActivity.class);
                MoneyNetworthActivity.this.startActivity(nextPage);
            }
        });


    }




}
