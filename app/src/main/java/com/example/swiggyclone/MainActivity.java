package com.example.swiggyclone;

//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//

import static android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;


import com.example.swiggyclone.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    private NavController navController;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_container);
        navController = navHostFragment.getNavController();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            TextView textViewId = binding.tvHome;
            int Id = destination.getId();
            if(Id == R.id.homeFragment)
            {
                setStatusBarColorAndAppearance(R.color.white);
                textViewId = binding.tvHome;
                showHideViews(View.VISIBLE, View.GONE, View.GONE, View.GONE, View.GONE);
                setTextViewStyles(binding.tvFood, binding.tvInstamart, binding.tvDineout, binding.tvGenie);

            } else if (Id==R.id.foodFragment) {
                setStatusBarColorAndAppearance(R.color.white);
                textViewId = binding.tvFood;
                showHideViews(View.GONE, View.VISIBLE, View.GONE, View.GONE, View.GONE);
                setTextViewStyles(binding.tvHome, binding.tvInstamart, binding.tvDineout, binding.tvGenie);



            } else if (Id==R.id.instamartFragment) {
                setStatusBarColorAndAppearance(R.color.bg_pink);
                textViewId = binding.tvInstamart;
                showHideViews(View.GONE, View.GONE, View.VISIBLE, View.GONE, View.GONE);
                setTextViewStyles(binding.tvHome, binding.tvFood, binding.tvDineout, binding.tvGenie);
              //  Toast.makeText(getApplicationContext(), "Instamart is on Click", Toast.LENGTH_SHORT).show();

            } else if (Id==R.id.dineoutFragment) {
                setStatusBarColorAndAppearance(R.color.black);
                textViewId = binding.tvDineout;
                showHideViews(View.GONE, View.GONE, View.GONE, View.VISIBLE, View.GONE);
                setTextViewStyles(binding.tvHome, binding.tvFood, binding.tvInstamart, binding.tvGenie);

            } else if (Id ==R.id.genieFragment) {
                setStatusBarColorAndAppearance(R.color.bg_violet);
                textViewId = binding.tvGenie;
                showHideViews(View.GONE, View.GONE, View.GONE, View.GONE, View.VISIBLE);
                setTextViewStyles(binding.tvHome, binding.tvFood, binding.tvInstamart, binding.tvDineout);

            }


            textViewId.setTextColor(Color.BLACK);
            textViewId.setTypeface(Typeface.create(binding.tvHome.getTypeface(), Typeface.BOLD));
        });



    }
    private void setStatusBarColorAndAppearance(int colorResId) {
        Window window = getWindow();
        window.setStatusBarColor(ContextCompat.getColor(this, colorResId));
        window.getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
    }

    private void showHideViews(int visibilityHome, int visibilityFood, int visibilityInstamart, int visibilityDineout, int visibilityGenie) {
        binding.viewHome.setVisibility(visibilityHome);
        binding.viewFood.setVisibility(visibilityFood);
        binding.viewInstamart.setVisibility(visibilityInstamart);
        binding.viewDineout.setVisibility(visibilityDineout);
        binding.viewGenie.setVisibility(visibilityGenie);
    }

    private void setTextViewStyles(TextView... textViews) {
        int darkGreyColor = ContextCompat.getColor(this, R.color.dark_grey);
        for (TextView textView : textViews) {
            textView.setTextColor(darkGreyColor);
            textView.setTypeface(Typeface.create(textView.getTypeface(), Typeface.NORMAL));
        }
}
}