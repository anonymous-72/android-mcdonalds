package com.first.mcdonalds;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FriesAndSnacksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fries_and_snacks);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.fries_and_snacks);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> {
            finish();
        });

        Button buttonFriesWithTomatoSauceAndFriedOnions = findViewById(R.id.buttonFriesWithTomatoSauceAndFriedOnions);
        buttonFriesWithTomatoSauceAndFriedOnions.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_fries_and_snacks,
                R.string.fries_with_tomato_sauce_and_fried_onions,
                R.mipmap.ic_fries_with_tomato_sauce_and_fried_onions_foreground,
                R.string.fries_with_tomato_sauce_and_fried_onions_description,
                R.string.fries_with_tomato_sauce_and_fried_onions_serving,
                R.string.fries_with_tomato_sauce_and_fried_onions_energy,
                R.string.fries_with_tomato_sauce_and_fried_onions_fat,
                R.string.fries_with_tomato_sauce_and_fried_onions_saturated_fat,
                R.string.fries_with_tomato_sauce_and_fried_onions_carbohidrates,
                R.string.fries_with_tomato_sauce_and_fried_onions_sugar,
                R.string.fries_with_tomato_sauce_and_fried_onions_fibre,
                R.string.fries_with_tomato_sauce_and_fried_onions_proteins,
                R.string.fries_with_tomato_sauce_and_fried_onions_salt,
                R.string.fries_with_tomato_sauce_and_fried_onions_price,
                false,
                false
        ));

        Button buttonWedges = findViewById(R.id.buttonWedges);
        buttonWedges.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_fries_and_snacks,
                R.string.wedges,
                R.mipmap.ic_wedges_foreground,
                R.string.wedges_description,
                R.string.wedges_serving,
                R.string.wedges_energy,
                R.string.wedges_fat,
                R.string.wedges_saturated_fat,
                R.string.wedges_carbohidrates,
                R.string.wedges_sugar,
                R.string.wedges_fibre,
                R.string.wedges_proteins,
                R.string.wedges_salt,
                R.string.wedges_price,
                false,
                false
        ));

        Button buttonFriesLarge = findViewById(R.id.buttonFriesLarge);
        buttonFriesLarge.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_fries_and_snacks,
                R.string.fries_large,
                R.mipmap.ic_fries_large_foreground,
                R.string.fries_large_description,
                R.string.fries_large_serving,
                R.string.fries_large_energy,
                R.string.fries_large_fat,
                R.string.fries_large_saturated_fat,
                R.string.fries_large_carbohidrates,
                R.string.fries_large_sugar,
                R.string.fries_large_fibre,
                R.string.fries_large_proteins,
                R.string.fries_large_salt,
                R.string.fries_large_price,
                false,
                false
        ));

        Button buttonFriesMedium = findViewById(R.id.buttonFriesMedium);
        buttonFriesMedium.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_fries_and_snacks,
                R.string.fries_medium,
                R.mipmap.ic_fries_medium_foreground,
                R.string.fries_medium_description,
                R.string.fries_medium_serving,
                R.string.fries_medium_energy,
                R.string.fries_medium_fat,
                R.string.fries_medium_saturated_fat,
                R.string.fries_medium_carbohidrates,
                R.string.fries_medium_sugar,
                R.string.fries_medium_fibre,
                R.string.fries_medium_proteins,
                R.string.fries_medium_salt,
                R.string.fries_medium_price,
                false,
                false
        ));

        Button buttonFriesRegular = findViewById(R.id.buttonFriesRegular);
        buttonFriesRegular.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_fries_and_snacks,
                R.string.fries_regular,
                R.mipmap.ic_fries_regular_foreground,
                R.string.fries_regular_description,
                R.string.fries_regular_serving,
                R.string.fries_regular_energy,
                R.string.fries_regular_fat,
                R.string.fries_regular_saturated_fat,
                R.string.fries_regular_carbohidrates,
                R.string.fries_regular_sugar,
                R.string.fries_regular_fibre,
                R.string.fries_regular_proteins,
                R.string.fries_regular_salt,
                R.string.fries_regular_price,
                false,
                false
        ));
    }
}