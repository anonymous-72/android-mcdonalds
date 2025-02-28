package com.first.mcdonalds;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SaucesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sauces);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.sauces);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> {
            finish();
        });

        Button buttonBBQSauce = findViewById(R.id.buttonBBQSauce);
        buttonBBQSauce.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_sauces,
                R.string.bbq_sauce,
                R.mipmap.ic_bbq_sauce_foreground,
                R.string.bbq_sauce_description,
                R.string.bbq_sauce_serving,
                R.string.bbq_sauce_energy,
                R.string.bbq_sauce_fat,
                R.string.bbq_sauce_saturated_fat,
                R.string.bbq_sauce_carbohidrates,
                R.string.bbq_sauce_sugar,
                R.string.bbq_sauce_fibre,
                R.string.bbq_sauce_proteins,
                R.string.bbq_sauce_salt,
                R.string.bbq_sauce_price,
                false,
                false
        ));

        Button buttonCurrySauce = findViewById(R.id.buttonCurrySauce);
        buttonCurrySauce.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_sauces,
                R.string.curry_sauce,
                R.mipmap.ic_curry_sauce_foreground,
                R.string.curry_sauce_description,
                R.string.curry_sauce_serving,
                R.string.curry_sauce_energy,
                R.string.curry_sauce_fat,
                R.string.curry_sauce_saturated_fat,
                R.string.curry_sauce_carbohidrates,
                R.string.curry_sauce_sugar,
                R.string.curry_sauce_fibre,
                R.string.curry_sauce_proteins,
                R.string.curry_sauce_salt,
                R.string.curry_sauce_price,
                false,
                false
        ));

        Button buttonGarlicSauce = findViewById(R.id.buttonGarlicSauce);
        buttonGarlicSauce.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_sauces,
                R.string.garlic_sauce,
                R.mipmap.ic_garlic_sauce_foreground,
                R.string.garlic_sauce_description,
                R.string.garlic_sauce_serving,
                R.string.garlic_sauce_energy,
                R.string.garlic_sauce_fat,
                R.string.garlic_sauce_saturated_fat,
                R.string.garlic_sauce_carbohidrates,
                R.string.garlic_sauce_sugar,
                R.string.garlic_sauce_fibre,
                R.string.garlic_sauce_proteins,
                R.string.garlic_sauce_salt,
                R.string.garlic_sauce_price,
                false,
                false
        ));

        Button buttonKetchup = findViewById(R.id.buttonKetchup);
        buttonKetchup.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_sauces,
                R.string.ketchup,
                R.mipmap.ic_ketchup_foreground,
                R.string.ketchup_description,
                R.string.ketchup_serving,
                R.string.ketchup_energy,
                R.string.ketchup_fat,
                R.string.ketchup_saturated_fat,
                R.string.ketchup_carbohidrates,
                R.string.ketchup_sugar,
                R.string.ketchup_fibre,
                R.string.ketchup_proteins,
                R.string.ketchup_salt,
                R.string.ketchup_price,
                false,
                false
        ));

        Button buttonMayonnaise = findViewById(R.id.buttonMayonnaise);
        buttonMayonnaise.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_sauces,
                R.string.mayonnaise,
                R.mipmap.ic_mayonnaise_foreground,
                R.string.mayonnaise_description,
                R.string.mayonnaise_serving,
                R.string.mayonnaise_energy,
                R.string.mayonnaise_fat,
                R.string.mayonnaise_saturated_fat,
                R.string.mayonnaise_carbohidrates,
                R.string.mayonnaise_sugar,
                R.string.mayonnaise_fibre,
                R.string.mayonnaise_proteins,
                R.string.mayonnaise_salt,
                R.string.mayonnaise_price,
                false,
                false
        ));

        Button buttonMustard = findViewById(R.id.buttonMustard);
        buttonMustard.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_sauces,
                R.string.mustard,
                R.mipmap.ic_mustard_foreground,
                R.string.mustard_description,
                R.string.mustard_serving,
                R.string.mustard_energy,
                R.string.mustard_fat,
                R.string.mustard_saturated_fat,
                R.string.mustard_carbohidrates,
                R.string.mustard_sugar,
                R.string.mustard_fibre,
                R.string.mustard_proteins,
                R.string.mustard_salt,
                R.string.mustard_price,
                false,
                false
        ));

        Button buttonSourCreamSauce = findViewById(R.id.buttonSourCreamSauce);
        buttonSourCreamSauce.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_sauces,
                R.string.sour_cream_sauce,
                R.mipmap.ic_sour_cream_sauce_foreground,
                R.string.sour_cream_sauce_description,
                R.string.sour_cream_sauce_serving,
                R.string.sour_cream_sauce_energy,
                R.string.sour_cream_sauce_fat,
                R.string.sour_cream_sauce_saturated_fat,
                R.string.sour_cream_sauce_carbohidrates,
                R.string.sour_cream_sauce_sugar,
                R.string.sour_cream_sauce_fibre,
                R.string.sour_cream_sauce_proteins,
                R.string.sour_cream_sauce_salt,
                R.string.sour_cream_sauce_price,
                false,
                false
        ));

        Button buttonSweetAndSourSauce = findViewById(R.id.buttonSweetAndSourSauce);
        buttonSweetAndSourSauce.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_sauces,
                R.string.sweet_and_sour_sauce,
                R.mipmap.ic_sweet_and_sour_sauce_foreground,
                R.string.sweet_and_sour_sauce_description,
                R.string.sweet_and_sour_sauce_serving,
                R.string.sweet_and_sour_sauce_energy,
                R.string.sweet_and_sour_sauce_fat,
                R.string.sweet_and_sour_sauce_saturated_fat,
                R.string.sweet_and_sour_sauce_carbohidrates,
                R.string.sweet_and_sour_sauce_sugar,
                R.string.sweet_and_sour_sauce_fibre,
                R.string.sweet_and_sour_sauce_proteins,
                R.string.sweet_and_sour_sauce_salt,
                R.string.sweet_and_sour_sauce_price,
                false,
                false
        ));

        Button buttonTabascoHotSauce = findViewById(R.id.buttonTabascoHotSauce);
        buttonTabascoHotSauce.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_sauces,
                R.string.tabasco_hot_sauce,
                R.mipmap.ic_tabasco_hot_sauce_foreground,
                R.string.tabasco_hot_sauce_description,
                R.string.tabasco_hot_sauce_serving,
                R.string.tabasco_hot_sauce_energy,
                R.string.tabasco_hot_sauce_fat,
                R.string.tabasco_hot_sauce_saturated_fat,
                R.string.tabasco_hot_sauce_carbohidrates,
                R.string.tabasco_hot_sauce_sugar,
                R.string.tabasco_hot_sauce_fibre,
                R.string.tabasco_hot_sauce_proteins,
                R.string.tabasco_hot_sauce_salt,
                R.string.tabasco_hot_sauce_price,
                false,
                false
        ));
    }
}