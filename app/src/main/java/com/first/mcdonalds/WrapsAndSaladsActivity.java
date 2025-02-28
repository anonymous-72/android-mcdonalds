package com.first.mcdonalds;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WrapsAndSaladsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_wraps_and_salads);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.wraps_and_salads);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> {
            finish();
        });

        Button buttonChickenSalad = findViewById(R.id.buttonChickenSalad);
        buttonChickenSalad.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_wraps_and_salads,
                R.string.chicken_salad,
                R.mipmap.ic_chicken_salad_foreground,
                R.string.chicken_salad_description,
                R.string.chicken_salad_serving,
                R.string.chicken_salad_energy,
                R.string.chicken_salad_fat,
                R.string.chicken_salad_saturated_fat,
                R.string.chicken_salad_carbohidrates,
                R.string.chicken_salad_sugar,
                R.string.chicken_salad_fibre,
                R.string.chicken_salad_proteins,
                R.string.chicken_salad_salt,
                R.string.chicken_salad_price,
                false,
                false
        ));

        Button buttonGreekSalad = findViewById(R.id.buttonGreekSalad);
        buttonGreekSalad.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_wraps_and_salads,
                R.string.greek_salad,
                R.mipmap.ic_greek_salad_foreground,
                R.string.greek_salad_description,
                R.string.greek_salad_serving,
                R.string.greek_salad_energy,
                R.string.greek_salad_fat,
                R.string.greek_salad_saturated_fat,
                R.string.greek_salad_carbohidrates,
                R.string.greek_salad_sugar,
                R.string.greek_salad_fibre,
                R.string.greek_salad_proteins,
                R.string.greek_salad_salt,
                R.string.greek_salad_price,
                false,
                false
        ));

        Button buttonBeefMcWrap = findViewById(R.id.buttonBeefMcWrap);
        buttonBeefMcWrap.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_wraps_and_salads,
                R.string.beef_mcwrap,
                R.mipmap.ic_beef_mcwrap_foreground,
                R.string.beef_mcwrap_description,
                R.string.beef_mcwrap_serving,
                R.string.beef_mcwrap_energy,
                R.string.beef_mcwrap_fat,
                R.string.beef_mcwrap_saturated_fat,
                R.string.beef_mcwrap_carbohidrates,
                R.string.beef_mcwrap_sugar,
                R.string.beef_mcwrap_fibre,
                R.string.beef_mcwrap_proteins,
                R.string.beef_mcwrap_salt,
                R.string.beef_mcwrap_price,
                false,
                false
        ));

        Button buttonChickenMcWrap = findViewById(R.id.buttonChickenMcWrap);
        buttonChickenMcWrap.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_wraps_and_salads,
                R.string.chicken_mcwrap,
                R.mipmap.ic_chicken_mcwrap_foreground,
                R.string.chicken_mcwrap_description,
                R.string.chicken_mcwrap_serving,
                R.string.chicken_mcwrap_energy,
                R.string.chicken_mcwrap_fat,
                R.string.chicken_mcwrap_saturated_fat,
                R.string.chicken_mcwrap_carbohidrates,
                R.string.chicken_mcwrap_sugar,
                R.string.chicken_mcwrap_fibre,
                R.string.chicken_mcwrap_proteins,
                R.string.chicken_mcwrap_salt,
                R.string.chicken_mcwrap_price,
                false,
                false
        ));

        Button buttonFishMcWrap = findViewById(R.id.buttonFishMcWrap);
        buttonFishMcWrap.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_wraps_and_salads,
                R.string.fish_mcwrap,
                R.mipmap.ic_fish_mcwrap_foreground,
                R.string.fish_mcwrap_description,
                R.string.fish_mcwrap_serving,
                R.string.fish_mcwrap_energy,
                R.string.fish_mcwrap_fat,
                R.string.fish_mcwrap_saturated_fat,
                R.string.fish_mcwrap_carbohidrates,
                R.string.fish_mcwrap_sugar,
                R.string.fish_mcwrap_fibre,
                R.string.fish_mcwrap_proteins,
                R.string.fish_mcwrap_salt,
                R.string.fish_mcwrap_price,
                false,
                false
        ));

        Button buttonPrichindelSalad = findViewById(R.id.buttonPrichindelSalad);
        buttonPrichindelSalad.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_wraps_and_salads,
                R.string.prichindel_salad,
                R.mipmap.ic_prichindel_salad_foreground,
                R.string.prichindel_salad_description,
                R.string.prichindel_salad_serving,
                R.string.prichindel_salad_energy,
                R.string.prichindel_salad_fat,
                R.string.prichindel_salad_saturated_fat,
                R.string.prichindel_salad_carbohidrates,
                R.string.prichindel_salad_sugar,
                R.string.prichindel_salad_fibre,
                R.string.prichindel_salad_proteins,
                R.string.prichindel_salad_salt,
                R.string.prichindel_salad_price,
                false,
                false
        ));
    }
}