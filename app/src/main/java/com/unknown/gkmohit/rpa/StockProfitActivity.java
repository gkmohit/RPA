package com.unknown.gkmohit.rpa;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StockProfitActivity extends AppCompatActivity {

    @Bind(R.id.ownedButton)
    Button mOwnedButton;

    @Bind(R.id.goalsButton)
    Button mGoalsButton;

    @Bind(R.id.stockTextView) TextView mStockTextView;
    @Bind(R.id.cashTextView) TextView mCashTextView;
    @Bind(R.id.estateTextView) TextView mEstateTextView;
    @Bind(R.id.retirementTextView) TextView mRetirementTextView;
    private FrameLayout stockProfitLineChart;
    private LineChart mChart;

    private float[] yData ={12,13,15,7,30};
    private String[] xData = {"", "", "", "", ""};


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
        stockProfitLineChart = (FrameLayout) findViewById(R.id.stockProfitLineChart);
        mChart = new LineChart(this);
        //add pie chart to main layout
        stockProfitLineChart.addView(mChart);
        stockProfitLineChart.setBackgroundColor(Color.argb(250, 242, 242, 242));

        //configure pie chart

        mChart.setDescription("");
        mChart.setDoubleTapToZoomEnabled(false);
        mChart.setPinchZoom(false);

        //chart value listener
        mChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry entry, int i, Highlight highlight) {
                //display msg
                if (entry == null)
                    return;

                Toast.makeText(StockProfitActivity.this,
                        xData[entry.getXIndex()] + " = " + entry.getVal(),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected() {

            }
        });

        //add data
        addData();
    }

    private void addData() {
        ArrayList<Entry> yVals1 = new ArrayList<Entry>();

        for(int i =0; i< yData.length; i++)
            yVals1.add(new Entry(yData[i], i));

        ArrayList<String> xVals = new ArrayList<String>();

        for (int i = 0; i < xData.length; i++)
            xVals.add(xData[i]);

        //create pie data set
        LineDataSet dataSet = new LineDataSet(yVals1, "Stock");
        dataSet.setCircleSize(7);

        dataSet.setColor(Color.RED);
        dataSet.setLineWidth(3);
        //instantiate pie data object
        LineData data = new LineData(xVals, dataSet);

        data.setValueTextSize(15);
        data.setValueTextColor(Color.BLACK);

        mChart.setData(data);

        //undo highlights
        mChart.highlightValue(null);

        //update pie chart
        mChart.invalidate();

    }
}
