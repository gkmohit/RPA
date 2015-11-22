package com.unknown.gkmohit.rpa;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MoneyTabActivity extends AppCompatActivity {


    @Bind(R.id.creditButton)
    Button mCreditButton;

    @Bind(R.id.networthButton)
    Button mNetworthButton;

    @Bind(R.id.stockTextView)
    TextView mStockTextView;

    @Bind(R.id.cashTextView)
    TextView mCashTextView;

    @Bind(R.id.estateTextView)
    TextView mEstateTextView;

    @Bind(R.id.retirementTextView)
    TextView mRetirementTextView;


    private FrameLayout moneytabBarChart;
    private BarChart mChart;

    private float[] yData = {9, 13};
    private String[] xData = {"Income", "Expenditure"};

    @Bind(R.id.gridLayout)
    ListView mGridList;

    private ArrayAdapter mArrayAdapter = null;
    private ArrayList mArrayList = new ArrayList();

    private String[] stockNames = {"Apple Store -$3000", "Income Coca-cola +$3200", "Credit payment -$3500", "Pizza Pizza -$34",
            "Canada GST +$800", "Future Shop -$2300", "Google Play Store -$700", "Money Deposit +$5000",
    "Groceries -$300", "Tesla -$13000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_tab);
        ButterKnife.bind(this);

        for(String stock : stockNames){
            mArrayList.add(stock);
        }

        mArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mArrayList);
        mGridList.setAdapter(mArrayAdapter);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        mStockTextView.setTypeface(font);
        mCashTextView.setTypeface(font);
        mEstateTextView.setTypeface(font);
        mRetirementTextView.setTypeface(font);

        mCreditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent creditPage = new Intent(MoneyTabActivity.this, MoneyCreditActivity.class);
                MoneyTabActivity.this.startActivity(creditPage);
            }
        });

        mNetworthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent netWorthPage = new Intent(MoneyTabActivity.this, MoneyNetworthActivity.class);
                MoneyTabActivity.this.startActivity(netWorthPage);
            }
        });

        mStockTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(MoneyTabActivity.this, HomePageActivity.class);
                MoneyTabActivity.this.startActivity(nextPage);
            }
        });
        moneytabBarChart = (FrameLayout) findViewById(R.id.moneytabBarChart);
        mChart = new BarChart(this);
        //add pie chart to main layout
        moneytabBarChart.addView(mChart);
        moneytabBarChart.setBackgroundColor(Color.argb(250, 242, 242, 242));

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

                Toast.makeText(MoneyTabActivity.this,
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
        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();

        for (int i = 0; i < yData.length; i++)
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


        dataSet.setColors(colors);

        //instantiate pie data object
        BarData data = new BarData(xVals, dataSet);

        data.setValueTextSize(16);
        data.setValueTextColor(Color.BLACK);

        mChart.setData(data);

        //undo highlights
        mChart.highlightValue(null);

        //update pie chart
        mChart.invalidate();

    }
}
