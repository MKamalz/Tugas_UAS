package com.example.tugas_uas;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity  {
    private static int currentPage;
    private static int NUM_PAGES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new fragmentclass()).commit();
    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment fragment = null;
                    switch (item.getItemId()) {
                        case R.id.home_menu:
                            fragment = new fragmentclass();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, fragment).commit();
                            break;
                        case R.id.daftar:
                            fragment = new fragmentoclass();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, fragment).commit();
                            break;
                        case R.id.feedback:
                            fragment = new fragmentosclass();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, fragment).commit();
                             break;
                    }
                return true;}
            };

  }



