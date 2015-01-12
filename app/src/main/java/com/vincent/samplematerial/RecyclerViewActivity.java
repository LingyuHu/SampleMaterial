package com.vincent.samplematerial;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.vincent.samplematerial.View.SampleDivider;
import com.vincent.samplematerial.adapter.RecyclerAdapter;
import com.vincent.samplematerial.bean.OldMan;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewActivity extends Activity {

    private final int[] avatars = {R.drawable.img_1_200, R.drawable.img_2_200, R.drawable.img_3_200,
            R.drawable.img_4_200, R.drawable.img_5_200, R.drawable.img_6_200, R.drawable.img_7_200,
            R.drawable.img_8_200, R.drawable.img_9_200, R.drawable.img_10_200, R.drawable.img_11_200,
            R.drawable.img_12_200};
    private List<OldMan> oldMans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initData();
        initView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recycler_view, menu);
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

    private void initData() {
        oldMans = new ArrayList<>();
        OldMan oldMan;
        for (int i = 0; i < avatars.length; i++) {
            oldMan = new OldMan("第" + i + "个老人", avatars[i]);
            oldMans.add(oldMan);
        }
    }

    private void initView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new SampleDivider(this));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(oldMans);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
