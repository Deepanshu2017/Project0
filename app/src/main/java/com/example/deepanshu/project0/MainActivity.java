package com.example.deepanshu.project0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button popular_movies = (Button) this.findViewById(R.id.popular_movies);
        Button stock_hawk = (Button) this.findViewById(R.id.stock_hawk);
        Button build_it_bigger = (Button) this.findViewById(R.id.build_it_bigger);
        Button make_your_app_material = (Button) this.findViewById(R.id.make_your_app_material);
        Button go_ubiquitous = (Button) this.findViewById(R.id.go_ubiquitous);
        Button capstone = (Button) this.findViewById(R.id.capstone);

        popular_movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "This button will launch my popular movies app",
                        Toast.LENGTH_LONG).show();
            }
        });

        stock_hawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "This button will launch my stock hawk app",
                        Toast.LENGTH_LONG).show();
            }
        });

        build_it_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "This button will launch my build it bigger app",
                        Toast.LENGTH_LONG).show();
            }
        });

        make_your_app_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "This button will launch my make your app material app",
                        Toast.LENGTH_LONG).show();
            }
        });

        go_ubiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "This button will launch my go ubiquitous app",
                        Toast.LENGTH_LONG).show();
            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "This button will launch my capstone app",
                        Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
