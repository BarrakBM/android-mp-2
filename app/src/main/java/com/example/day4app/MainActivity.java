package com.example.day4app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<TvShows> TvLibrary = new ArrayList<>();

        TvShows bb  = new TvShows("Breaking Bad", "5", "2008-2013",R.drawable.breakingbad);
        TvShows got = new TvShows("Game of Thrones", "8", "2011-2019",R.drawable.got);
        TvShows bl  = new TvShows("The Black List", "8", "2013-",R.drawable.blacklist);
        TvShows hof = new TvShows("House of Card", "6", "2013-2018",R.drawable.houseofcards);
        TvShows suit = new TvShows("Suits","8","2011-2019",R.drawable.suits);
        TvShows vik = new TvShows("Vikings","6","2013-",R.drawable.vikings);
        TvShows ted = new TvShows("Ted Lasso","3","2020",R.drawable.tedlasso);


        TvLibrary.add(bb);
        TvLibrary.add(got);
        TvLibrary.add(bl);
        TvLibrary.add(hof);
        TvLibrary.add(suit);
        TvLibrary.add(vik);
        TvLibrary.add(ted);


        RecyclerView TvList = findViewById(R.id.rv);
       // لترتيب القائمه  عشان ماتبوض الدنيا

        TvList.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        TvList.setLayoutManager(lm);

        // نربط ال recycle view مع arraylist

        TvShowsAdapter tm = new TvShowsAdapter(TvLibrary,MainActivity.this);
        TvList.setAdapter(tm);





    }



}