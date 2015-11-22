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

public class StockProfitActivity extends AppCompatActivity {

    @Bind(R.id.ownedButton)
    Button mOwnedButton;

    @Bind(R.id.goalsButton)
    Button mGoalsButton;

    @Bind(R.id.stockTextView)
    TextView mStockTextView;
    @Bind(R.id.cashTextView) TextView mCashTextView;
    @Bind(R.id.estateTextView) TextView mEstateTextView;
    @Bind(R.id.retirementTextView) TextView mRetirementTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_profit);

        ButterKnife.bind(this);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        mStockTextView.setTypeface(font);
        mCashTextView.setTypeface(font);
        mEstateTextView.setTypeface(font);
        mRetirementTextView.setTypeface(font);

        mGoalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goalsPage = new Intent(StockProfitActivity.this, StocksGoalsActivity.class);
                StockProfitActivity.this.startActivity(goalsPage);

            }
        });

        mOwnedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ownPage = new Intent(StockProfitActivity.this, HomePageActivity.class);
                StockProfitActivity.this.startActivity(ownPage);

            }
        });

        mCashTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(StockProfitActivity.this, MoneyTabActivity.class);
                StockProfitActivity.this.startActivity(nextPage);
            }
        });
    }

}
