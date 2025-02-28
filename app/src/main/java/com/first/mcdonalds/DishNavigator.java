package com.first.mcdonalds;

import android.content.Context;
import android.content.Intent;

public class DishNavigator {
    public static void openDishDetail(
            Context context,
            int backTo,
            int dishName,
            int dishImage,
            int dishDescription,
            int dishServing,
            int dishEnergy,
            int dishFat,
            int dishSaturatedFat,
            int dishCarbohidrates,
            int dishSugar,
            int dishFibre,
            int dishProteins,
            int dishSalt,
            int dishPrice,
            boolean isMenu,
            boolean isHotDrink) {
        Intent intent = new Intent(context, DishDetailActivity.class);
        intent.putExtra("BACK_TO", backTo);
        intent.putExtra("DISH_NAME", dishName);
        intent.putExtra("DISH_IMAGE", dishImage);
        intent.putExtra("DISH_DESCRIPTION", dishDescription);
        intent.putExtra("DISH_SERVING", dishServing);
        intent.putExtra("DISH_ENERGY", dishEnergy);
        intent.putExtra("DISH_FAT", dishFat);
        intent.putExtra("DISH_SATURATED_FAT", dishSaturatedFat);
        intent.putExtra("DISH_CARBOHIDRATES", dishCarbohidrates);
        intent.putExtra("DISH_SUGAR", dishSugar);
        intent.putExtra("DISH_FIBRE", dishFibre);
        intent.putExtra("DISH_PROTEINS", dishProteins);
        intent.putExtra("DISH_SALT", dishSalt);
        intent.putExtra("DISH_PRICE", dishPrice);
        intent.putExtra("IS_MENU", isMenu);
        intent.putExtra("IS_HOT_DRINK", isHotDrink);
        context.startActivity(intent);
    }
}
