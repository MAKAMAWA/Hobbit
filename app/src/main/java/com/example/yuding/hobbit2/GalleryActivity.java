package com.example.yuding.hobbit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import static com.example.yuding.hobbit2.R.id.galleryView;


public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        GridView galleryview = (GridView) findViewById(galleryView);
        galleryview.setAdapter(new ImageAdapter(this));

        galleryview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(GalleryActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
