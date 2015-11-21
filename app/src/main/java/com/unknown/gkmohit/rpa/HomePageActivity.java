package com.unknown.gkmohit.rpa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomePageActivity extends AppCompatActivity {
    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mDrawerList = (ListView)findViewById(R.id.navList);

//        private void addDrawerItems() {
//            String[] osArray = { "Android", "iOS", "Windows", "OS X", "Linux" };
//            mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
//            mDrawerList.setAdapter(mAdapter);
        }
}
