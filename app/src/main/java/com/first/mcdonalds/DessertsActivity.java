package com.first.mcdonalds;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_desserts);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.desserts);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> {
            finish();
        });

        Button buttonAppleCaramelPie = findViewById(R.id.buttonAppleCaramelPie);
        buttonAppleCaramelPie.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
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

        Button buttonMcFlurryKitKatWithStrawberryTopping = findViewById(R.id.buttonMcFlurryKitKatWithStrawberryTopping);
        buttonMcFlurryKitKatWithStrawberryTopping.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.mcflurry_kit_kat_with_strawberry_topping,
                R.mipmap.ic_mcflurry_kit_kat_with_strawberry_topping_foreground,
                R.string.mcflurry_kit_kat_with_strawberry_topping_description,
                R.string.mcflurry_kit_kat_with_strawberry_topping_serving,
                R.string.mcflurry_kit_kat_with_strawberry_topping_energy,
                R.string.mcflurry_kit_kat_with_strawberry_topping_fat,
                R.string.mcflurry_kit_kat_with_strawberry_topping_saturated_fat,
                R.string.mcflurry_kit_kat_with_strawberry_topping_carbohidrates,
                R.string.mcflurry_kit_kat_with_strawberry_topping_sugar,
                R.string.mcflurry_kit_kat_with_strawberry_topping_fibre,
                R.string.mcflurry_kit_kat_with_strawberry_topping_proteins,
                R.string.mcflurry_kit_kat_with_strawberry_topping_salt,
                R.string.mcflurry_kit_kat_with_strawberry_topping_price,
                false,
                false
        ));

        Button buttonMcFlurryOreoWithStrawberryTopping = findViewById(R.id.buttonMcFlurryOreoWithStrawberryTopping);
        buttonMcFlurryOreoWithStrawberryTopping.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.mcflurry_oreo_with_strawberry_topping,
                R.mipmap.ic_mcflurry_oreo_with_strawberry_topping_foreground,
                R.string.mcflurry_oreo_with_strawberry_topping_description,
                R.string.mcflurry_oreo_with_strawberry_topping_serving,
                R.string.mcflurry_oreo_with_strawberry_topping_energy,
                R.string.mcflurry_oreo_with_strawberry_topping_fat,
                R.string.mcflurry_oreo_with_strawberry_topping_saturated_fat,
                R.string.mcflurry_oreo_with_strawberry_topping_carbohidrates,
                R.string.mcflurry_oreo_with_strawberry_topping_sugar,
                R.string.mcflurry_oreo_with_strawberry_topping_fibre,
                R.string.mcflurry_oreo_with_strawberry_topping_proteins,
                R.string.mcflurry_oreo_with_strawberry_topping_salt,
                R.string.mcflurry_oreo_with_strawberry_topping_price,
                false,
                false
        ));

        Button buttonMcPopsApricots = findViewById(R.id.buttonMcPopsApricots);
        buttonMcPopsApricots.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
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
                R.string.back_to_desserts,
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
                R.string.back_to_desserts,
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

        Button buttonMcFlurryKitKat = findViewById(R.id.buttonMcFlurryKitKat);
        buttonMcFlurryKitKat.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.mcflurry_kit_kat,
                R.mipmap.ic_mcflurry_kit_kat_foreground,
                R.string.mcflurry_kit_kat_description,
                R.string.mcflurry_kit_kat_serving,
                R.string.mcflurry_kit_kat_energy,
                R.string.mcflurry_kit_kat_fat,
                R.string.mcflurry_kit_kat_saturated_fat,
                R.string.mcflurry_kit_kat_carbohidrates,
                R.string.mcflurry_kit_kat_sugar,
                R.string.mcflurry_kit_kat_fibre,
                R.string.mcflurry_kit_kat_proteins,
                R.string.mcflurry_kit_kat_salt,
                R.string.mcflurry_kit_kat_price,
                false,
                false
        ));

        Button buttonMcFlurryKitKatCaramel = findViewById(R.id.buttonMcFlurryKitKatCaramel);
        buttonMcFlurryKitKatCaramel.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.mcflurry_kit_kat_caramel,
                R.mipmap.ic_mcflurry_kit_kat_caramel_foreground,
                R.string.mcflurry_kit_kat_caramel_description,
                R.string.mcflurry_kit_kat_caramel_serving,
                R.string.mcflurry_kit_kat_caramel_energy,
                R.string.mcflurry_kit_kat_caramel_fat,
                R.string.mcflurry_kit_kat_caramel_saturated_fat,
                R.string.mcflurry_kit_kat_caramel_carbohidrates,
                R.string.mcflurry_kit_kat_caramel_sugar,
                R.string.mcflurry_kit_kat_caramel_fibre,
                R.string.mcflurry_kit_kat_caramel_proteins,
                R.string.mcflurry_kit_kat_caramel_salt,
                R.string.mcflurry_kit_kat_caramel_price,
                false,
                false
        ));

        Button buttonMcFlurryKitKatChocolate = findViewById(R.id.buttonMcFlurryKitKatChocolate);
        buttonMcFlurryKitKatChocolate.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.mcflurry_kit_kat_chocolate,
                R.mipmap.ic_mcflurry_kit_kat_chocolate_foreground,
                R.string.mcflurry_kit_kat_chocolate_description,
                R.string.mcflurry_kit_kat_chocolate_serving,
                R.string.mcflurry_kit_kat_chocolate_energy,
                R.string.mcflurry_kit_kat_chocolate_fat,
                R.string.mcflurry_kit_kat_chocolate_saturated_fat,
                R.string.mcflurry_kit_kat_chocolate_carbohidrates,
                R.string.mcflurry_kit_kat_chocolate_sugar,
                R.string.mcflurry_kit_kat_chocolate_fibre,
                R.string.mcflurry_kit_kat_chocolate_proteins,
                R.string.mcflurry_kit_kat_chocolate_salt,
                R.string.mcflurry_kit_kat_chocolate_price,
                false,
                false
        ));

        Button buttonMcFlurryOreoCaramel = findViewById(R.id.buttonMcFlurryOreoCaramel);
        buttonMcFlurryOreoCaramel.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.mcflurry_oreo_caramel,
                R.mipmap.ic_mcflurry_oreo_caramel_foreground,
                R.string.mcflurry_oreo_caramel_description,
                R.string.mcflurry_oreo_caramel_serving,
                R.string.mcflurry_oreo_caramel_energy,
                R.string.mcflurry_oreo_caramel_fat,
                R.string.mcflurry_oreo_caramel_saturated_fat,
                R.string.mcflurry_oreo_caramel_carbohidrates,
                R.string.mcflurry_oreo_caramel_sugar,
                R.string.mcflurry_oreo_caramel_fibre,
                R.string.mcflurry_oreo_caramel_proteins,
                R.string.mcflurry_oreo_caramel_salt,
                R.string.mcflurry_oreo_caramel_price,
                false,
                false
        ));

        Button buttonMcFlurryOreoChocolate = findViewById(R.id.buttonMcFlurryOreoChocolate);
        buttonMcFlurryOreoChocolate.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.mcflurry_oreo_chocolate,
                R.mipmap.ic_mcflurry_oreo_chocolate_foreground,
                R.string.mcflurry_oreo_chocolate_description,
                R.string.mcflurry_oreo_chocolate_serving,
                R.string.mcflurry_oreo_chocolate_energy,
                R.string.mcflurry_oreo_chocolate_fat,
                R.string.mcflurry_oreo_chocolate_saturated_fat,
                R.string.mcflurry_oreo_chocolate_carbohidrates,
                R.string.mcflurry_oreo_chocolate_sugar,
                R.string.mcflurry_oreo_chocolate_fibre,
                R.string.mcflurry_oreo_chocolate_proteins,
                R.string.mcflurry_oreo_chocolate_salt,
                R.string.mcflurry_oreo_chocolate_price,
                false,
                false
        ));

        Button buttonMcSundaeCaramel = findViewById(R.id.buttonMcSundaeCaramel);
        buttonMcSundaeCaramel.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.mcsundae_caramel,
                R.mipmap.ic_mcsundae_caramel_foreground,
                R.string.mcsundae_caramel_description,
                R.string.mcsundae_caramel_serving,
                R.string.mcsundae_caramel_energy,
                R.string.mcsundae_caramel_fat,
                R.string.mcsundae_caramel_saturated_fat,
                R.string.mcsundae_caramel_carbohidrates,
                R.string.mcsundae_caramel_sugar,
                R.string.mcsundae_caramel_fibre,
                R.string.mcsundae_caramel_proteins,
                R.string.mcsundae_caramel_salt,
                R.string.mcsundae_caramel_price,
                false,
                false
        ));

        Button buttonMcSundaeChocolate = findViewById(R.id.buttonMcSundaeChocolate);
        buttonMcSundaeChocolate.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.mcsundae_chocolate,
                R.mipmap.ic_mcsundae_chocolate_foreground,
                R.string.mcsundae_chocolate_description,
                R.string.mcsundae_chocolate_serving,
                R.string.mcsundae_chocolate_energy,
                R.string.mcsundae_chocolate_fat,
                R.string.mcsundae_chocolate_saturated_fat,
                R.string.mcsundae_chocolate_carbohidrates,
                R.string.mcsundae_chocolate_sugar,
                R.string.mcsundae_chocolate_fibre,
                R.string.mcsundae_chocolate_proteins,
                R.string.mcsundae_chocolate_salt,
                R.string.mcsundae_chocolate_price,
                false,
                false
        ));

        Button buttonMcSundaeStrawberries = findViewById(R.id.buttonMcSundaeStrawberries);
        buttonMcSundaeStrawberries.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.mcsundae_strawberries,
                R.mipmap.ic_mcsundae_strawberries_foreground,
                R.string.mcsundae_strawberries_description,
                R.string.mcsundae_strawberries_serving,
                R.string.mcsundae_strawberries_energy,
                R.string.mcsundae_strawberries_fat,
                R.string.mcsundae_strawberries_saturated_fat,
                R.string.mcsundae_strawberries_carbohidrates,
                R.string.mcsundae_strawberries_sugar,
                R.string.mcsundae_strawberries_fibre,
                R.string.mcsundae_strawberries_proteins,
                R.string.mcsundae_strawberries_salt,
                R.string.mcsundae_strawberries_price,
                false,
                false
        ));

        Button buttonShakeRoyalWithStrawberries300Ml = findViewById(R.id.buttonShakeRoyalWithStrawberries300Ml);
        buttonShakeRoyalWithStrawberries300Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.shake_royal_with_strawberries_300_ml,
                R.mipmap.ic_shake_royal_with_strawberries_300_ml_foreground,
                R.string.shake_royal_with_strawberries_300_ml_description,
                R.string.shake_royal_with_strawberries_300_ml_serving,
                R.string.shake_royal_with_strawberries_300_ml_energy,
                R.string.shake_royal_with_strawberries_300_ml_fat,
                R.string.shake_royal_with_strawberries_300_ml_saturated_fat,
                R.string.shake_royal_with_strawberries_300_ml_carbohidrates,
                R.string.shake_royal_with_strawberries_300_ml_sugar,
                R.string.shake_royal_with_strawberries_300_ml_fibre,
                R.string.shake_royal_with_strawberries_300_ml_proteins,
                R.string.shake_royal_with_strawberries_300_ml_salt,
                R.string.shake_royal_with_strawberries_300_ml_price,
                false,
                false
        ));

        Button buttonShakeRoyalWithVanilla300Ml = findViewById(R.id.buttonShakeRoyalWithVanilla300Ml);
        buttonShakeRoyalWithVanilla300Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.shake_royal_with_vanilla_300_ml,
                R.mipmap.ic_shake_royal_with_vanilla_300_ml_foreground,
                R.string.shake_royal_with_vanilla_300_ml_description,
                R.string.shake_royal_with_vanilla_300_ml_serving,
                R.string.shake_royal_with_vanilla_300_ml_energy,
                R.string.shake_royal_with_vanilla_300_ml_fat,
                R.string.shake_royal_with_vanilla_300_ml_saturated_fat,
                R.string.shake_royal_with_vanilla_300_ml_carbohidrates,
                R.string.shake_royal_with_vanilla_300_ml_sugar,
                R.string.shake_royal_with_vanilla_300_ml_fibre,
                R.string.shake_royal_with_vanilla_300_ml_proteins,
                R.string.shake_royal_with_vanilla_300_ml_salt,
                R.string.shake_royal_with_vanilla_300_ml_price,
                false,
                false
        ));

        Button buttonShakeWithChocolate250Ml = findViewById(R.id.buttonShakeWithChocolate250Ml);
        buttonShakeWithChocolate250Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.shake_with_chocolate_250_ml,
                R.mipmap.ic_shake_with_chocolate_250_ml_foreground,
                R.string.shake_with_chocolate_250_ml_description,
                R.string.shake_with_chocolate_250_ml_serving,
                R.string.shake_with_chocolate_250_ml_energy,
                R.string.shake_with_chocolate_250_ml_fat,
                R.string.shake_with_chocolate_250_ml_saturated_fat,
                R.string.shake_with_chocolate_250_ml_carbohidrates,
                R.string.shake_with_chocolate_250_ml_sugar,
                R.string.shake_with_chocolate_250_ml_fibre,
                R.string.shake_with_chocolate_250_ml_proteins,
                R.string.shake_with_chocolate_250_ml_salt,
                R.string.shake_with_chocolate_250_ml_price,
                false,
                false
        ));

        Button buttonShakeWithChocolate400Ml = findViewById(R.id.buttonShakeWithChocolate400Ml);
        buttonShakeWithChocolate400Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.shake_with_chocolate_400_ml,
                R.mipmap.ic_shake_with_chocolate_400_ml_foreground,
                R.string.shake_with_chocolate_400_ml_description,
                R.string.shake_with_chocolate_400_ml_serving,
                R.string.shake_with_chocolate_400_ml_energy,
                R.string.shake_with_chocolate_400_ml_fat,
                R.string.shake_with_chocolate_400_ml_saturated_fat,
                R.string.shake_with_chocolate_400_ml_carbohidrates,
                R.string.shake_with_chocolate_400_ml_sugar,
                R.string.shake_with_chocolate_400_ml_fibre,
                R.string.shake_with_chocolate_400_ml_proteins,
                R.string.shake_with_chocolate_400_ml_salt,
                R.string.shake_with_chocolate_400_ml_price,
                false,
                false
        ));

        Button buttonShakeWithStrawberries250Ml = findViewById(R.id.buttonShakeWithStrawberries250Ml);
        buttonShakeWithStrawberries250Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.shake_with_strawberries_250_ml,
                R.mipmap.ic_shake_with_strawberries_250_ml_foreground,
                R.string.shake_with_strawberries_250_ml_description,
                R.string.shake_with_strawberries_250_ml_serving,
                R.string.shake_with_strawberries_250_ml_energy,
                R.string.shake_with_strawberries_250_ml_fat,
                R.string.shake_with_strawberries_250_ml_saturated_fat,
                R.string.shake_with_strawberries_250_ml_carbohidrates,
                R.string.shake_with_strawberries_250_ml_sugar,
                R.string.shake_with_strawberries_250_ml_fibre,
                R.string.shake_with_strawberries_250_ml_proteins,
                R.string.shake_with_strawberries_250_ml_salt,
                R.string.shake_with_strawberries_250_ml_price,
                false,
                false
        ));

        Button buttonShakeWithStrawberries400Ml = findViewById(R.id.buttonShakeWithStrawberries400Ml);
        buttonShakeWithStrawberries400Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.shake_with_strawberries_400_ml,
                R.mipmap.ic_shake_with_strawberries_400_ml_foreground,
                R.string.shake_with_strawberries_400_ml_description,
                R.string.shake_with_strawberries_400_ml_serving,
                R.string.shake_with_strawberries_400_ml_energy,
                R.string.shake_with_strawberries_400_ml_fat,
                R.string.shake_with_strawberries_400_ml_saturated_fat,
                R.string.shake_with_strawberries_400_ml_carbohidrates,
                R.string.shake_with_strawberries_400_ml_sugar,
                R.string.shake_with_strawberries_400_ml_fibre,
                R.string.shake_with_strawberries_400_ml_proteins,
                R.string.shake_with_strawberries_400_ml_salt,
                R.string.shake_with_strawberries_400_ml_price,
                false,
                false
        ));

        Button buttonShakeWithVanilla250Ml = findViewById(R.id.buttonShakeWithVanilla250Ml);
        buttonShakeWithVanilla250Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.shake_with_vanilla_250_ml,
                R.mipmap.ic_shake_with_vanilla_250_ml_foreground,
                R.string.shake_with_vanilla_250_ml_description,
                R.string.shake_with_vanilla_250_ml_serving,
                R.string.shake_with_vanilla_250_ml_energy,
                R.string.shake_with_vanilla_250_ml_fat,
                R.string.shake_with_vanilla_250_ml_saturated_fat,
                R.string.shake_with_vanilla_250_ml_carbohidrates,
                R.string.shake_with_vanilla_250_ml_sugar,
                R.string.shake_with_vanilla_250_ml_fibre,
                R.string.shake_with_vanilla_250_ml_proteins,
                R.string.shake_with_vanilla_250_ml_salt,
                R.string.shake_with_vanilla_250_ml_price,
                false,
                false
        ));

        Button buttonShakeWithVanilla400Ml = findViewById(R.id.buttonShakeWithVanilla400Ml);
        buttonShakeWithVanilla400Ml.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.shake_with_vanilla_400_ml,
                R.mipmap.ic_shake_with_vanilla_400_ml_foreground,
                R.string.shake_with_vanilla_400_ml_description,
                R.string.shake_with_vanilla_400_ml_serving,
                R.string.shake_with_vanilla_400_ml_energy,
                R.string.shake_with_vanilla_400_ml_fat,
                R.string.shake_with_vanilla_400_ml_saturated_fat,
                R.string.shake_with_vanilla_400_ml_carbohidrates,
                R.string.shake_with_vanilla_400_ml_sugar,
                R.string.shake_with_vanilla_400_ml_fibre,
                R.string.shake_with_vanilla_400_ml_proteins,
                R.string.shake_with_vanilla_400_ml_salt,
                R.string.shake_with_vanilla_400_ml_price,
                false,
                false
        ));

        Button buttonCherryPie = findViewById(R.id.buttonCherryPie);
        buttonCherryPie.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.cherry_pie,
                R.mipmap.ic_cherry_pie_foreground,
                R.string.cherry_pie_description,
                R.string.cherry_pie_serving,
                R.string.cherry_pie_energy,
                R.string.cherry_pie_fat,
                R.string.cherry_pie_saturated_fat,
                R.string.cherry_pie_carbohidrates,
                R.string.cherry_pie_sugar,
                R.string.cherry_pie_fibre,
                R.string.cherry_pie_proteins,
                R.string.cherry_pie_salt,
                R.string.cherry_pie_price,
                false,
                false
        ));

        Button buttonVanillaDonut = findViewById(R.id.buttonVanillaDonut);
        buttonVanillaDonut.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
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
                R.string.back_to_desserts,
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
                R.string.back_to_desserts,
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
                R.string.back_to_desserts,
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

        Button buttonIceCone = findViewById(R.id.buttonIceCone);
        buttonIceCone.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_desserts,
                R.string.ice_cone,
                R.mipmap.ic_ice_cone_foreground,
                R.string.ice_cone_description,
                R.string.ice_cone_serving,
                R.string.ice_cone_energy,
                R.string.ice_cone_fat,
                R.string.ice_cone_saturated_fat,
                R.string.ice_cone_carbohidrates,
                R.string.ice_cone_sugar,
                R.string.ice_cone_fibre,
                R.string.ice_cone_proteins,
                R.string.ice_cone_salt,
                R.string.ice_cone_price,
                false,
                false
        ));
    }
}