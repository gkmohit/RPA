package com.unknown.gkmohit.rpa;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StocksGoalsActivity extends AppCompatActivity {

    @Bind(R.id.ownedButton)
    Button mOwnedButton;

    @Bind(R.id.profitButton)
    Button mProfitButton;

    @Bind(R.id.stockTextView)
    TextView mStockTextView;
    @Bind(R.id.cashTextView)
    TextView mCashTextView;
    @Bind(R.id.estateTextView)
    TextView mEstateTextView;
    @Bind(R.id.retirementTextView)
    TextView mRetirementTextView;

    @Bind(R.id.gridLayout)
    ListView mGridList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stocks_goals);
        ButterKnife.bind(this);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        mStockTextView.setTypeface(font);
        mCashTextView.setTypeface(font);
        mEstateTextView.setTypeface(font);
        mRetirementTextView.setTypeface(font);

        mProfitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profitPage = new Intent(StocksGoalsActivity.this, StockProfitActivity.class);
                StocksGoalsActivity.this.startActivity(profitPage);

            }
        });

        mOwnedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ownPage = new Intent(StocksGoalsActivity.this, HomePageActivity.class);
                StocksGoalsActivity.this.startActivity(ownPage);

            }
        });

        mCashTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(StocksGoalsActivity.this, MoneyTabActivity.class);
                StocksGoalsActivity.this.startActivity(nextPage);
            }
        });
    }

}
