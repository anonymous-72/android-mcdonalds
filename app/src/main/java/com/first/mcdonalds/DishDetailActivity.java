package com.first.mcdonalds;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DishDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dish_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.whats_new);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> finish());

        TextView textViewDishTitle = findViewById(R.id.textViewDishTitle);
        ImageView imageViewDishImage = findViewById(R.id.imageViewDishImage);
        TextView textViewDishDescription = findViewById(R.id.textViewDishDescription);
        TextView textViewServingData = findViewById(R.id.textViewServingData);
        TextView textViewEnergyData = findViewById(R.id.textViewEnergyData);
        TextView textViewFatData = findViewById(R.id.textViewFatData);
        TextView textViewSaturatedFatData = findViewById(R.id.textViewSaturatedFatData);
        TextView textViewCarbohidratesData = findViewById(R.id.textViewCarbohidratesData);
        TextView textViewSugarData = findViewById(R.id.textViewSugarData);
        TextView textViewFibreData = findViewById(R.id.textViewFibreData);
        TextView textViewProteinsData = findViewById(R.id.textViewProteinsData);
        TextView textViewSaltData = findViewById(R.id.textViewSaltData);
        TextView textViewPriceData = findViewById(R.id.textViewPriceData);
        LinearLayout linearLayoutContent = findViewById(R.id.linearLayoutContent);
        LinearLayout linearLayoutSaturatedFat = findViewById(R.id.linearLayoutSaturatedFat);
        LinearLayout linearLayoutFibre = findViewById(R.id.linearLayoutFibre);

        int backTo = getIntent().getIntExtra("BACK_TO", 0);
        int dishName = getIntent().getIntExtra("DISH_NAME", 0);
        int dishImage = getIntent().getIntExtra("DISH_IMAGE", 0);
        int dishDescription = getIntent().getIntExtra("DISH_DESCRIPTION", 0);
        int dishServing = getIntent().getIntExtra("DISH_SERVING", 0);
        int dishEnergy = getIntent().getIntExtra("DISH_ENERGY", 0);
        int dishFat = getIntent().getIntExtra("DISH_FAT", 0);
        int dishSaturatedFat = getIntent().getIntExtra("DISH_SATURATED_FAT", 0);
        int dishCarbohidrates = getIntent().getIntExtra("DISH_CARBOHIDRATES", 0);
        int dishSugar = getIntent().getIntExtra("DISH_SUGAR", 0);
        int dishFibre = getIntent().getIntExtra("DISH_FIBRE", 0);
        int dishProteins = getIntent().getIntExtra("DISH_PROTEINS", 0);
        int dishSalt = getIntent().getIntExtra("DISH_SALT", 0);
        int dishPrice = getIntent().getIntExtra("DISH_PRICE", 0);
        boolean isMenu = getIntent().getBooleanExtra("IS_MENU", false);
        boolean isHotDrink = getIntent().getBooleanExtra("IS_HOT_DRINK", false);

        buttonBack.setText(backTo);
        textViewDishTitle.setText(dishName);
        imageViewDishImage.setImageResource(dishImage);
        textViewDishDescription.setText(dishDescription);
        textViewServingData.setText(dishServing);
        textViewEnergyData.setText(dishEnergy);
        textViewFatData.setText(dishFat);
        textViewSaturatedFatData.setText(dishSaturatedFat);
        textViewCarbohidratesData.setText(dishCarbohidrates);
        textViewSugarData.setText(dishSugar);
        textViewFibreData.setText(dishFibre);
        textViewProteinsData.setText(dishProteins);
        textViewSaltData.setText(dishSalt);
        textViewPriceData.setText(dishPrice);

        if (isMenu) {
            linearLayoutContent.setVisibility(View.GONE);
        } else if (isHotDrink) {
            textViewDishDescription.setVisibility(View.GONE);
            linearLayoutSaturatedFat.setVisibility(View.GONE);
            linearLayoutFibre.setVisibility(View.GONE);
        }
    }
}