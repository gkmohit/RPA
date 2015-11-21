package com.unknown.gkmohit.rpa;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
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

/**
 * Created by tranhien on 15-11-21.
 */
public class StockActivity extends Activity {

        private FrameLayout stockLayout;
        private PieChart mChart;

        private float[] yData ={12,13,15,30,40};
        private String[] xData = {"RBC", "TD", "BMO", "Facebook", "Apple"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_stock);
            stockLayout = (FrameLayout) findViewById(R.id.stockLayout);
            mChart = new PieChart(this);
            //add pie chart to main layout
            stockLayout.addView(mChart);
            stockLayout.setBackgroundColor(Color.TRANSPARENT);

            //configure pie chart
            mChart.setUsePercentValues(true);
            mChart.setDescription("Stock distribution");

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

                    Toast.makeText(StockActivity.this,
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
            data.setValueTextColor(Color.GRAY);

            mChart.setData(data);

            //undo highlights
            mChart.highlightValue(null);

            //update pie chart
            mChart.invalidate();

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
