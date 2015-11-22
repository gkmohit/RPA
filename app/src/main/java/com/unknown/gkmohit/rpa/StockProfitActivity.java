package com.unknown.gkmohit.rpa;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StockProfitActivity extends AppCompatActivity {

    @Bind(R.id.stockTextView) TextView mStockTextView;
    @Bind(R.id.cashTextView) TextView mCashTextView;
    @Bind(R.id.estateTextView) TextView mEstateTextView;
    @Bind(R.id.retirementTextView) TextView mRetirementTextView;

    @Bind(R.id.profitButton)
    Button mProfitButton;

    @Bind(R.id.goalsButton)
    Button mGoalsButton;

    @Bind(R.id.ownedButton)
    Button mOwnedButton;

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

        mOwnedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ownedPage = new Intent(StockProfitActivity.this, HomePageActivity.class);
                StockProfitActivity.this.startActivity(ownedPage);

            }
        });

        mGoalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goalsPage = new Intent(StockProfitActivity.this, StocksGoalsActivity.class);
                StockProfitActivity.this.startActivity(goalsPage);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stock_profit, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
