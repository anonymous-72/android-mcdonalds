package com.first.mcdonalds;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HappyMealActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_happy_meal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.happy_meal);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> {
            finish();
        });

        Button button4ChickenMcNuggetsHappyMeal = findViewById(R.id.button4ChickenMcNuggetsHappyMeal);
        button4ChickenMcNuggetsHappyMeal.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_happy_meal,
                R.string.four_chicken_mcnuggets_happy_meal,
                R.mipmap.ic_4_chicken_mcnuggets_happy_meal_foreground,
                R.string.four_chicken_mcnuggets_happy_meal_description,
                R.string.four_chicken_mcnuggets_happy_meal_serving,
                R.string.four_chicken_mcnuggets_happy_meal_energy,
                R.string.four_chicken_mcnuggets_happy_meal_fat,
                R.string.four_chicken_mcnuggets_happy_meal_saturated_fat,
                R.string.four_chicken_mcnuggets_happy_meal_carbohidrates,
                R.string.four_chicken_mcnuggets_happy_meal_sugar,
                R.string.four_chicken_mcnuggets_happy_meal_fibre,
                R.string.four_chicken_mcnuggets_happy_meal_proteins,
                R.string.four_chicken_mcnuggets_happy_meal_salt,
                R.string.four_chicken_mcnuggets_happy_meal_price,
                true,
                false
        ));

        Button buttonCheeseburgerHappyMeal = findViewById(R.id.buttonCheeseburgerHappyMeal);
        buttonCheeseburgerHappyMeal.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_happy_meal,
                R.string.cheeseburger_happy_meal,
                R.mipmap.ic_cheeseburger_happy_meal_foreground,
                R.string.cheeseburger_happy_meal_description,
                R.string.cheeseburger_happy_meal_serving,
                R.string.cheeseburger_happy_meal_energy,
                R.string.cheeseburger_happy_meal_fat,
                R.string.cheeseburger_happy_meal_saturated_fat,
                R.string.cheeseburger_happy_meal_carbohidrates,
                R.string.cheeseburger_happy_meal_sugar,
                R.string.cheeseburger_happy_meal_fibre,
                R.string.cheeseburger_happy_meal_proteins,
                R.string.cheeseburger_happy_meal_salt,
                R.string.cheeseburger_happy_meal_price,
                true,
                false
        ));

        Button buttonHamburgerHappyMeal = findViewById(R.id.buttonHamburgerHappyMeal);
        buttonHamburgerHappyMeal.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_happy_meal,
                R.string.hamburger_happy_meal,
                R.mipmap.ic_hamburger_happy_meal_foreground,
                R.string.hamburger_happy_meal_description,
                R.string.hamburger_happy_meal_serving,
                R.string.hamburger_happy_meal_energy,
                R.string.hamburger_happy_meal_fat,
                R.string.hamburger_happy_meal_saturated_fat,
                R.string.hamburger_happy_meal_carbohidrates,
                R.string.hamburger_happy_meal_sugar,
                R.string.hamburger_happy_meal_fibre,
                R.string.hamburger_happy_meal_proteins,
                R.string.hamburger_happy_meal_salt,
                R.string.hamburger_happy_meal_price,
                true,
                false
        ));

        Button buttonMcPuisorHappyMeal = findViewById(R.id.buttonMcPuisorHappyMeal);
        buttonMcPuisorHappyMeal.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_happy_meal,
                R.string.mcpuisor_happy_meal,
                R.mipmap.ic_mcpuisor_happy_meal_foreground,
                R.string.mcpuisor_happy_meal_description,
                R.string.mcpuisor_happy_meal_serving,
                R.string.mcpuisor_happy_meal_energy,
                R.string.mcpuisor_happy_meal_fat,
                R.string.mcpuisor_happy_meal_saturated_fat,
                R.string.mcpuisor_happy_meal_carbohidrates,
                R.string.mcpuisor_happy_meal_sugar,
                R.string.mcpuisor_happy_meal_fibre,
                R.string.mcpuisor_happy_meal_proteins,
                R.string.mcpuisor_happy_meal_salt,
                R.string.mcpuisor_happy_meal_price,
                true,
                false
        ));

        Button buttonMcToastHappyMeal = findViewById(R.id.buttonMcToastHappyMeal);
        buttonMcToastHappyMeal.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_happy_meal,
                R.string.mctoast_happy_meal,
                R.mipmap.ic_mctoast_happy_meal_foreground,
                R.string.mctoast_happy_meal_description,
                R.string.mctoast_happy_meal_serving,
                R.string.mctoast_happy_meal_energy,
                R.string.mctoast_happy_meal_fat,
                R.string.mctoast_happy_meal_saturated_fat,
                R.string.mctoast_happy_meal_carbohidrates,
                R.string.mctoast_happy_meal_sugar,
                R.string.mctoast_happy_meal_fibre,
                R.string.mctoast_happy_meal_proteins,
                R.string.mctoast_happy_meal_salt,
                R.string.mctoast_happy_meal_price,
                true,
                false
        ));
    }
}