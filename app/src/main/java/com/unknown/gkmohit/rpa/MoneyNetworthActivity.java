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

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

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
    private FrameLayout ownedBarChartFrame;
    private BarChart mChart;

    private float[] yData ={12,-5,7};
    private String[] xData = {"Credit", "Debit", "Networth"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_networth);
        ButterKnife.bind(this);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        mStockTextView.setTypeface(font);
        mCashTextView.setTypeface(font);
        mEstateTextView.setTypeface(font);
        mRetirementTextView.setTypeface(font);


        mCreditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(MoneyNetworthActivity.this, MoneyCreditActivity.class);
                MoneyNetworthActivity.this.startActivity(nextPage);
            }
        });

        mCheckingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(MoneyNetworthActivity.this, MoneyTabActivity.class);
                MoneyNetworthActivity.this.startActivity(nextPage);
            }
        });

        mStockTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(MoneyNetworthActivity.this, HomePageActivity.class);
                MoneyNetworthActivity.this.startActivity(nextPage);
            }
        });


        ownedBarChartFrame = (FrameLayout) findViewById(R.id.ownedBarChartFrame);
        mChart = new BarChart(this);
        //add pie chart to main layout
        ownedBarChartFrame.addView(mChart);
        ownedBarChartFrame.setBackgroundColor(Color.argb(250, 242, 242, 242));

        //configure pie chart
        mChart.setDescription("");
        mChart.setScaleEnabled(false);
        mChart.setPinchZoom(true);
        mChart.setDoubleTapToZoomEnabled(true);

        //chart value listener
        mChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry entry, int i, Highlight highlight) {
                //display msg
                if (entry == null)
                    return;

                Toast.makeText(MoneyNetworthActivity.this,
                        xData[entry.getXIndex()] + " = " + entry.getVal(),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected() {

            }
        });


        //add data
        addData();
        //customize legends
        Legend l = mChart.getLegend();
        l.setEnabled(true);
        l.setPosition(Legend.LegendPosition.ABOVE_CHART_CENTER);
        l.setXEntrySpace(7);
        l.setYEntrySpace(5);

    }

    private void addData() {
        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();

        for(int i =0; i< yData.length; i++)
            yVals1.add(new BarEntry(yData[i], i));

        ArrayList<String> xVals = new ArrayList<String>();

        for (int i = 0; i < xData.length; i++)
            xVals.add(xData[i]);

        //create pie data set
        BarDataSet dataSet = new BarDataSet(yVals1, "Stock");
        //	dataSet.setSliceSpace(5);
        //	dataSet.setSelectionShift(5);

        //add many colors
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(Color.rgb(0, 204, 68));
        colors.add(Color.rgb(230, 0, 0));
        colors.add(Color.rgb(0, 204, 68));

        dataSet.setColors(colors);

        //instantiate pie data object
        BarData data = new BarData(xVals, dataSet);

        data.setValueTextSize(11);
        data.setValueTextColor(Color.BLACK);

        mChart.setData(data);

        //undo highlights
        mChart.highlightValue(null);

        //update pie chart
        mChart.invalidate();

    }

}


