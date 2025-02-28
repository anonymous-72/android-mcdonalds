package com.first.mcdonalds;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WingsAndMcnuggetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_wings_and_mcnuggets);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.wings_and_mcnuggets);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> {
            finish();
        });

        Button buttonChickenMcNuggets20Pcs = findViewById(R.id.buttonChickenMcNuggets20Pcs);
        buttonChickenMcNuggets20Pcs.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_wings_and_mcnuggets,
                R.string.chicken_mcnuggets_20_pcs,
                R.mipmap.ic_chicken_mcnuggets_20_pcs_foreground,
                R.string.chicken_mcnuggets_20_pcs_description,
                R.string.chicken_mcnuggets_20_pcs_serving,
                R.string.chicken_mcnuggets_20_pcs_energy,
                R.string.chicken_mcnuggets_20_pcs_fat,
                R.string.chicken_mcnuggets_20_pcs_saturated_fat,
                R.string.chicken_mcnuggets_20_pcs_carbohidrates,
                R.string.chicken_mcnuggets_20_pcs_sugar,
                R.string.chicken_mcnuggets_20_pcs_fibre,
                R.string.chicken_mcnuggets_20_pcs_proteins,
                R.string.chicken_mcnuggets_20_pcs_salt,
                R.string.chicken_mcnuggets_20_pcs_price,
                false,
                false
        ));

        Button buttonChickenMcNuggets9Pcs = findViewById(R.id.buttonChickenMcNuggets9Pcs);
        buttonChickenMcNuggets9Pcs.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_wings_and_mcnuggets,
                R.string.chicken_mcnuggets_9_pcs,
                R.mipmap.ic_chicken_mcnuggets_9_pcs_foreground,
                R.string.chicken_mcnuggets_9_pcs_description,
                R.string.chicken_mcnuggets_9_pcs_serving,
                R.string.chicken_mcnuggets_9_pcs_energy,
                R.string.chicken_mcnuggets_9_pcs_fat,
                R.string.chicken_mcnuggets_9_pcs_saturated_fat,
                R.string.chicken_mcnuggets_9_pcs_carbohidrates,
                R.string.chicken_mcnuggets_9_pcs_sugar,
                R.string.chicken_mcnuggets_9_pcs_fibre,
                R.string.chicken_mcnuggets_9_pcs_proteins,
                R.string.chicken_mcnuggets_9_pcs_salt,
                R.string.chicken_mcnuggets_9_pcs_price,
                false,
                false
        ));

        Button buttonChickenMcNuggets6Pcs = findViewById(R.id.buttonChickenMcNuggets6Pcs);
        buttonChickenMcNuggets6Pcs.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_wings_and_mcnuggets,
                R.string.chicken_mcnuggets_6_pcs,
                R.mipmap.ic_chicken_mcnuggets_6_pcs_foreground,
                R.string.chicken_mcnuggets_6_pcs_description,
                R.string.chicken_mcnuggets_6_pcs_serving,
                R.string.chicken_mcnuggets_6_pcs_energy,
                R.string.chicken_mcnuggets_6_pcs_fat,
                R.string.chicken_mcnuggets_6_pcs_saturated_fat,
                R.string.chicken_mcnuggets_6_pcs_carbohidrates,
                R.string.chicken_mcnuggets_6_pcs_sugar,
                R.string.chicken_mcnuggets_6_pcs_fibre,
                R.string.chicken_mcnuggets_6_pcs_proteins,
                R.string.chicken_mcnuggets_6_pcs_salt,
                R.string.chicken_mcnuggets_6_pcs_price,
                false,
                false
        ));

        Button buttonSpicyChickenWings8Pcs = findViewById(R.id.buttonSpicyChickenWings8Pcs);
        buttonSpicyChickenWings8Pcs.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_wings_and_mcnuggets,
                R.string.spicy_chicken_wings_8_pcs,
                R.mipmap.ic_spicy_chicken_wings_8_pcs_foreground,
                R.string.spicy_chicken_wings_8_pcs_description,
                R.string.spicy_chicken_wings_8_pcs_serving,
                R.string.spicy_chicken_wings_8_pcs_energy,
                R.string.spicy_chicken_wings_8_pcs_fat,
                R.string.spicy_chicken_wings_8_pcs_saturated_fat,
                R.string.spicy_chicken_wings_8_pcs_carbohidrates,
                R.string.spicy_chicken_wings_8_pcs_sugar,
                R.string.spicy_chicken_wings_8_pcs_fibre,
                R.string.spicy_chicken_wings_8_pcs_proteins,
                R.string.spicy_chicken_wings_8_pcs_salt,
                R.string.spicy_chicken_wings_8_pcs_price,
                false,
                false
        ));

        Button buttonSpicyChickenWings5Pcs = findViewById(R.id.buttonSpicyChickenWings5Pcs);
        buttonSpicyChickenWings5Pcs.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_wings_and_mcnuggets,
                R.string.spicy_chicken_wings_5_pcs,
                R.mipmap.ic_spicy_chicken_wings_5_pcs_foreground,
                R.string.spicy_chicken_wings_5_pcs_description,
                R.string.spicy_chicken_wings_5_pcs_serving,
                R.string.spicy_chicken_wings_5_pcs_energy,
                R.string.spicy_chicken_wings_5_pcs_fat,
                R.string.spicy_chicken_wings_5_pcs_saturated_fat,
                R.string.spicy_chicken_wings_5_pcs_carbohidrates,
                R.string.spicy_chicken_wings_5_pcs_sugar,
                R.string.spicy_chicken_wings_5_pcs_fibre,
                R.string.spicy_chicken_wings_5_pcs_proteins,
                R.string.spicy_chicken_wings_5_pcs_salt,
                R.string.spicy_chicken_wings_5_pcs_price,
                false,
                false
        ));
    }
}