package sg.edu.rp.c346.id21023135.mymoviesinsertmovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText etTitle, etGenre, etYear;
    Spinner spnRating;
    Button btnInsert, btnShowList;
    ArrayList<Movies> alInsert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTitle = findViewById(R.id.etTitle);
        etGenre  = findViewById(R.id.etGenre);
        etYear = findViewById(R.id.etYear);
        spnRating = findViewById(R.id.spnRating);
        btnInsert = findViewById(R.id.btnInsert);
        btnShowList = findViewById(R.id.btnShowList);

        alInsert = new ArrayList<>();
        spnRating.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String rating = "";
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                switch (pos) {
                    case 0:
                        rating = parent.getItemAtPosition(pos).toString();
                        break;
                    case 1:
                        rating = parent.getItemAtPosition(pos).toString();
                        break;
                    case 2:
                        rating = parent.getItemAtPosition(pos).toString();
                        break;
                    case 3:
                        rating = parent.getItemAtPosition(pos).toString();
                        break;
                    case 4:
                        rating = parent.getItemAtPosition(pos).toString();
                        break;
                    case 5:
                        rating = parent.getItemAtPosition(pos).toString();
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = etTitle.getText().toString();
                String genre = etGenre.getText().toString();
                int year = Integer.parseInt(etYear.getText().toString());
                String rating = spnRating.getSelectedItem().toString();
                Movies item = new Movies(title, genre, year, rating);
                alInsert.add(item);
            }
        });
    }
}