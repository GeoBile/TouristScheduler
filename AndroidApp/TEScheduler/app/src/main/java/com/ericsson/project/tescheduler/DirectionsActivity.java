package com.ericsson.project.tescheduler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.ericsson.project.tescheduler.Tools.DirectionsRVA;

public class DirectionsActivity extends MenuedActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //ToDO Work on formatting the resulting route
        /*recyclerView = (RecyclerView) findViewById(R.id.recycler_piduration);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);*/

    }

    @Override
    protected void onResume() {
        super.onResume();
        //DirectionsRVA adapter = new DirectionsRVA();
        //recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return id == R.id.action_directions || super.onOptionsItemSelected(item);
    }
}
