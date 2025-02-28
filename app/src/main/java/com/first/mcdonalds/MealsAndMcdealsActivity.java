package com.first.mcdonalds;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MealsAndMcdealsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_meals_and_mcdeals);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.meals_and_mcdeals);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> {
            finish();
        });

        Button buttonMenuBigMac = findViewById(R.id.buttonMenuBigMac);
        buttonMenuBigMac.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_big_mac,
                R.mipmap.ic_menu_big_mac_foreground,
                R.string.menu_big_mac_description,
                R.string.menu_big_mac_serving,
                R.string.menu_big_mac_energy,
                R.string.menu_big_mac_fat,
                R.string.menu_big_mac_saturated_fat,
                R.string.menu_big_mac_carbohidrates,
                R.string.menu_big_mac_sugar,
                R.string.menu_big_mac_fibre,
                R.string.menu_big_mac_proteins,
                R.string.menu_big_mac_salt,
                R.string.menu_big_mac_price,
                true,
                false
        ));

        Button buttonMenuNoelChicken = findViewById(R.id.buttonMenuNoelChicken);
        buttonMenuNoelChicken.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
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

        Button button20ChickenMcNuggetsBox = findViewById(R.id.button20ChickenMcNuggetsBox);
        button20ChickenMcNuggetsBox.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.twenty_chicken_mcnuggets_box,
                R.mipmap.ic_20_chicken_mcnuggets_box_foreground,
                R.string.twenty_chicken_mcnuggets_box_description,
                R.string.twenty_chicken_mcnuggets_box_serving,
                R.string.twenty_chicken_mcnuggets_box_energy,
                R.string.twenty_chicken_mcnuggets_box_fat,
                R.string.twenty_chicken_mcnuggets_box_saturated_fat,
                R.string.twenty_chicken_mcnuggets_box_carbohidrates,
                R.string.twenty_chicken_mcnuggets_box_sugar,
                R.string.twenty_chicken_mcnuggets_box_fibre,
                R.string.twenty_chicken_mcnuggets_box_proteins,
                R.string.twenty_chicken_mcnuggets_box_salt,
                R.string.twenty_chicken_mcnuggets_box_price,
                true,
                false
        ));

        Button buttonMcCrispyMenu = findViewById(R.id.buttonMcCrispyMenu);
        buttonMcCrispyMenu.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.mccrispy_menu,
                R.mipmap.ic_mccrispy_menu_foreground,
                R.string.mccrispy_menu_description,
                R.string.mccrispy_menu_serving,
                R.string.mccrispy_menu_energy,
                R.string.mccrispy_menu_fat,
                R.string.mccrispy_menu_saturated_fat,
                R.string.mccrispy_menu_carbohidrates,
                R.string.mccrispy_menu_sugar,
                R.string.mccrispy_menu_fibre,
                R.string.mccrispy_menu_proteins,
                R.string.mccrispy_menu_salt,
                R.string.mccrispy_menu_price,
                true,
                false
        ));

        Button buttonMcDealFamily = findViewById(R.id.buttonMcDealFamily);
        buttonMcDealFamily.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.mcdeal_family,
                R.mipmap.ic_mcdeal_family_foreground,
                R.string.mcdeal_family_description,
                R.string.mcdeal_family_serving,
                R.string.mcdeal_family_energy,
                R.string.mcdeal_family_fat,
                R.string.mcdeal_family_saturated_fat,
                R.string.mcdeal_family_carbohidrates,
                R.string.mcdeal_family_sugar,
                R.string.mcdeal_family_fibre,
                R.string.mcdeal_family_proteins,
                R.string.mcdeal_family_salt,
                R.string.mcdeal_family_price,
                true,
                false
        ));

        Button buttonMcDealFor2 = findViewById(R.id.buttonMcDealFor2);
        buttonMcDealFor2.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.mcdeal_for_2,
                R.mipmap.ic_mcdeal_for_2_foreground,
                R.string.mcdeal_for_2_description,
                R.string.mcdeal_for_2_serving,
                R.string.mcdeal_for_2_energy,
                R.string.mcdeal_for_2_fat,
                R.string.mcdeal_for_2_saturated_fat,
                R.string.mcdeal_for_2_carbohidrates,
                R.string.mcdeal_for_2_sugar,
                R.string.mcdeal_for_2_fibre,
                R.string.mcdeal_for_2_proteins,
                R.string.mcdeal_for_2_salt,
                R.string.mcdeal_for_2_price,
                true,
                false
        ));

        Button buttonMcDealFriends = findViewById(R.id.buttonMcDealFriends);
        buttonMcDealFriends.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.mcdeal_friends,
                R.mipmap.ic_mcdeal_friends_foreground,
                R.string.mcdeal_friends_description,
                R.string.mcdeal_friends_serving,
                R.string.mcdeal_friends_energy,
                R.string.mcdeal_friends_fat,
                R.string.mcdeal_friends_saturated_fat,
                R.string.mcdeal_friends_carbohidrates,
                R.string.mcdeal_friends_sugar,
                R.string.mcdeal_friends_fibre,
                R.string.mcdeal_friends_proteins,
                R.string.mcdeal_friends_salt,
                R.string.mcdeal_friends_price,
                true,
                false
        ));

        Button buttonMenuBigMacBacon = findViewById(R.id.buttonMenuBigMacBacon);
        buttonMenuBigMacBacon.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_big_mac_bacon,
                R.mipmap.ic_menu_big_mac_bacon_foreground,
                R.string.menu_big_mac_bacon_description,
                R.string.menu_big_mac_bacon_serving,
                R.string.menu_big_mac_bacon_energy,
                R.string.menu_big_mac_bacon_fat,
                R.string.menu_big_mac_bacon_saturated_fat,
                R.string.menu_big_mac_bacon_carbohidrates,
                R.string.menu_big_mac_bacon_sugar,
                R.string.menu_big_mac_bacon_fibre,
                R.string.menu_big_mac_bacon_proteins,
                R.string.menu_big_mac_bacon_salt,
                R.string.menu_big_mac_bacon_price,
                true,
                false
        ));

        Button buttonMenuBigTasty = findViewById(R.id.buttonMenuBigTasty);
        buttonMenuBigTasty.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_big_tasty,
                R.mipmap.ic_menu_big_tasty_foreground,
                R.string.menu_big_tasty_description,
                R.string.menu_big_tasty_serving,
                R.string.menu_big_tasty_energy,
                R.string.menu_big_tasty_fat,
                R.string.menu_big_tasty_saturated_fat,
                R.string.menu_big_tasty_carbohidrates,
                R.string.menu_big_tasty_sugar,
                R.string.menu_big_tasty_fibre,
                R.string.menu_big_tasty_proteins,
                R.string.menu_big_tasty_salt,
                R.string.menu_big_tasty_price,
                true,
                false
        ));

        Button buttonMenuBigTastyBacon = findViewById(R.id.buttonMenuBigTastyBacon);
        buttonMenuBigTastyBacon.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_big_tasty_bacon,
                R.mipmap.ic_menu_big_tasty_bacon_foreground,
                R.string.menu_big_tasty_bacon_description,
                R.string.menu_big_tasty_bacon_serving,
                R.string.menu_big_tasty_bacon_energy,
                R.string.menu_big_tasty_bacon_fat,
                R.string.menu_big_tasty_bacon_saturated_fat,
                R.string.menu_big_tasty_bacon_carbohidrates,
                R.string.menu_big_tasty_bacon_sugar,
                R.string.menu_big_tasty_bacon_fibre,
                R.string.menu_big_tasty_bacon_proteins,
                R.string.menu_big_tasty_bacon_salt,
                R.string.menu_big_tasty_bacon_price,
                true,
                false
        ));

        Button buttonMenuBigTastyChicken = findViewById(R.id.buttonMenuBigTastyChicken);
        buttonMenuBigTastyChicken.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_big_tasty_chicken,
                R.mipmap.ic_menu_big_tasty_chicken_foreground,
                R.string.menu_big_tasty_chicken_description,
                R.string.menu_big_tasty_chicken_serving,
                R.string.menu_big_tasty_chicken_energy,
                R.string.menu_big_tasty_chicken_fat,
                R.string.menu_big_tasty_chicken_saturated_fat,
                R.string.menu_big_tasty_chicken_carbohidrates,
                R.string.menu_big_tasty_chicken_sugar,
                R.string.menu_big_tasty_chicken_fibre,
                R.string.menu_big_tasty_chicken_proteins,
                R.string.menu_big_tasty_chicken_salt,
                R.string.menu_big_tasty_chicken_price,
                true,
                false
        ));

        Button buttonMenuChickenMcNuggets6Pcs = findViewById(R.id.buttonMenuChickenMcNuggets6Pcs);
        buttonMenuChickenMcNuggets6Pcs.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_chicken_mcnuggets_6_pcs,
                R.mipmap.ic_menu_chicken_mcnuggets_6_pcs_foreground,
                R.string.menu_chicken_mcnuggets_6_pcs_description,
                R.string.menu_chicken_mcnuggets_6_pcs_serving,
                R.string.menu_chicken_mcnuggets_6_pcs_energy,
                R.string.menu_chicken_mcnuggets_6_pcs_fat,
                R.string.menu_chicken_mcnuggets_6_pcs_saturated_fat,
                R.string.menu_chicken_mcnuggets_6_pcs_carbohidrates,
                R.string.menu_chicken_mcnuggets_6_pcs_sugar,
                R.string.menu_chicken_mcnuggets_6_pcs_fibre,
                R.string.menu_chicken_mcnuggets_6_pcs_proteins,
                R.string.menu_chicken_mcnuggets_6_pcs_salt,
                R.string.menu_chicken_mcnuggets_6_pcs_price,
                true,
                false
        ));

        Button buttonMenuChickenMcNuggets9Pcs = findViewById(R.id.buttonMenuChickenMcNuggets9Pcs);
        buttonMenuChickenMcNuggets9Pcs.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_chicken_mcnuggets_9_pcs,
                R.mipmap.ic_menu_chicken_mcnuggets_9_pcs_foreground,
                R.string.menu_chicken_mcnuggets_9_pcs_description,
                R.string.menu_chicken_mcnuggets_9_pcs_serving,
                R.string.menu_chicken_mcnuggets_9_pcs_energy,
                R.string.menu_chicken_mcnuggets_9_pcs_fat,
                R.string.menu_chicken_mcnuggets_9_pcs_saturated_fat,
                R.string.menu_chicken_mcnuggets_9_pcs_carbohidrates,
                R.string.menu_chicken_mcnuggets_9_pcs_sugar,
                R.string.menu_chicken_mcnuggets_9_pcs_fibre,
                R.string.menu_chicken_mcnuggets_9_pcs_proteins,
                R.string.menu_chicken_mcnuggets_9_pcs_salt,
                R.string.menu_chicken_mcnuggets_9_pcs_price,
                true,
                false
        ));

        Button buttonMenuChickenMcWrap = findViewById(R.id.buttonMenuChickenMcWrap);
        buttonMenuChickenMcWrap.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_chicken_mcwrap,
                R.mipmap.ic_menu_chicken_mcwrap_foreground,
                R.string.menu_chicken_mcwrap_description,
                R.string.menu_chicken_mcwrap_serving,
                R.string.menu_chicken_mcwrap_energy,
                R.string.menu_chicken_mcwrap_fat,
                R.string.menu_chicken_mcwrap_saturated_fat,
                R.string.menu_chicken_mcwrap_carbohidrates,
                R.string.menu_chicken_mcwrap_sugar,
                R.string.menu_chicken_mcwrap_fibre,
                R.string.menu_chicken_mcwrap_proteins,
                R.string.menu_chicken_mcwrap_salt,
                R.string.menu_chicken_mcwrap_price,
                true,
                false
        ));

        Button buttonMenuDoubleBigTasty = findViewById(R.id.buttonMenuDoubleBigTasty);
        buttonMenuDoubleBigTasty.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_double_big_tasty,
                R.mipmap.ic_menu_double_big_tasty_foreground,
                R.string.menu_double_big_tasty_description,
                R.string.menu_double_big_tasty_serving,
                R.string.menu_double_big_tasty_energy,
                R.string.menu_double_big_tasty_fat,
                R.string.menu_double_big_tasty_saturated_fat,
                R.string.menu_double_big_tasty_carbohidrates,
                R.string.menu_double_big_tasty_sugar,
                R.string.menu_double_big_tasty_fibre,
                R.string.menu_double_big_tasty_proteins,
                R.string.menu_double_big_tasty_salt,
                R.string.menu_double_big_tasty_price,
                true,
                false
        ));

        Button buttonMenuDoubleCheeseburger = findViewById(R.id.buttonMenuDoubleCheeseburger);
        buttonMenuDoubleCheeseburger.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_double_cheeseburger,
                R.mipmap.ic_menu_double_cheeseburger_foreground,
                R.string.menu_double_cheeseburger_description,
                R.string.menu_double_cheeseburger_serving,
                R.string.menu_double_cheeseburger_energy,
                R.string.menu_double_cheeseburger_fat,
                R.string.menu_double_cheeseburger_saturated_fat,
                R.string.menu_double_cheeseburger_carbohidrates,
                R.string.menu_double_cheeseburger_sugar,
                R.string.menu_double_cheeseburger_fibre,
                R.string.menu_double_cheeseburger_proteins,
                R.string.menu_double_cheeseburger_salt,
                R.string.menu_double_cheeseburger_price,
                true,
                false
        ));

        Button buttonMenuDoubleFiletOFish = findViewById(R.id.buttonMenuDoubleFiletOFish);
        buttonMenuDoubleFiletOFish.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_double_filet_o_fish,
                R.mipmap.ic_menu_double_filet_o_fish_foreground,
                R.string.menu_double_filet_o_fish_description,
                R.string.menu_double_filet_o_fish_serving,
                R.string.menu_double_filet_o_fish_energy,
                R.string.menu_double_filet_o_fish_fat,
                R.string.menu_double_filet_o_fish_saturated_fat,
                R.string.menu_double_filet_o_fish_carbohidrates,
                R.string.menu_double_filet_o_fish_sugar,
                R.string.menu_double_filet_o_fish_fibre,
                R.string.menu_double_filet_o_fish_proteins,
                R.string.menu_double_filet_o_fish_salt,
                R.string.menu_double_filet_o_fish_price,
                true,
                false
        ));

        Button buttonMenuDoubleMcRoyal = findViewById(R.id.buttonMenuDoubleMcRoyal);
        buttonMenuDoubleMcRoyal.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_double_mcroyal,
                R.mipmap.ic_menu_double_mcroyal_foreground,
                R.string.menu_double_mcroyal_description,
                R.string.menu_double_mcroyal_serving,
                R.string.menu_double_mcroyal_energy,
                R.string.menu_double_mcroyal_fat,
                R.string.menu_double_mcroyal_saturated_fat,
                R.string.menu_double_mcroyal_carbohidrates,
                R.string.menu_double_mcroyal_sugar,
                R.string.menu_double_mcroyal_fibre,
                R.string.menu_double_mcroyal_proteins,
                R.string.menu_double_mcroyal_salt,
                R.string.menu_double_mcroyal_price,
                true,
                false
        ));

        Button buttonMenuFiletOFish = findViewById(R.id.buttonMenuFiletOFish);
        buttonMenuFiletOFish.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_filet_o_fish,
                R.mipmap.ic_menu_filet_o_fish_foreground,
                R.string.menu_filet_o_fish_description,
                R.string.menu_filet_o_fish_serving,
                R.string.menu_filet_o_fish_energy,
                R.string.menu_filet_o_fish_fat,
                R.string.menu_filet_o_fish_saturated_fat,
                R.string.menu_filet_o_fish_carbohidrates,
                R.string.menu_filet_o_fish_sugar,
                R.string.menu_filet_o_fish_fibre,
                R.string.menu_filet_o_fish_proteins,
                R.string.menu_filet_o_fish_salt,
                R.string.menu_filet_o_fish_price,
                true,
                false
        ));

        Button buttonMenuFishMcWrap = findViewById(R.id.buttonMenuFishMcWrap);
        buttonMenuFishMcWrap.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_fish_mcwrap,
                R.mipmap.ic_menu_fish_mcwrap_foreground,
                R.string.menu_fish_mcwrap_description,
                R.string.menu_fish_mcwrap_serving,
                R.string.menu_fish_mcwrap_energy,
                R.string.menu_fish_mcwrap_fat,
                R.string.menu_fish_mcwrap_saturated_fat,
                R.string.menu_fish_mcwrap_carbohidrates,
                R.string.menu_fish_mcwrap_sugar,
                R.string.menu_fish_mcwrap_fibre,
                R.string.menu_fish_mcwrap_proteins,
                R.string.menu_fish_mcwrap_salt,
                R.string.menu_fish_mcwrap_price,
                true,
                false
        ));

        Button buttonMenuJollyCheese = findViewById(R.id.buttonMenuJollyCheese);
        buttonMenuJollyCheese.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
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

        Button buttonMenuMcChicken = findViewById(R.id.buttonMenuMcChicken);
        buttonMenuMcChicken.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_mcchicken,
                R.mipmap.ic_menu_mcchicken_foreground,
                R.string.menu_mcchicken_description,
                R.string.menu_mcchicken_serving,
                R.string.menu_mcchicken_energy,
                R.string.menu_mcchicken_fat,
                R.string.menu_mcchicken_saturated_fat,
                R.string.menu_mcchicken_carbohidrates,
                R.string.menu_mcchicken_sugar,
                R.string.menu_mcchicken_fibre,
                R.string.menu_mcchicken_proteins,
                R.string.menu_mcchicken_salt,
                R.string.menu_mcchicken_price,
                true,
                false
        ));

        Button buttonMenuMcRoyal = findViewById(R.id.buttonMenuMcRoyal);
        buttonMenuMcRoyal.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_mcroyal,
                R.mipmap.ic_menu_mcroyal_foreground,
                R.string.menu_mcroyal_description,
                R.string.menu_mcroyal_serving,
                R.string.menu_mcroyal_energy,
                R.string.menu_mcroyal_fat,
                R.string.menu_mcroyal_saturated_fat,
                R.string.menu_mcroyal_carbohidrates,
                R.string.menu_mcroyal_sugar,
                R.string.menu_mcroyal_fibre,
                R.string.menu_mcroyal_proteins,
                R.string.menu_mcroyal_salt,
                R.string.menu_mcroyal_price,
                true,
                false
        ));

        Button buttonMenuMcRoyalBacon = findViewById(R.id.buttonMenuMcRoyalBacon);
        buttonMenuMcRoyalBacon.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_mcroyal_bacon,
                R.mipmap.ic_menu_mcroyal_bacon_foreground,
                R.string.menu_mcroyal_bacon_description,
                R.string.menu_mcroyal_bacon_serving,
                R.string.menu_mcroyal_bacon_energy,
                R.string.menu_mcroyal_bacon_fat,
                R.string.menu_mcroyal_bacon_saturated_fat,
                R.string.menu_mcroyal_bacon_carbohidrates,
                R.string.menu_mcroyal_bacon_sugar,
                R.string.menu_mcroyal_bacon_fibre,
                R.string.menu_mcroyal_bacon_proteins,
                R.string.menu_mcroyal_bacon_salt,
                R.string.menu_mcroyal_bacon_price,
                true,
                false
        ));

        Button buttonMenuMcRoyalDeluxe = findViewById(R.id.buttonMenuMcRoyalDeluxe);
        buttonMenuMcRoyalDeluxe.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_mcroyal_deluxe,
                R.mipmap.ic_menu_mcroyal_deluxe_foreground,
                R.string.menu_mcroyal_deluxe_description,
                R.string.menu_mcroyal_deluxe_serving,
                R.string.menu_mcroyal_deluxe_energy,
                R.string.menu_mcroyal_deluxe_fat,
                R.string.menu_mcroyal_deluxe_saturated_fat,
                R.string.menu_mcroyal_deluxe_carbohidrates,
                R.string.menu_mcroyal_deluxe_sugar,
                R.string.menu_mcroyal_deluxe_fibre,
                R.string.menu_mcroyal_deluxe_proteins,
                R.string.menu_mcroyal_deluxe_salt,
                R.string.menu_mcroyal_deluxe_price,
                true,
                false
        ));

        Button buttonMenuSpicyChickenWings5Pcs = findViewById(R.id.buttonMenuSpicyChickenWings5Pcs);
        buttonMenuSpicyChickenWings5Pcs.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_spicy_chicken_wings_5_pcs,
                R.mipmap.ic_menu_spicy_chicken_wings_5_pcs_foreground,
                R.string.menu_spicy_chicken_wings_5_pcs_description,
                R.string.menu_spicy_chicken_wings_5_pcs_serving,
                R.string.menu_spicy_chicken_wings_5_pcs_energy,
                R.string.menu_spicy_chicken_wings_5_pcs_fat,
                R.string.menu_spicy_chicken_wings_5_pcs_saturated_fat,
                R.string.menu_spicy_chicken_wings_5_pcs_carbohidrates,
                R.string.menu_spicy_chicken_wings_5_pcs_sugar,
                R.string.menu_spicy_chicken_wings_5_pcs_fibre,
                R.string.menu_spicy_chicken_wings_5_pcs_proteins,
                R.string.menu_spicy_chicken_wings_5_pcs_salt,
                R.string.menu_spicy_chicken_wings_5_pcs_price,
                true,
                false
        ));

        Button buttonMenuSpicyChickenWings8Pcs = findViewById(R.id.buttonMenuSpicyChickenWings8Pcs);
        buttonMenuSpicyChickenWings8Pcs.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_spicy_chicken_wings_8_pcs,
                R.mipmap.ic_menu_spicy_chicken_wings_8_pcs_foreground,
                R.string.menu_spicy_chicken_wings_8_pcs_description,
                R.string.menu_spicy_chicken_wings_8_pcs_serving,
                R.string.menu_spicy_chicken_wings_8_pcs_energy,
                R.string.menu_spicy_chicken_wings_8_pcs_fat,
                R.string.menu_spicy_chicken_wings_8_pcs_saturated_fat,
                R.string.menu_spicy_chicken_wings_8_pcs_carbohidrates,
                R.string.menu_spicy_chicken_wings_8_pcs_sugar,
                R.string.menu_spicy_chicken_wings_8_pcs_fibre,
                R.string.menu_spicy_chicken_wings_8_pcs_proteins,
                R.string.menu_spicy_chicken_wings_8_pcs_salt,
                R.string.menu_spicy_chicken_wings_8_pcs_price,
                true,
                false
        ));

        Button buttonMenuTripleCheeseburger = findViewById(R.id.buttonMenuTripleCheeseburger);
        buttonMenuTripleCheeseburger.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_triple_cheeseburger,
                R.mipmap.ic_menu_triple_cheeseburger_foreground,
                R.string.menu_triple_cheeseburger_description,
                R.string.menu_triple_cheeseburger_serving,
                R.string.menu_triple_cheeseburger_energy,
                R.string.menu_triple_cheeseburger_fat,
                R.string.menu_triple_cheeseburger_saturated_fat,
                R.string.menu_triple_cheeseburger_carbohidrates,
                R.string.menu_triple_cheeseburger_sugar,
                R.string.menu_triple_cheeseburger_fibre,
                R.string.menu_triple_cheeseburger_proteins,
                R.string.menu_triple_cheeseburger_salt,
                R.string.menu_triple_cheeseburger_price,
                true,
                false
        ));

        Button buttonMenuXmasBeef = findViewById(R.id.buttonMenuXmasBeef);
        buttonMenuXmasBeef.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
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

        Button buttonMenuBeefMcWrap = findViewById(R.id.buttonMenuBeefMcWrap);
        buttonMenuBeefMcWrap.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_meals_and_mcdeals,
                R.string.menu_beef_mcwrap,
                R.mipmap.ic_menu_beef_mcwrap_foreground,
                R.string.menu_beef_mcwrap_description,
                R.string.menu_beef_mcwrap_serving,
                R.string.menu_beef_mcwrap_energy,
                R.string.menu_beef_mcwrap_fat,
                R.string.menu_beef_mcwrap_saturated_fat,
                R.string.menu_beef_mcwrap_carbohidrates,
                R.string.menu_beef_mcwrap_sugar,
                R.string.menu_beef_mcwrap_fibre,
                R.string.menu_beef_mcwrap_proteins,
                R.string.menu_beef_mcwrap_salt,
                R.string.menu_beef_mcwrap_price,
                true,
                false
        ));
    }
}