package com.example.user.swim;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class driver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
        new BottomNavigationView.OnNavigationItemSelectedListener()

        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item )
            {
                Fragment selectedFragment = null;
                switch (item.getItemId())
                {
                    case R.id.profile:
                        selectedFragment = new ProfileFragment();
                        break;

                    case R.id.history:
                        selectedFragment = new ridehistory();
                        break;

                    case R.id.notifications:
                        selectedFragment = new notifications();
                        break;

                    case R.id.create_ride:
                        selectedFragment = new create_ride();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.main_container, selectedFragment).commit();
                return true;
            }

        };

    }

