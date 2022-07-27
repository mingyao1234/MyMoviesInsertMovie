package sg.edu.rp.c346.id21023135.mymoviesinsertmovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class moviesList extends AppCompatActivity {
    ListView lvmovie;
    ArrayList<Movies> alMovie;
    CustomAdapter caMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);
        lvmovie = findViewById(R.id.lvMovie);

        alMovie = new ArrayList<>();
        Intent intentReceived = getIntent();
        String title = intentReceived.getStringExtra("title");
        String genre = intentReceived.getStringExtra("genre");
        int year = intentReceived.getIntExtra("year", 0);
        String rating = intentReceived.getStringExtra("rating");
        Movies item1 = new Movies(title, genre, year, rating);
        alMovie.add(item1);

        caMovie = new CustomAdapter(this, R.layout.row,alMovie);
        lvmovie.setAdapter(caMovie);
    }
}