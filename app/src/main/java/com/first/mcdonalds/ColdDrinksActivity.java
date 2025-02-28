package com.first.mcdonalds;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ColdDrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cold_drinks);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.cold_drinks);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> {
            finish();
        });

        Button buttonCocaCola500Ml = findViewById(R.id.buttonCocaCola500Ml);
        buttonCocaCola500Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.coca_cola_500_ml,
                R.mipmap.ic_coca_cola_500_ml_foreground,
                R.string.coca_cola_500_ml_description,
                R.string.coca_cola_500_ml_serving,
                R.string.coca_cola_500_ml_energy,
                R.string.coca_cola_500_ml_fat,
                R.string.coca_cola_500_ml_saturated_fat,
                R.string.coca_cola_500_ml_carbohidrates,
                R.string.coca_cola_500_ml_sugar,
                R.string.coca_cola_500_ml_fibre,
                R.string.coca_cola_500_ml_proteins,
                R.string.coca_cola_500_ml_salt,
                R.string.coca_cola_500_ml_price,
                false,
                false
        ));

        Button buttonCocaColaZeroSugar500Ml = findViewById(R.id.buttonCocaColaZeroSugar500Ml);
        buttonCocaColaZeroSugar500Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.coca_cola_zero_sugar_500_ml,
                R.mipmap.ic_coca_cola_zero_sugar_500_ml_foreground,
                R.string.coca_cola_zero_sugar_500_ml_description,
                R.string.coca_cola_zero_sugar_500_ml_serving,
                R.string.coca_cola_zero_sugar_500_ml_energy,
                R.string.coca_cola_zero_sugar_500_ml_fat,
                R.string.coca_cola_zero_sugar_500_ml_saturated_fat,
                R.string.coca_cola_zero_sugar_500_ml_carbohidrates,
                R.string.coca_cola_zero_sugar_500_ml_sugar,
                R.string.coca_cola_zero_sugar_500_ml_fibre,
                R.string.coca_cola_zero_sugar_500_ml_proteins,
                R.string.coca_cola_zero_sugar_500_ml_salt,
                R.string.coca_cola_zero_sugar_500_ml_price,
                false,
                false
        ));

        Button buttonFanta500Ml = findViewById(R.id.buttonFanta500Ml);
        buttonFanta500Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.fanta_500_ml,
                R.mipmap.ic_fanta_500_ml_foreground,
                R.string.fanta_500_ml_description,
                R.string.fanta_500_ml_serving,
                R.string.fanta_500_ml_energy,
                R.string.fanta_500_ml_fat,
                R.string.fanta_500_ml_saturated_fat,
                R.string.fanta_500_ml_carbohidrates,
                R.string.fanta_500_ml_sugar,
                R.string.fanta_500_ml_fibre,
                R.string.fanta_500_ml_proteins,
                R.string.fanta_500_ml_salt,
                R.string.fanta_500_ml_price,
                false,
                false
        ));

        Button buttonSprite500Ml = findViewById(R.id.buttonSprite500Ml);
        buttonSprite500Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.sprite_500_ml,
                R.mipmap.ic_sprite_500_ml_foreground,
                R.string.sprite_500_ml_description,
                R.string.sprite_500_ml_serving,
                R.string.sprite_500_ml_energy,
                R.string.sprite_500_ml_fat,
                R.string.sprite_500_ml_saturated_fat,
                R.string.sprite_500_ml_carbohidrates,
                R.string.sprite_500_ml_sugar,
                R.string.sprite_500_ml_fibre,
                R.string.sprite_500_ml_proteins,
                R.string.sprite_500_ml_salt,
                R.string.sprite_500_ml_price,
                false,
                false
        ));

        Button buttonLipton500Ml = findViewById(R.id.buttonLipton500Ml);
        buttonLipton500Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.lipton_500_ml,
                R.mipmap.ic_lipton_500_ml_foreground,
                R.string.lipton_500_ml_description,
                R.string.lipton_500_ml_serving,
                R.string.lipton_500_ml_energy,
                R.string.lipton_500_ml_fat,
                R.string.lipton_500_ml_saturated_fat,
                R.string.lipton_500_ml_carbohidrates,
                R.string.lipton_500_ml_sugar,
                R.string.lipton_500_ml_fibre,
                R.string.lipton_500_ml_proteins,
                R.string.lipton_500_ml_salt,
                R.string.lipton_500_ml_price,
                false,
                false
        ));

        Button buttonAppleJuice500Ml = findViewById(R.id.buttonAppleJuice500Ml);
        buttonAppleJuice500Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.apple_juice_500_ml,
                R.mipmap.ic_apple_juice_500_ml_foreground,
                R.string.apple_juice_500_ml_description,
                R.string.apple_juice_500_ml_serving,
                R.string.apple_juice_500_ml_energy,
                R.string.apple_juice_500_ml_fat,
                R.string.apple_juice_500_ml_saturated_fat,
                R.string.apple_juice_500_ml_carbohidrates,
                R.string.apple_juice_500_ml_sugar,
                R.string.apple_juice_500_ml_fibre,
                R.string.apple_juice_500_ml_proteins,
                R.string.apple_juice_500_ml_salt,
                R.string.apple_juice_500_ml_price,
                false,
                false
        ));

        Button buttonOrangeJuice500Ml = findViewById(R.id.buttonOrangeJuice500Ml);
        buttonOrangeJuice500Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.orange_juice_500_ml,
                R.mipmap.ic_orange_juice_500_ml_foreground,
                R.string.orange_juice_500_ml_description,
                R.string.orange_juice_500_ml_serving,
                R.string.orange_juice_500_ml_energy,
                R.string.orange_juice_500_ml_fat,
                R.string.orange_juice_500_ml_saturated_fat,
                R.string.orange_juice_500_ml_carbohidrates,
                R.string.orange_juice_500_ml_sugar,
                R.string.orange_juice_500_ml_fibre,
                R.string.orange_juice_500_ml_proteins,
                R.string.orange_juice_500_ml_salt,
                R.string.orange_juice_500_ml_price,
                false,
                false
        ));

        Button buttonCocaCola400Ml = findViewById(R.id.buttonCocaCola400Ml);
        buttonCocaCola400Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.coca_cola_400_ml,
                R.mipmap.ic_coca_cola_400_ml_foreground,
                R.string.coca_cola_400_ml_description,
                R.string.coca_cola_400_ml_serving,
                R.string.coca_cola_400_ml_energy,
                R.string.coca_cola_400_ml_fat,
                R.string.coca_cola_400_ml_saturated_fat,
                R.string.coca_cola_400_ml_carbohidrates,
                R.string.coca_cola_400_ml_sugar,
                R.string.coca_cola_400_ml_fibre,
                R.string.coca_cola_400_ml_proteins,
                R.string.coca_cola_400_ml_salt,
                R.string.coca_cola_400_ml_price,
                false,
                false
        ));

        Button buttonCocaColaZeroSugar400Ml = findViewById(R.id.buttonCocaColaZeroSugar400Ml);
        buttonCocaColaZeroSugar400Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.coca_cola_zero_sugar_400_ml,
                R.mipmap.ic_coca_cola_zero_sugar_400_ml_foreground,
                R.string.coca_cola_zero_sugar_400_ml_description,
                R.string.coca_cola_zero_sugar_400_ml_serving,
                R.string.coca_cola_zero_sugar_400_ml_energy,
                R.string.coca_cola_zero_sugar_400_ml_fat,
                R.string.coca_cola_zero_sugar_400_ml_saturated_fat,
                R.string.coca_cola_zero_sugar_400_ml_carbohidrates,
                R.string.coca_cola_zero_sugar_400_ml_sugar,
                R.string.coca_cola_zero_sugar_400_ml_fibre,
                R.string.coca_cola_zero_sugar_400_ml_proteins,
                R.string.coca_cola_zero_sugar_400_ml_salt,
                R.string.coca_cola_zero_sugar_400_ml_price,
                false,
                false
        ));

        Button buttonFanta400Ml = findViewById(R.id.buttonFanta400Ml);
        buttonFanta400Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.fanta_400_ml,
                R.mipmap.ic_fanta_400_ml_foreground,
                R.string.fanta_400_ml_description,
                R.string.fanta_400_ml_serving,
                R.string.fanta_400_ml_energy,
                R.string.fanta_400_ml_fat,
                R.string.fanta_400_ml_saturated_fat,
                R.string.fanta_400_ml_carbohidrates,
                R.string.fanta_400_ml_sugar,
                R.string.fanta_400_ml_fibre,
                R.string.fanta_400_ml_proteins,
                R.string.fanta_400_ml_salt,
                R.string.fanta_400_ml_price,
                false,
                false
        ));

        Button buttonSprite400Ml = findViewById(R.id.buttonSprite400Ml);
        buttonSprite400Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.sprite_400_ml,
                R.mipmap.ic_sprite_400_ml_foreground,
                R.string.sprite_400_ml_description,
                R.string.sprite_400_ml_serving,
                R.string.sprite_400_ml_energy,
                R.string.sprite_400_ml_fat,
                R.string.sprite_400_ml_saturated_fat,
                R.string.sprite_400_ml_carbohidrates,
                R.string.sprite_400_ml_sugar,
                R.string.sprite_400_ml_fibre,
                R.string.sprite_400_ml_proteins,
                R.string.sprite_400_ml_salt,
                R.string.sprite_400_ml_price,
                false,
                false
        ));

        Button buttonLipton400Ml = findViewById(R.id.buttonLipton400Ml);
        buttonLipton400Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.lipton_400_ml,
                R.mipmap.ic_lipton_400_ml_foreground,
                R.string.lipton_400_ml_description,
                R.string.lipton_400_ml_serving,
                R.string.lipton_400_ml_energy,
                R.string.lipton_400_ml_fat,
                R.string.lipton_400_ml_saturated_fat,
                R.string.lipton_400_ml_carbohidrates,
                R.string.lipton_400_ml_sugar,
                R.string.lipton_400_ml_fibre,
                R.string.lipton_400_ml_proteins,
                R.string.lipton_400_ml_salt,
                R.string.lipton_400_ml_price,
                false,
                false
        ));

        Button buttonLipton250Ml = findViewById(R.id.buttonLipton250Ml);
        buttonLipton250Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.lipton_250_ml,
                R.mipmap.ic_lipton_250_ml_foreground,
                R.string.lipton_250_ml_description,
                R.string.lipton_250_ml_serving,
                R.string.lipton_250_ml_energy,
                R.string.lipton_250_ml_fat,
                R.string.lipton_250_ml_saturated_fat,
                R.string.lipton_250_ml_carbohidrates,
                R.string.lipton_250_ml_sugar,
                R.string.lipton_250_ml_fibre,
                R.string.lipton_250_ml_proteins,
                R.string.lipton_250_ml_salt,
                R.string.lipton_250_ml_price,
                false,
                false
        ));

        Button buttonCocaCola250Ml = findViewById(R.id.buttonCocaCola250Ml);
        buttonCocaCola250Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.coca_cola_250_ml,
                R.mipmap.ic_coca_cola_250_ml_foreground,
                R.string.coca_cola_250_ml_description,
                R.string.coca_cola_250_ml_serving,
                R.string.coca_cola_250_ml_energy,
                R.string.coca_cola_250_ml_fat,
                R.string.coca_cola_250_ml_saturated_fat,
                R.string.coca_cola_250_ml_carbohidrates,
                R.string.coca_cola_250_ml_sugar,
                R.string.coca_cola_250_ml_fibre,
                R.string.coca_cola_250_ml_proteins,
                R.string.coca_cola_250_ml_salt,
                R.string.coca_cola_250_ml_price,
                false,
                false
        ));

        Button buttonCocaColaZeroSugar250Ml = findViewById(R.id.buttonCocaColaZeroSugar250Ml);
        buttonCocaColaZeroSugar250Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.coca_cola_zero_sugar_250_ml,
                R.mipmap.ic_coca_cola_zero_sugar_250_ml_foreground,
                R.string.coca_cola_zero_sugar_250_ml_description,
                R.string.coca_cola_zero_sugar_250_ml_serving,
                R.string.coca_cola_zero_sugar_250_ml_energy,
                R.string.coca_cola_zero_sugar_250_ml_fat,
                R.string.coca_cola_zero_sugar_250_ml_saturated_fat,
                R.string.coca_cola_zero_sugar_250_ml_carbohidrates,
                R.string.coca_cola_zero_sugar_250_ml_sugar,
                R.string.coca_cola_zero_sugar_250_ml_fibre,
                R.string.coca_cola_zero_sugar_250_ml_proteins,
                R.string.coca_cola_zero_sugar_250_ml_salt,
                R.string.coca_cola_zero_sugar_250_ml_price,
                false,
                false
        ));

        Button buttonFanta250Ml = findViewById(R.id.buttonFanta250Ml);
        buttonFanta250Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.fanta_250_ml,
                R.mipmap.ic_fanta_250_ml_foreground,
                R.string.fanta_250_ml_description,
                R.string.fanta_250_ml_serving,
                R.string.fanta_250_ml_energy,
                R.string.fanta_250_ml_fat,
                R.string.fanta_250_ml_saturated_fat,
                R.string.fanta_250_ml_carbohidrates,
                R.string.fanta_250_ml_sugar,
                R.string.fanta_250_ml_fibre,
                R.string.fanta_250_ml_proteins,
                R.string.fanta_250_ml_salt,
                R.string.fanta_250_ml_price,
                false,
                false
        ));

        Button buttonSprite250Ml = findViewById(R.id.buttonSprite250Ml);
        buttonSprite250Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.sprite_250_ml,
                R.mipmap.ic_sprite_250_ml_foreground,
                R.string.sprite_250_ml_description,
                R.string.sprite_250_ml_serving,
                R.string.sprite_250_ml_energy,
                R.string.sprite_250_ml_fat,
                R.string.sprite_250_ml_saturated_fat,
                R.string.sprite_250_ml_carbohidrates,
                R.string.sprite_250_ml_sugar,
                R.string.sprite_250_ml_fibre,
                R.string.sprite_250_ml_proteins,
                R.string.sprite_250_ml_salt,
                R.string.sprite_250_ml_price,
                false,
                false
        ));

        Button buttonAppleJuice250Ml = findViewById(R.id.buttonAppleJuice250Ml);
        buttonAppleJuice250Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.apple_juice_250_ml,
                R.mipmap.ic_apple_juice_250_ml_foreground,
                R.string.apple_juice_250_ml_description,
                R.string.apple_juice_250_ml_serving,
                R.string.apple_juice_250_ml_energy,
                R.string.apple_juice_250_ml_fat,
                R.string.apple_juice_250_ml_saturated_fat,
                R.string.apple_juice_250_ml_carbohidrates,
                R.string.apple_juice_250_ml_sugar,
                R.string.apple_juice_250_ml_fibre,
                R.string.apple_juice_250_ml_proteins,
                R.string.apple_juice_250_ml_salt,
                R.string.apple_juice_250_ml_price,
                false,
                false
        ));

        Button buttonOrangeJuice250Ml = findViewById(R.id.buttonOrangeJuice250Ml);
        buttonOrangeJuice250Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.orange_juice_250_ml,
                R.mipmap.ic_orange_juice_250_ml_foreground,
                R.string.orange_juice_250_ml_description,
                R.string.orange_juice_250_ml_serving,
                R.string.orange_juice_250_ml_energy,
                R.string.orange_juice_250_ml_fat,
                R.string.orange_juice_250_ml_saturated_fat,
                R.string.orange_juice_250_ml_carbohidrates,
                R.string.orange_juice_250_ml_sugar,
                R.string.orange_juice_250_ml_fibre,
                R.string.orange_juice_250_ml_proteins,
                R.string.orange_juice_250_ml_salt,
                R.string.orange_juice_250_ml_price,
                false,
                false
        ));

        Button buttonSparklingWater = findViewById(R.id.buttonSparklingWater);
        buttonSparklingWater.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.sparkling_water,
                R.mipmap.ic_sparkling_water_foreground,
                R.string.sparkling_water_description,
                R.string.sparkling_water_serving,
                R.string.sparkling_water_energy,
                R.string.sparkling_water_fat,
                R.string.sparkling_water_saturated_fat,
                R.string.sparkling_water_carbohidrates,
                R.string.sparkling_water_sugar,
                R.string.sparkling_water_fibre,
                R.string.sparkling_water_proteins,
                R.string.sparkling_water_salt,
                R.string.sparkling_water_price,
                false,
                false
        ));

        Button buttonStillWater = findViewById(R.id.buttonStillWater);
        buttonStillWater.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.still_water,
                R.mipmap.ic_still_water_foreground,
                R.string.still_water_description,
                R.string.still_water_serving,
                R.string.still_water_energy,
                R.string.still_water_fat,
                R.string.still_water_saturated_fat,
                R.string.still_water_carbohidrates,
                R.string.still_water_sugar,
                R.string.still_water_fibre,
                R.string.still_water_proteins,
                R.string.still_water_salt,
                R.string.still_water_price,
                false,
                false
        ));

        Button buttonFuzeteaBlackTeaForestFruits = findViewById(R.id.buttonFuzeteaBlackTeaForestFruits);
        buttonFuzeteaBlackTeaForestFruits.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.fuzetea_black_tea_forest_fruits,
                R.mipmap.ic_fuzetea_black_tea_forest_fruits_foreground,
                R.string.fuzetea_black_tea_forest_fruits_description,
                R.string.fuzetea_black_tea_forest_fruits_serving,
                R.string.fuzetea_black_tea_forest_fruits_energy,
                R.string.fuzetea_black_tea_forest_fruits_fat,
                R.string.fuzetea_black_tea_forest_fruits_saturated_fat,
                R.string.fuzetea_black_tea_forest_fruits_carbohidrates,
                R.string.fuzetea_black_tea_forest_fruits_sugar,
                R.string.fuzetea_black_tea_forest_fruits_fibre,
                R.string.fuzetea_black_tea_forest_fruits_proteins,
                R.string.fuzetea_black_tea_forest_fruits_salt,
                R.string.fuzetea_black_tea_forest_fruits_price,
                false,
                false
        ));

        Button buttonFuzeteaBlackTeaLemonAndLemongrass = findViewById(R.id.buttonFuzeteaBlackTeaLemonAndLemongrass);
        buttonFuzeteaBlackTeaLemonAndLemongrass.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.fuzetea_black_tea_lemon_and_lemongrass,
                R.mipmap.ic_fuzetea_black_tea_lemon_and_lemongrass_foreground,
                R.string.fuzetea_black_tea_lemon_and_lemongrass_description,
                R.string.fuzetea_black_tea_lemon_and_lemongrass_serving,
                R.string.fuzetea_black_tea_lemon_and_lemongrass_energy,
                R.string.fuzetea_black_tea_lemon_and_lemongrass_fat,
                R.string.fuzetea_black_tea_lemon_and_lemongrass_saturated_fat,
                R.string.fuzetea_black_tea_lemon_and_lemongrass_carbohidrates,
                R.string.fuzetea_black_tea_lemon_and_lemongrass_sugar,
                R.string.fuzetea_black_tea_lemon_and_lemongrass_fibre,
                R.string.fuzetea_black_tea_lemon_and_lemongrass_proteins,
                R.string.fuzetea_black_tea_lemon_and_lemongrass_salt,
                R.string.fuzetea_black_tea_lemon_and_lemongrass_price,
                false,
                false
        ));

        Button buttonFuzeteaBlackTeaPeachesAndHibiscus = findViewById(R.id.buttonFuzeteaBlackTeaPeachesAndHibiscus);
        buttonFuzeteaBlackTeaPeachesAndHibiscus.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.fuzetea_black_tea_peaches_and_hibiscus,
                R.mipmap.ic_fuzetea_black_tea_peaches_and_hibiscus_foreground,
                R.string.fuzetea_black_tea_peaches_and_hibiscus_description,
                R.string.fuzetea_black_tea_peaches_and_hibiscus_serving,
                R.string.fuzetea_black_tea_peaches_and_hibiscus_energy,
                R.string.fuzetea_black_tea_peaches_and_hibiscus_fat,
                R.string.fuzetea_black_tea_peaches_and_hibiscus_saturated_fat,
                R.string.fuzetea_black_tea_peaches_and_hibiscus_carbohidrates,
                R.string.fuzetea_black_tea_peaches_and_hibiscus_sugar,
                R.string.fuzetea_black_tea_peaches_and_hibiscus_fibre,
                R.string.fuzetea_black_tea_peaches_and_hibiscus_proteins,
                R.string.fuzetea_black_tea_peaches_and_hibiscus_salt,
                R.string.fuzetea_black_tea_peaches_and_hibiscus_price,
                false,
                false
        ));

        Button buttonBurnEnergyDrink = findViewById(R.id.buttonBurnEnergyDrink);
        buttonBurnEnergyDrink.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_cold_drinks,
                R.string.burn_energy_drink,
                R.mipmap.ic_burn_energy_drink_foreground,
                R.string.burn_energy_drink_description,
                R.string.burn_energy_drink_serving,
                R.string.burn_energy_drink_energy,
                R.string.burn_energy_drink_fat,
                R.string.burn_energy_drink_saturated_fat,
                R.string.burn_energy_drink_carbohidrates,
                R.string.burn_energy_drink_sugar,
                R.string.burn_energy_drink_fibre,
                R.string.burn_energy_drink_proteins,
                R.string.burn_energy_drink_salt,
                R.string.burn_energy_drink_price,
                false,
                false
        ));
    }
}