package com.labawsrh.aws.staggeredgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView staggeredRv;
    private StaggeredRecyclerAdapter adapter ;
    private StaggeredGridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        // let's make the activity on full screen for better ui

        getSupportActionBar().hide();

        staggeredRv = findViewById(R.id.staggered_rv);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        staggeredRv.setLayoutManager(manager);
        // lets create a simple array list of images
        List<row> lst = new ArrayList<>();
        lst.add(new row(R.drawable.illustrationtwo));
        lst.add(new row(R.drawable.clothes));
        lst.add(new row(R.drawable.illustration));
        lst.add(new row(R.drawable.clothes));
        lst.add(new row(R.drawable.paint2));
        lst.add(new row(R.drawable.paint));
        lst.add(new row(R.drawable.clothestwo));
        lst.add(new row(R.drawable.wallpaper));
        lst.add(new row(R.drawable.illustrationtwo));
        lst.add(new row(R.drawable.illustration));
        lst.add(new row(R.drawable.clothes));
        lst.add(new row(R.drawable.paint2));
        lst.add(new row(R.drawable.paint));
        lst.add(new row(R.drawable.clothestwo));
        lst.add(new row(R.drawable.wallpaper));
        lst.add(new row(R.drawable.clothes));





        adapter = new StaggeredRecyclerAdapter(this,lst);
        staggeredRv.setAdapter(adapter);



    }
}
