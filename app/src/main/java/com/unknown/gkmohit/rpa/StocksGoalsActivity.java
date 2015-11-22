package com.unknown.gkmohit.rpa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stocks_goals);
        ButterKnife.bind(this);

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


    }

}
