package com.first.mcdonalds;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.menus);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> {
            finish();
        });

        Button buttonWhatsNew = findViewById(R.id.buttonWhatsNew);
        buttonWhatsNew.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, WhatsNewActivity.class);
            startActivity(intent);
        });

        Button buttonMealsAndMcDeals = findViewById(R.id.buttonMealsAndMcDeals);
        buttonMealsAndMcDeals.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, MealsAndMcdealsActivity.class);
            startActivity(intent);
        });

        Button buttonBurgers = findViewById(R.id.buttonBurgers);
        buttonBurgers.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, BurgersActivity.class);
            startActivity(intent);
        });

        Button buttonWingsAndMcNuggets = findViewById(R.id.buttonWingsAndMcNuggets);
        buttonWingsAndMcNuggets.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, WingsAndMcnuggetsActivity.class);
            startActivity(intent);
        });

        Button buttonWrapsAndSalads = findViewById(R.id.buttonWrapsAndSalads);
        buttonWrapsAndSalads.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, WrapsAndSaladsActivity.class);
            startActivity(intent);
        });

        Button buttonFriesAndSnacks = findViewById(R.id.buttonFriesAndSnacks);
        buttonFriesAndSnacks.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, FriesAndSnacksActivity.class);
            startActivity(intent);
        });

        Button buttonHappyMeal = findViewById(R.id.buttonHappyMeal);
        buttonHappyMeal.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, HappyMealActivity.class);
            startActivity(intent);
        });

        Button buttonColdDrinks = findViewById(R.id.buttonColdDrinks);
        buttonColdDrinks.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, ColdDrinksActivity.class);
            startActivity(intent);
        });

        Button buttonMcCafe = findViewById(R.id.buttonMcCafe);
        buttonMcCafe.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, MccafeActivity.class);
            startActivity(intent);
        });

        Button buttonDesserts = findViewById(R.id.buttonDesserts);
        buttonDesserts.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, DessertsActivity.class);
            startActivity(intent);
        });

        Button buttonSauces = findViewById(R.id.buttonSauces);
        buttonSauces.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, SaucesActivity.class);
            startActivity(intent);
        });
    }
}