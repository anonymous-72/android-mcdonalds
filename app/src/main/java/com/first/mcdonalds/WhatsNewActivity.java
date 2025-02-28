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

public class WhatsNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_whats_new);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.whats_new);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> {
            finish();
        });

        Button buttonAppleCaramelPie = findViewById(R.id.buttonAppleCaramelPie);
        buttonAppleCaramelPie.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_whats_new,
                R.string.apple_caramel_pie,
                R.mipmap.ic_apple_caramel_pie_foreground,
                R.string.apple_caramel_pie_description,
                R.string.apple_caramel_pie_serving,
                R.string.apple_caramel_pie_energy,
                R.string.apple_caramel_pie_fat,
                R.string.apple_caramel_pie_saturated_fat,
                R.string.apple_caramel_pie_carbohidrates,
                R.string.apple_caramel_pie_sugar,
                R.string.apple_caramel_pie_fibre,
                R.string.apple_caramel_pie_proteins,
                R.string.apple_caramel_pie_salt,
                R.string.apple_caramel_pie_price,
                false,
                false
        ));

        Button buttonMenuNoelChicken = findViewById(R.id.buttonMenuNoelChicken);
        buttonMenuNoelChicken.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_whats_new,
                R.string.menu_noel_chicken,
                R.mipmap.ic_menu_noel_chicken_foreground,
                R.string.menu_noel_chicken_description,
                R.string.menu_noel_chicken_serving,
                R.string.menu_noel_chicken_energy,
                R.string.menu_noel_chicken_fat,
                R.string.menu_noel_chicken_saturated_fat,
                R.string.menu_noel_chicken_carbohidrates,
                R.string.menu_noel_chicken_sugar,
                R.string.menu_noel_chicken_fibre,
                R.string.menu_noel_chicken_proteins,
                R.string.menu_noel_chicken_salt,
                R.string.menu_noel_chicken_price,
                true,
                false
        ));

        Button buttonCheesyBeef = findViewById(R.id.buttonCheesyBeef);
        buttonCheesyBeef.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_whats_new,
                R.string.cheesy_beef,
                R.mipmap.ic_cheesy_beef_foreground,
                R.string.cheesy_beef_description,
                R.string.cheesy_beef_serving,
                R.string.cheesy_beef_energy,
                R.string.cheesy_beef_fat,
                R.string.cheesy_beef_saturated_fat,
                R.string.cheesy_beef_carbohidrates,
                R.string.cheesy_beef_sugar,
                R.string.cheesy_beef_fibre,
                R.string.cheesy_beef_proteins,
                R.string.cheesy_beef_salt,
                R.string.cheesy_beef_price,
                false,
                false
        ));

        Button buttonCheesyChicken = findViewById(R.id.buttonCheesyChicken);
        buttonCheesyChicken.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_whats_new,
                R.string.cheesy_chicken,
                R.mipmap.ic_cheesy_chicken_foreground,
                R.string.cheesy_chicken_description,
                R.string.cheesy_chicken_serving,
                R.string.cheesy_chicken_energy,
                R.string.cheesy_chicken_fat,
                R.string.cheesy_chicken_saturated_fat,
                R.string.cheesy_chicken_carbohidrates,
                R.string.cheesy_chicken_sugar,
                R.string.cheesy_chicken_fibre,
                R.string.cheesy_chicken_proteins,
                R.string.cheesy_chicken_salt,
                R.string.cheesy_chicken_price,
                false,
                false
        ));

        Button buttonJollyCheese = findViewById(R.id.buttonJollyCheese);
        buttonJollyCheese.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_whats_new,
                R.string.jolly_cheese,
                R.mipmap.ic_jolly_cheese_foreground,
                R.string.jolly_cheese_description,
                R.string.jolly_cheese_serving,
                R.string.jolly_cheese_energy,
                R.string.jolly_cheese_fat,
                R.string.jolly_cheese_saturated_fat,
                R.string.jolly_cheese_carbohidrates,
                R.string.jolly_cheese_sugar,
                R.string.jolly_cheese_fibre,
                R.string.jolly_cheese_proteins,
                R.string.jolly_cheese_salt,
                R.string.jolly_cheese_price,
                false,
                false
        ));

        Button buttonMenuJollyCheese = findViewById(R.id.buttonMenuJollyCheese);
        buttonMenuJollyCheese.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_whats_new,
                R.string.menu_jolly_cheese,
                R.mipmap.ic_menu_jolly_cheese_foreground,
                R.string.menu_jolly_cheese_description,
                R.string.menu_jolly_cheese_serving,
                R.string.menu_jolly_cheese_energy,
                R.string.menu_jolly_cheese_fat,
                R.string.menu_jolly_cheese_saturated_fat,
                R.string.menu_jolly_cheese_carbohidrates,
                R.string.menu_jolly_cheese_sugar,
                R.string.menu_jolly_cheese_fibre,
                R.string.menu_jolly_cheese_proteins,
                R.string.menu_jolly_cheese_salt,
                R.string.menu_jolly_cheese_price,
                true,
                false
        ));

        Button buttonMenuXmasBeef = findViewById(R.id.buttonMenuXmasBeef);
        buttonMenuXmasBeef.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_whats_new,
                R.string.menu_xmas_beef,
                R.mipmap.ic_menu_xmas_beef_foreground,
                R.string.menu_xmas_beef_description,
                R.string.menu_xmas_beef_serving,
                R.string.menu_xmas_beef_energy,
                R.string.menu_xmas_beef_fat,
                R.string.menu_xmas_beef_saturated_fat,
                R.string.menu_xmas_beef_carbohidrates,
                R.string.menu_xmas_beef_sugar,
                R.string.menu_xmas_beef_fibre,
                R.string.menu_xmas_beef_proteins,
                R.string.menu_xmas_beef_salt,
                R.string.menu_xmas_beef_price,
                true,
                false
        ));

        Button buttonNoelChicken = findViewById(R.id.buttonNoelChicken);
        buttonNoelChicken.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_whats_new,
                R.string.noel_chicken,
                R.mipmap.ic_noel_chicken_foreground,
                R.string.noel_chicken_description,
                R.string.noel_chicken_serving,
                R.string.noel_chicken_energy,
                R.string.noel_chicken_fat,
                R.string.noel_chicken_saturated_fat,
                R.string.noel_chicken_carbohidrates,
                R.string.noel_chicken_sugar,
                R.string.noel_chicken_fibre,
                R.string.noel_chicken_proteins,
                R.string.noel_chicken_salt,
                R.string.noel_chicken_price,
                false,
                false
        ));

        Button buttonXmasBeef = findViewById(R.id.buttonXmasBeef);
        buttonXmasBeef.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_whats_new,
                R.string.xmas_beef,
                R.mipmap.ic_xmas_beef_foreground,
                R.string.xmas_beef_description,
                R.string.xmas_beef_serving,
                R.string.xmas_beef_energy,
                R.string.xmas_beef_fat,
                R.string.xmas_beef_saturated_fat,
                R.string.xmas_beef_carbohidrates,
                R.string.xmas_beef_sugar,
                R.string.xmas_beef_fibre,
                R.string.xmas_beef_proteins,
                R.string.xmas_beef_salt,
                R.string.xmas_beef_price,
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

        Button buttonTrianglesSwissCheese = findViewById(R.id.buttonTrianglesSwissCheese);
        buttonTrianglesSwissCheese.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_whats_new,
                R.string.triangles_swiss_cheese,
                R.mipmap.ic_triangles_swiss_cheese_foreground,
                R.string.triangles_swiss_cheese_description,
                R.string.triangles_swiss_cheese_serving,
                R.string.triangles_swiss_cheese_energy,
                R.string.triangles_swiss_cheese_fat,
                R.string.triangles_swiss_cheese_saturated_fat,
                R.string.triangles_swiss_cheese_carbohidrates,
                R.string.triangles_swiss_cheese_sugar,
                R.string.triangles_swiss_cheese_fibre,
                R.string.triangles_swiss_cheese_proteins,
                R.string.triangles_swiss_cheese_salt,
                R.string.triangles_swiss_cheese_price,
                false,
                false
        ));
    }
}