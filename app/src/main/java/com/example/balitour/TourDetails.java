package com.example.balitour;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TourDetails extends AppCompatActivity {
    public static final String EXTRA_TOUR = "extra_tour";

    TextView tv_judul, tv_deskripsi;
    ImageView img_cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_details);

        tv_judul = findViewById(R.id.tv_tourDetails);
        tv_deskripsi = findViewById(R.id.tv_deskripsi);
        img_cover = findViewById(R.id.img_tour);

        Tour tour = getIntent().getParcelableExtra(EXTRA_TOUR);

        img_cover.setImageResource(tour.getPhoto());
        tv_judul.setText(tour.getName());
        tv_deskripsi.setText(tour.getDetail());

    }
}
