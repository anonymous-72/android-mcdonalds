package com.first.mcdonalds;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MccafeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mccafe);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.mccafe);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> {
            finish();
        });

        Button buttonMcPopsApricots = findViewById(R.id.buttonMcPopsApricots);
        buttonMcPopsApricots.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.mcpops_apricots,
                R.mipmap.ic_mcpops_apricots_foreground,
                R.string.mcpops_apricots_description,
                R.string.mcpops_apricots_serving,
                R.string.mcpops_apricots_energy,
                R.string.mcpops_apricots_fat,
                R.string.mcpops_apricots_saturated_fat,
                R.string.mcpops_apricots_carbohidrates,
                R.string.mcpops_apricots_sugar,
                R.string.mcpops_apricots_fibre,
                R.string.mcpops_apricots_proteins,
                R.string.mcpops_apricots_salt,
                R.string.mcpops_apricots_price,
                false,
                false
        ));

        Button buttonMcPopsChocolate = findViewById(R.id.buttonMcPopsChocolate);
        buttonMcPopsChocolate.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.mcpops_chocolate,
                R.mipmap.ic_mcpops_chocolate_foreground,
                R.string.mcpops_chocolate_description,
                R.string.mcpops_chocolate_serving,
                R.string.mcpops_chocolate_energy,
                R.string.mcpops_chocolate_fat,
                R.string.mcpops_chocolate_saturated_fat,
                R.string.mcpops_chocolate_carbohidrates,
                R.string.mcpops_chocolate_sugar,
                R.string.mcpops_chocolate_fibre,
                R.string.mcpops_chocolate_proteins,
                R.string.mcpops_chocolate_salt,
                R.string.mcpops_chocolate_price,
                false,
                false
        ));

        Button buttonMcPopsCaramel = findViewById(R.id.buttonMcPopsCaramel);
        buttonMcPopsCaramel.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.mcpops_caramel,
                R.mipmap.ic_mcpops_caramel_foreground,
                R.string.mcpops_caramel_description,
                R.string.mcpops_caramel_serving,
                R.string.mcpops_caramel_energy,
                R.string.mcpops_caramel_fat,
                R.string.mcpops_caramel_saturated_fat,
                R.string.mcpops_caramel_carbohidrates,
                R.string.mcpops_caramel_sugar,
                R.string.mcpops_caramel_fibre,
                R.string.mcpops_caramel_proteins,
                R.string.mcpops_caramel_salt,
                R.string.mcpops_caramel_price,
                false,
                false
        ));

        Button buttonSeaBuckthornAndGingerHotDrink = findViewById(R.id.buttonSeaBuckthornAndGingerHotDrink);
        buttonSeaBuckthornAndGingerHotDrink.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_whats_new,
                R.string.sea_buckthorn_and_ginger_hot_drink,
                R.mipmap.ic_sea_buckthorn_and_ginger_hot_drink_foreground,
                R.string.sea_buckthorn_and_ginger_hot_drink_description,
                R.string.sea_buckthorn_and_ginger_hot_drink_serving,
                R.string.sea_buckthorn_and_ginger_hot_drink_energy,
                R.string.sea_buckthorn_and_ginger_hot_drink_fat,
                R.string.sea_buckthorn_and_ginger_hot_drink_saturated_fat,
                R.string.sea_buckthorn_and_ginger_hot_drink_carbohidrates,
                R.string.sea_buckthorn_and_ginger_hot_drink_sugar,
                R.string.sea_buckthorn_and_ginger_hot_drink_fibre,
                R.string.sea_buckthorn_and_ginger_hot_drink_proteins,
                R.string.sea_buckthorn_and_ginger_hot_drink_salt,
                R.string.sea_buckthorn_and_ginger_hot_drink_price,
                false,
                true
        ));

        Button buttonRaspberryAndForestBerriesHotDrink = findViewById(R.id.buttonRaspberryAndForestBerriesHotDrink);
        buttonRaspberryAndForestBerriesHotDrink.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_whats_new,
                R.string.raspberry_and_forest_berries_hot_drink,
                R.mipmap.ic_raspberry_and_forest_berries_hot_drink_foreground,
                R.string.raspberry_and_forest_berries_hot_drink_description,
                R.string.raspberry_and_forest_berries_hot_drink_serving,
                R.string.raspberry_and_forest_berries_hot_drink_energy,
                R.string.raspberry_and_forest_berries_hot_drink_fat,
                R.string.raspberry_and_forest_berries_hot_drink_saturated_fat,
                R.string.raspberry_and_forest_berries_hot_drink_carbohidrates,
                R.string.raspberry_and_forest_berries_hot_drink_sugar,
                R.string.raspberry_and_forest_berries_hot_drink_fibre,
                R.string.raspberry_and_forest_berries_hot_drink_proteins,
                R.string.raspberry_and_forest_berries_hot_drink_salt,
                R.string.raspberry_and_forest_berries_hot_drink_price,
                false,
                true
        ));

        Button buttonCaffeLatte200Ml = findViewById(R.id.buttonCaffeLatte200Ml);
        buttonCaffeLatte200Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.caffe_latte_200_ml,
                R.mipmap.ic_caffe_latte_200_ml_foreground,
                R.string.caffe_latte_200_ml_description,
                R.string.caffe_latte_200_ml_serving,
                R.string.caffe_latte_200_ml_energy,
                R.string.caffe_latte_200_ml_fat,
                R.string.caffe_latte_200_ml_saturated_fat,
                R.string.caffe_latte_200_ml_carbohidrates,
                R.string.caffe_latte_200_ml_sugar,
                R.string.caffe_latte_200_ml_fibre,
                R.string.caffe_latte_200_ml_proteins,
                R.string.caffe_latte_200_ml_salt,
                R.string.caffe_latte_200_ml_price,
                false,
                false
        ));

        Button buttonCaffeLatte300Ml = findViewById(R.id.buttonCaffeLatte300Ml);
        buttonCaffeLatte300Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.caffe_latte_300_ml,
                R.mipmap.ic_caffe_latte_300_ml_foreground,
                R.string.caffe_latte_300_ml_description,
                R.string.caffe_latte_300_ml_serving,
                R.string.caffe_latte_300_ml_energy,
                R.string.caffe_latte_300_ml_fat,
                R.string.caffe_latte_300_ml_saturated_fat,
                R.string.caffe_latte_300_ml_carbohidrates,
                R.string.caffe_latte_300_ml_sugar,
                R.string.caffe_latte_300_ml_fibre,
                R.string.caffe_latte_300_ml_proteins,
                R.string.caffe_latte_300_ml_salt,
                R.string.caffe_latte_300_ml_price,
                false,
                false
        ));

        Button buttonCappuccino200Ml = findViewById(R.id.buttonCappuccino200Ml);
        buttonCappuccino200Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.cappuccino_200_ml,
                R.mipmap.ic_cappuccino_200_ml_foreground,
                R.string.cappuccino_200_ml_description,
                R.string.cappuccino_200_ml_serving,
                R.string.cappuccino_200_ml_energy,
                R.string.cappuccino_200_ml_fat,
                R.string.cappuccino_200_ml_saturated_fat,
                R.string.cappuccino_200_ml_carbohidrates,
                R.string.cappuccino_200_ml_sugar,
                R.string.cappuccino_200_ml_fibre,
                R.string.cappuccino_200_ml_proteins,
                R.string.cappuccino_200_ml_salt,
                R.string.cappuccino_200_ml_price,
                false,
                false
        ));

        Button buttonCappuccino300Ml = findViewById(R.id.buttonCappuccino300Ml);
        buttonCappuccino300Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.cappuccino_300_ml,
                R.mipmap.ic_cappuccino_300_ml_foreground,
                R.string.cappuccino_300_ml_description,
                R.string.cappuccino_300_ml_serving,
                R.string.cappuccino_300_ml_energy,
                R.string.cappuccino_300_ml_fat,
                R.string.cappuccino_300_ml_saturated_fat,
                R.string.cappuccino_300_ml_carbohidrates,
                R.string.cappuccino_300_ml_sugar,
                R.string.cappuccino_300_ml_fibre,
                R.string.cappuccino_300_ml_proteins,
                R.string.cappuccino_300_ml_salt,
                R.string.cappuccino_300_ml_price,
                false,
                false
        ));

        Button buttonChaiLatte200Ml = findViewById(R.id.buttonChaiLatte200Ml);
        buttonChaiLatte200Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.chai_latte_200_ml,
                R.mipmap.ic_chai_latte_200_ml_foreground,
                R.string.chai_latte_200_ml_description,
                R.string.chai_latte_200_ml_serving,
                R.string.chai_latte_200_ml_energy,
                R.string.chai_latte_200_ml_fat,
                R.string.chai_latte_200_ml_saturated_fat,
                R.string.chai_latte_200_ml_carbohidrates,
                R.string.chai_latte_200_ml_sugar,
                R.string.chai_latte_200_ml_fibre,
                R.string.chai_latte_200_ml_proteins,
                R.string.chai_latte_200_ml_salt,
                R.string.chai_latte_200_ml_price,
                false,
                false
        ));

        Button buttonChaiLatte300Ml = findViewById(R.id.buttonChaiLatte300Ml);
        buttonChaiLatte300Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.chai_latte_300_ml,
                R.mipmap.ic_chai_latte_300_ml_foreground,
                R.string.chai_latte_300_ml_description,
                R.string.chai_latte_300_ml_serving,
                R.string.chai_latte_300_ml_energy,
                R.string.chai_latte_300_ml_fat,
                R.string.chai_latte_300_ml_saturated_fat,
                R.string.chai_latte_300_ml_carbohidrates,
                R.string.chai_latte_300_ml_sugar,
                R.string.chai_latte_300_ml_fibre,
                R.string.chai_latte_300_ml_proteins,
                R.string.chai_latte_300_ml_salt,
                R.string.chai_latte_300_ml_price,
                false,
                false
        ));

        Button buttonCoffee200Ml = findViewById(R.id.buttonCoffee200Ml);
        buttonCoffee200Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.coffee_200_ml,
                R.mipmap.ic_coffee_200_ml_foreground,
                R.string.coffee_200_ml_description,
                R.string.coffee_200_ml_serving,
                R.string.coffee_200_ml_energy,
                R.string.coffee_200_ml_fat,
                R.string.coffee_200_ml_saturated_fat,
                R.string.coffee_200_ml_carbohidrates,
                R.string.coffee_200_ml_sugar,
                R.string.coffee_200_ml_fibre,
                R.string.coffee_200_ml_proteins,
                R.string.coffee_200_ml_salt,
                R.string.coffee_200_ml_price,
                false,
                false
        ));

        Button buttonCoffee300Ml = findViewById(R.id.buttonCoffee300Ml);
        buttonCoffee300Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.coffee_300_ml,
                R.mipmap.ic_coffee_300_ml_foreground,
                R.string.coffee_300_ml_description,
                R.string.coffee_300_ml_serving,
                R.string.coffee_300_ml_energy,
                R.string.coffee_300_ml_fat,
                R.string.coffee_300_ml_saturated_fat,
                R.string.coffee_300_ml_carbohidrates,
                R.string.coffee_300_ml_sugar,
                R.string.coffee_300_ml_fibre,
                R.string.coffee_300_ml_proteins,
                R.string.coffee_300_ml_salt,
                R.string.coffee_300_ml_price,
                false,
                false
        ));

        Button buttonEspresso30Ml = findViewById(R.id.buttonEspresso30Ml);
        buttonEspresso30Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.espresso_30_ml,
                R.mipmap.ic_espresso_30_ml_foreground,
                R.string.espresso_30_ml_description,
                R.string.espresso_30_ml_serving,
                R.string.espresso_30_ml_energy,
                R.string.espresso_30_ml_fat,
                R.string.espresso_30_ml_saturated_fat,
                R.string.espresso_30_ml_carbohidrates,
                R.string.espresso_30_ml_sugar,
                R.string.espresso_30_ml_fibre,
                R.string.espresso_30_ml_proteins,
                R.string.espresso_30_ml_salt,
                R.string.espresso_30_ml_price,
                false,
                false
        ));

        Button buttonLatteMacchiato300Ml = findViewById(R.id.buttonLatteMacchiato300Ml);
        buttonLatteMacchiato300Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.latte_macchiato_300_ml,
                R.mipmap.ic_latte_macchiato_300_ml_foreground,
                R.string.latte_macchiato_300_ml_description,
                R.string.latte_macchiato_300_ml_serving,
                R.string.latte_macchiato_300_ml_energy,
                R.string.latte_macchiato_300_ml_fat,
                R.string.latte_macchiato_300_ml_saturated_fat,
                R.string.latte_macchiato_300_ml_carbohidrates,
                R.string.latte_macchiato_300_ml_sugar,
                R.string.latte_macchiato_300_ml_fibre,
                R.string.latte_macchiato_300_ml_proteins,
                R.string.latte_macchiato_300_ml_salt,
                R.string.latte_macchiato_300_ml_price,
                false,
                false
        ));

        Button buttonThea200Ml = findViewById(R.id.buttonThea200Ml);
        buttonThea200Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.thea_200_ml,
                R.mipmap.ic_thea_200_ml_foreground,
                R.string.thea_200_ml_description,
                R.string.thea_200_ml_serving,
                R.string.thea_200_ml_energy,
                R.string.thea_200_ml_fat,
                R.string.thea_200_ml_saturated_fat,
                R.string.thea_200_ml_carbohidrates,
                R.string.thea_200_ml_sugar,
                R.string.thea_200_ml_fibre,
                R.string.thea_200_ml_proteins,
                R.string.thea_200_ml_salt,
                R.string.thea_200_ml_price,
                false,
                false
        ));

        Button buttonThea300Ml = findViewById(R.id.buttonThea300Ml);
        buttonThea300Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.thea_300_ml,
                R.mipmap.ic_thea_300_ml_foreground,
                R.string.thea_300_ml_description,
                R.string.thea_300_ml_serving,
                R.string.thea_300_ml_energy,
                R.string.thea_300_ml_fat,
                R.string.thea_300_ml_saturated_fat,
                R.string.thea_300_ml_carbohidrates,
                R.string.thea_300_ml_sugar,
                R.string.thea_300_ml_fibre,
                R.string.thea_300_ml_proteins,
                R.string.thea_300_ml_salt,
                R.string.thea_300_ml_price,
                false,
                false
        ));

        Button buttonTheaExclusiv300Ml = findViewById(R.id.buttonTheaExclusiv300Ml);
        buttonTheaExclusiv300Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.thea_exclusiv_300_ml,
                R.mipmap.ic_thea_exclusiv_300_ml_foreground,
                R.string.thea_exclusiv_300_ml_description,
                R.string.thea_exclusiv_300_ml_serving,
                R.string.thea_exclusiv_300_ml_energy,
                R.string.thea_exclusiv_300_ml_fat,
                R.string.thea_exclusiv_300_ml_saturated_fat,
                R.string.thea_exclusiv_300_ml_carbohidrates,
                R.string.thea_exclusiv_300_ml_sugar,
                R.string.thea_exclusiv_300_ml_fibre,
                R.string.thea_exclusiv_300_ml_proteins,
                R.string.thea_exclusiv_300_ml_salt,
                R.string.thea_exclusiv_300_ml_price,
                false,
                false
        ));

        Button buttonTheaExclusiv400Ml = findViewById(R.id.buttonTheaExclusiv400Ml);
        buttonTheaExclusiv400Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.thea_exclusiv_400_ml,
                R.mipmap.ic_thea_exclusiv_400_ml_foreground,
                R.string.thea_exclusiv_400_ml_description,
                R.string.thea_exclusiv_400_ml_serving,
                R.string.thea_exclusiv_400_ml_energy,
                R.string.thea_exclusiv_400_ml_fat,
                R.string.thea_exclusiv_400_ml_saturated_fat,
                R.string.thea_exclusiv_400_ml_carbohidrates,
                R.string.thea_exclusiv_400_ml_sugar,
                R.string.thea_exclusiv_400_ml_fibre,
                R.string.thea_exclusiv_400_ml_proteins,
                R.string.thea_exclusiv_400_ml_salt,
                R.string.thea_exclusiv_400_ml_price,
                false,
                false
        ));

        Button buttonVanillaDonut = findViewById(R.id.buttonVanillaDonut);
        buttonVanillaDonut.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.vanilla_donut,
                R.mipmap.ic_vanilla_donut_foreground,
                R.string.vanilla_donut_description,
                R.string.vanilla_donut_serving,
                R.string.vanilla_donut_energy,
                R.string.vanilla_donut_fat,
                R.string.vanilla_donut_saturated_fat,
                R.string.vanilla_donut_carbohidrates,
                R.string.vanilla_donut_sugar,
                R.string.vanilla_donut_fibre,
                R.string.vanilla_donut_proteins,
                R.string.vanilla_donut_salt,
                R.string.vanilla_donut_price,
                false,
                false
        ));

        Button buttonCroissantWithChocolate = findViewById(R.id.buttonCroissantWithChocolate);
        buttonCroissantWithChocolate.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.croissant_with_chocolate,
                R.mipmap.ic_croissant_with_chocolate_foreground,
                R.string.croissant_with_chocolate_description,
                R.string.croissant_with_chocolate_serving,
                R.string.croissant_with_chocolate_energy,
                R.string.croissant_with_chocolate_fat,
                R.string.croissant_with_chocolate_saturated_fat,
                R.string.croissant_with_chocolate_carbohidrates,
                R.string.croissant_with_chocolate_sugar,
                R.string.croissant_with_chocolate_fibre,
                R.string.croissant_with_chocolate_proteins,
                R.string.croissant_with_chocolate_salt,
                R.string.croissant_with_chocolate_price,
                false,
                false
        ));

        Button buttonCroissantWithButter = findViewById(R.id.buttonCroissantWithButter);
        buttonCroissantWithButter.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.croissant_with_butter,
                R.mipmap.ic_croissant_with_butter_foreground,
                R.string.croissant_with_butter_description,
                R.string.croissant_with_butter_serving,
                R.string.croissant_with_butter_energy,
                R.string.croissant_with_butter_fat,
                R.string.croissant_with_butter_saturated_fat,
                R.string.croissant_with_butter_carbohidrates,
                R.string.croissant_with_butter_sugar,
                R.string.croissant_with_butter_fibre,
                R.string.croissant_with_butter_proteins,
                R.string.croissant_with_butter_salt,
                R.string.croissant_with_butter_price,
                false,
                false
        ));

        Button buttonChocolateCookie = findViewById(R.id.buttonChocolateCookie);
        buttonChocolateCookie.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_mccafe,
                R.string.chocolate_cookie,
                R.mipmap.ic_chocolate_cookie_foreground,
                R.string.chocolate_cookie_description,
                R.string.chocolate_cookie_serving,
                R.string.chocolate_cookie_energy,
                R.string.chocolate_cookie_fat,
                R.string.chocolate_cookie_saturated_fat,
                R.string.chocolate_cookie_carbohidrates,
                R.string.chocolate_cookie_sugar,
                R.string.chocolate_cookie_fibre,
                R.string.chocolate_cookie_proteins,
                R.string.chocolate_cookie_salt,
                R.string.chocolate_cookie_price,
                false,
                false
        ));
    }
}