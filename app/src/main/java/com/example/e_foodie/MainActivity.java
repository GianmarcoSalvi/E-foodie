package com.example.e_foodie;

import static androidx.navigation.Navigation.findNavController;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;

import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import androidx.navigation.NavController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        // SETTING THE NAV CONTROLLER - it is responsible of changing fragment content
        NavController navController = findNavController(this, R.id.current_fragment);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

        // needed to swap the name of the fragment at the top when actually swapping fragment in the nav bar
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.searchFragment, R.id.submitFragment, R.id.profileFragment)
                .build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

    }

}