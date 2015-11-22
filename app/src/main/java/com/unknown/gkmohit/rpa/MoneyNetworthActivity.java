package com.unknown.gkmohit.rpa;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MoneyNetworthActivity extends AppCompatActivity {
    private FrameLayout ownedBarChartFrame;
    private BarChart mChart;

    private float[] yData ={12,-5,7};
    private String[] xData = {"Credit", "Debit", "Networth"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_networth);
        ownedBarChartFrame = (FrameLayout) findViewById(R.id.ownedBarChartFrame);
        mChart = new BarChart(this);
        //add pie chart to main layout
        ownedBarChartFrame.addView(mChart);
        ownedBarChartFrame.setBackgroundColor(Color.argb(250,242, 242, 242));

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
        l.setEnabled(false);
        l.setPosition(Legend.LegendPosition.RIGHT_OF_CHART_INSIDE);
        l.setXEntrySpace(3);
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
        colors.add(Color.rgb(0, 179, 60));
        colors.add(Color.rgb(230, 0, 0));
        colors.add(Color.rgb(0, 179, 61));

//        for (int c : ColorTemplate.JOYFUL_COLORS)
//            colors.add(c);
//
//        for (int c : ColorTemplate.JOYFUL_COLORS)
//            colors.add(c);
//
//        for (int c : ColorTemplate.COLORFUL_COLORS)
//            colors.add(c);
//
//        for (int c : ColorTemplate.LIBERTY_COLORS)
//            colors.add(c);
//
//        for (int c : ColorTemplate.PASTEL_COLORS)
//            colors.add(c);
//
//        colors.add(ColorTemplate.getHoloBlue());
        dataSet.setColors(colors);

        //instantiate pie data object
        BarData data = new BarData(xVals, dataSet);
//        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(11);
        data.setValueTextColor(Color.BLACK);


        mChart.setData(data);

        //undo highlights
        mChart.highlightValue(null);

        //update pie chart
        mChart.invalidate();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_money_networth, menu);
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
