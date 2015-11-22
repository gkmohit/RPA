package com.unknown.gkmohit.rpa;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StocksGoalsActivity extends AppCompatActivity {

//    @Bind(R.id.ownedButton) Button mOwnedButton;
//    @Bind(R.id.profitButton) Button mProfitButton;
//    @Bind(R.id.stockTextView) TextView mStockTextView;
//    @Bind(R.id.cashTextView) TextView mCashTextView;
//    @Bind(R.id.cashTextView) TextView mCashTextView;
//    @Bind(R.id.estateTextView) TextView mEstateTextView;
//    @Bind(R.id.retirementTextView) TextView mRetirementTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stocks_goals);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
//        mOwnedButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent ownedpage = new Intent(StocksGoalsActivity.this, HomePageActivity.class);
//                StocksGoalsActivity.this.startActivity(ownedpage);
//            }
//        });

//        mProfitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent profitPage = new Intent(StocksGoalsActivity.this, StockProfitActivity.class);
//                StocksGoalsActivity.this.startActivity(profitPage);
//            }
//        });
        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);


    }

}
