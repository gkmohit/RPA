package com.unknown.gkmohit.rpa;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import model.Person;

public class HomePageActivity extends AppCompatActivity {

    @Bind(R.id.stockTextView) TextView mStockTextView;
    @Bind(R.id.cashTextView) TextView mCashTextView;
    @Bind(R.id.estateTextView) TextView mEstateTextView;
    @Bind(R.id.retirementTextView) TextView mRetirementTextView;


    @Bind(R.id.goalsButton)
    Button mGoalsButton;

    @Bind(R.id.profitButton)
    Button mProfitButton;


    private FrameLayout ownedPieChartFrame;
    private PieChart mChart;

    private float[] yData ={34,13,15,30,12};
    private String[] xData = {"RBC", "TD", "BMO", "CIBC", "Scotia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        ButterKnife.bind(this);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        mStockTextView.setTypeface(font);
        mCashTextView.setTypeface(font);
        mEstateTextView.setTypeface(font);
        mRetirementTextView.setTypeface(font);

        ownedPieChartFrame = (FrameLayout) findViewById(R.id.ownedPieChartFrame);
        mChart = new PieChart(this);
        //add pie chart to main layout
        ownedPieChartFrame.addView(mChart);
        ownedPieChartFrame.setBackgroundColor(Color.argb(250,242, 242, 242));

        //configure pie chart
        mChart.setUsePercentValues(true);
        mChart.setDescription("");

        //chart hole
        mChart.setDrawHoleEnabled(true);
        mChart.setHoleColorTransparent(true);
        mChart.setHoleRadius(7);
        mChart.setTransparentCircleAlpha(10);

        //rotation
        mChart.setRotationAngle(0);
        mChart.setRotationEnabled(true);

        //chart value listener
        mChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {

            @Override
            public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {
                //display msg
                if (e == null)
                    return;

                Toast.makeText(HomePageActivity.this,
                        xData[e.getXIndex()] + " = " + e.getVal() + "%",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected() {
                // TODO Auto-generated method stub

            }
        });
        //add data
        addData();

        //customize legends
        Legend l = mChart.getLegend();
        l.setEnabled(false);
        l.setPosition(Legend.LegendPosition.RIGHT_OF_CHART);
        l.setXEntrySpace(7);
        l.setYEntrySpace(5);
    }

    private void addData() {
        ArrayList<Entry> yVals1 = new ArrayList<Entry>();

        for(int i =0; i< yData.length; i++)
            yVals1.add(new Entry(yData[i], i));

        ArrayList<String> xVals = new ArrayList<String>();

        for (int i = 0; i < xData.length; i++)
            xVals.add(xData[i]);

        //create pie data set
        PieDataSet dataSet = new PieDataSet(yVals1, "Stock");
        dataSet.setSliceSpace(5);
        dataSet.setSelectionShift(5);

        //add many colors
        ArrayList<Integer> colors = new ArrayList<Integer>();

        for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.COLORFUL_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.PASTEL_COLORS)
            colors.add(c);

        colors.add(ColorTemplate.getHoloBlue());
        dataSet.setColors(colors);

        //instantiate pie data object
        PieData data = new PieData(xVals, dataSet);
        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(11);
        data.setValueTextColor(Color.BLACK);

        mChart.setData(data);

        //undo highlights
        mChart.highlightValue(null);

        //update pie chart
        mChart.invalidate();

        mProfitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profitPage = new Intent(HomePageActivity.this, StockProfitActivity.class);
                HomePageActivity.this.startActivity(profitPage);

            }
        });

        mGoalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goalPage = new Intent(HomePageActivity.this, StocksGoalsActivity.class);
                HomePageActivity.this.startActivity(goalPage);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//            getMenuInflater().inflate(R.menu., menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


