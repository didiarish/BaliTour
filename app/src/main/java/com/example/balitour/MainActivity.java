package com.example.balitour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvTours;
    private ArrayList<Tour> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTours = findViewById(R.id.rv_tours);
        rvTours.setHasFixedSize(true);

        list.addAll(ToursData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTours.setLayoutManager(new LinearLayoutManager(this));
        ListTourAdapter listTourAdapter = new ListTourAdapter(list);
        rvTours.setAdapter(listTourAdapter);

        listTourAdapter.setOnItemClickCallback(new ListTourAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Tour data) {
                showSelectedTour(data);
            }
        });
    }

    private void showRecyclerGrid(){
        rvTours.setLayoutManager(new GridLayoutManager(this, 1));
        GridTourAdapter gridTourAdapter = new GridTourAdapter(list);
        rvTours.setAdapter(gridTourAdapter);

        gridTourAdapter.setOnItemClickCallback(new GridTourAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Tour data) {
                showSelectedTour(data);
            }
        });
    }

    private void showAboutMe() {
        Intent intent = new Intent(MainActivity.this, AboutMe.class);
        startActivity(intent);
    }

    private void showSelectedTour(Tour tour) {

        tour.setPhoto(tour.getPhoto());
        tour.setName(tour.getName());
        tour.setDetail(tour.getDetail());

        Intent moveWithDataIntent = new Intent(MainActivity.this,TourDetails.class);
        moveWithDataIntent.putExtra(TourDetails.EXTRA_TOUR, tour);
        startActivity(moveWithDataIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerList();
                break;

            case R.id.action_grid:
                showRecyclerGrid();
                break;

            case R.id.action_about:
                showAboutMe();
                break;
        }
    }
}

