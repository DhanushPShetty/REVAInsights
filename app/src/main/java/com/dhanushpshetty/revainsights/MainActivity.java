package com.dhanushpshetty.revainsights;

import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener navlistener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()) {

                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                            break;

                        case R.id.nav_department:
                            selectedFragment = new DepartmentFragment();
                            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                            break;

                        case R.id.nav_events:
                            selectedFragment = new EventFragment();
                            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                            break;

                        case R.id.nav_club:
                            selectedFragment = new ClubFragment();
                            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                            break;

                        case R.id.nav_student:
                            selectedFragment = new StudentFragment();
                            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                            break;


                    }

                    assert selectedFragment != null;
                    getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container,
                            selectedFragment).commit();

                    return true;
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navlistener);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new
                HomeFragment()).commit();
    }
}






