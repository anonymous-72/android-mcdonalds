package com.first.mcdonalds;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BurgersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_burgers);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(R.string.burgers);

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> {
            finish();
        });

        Button buttonBigMac = findViewById(R.id.buttonBigMac);
        buttonBigMac.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.big_mac,
                R.mipmap.ic_big_mac_foreground,
                R.string.big_mac_description,
                R.string.big_mac_serving,
                R.string.big_mac_energy,
                R.string.big_mac_fat,
                R.string.big_mac_saturated_fat,
                R.string.big_mac_carbohidrates,
                R.string.big_mac_sugar,
                R.string.big_mac_fibre,
                R.string.big_mac_proteins,
                R.string.big_mac_salt,
                R.string.big_mac_price,
                false,
                false
        ));

        Button buttonBigTastyBacon = findViewById(R.id.buttonBigTastyBacon);
        buttonBigTastyBacon.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.big_tasty_bacon,
                R.mipmap.ic_big_tasty_bacon_foreground,
                R.string.big_tasty_bacon_description,
                R.string.big_tasty_bacon_serving,
                R.string.big_tasty_bacon_energy,
                R.string.big_tasty_bacon_fat,
                R.string.big_tasty_bacon_saturated_fat,
                R.string.big_tasty_bacon_carbohidrates,
                R.string.big_tasty_bacon_sugar,
                R.string.big_tasty_bacon_fibre,
                R.string.big_tasty_bacon_proteins,
                R.string.big_tasty_bacon_salt,
                R.string.big_tasty_bacon_price,
                false,
                false
        ));

        Button buttonCheesyBeef = findViewById(R.id.buttonCheesyBeef);
        buttonCheesyBeef.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
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
                R.string.back_to_burgers,
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

        Button buttonDoubleBigTasty = findViewById(R.id.buttonDoubleBigTasty);
        buttonDoubleBigTasty.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.double_big_tasty,
                R.mipmap.ic_double_big_tasty_foreground,
                R.string.double_big_tasty_description,
                R.string.double_big_tasty_serving,
                R.string.double_big_tasty_energy,
                R.string.double_big_tasty_fat,
                R.string.double_big_tasty_saturated_fat,
                R.string.double_big_tasty_carbohidrates,
                R.string.double_big_tasty_sugar,
                R.string.double_big_tasty_fibre,
                R.string.double_big_tasty_proteins,
                R.string.double_big_tasty_salt,
                R.string.double_big_tasty_price,
                false,
                false
        ));

        Button buttonJollyCheese = findViewById(R.id.buttonJollyCheese);
        buttonJollyCheese.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
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

        Button buttonNoelChicken = findViewById(R.id.buttonNoelChicken);
        buttonNoelChicken.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
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
                R.string.back_to_burgers,
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

        Button buttonBigTasty = findViewById(R.id.buttonBigTasty);
        buttonBigTasty.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.big_tasty,
                R.mipmap.ic_big_tasty_foreground,
                R.string.big_tasty_description,
                R.string.big_tasty_serving,
                R.string.big_tasty_energy,
                R.string.big_tasty_fat,
                R.string.big_tasty_saturated_fat,
                R.string.big_tasty_carbohidrates,
                R.string.big_tasty_sugar,
                R.string.big_tasty_fibre,
                R.string.big_tasty_proteins,
                R.string.big_tasty_salt,
                R.string.big_tasty_price,
                false,
                false
        ));

        Button buttonBigTastyChicken = findViewById(R.id.buttonBigTastyChicken);
        buttonBigTastyChicken.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.big_tasty_chicken,
                R.mipmap.ic_big_tasty_chicken_foreground,
                R.string.big_tasty_chicken_description,
                R.string.big_tasty_chicken_serving,
                R.string.big_tasty_chicken_energy,
                R.string.big_tasty_chicken_fat,
                R.string.big_tasty_chicken_saturated_fat,
                R.string.big_tasty_chicken_carbohidrates,
                R.string.big_tasty_chicken_sugar,
                R.string.big_tasty_chicken_fibre,
                R.string.big_tasty_chicken_proteins,
                R.string.big_tasty_chicken_salt,
                R.string.big_tasty_chicken_price,
                false,
                false
        ));

        Button buttonMcCrispy = findViewById(R.id.buttonMcCrispy);
        buttonMcCrispy.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.mccrispy,
                R.mipmap.ic_mccrispy_foreground,
                R.string.mccrispy_description,
                R.string.mccrispy_serving,
                R.string.mccrispy_energy,
                R.string.mccrispy_fat,
                R.string.mccrispy_saturated_fat,
                R.string.mccrispy_carbohidrates,
                R.string.mccrispy_sugar,
                R.string.mccrispy_fibre,
                R.string.mccrispy_proteins,
                R.string.mccrispy_salt,
                R.string.mccrispy_price,
                false,
                false
        ));

        Button buttonDoubleMcRoyal = findViewById(R.id.buttonDoubleMcRoyal);
        buttonDoubleMcRoyal.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.double_mcroyal,
                R.mipmap.ic_double_mcroyal_foreground,
                R.string.double_mcroyal_description,
                R.string.double_mcroyal_serving,
                R.string.double_mcroyal_energy,
                R.string.double_mcroyal_fat,
                R.string.double_mcroyal_saturated_fat,
                R.string.double_mcroyal_carbohidrates,
                R.string.double_mcroyal_sugar,
                R.string.double_mcroyal_fibre,
                R.string.double_mcroyal_proteins,
                R.string.double_mcroyal_salt,
                R.string.double_mcroyal_price,
                false,
                false
        ));

        Button buttonMcRoyalDeluxe = findViewById(R.id.buttonMcRoyalDeluxe);
        buttonMcRoyalDeluxe.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.mcroyal_deluxe,
                R.mipmap.ic_mcroyal_deluxe_foreground,
                R.string.mcroyal_deluxe_description,
                R.string.mcroyal_deluxe_serving,
                R.string.mcroyal_deluxe_energy,
                R.string.mcroyal_deluxe_fat,
                R.string.mcroyal_deluxe_saturated_fat,
                R.string.mcroyal_deluxe_carbohidrates,
                R.string.mcroyal_deluxe_sugar,
                R.string.mcroyal_deluxe_fibre,
                R.string.mcroyal_deluxe_proteins,
                R.string.mcroyal_deluxe_salt,
                R.string.mcroyal_deluxe_price,
                false,
                false
        ));

        Button buttonMcRoyalBacon = findViewById(R.id.buttonMcRoyalBacon);
        buttonMcRoyalBacon.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.mcroyal_bacon,
                R.mipmap.ic_mcroyal_bacon_foreground,
                R.string.mcroyal_bacon_description,
                R.string.mcroyal_bacon_serving,
                R.string.mcroyal_bacon_energy,
                R.string.mcroyal_bacon_fat,
                R.string.mcroyal_bacon_saturated_fat,
                R.string.mcroyal_bacon_carbohidrates,
                R.string.mcroyal_bacon_sugar,
                R.string.mcroyal_bacon_fibre,
                R.string.mcroyal_bacon_proteins,
                R.string.mcroyal_bacon_salt,
                R.string.mcroyal_bacon_price,
                false,
                false
        ));

        Button buttonMcRoyal = findViewById(R.id.buttonMcRoyal);
        buttonMcRoyal.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.mcroyal,
                R.mipmap.ic_mcroyal_foreground,
                R.string.mcroyal_description,
                R.string.mcroyal_serving,
                R.string.mcroyal_energy,
                R.string.mcroyal_fat,
                R.string.mcroyal_saturated_fat,
                R.string.mcroyal_carbohidrates,
                R.string.mcroyal_sugar,
                R.string.mcroyal_fibre,
                R.string.mcroyal_proteins,
                R.string.mcroyal_salt,
                R.string.mcroyal_price,
                false,
                false
        ));

        Button buttonBigMacBacon = findViewById(R.id.buttonBigMacBacon);
        buttonBigMacBacon.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.big_mac_bacon,
                R.mipmap.ic_big_mac_bacon_foreground,
                R.string.big_mac_bacon_description,
                R.string.big_mac_bacon_serving,
                R.string.big_mac_bacon_energy,
                R.string.big_mac_bacon_fat,
                R.string.big_mac_bacon_saturated_fat,
                R.string.big_mac_bacon_carbohidrates,
                R.string.big_mac_bacon_sugar,
                R.string.big_mac_bacon_fibre,
                R.string.big_mac_bacon_proteins,
                R.string.big_mac_bacon_salt,
                R.string.big_mac_bacon_price,
                false,
                false
        ));

        Button buttonMcChicken = findViewById(R.id.buttonMcChicken);
        buttonMcChicken.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.mcchicken,
                R.mipmap.ic_mcchicken_foreground,
                R.string.mcchicken_description,
                R.string.mcchicken_serving,
                R.string.mcchicken_energy,
                R.string.mcchicken_fat,
                R.string.mcchicken_saturated_fat,
                R.string.mcchicken_carbohidrates,
                R.string.mcchicken_sugar,
                R.string.mcchicken_fibre,
                R.string.mcchicken_proteins,
                R.string.mcchicken_salt,
                R.string.mcchicken_price,
                false,
                false
        ));

        Button buttonDoubleFiletOFish = findViewById(R.id.buttonDoubleFiletOFish);
        buttonDoubleFiletOFish.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.double_filet_o_fish,
                R.mipmap.ic_double_filet_o_fish_foreground,
                R.string.double_filet_o_fish_description,
                R.string.double_filet_o_fish_serving,
                R.string.double_filet_o_fish_energy,
                R.string.double_filet_o_fish_fat,
                R.string.double_filet_o_fish_saturated_fat,
                R.string.double_filet_o_fish_carbohidrates,
                R.string.double_filet_o_fish_sugar,
                R.string.double_filet_o_fish_fibre,
                R.string.double_filet_o_fish_proteins,
                R.string.double_filet_o_fish_salt,
                R.string.double_filet_o_fish_price,
                false,
                false
        ));

        Button buttonFiletOFish = findViewById(R.id.buttonFiletOFish);
        buttonFiletOFish.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.filet_o_fish,
                R.mipmap.ic_filet_o_fish_foreground,
                R.string.filet_o_fish_description,
                R.string.filet_o_fish_serving,
                R.string.filet_o_fish_energy,
                R.string.filet_o_fish_fat,
                R.string.filet_o_fish_saturated_fat,
                R.string.filet_o_fish_carbohidrates,
                R.string.filet_o_fish_sugar,
                R.string.filet_o_fish_fibre,
                R.string.filet_o_fish_proteins,
                R.string.filet_o_fish_salt,
                R.string.filet_o_fish_price,
                false,
                false
        ));

        Button buttonTripleCheeseburger = findViewById(R.id.buttonTripleCheeseburger);
        buttonTripleCheeseburger.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.triple_cheeseburger,
                R.mipmap.ic_triple_cheeseburger_foreground,
                R.string.triple_cheeseburger_description,
                R.string.triple_cheeseburger_serving,
                R.string.triple_cheeseburger_energy,
                R.string.triple_cheeseburger_fat,
                R.string.triple_cheeseburger_saturated_fat,
                R.string.triple_cheeseburger_carbohidrates,
                R.string.triple_cheeseburger_sugar,
                R.string.triple_cheeseburger_fibre,
                R.string.triple_cheeseburger_proteins,
                R.string.triple_cheeseburger_salt,
                R.string.triple_cheeseburger_price,
                false,
                false
        ));

        Button buttonDoubleCheeseburger = findViewById(R.id.buttonDoubleCheeseburger);
        buttonDoubleCheeseburger.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.double_cheeseburger,
                R.mipmap.ic_double_cheeseburger_foreground,
                R.string.double_cheeseburger_description,
                R.string.double_cheeseburger_serving,
                R.string.double_cheeseburger_energy,
                R.string.double_cheeseburger_fat,
                R.string.double_cheeseburger_saturated_fat,
                R.string.double_cheeseburger_carbohidrates,
                R.string.double_cheeseburger_sugar,
                R.string.double_cheeseburger_fibre,
                R.string.double_cheeseburger_proteins,
                R.string.double_cheeseburger_salt,
                R.string.double_cheeseburger_price,
                false,
                false
        ));

        Button buttonDoubleMcPuisor = findViewById(R.id.buttonDoubleMcPuisor);
        buttonDoubleMcPuisor.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.double_mcpuisor,
                R.mipmap.ic_double_mcpuisor_foreground,
                R.string.double_mcpuisor_description,
                R.string.double_mcpuisor_serving,
                R.string.double_mcpuisor_energy,
                R.string.double_mcpuisor_fat,
                R.string.double_mcpuisor_saturated_fat,
                R.string.double_mcpuisor_carbohidrates,
                R.string.double_mcpuisor_sugar,
                R.string.double_mcpuisor_fibre,
                R.string.double_mcpuisor_proteins,
                R.string.double_mcpuisor_salt,
                R.string.double_mcpuisor_price,
                false,
                false
        ));

        Button buttonDoubleCheeseLavash = findViewById(R.id.buttonDoubleCheeseLavash);
        buttonDoubleCheeseLavash.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.double_cheese_lavash,
                R.mipmap.ic_double_cheese_lavash_foreground,
                R.string.double_cheese_lavash_description,
                R.string.double_cheese_lavash_serving,
                R.string.double_cheese_lavash_energy,
                R.string.double_cheese_lavash_fat,
                R.string.double_cheese_lavash_saturated_fat,
                R.string.double_cheese_lavash_carbohidrates,
                R.string.double_cheese_lavash_sugar,
                R.string.double_cheese_lavash_fibre,
                R.string.double_cheese_lavash_proteins,
                R.string.double_cheese_lavash_salt,
                R.string.double_cheese_lavash_price,
                false,
                false
        ));

        Button buttonCheeseLavash = findViewById(R.id.buttonCheeseLavash);
        buttonCheeseLavash.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.cheese_lavash,
                R.mipmap.ic_cheese_lavash_foreground,
                R.string.cheese_lavash_description,
                R.string.cheese_lavash_serving,
                R.string.cheese_lavash_energy,
                R.string.cheese_lavash_fat,
                R.string.cheese_lavash_saturated_fat,
                R.string.cheese_lavash_carbohidrates,
                R.string.cheese_lavash_sugar,
                R.string.cheese_lavash_fibre,
                R.string.cheese_lavash_proteins,
                R.string.cheese_lavash_salt,
                R.string.cheese_lavash_price,
                false,
                false
        ));

        Button buttonCheeseburger = findViewById(R.id.buttonCheeseburger);
        buttonCheeseburger.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.cheeseburger,
                R.mipmap.ic_cheeseburger_foreground,
                R.string.cheeseburger_description,
                R.string.cheeseburger_serving,
                R.string.cheeseburger_energy,
                R.string.cheeseburger_fat,
                R.string.cheeseburger_saturated_fat,
                R.string.cheeseburger_carbohidrates,
                R.string.cheeseburger_sugar,
                R.string.cheeseburger_fibre,
                R.string.cheeseburger_proteins,
                R.string.cheeseburger_salt,
                R.string.cheeseburger_price,
                false,
                false
        ));

        Button buttonHamburger = findViewById(R.id.buttonHamburger);
        buttonHamburger.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.hamburger,
                R.mipmap.ic_hamburger_foreground,
                R.string.hamburger_description,
                R.string.hamburger_serving,
                R.string.hamburger_energy,
                R.string.hamburger_fat,
                R.string.hamburger_saturated_fat,
                R.string.hamburger_carbohidrates,
                R.string.hamburger_sugar,
                R.string.hamburger_fibre,
                R.string.hamburger_proteins,
                R.string.hamburger_salt,
                R.string.hamburger_price,
                false,
                false
        ));

        Button buttonMcPuisor = findViewById(R.id.buttonMcPuisor);
        buttonMcPuisor.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.mcpuisor,
                R.mipmap.ic_mcpuisor_foreground,
                R.string.mcpuisor_description,
                R.string.mcpuisor_serving,
                R.string.mcpuisor_energy,
                R.string.mcpuisor_fat,
                R.string.mcpuisor_saturated_fat,
                R.string.mcpuisor_carbohidrates,
                R.string.mcpuisor_sugar,
                R.string.mcpuisor_fibre,
                R.string.mcpuisor_proteins,
                R.string.mcpuisor_salt,
                R.string.mcpuisor_price,
                false,
                false
        ));

        Button buttonMcToast = findViewById(R.id.buttonMcToast);
        buttonMcToast.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.mctoast,
                R.mipmap.ic_mctoast_foreground,
                R.string.mctoast_description,
                R.string.mctoast_serving,
                R.string.mctoast_energy,
                R.string.mctoast_fat,
                R.string.mctoast_saturated_fat,
                R.string.mctoast_carbohidrates,
                R.string.mctoast_sugar,
                R.string.mctoast_fibre,
                R.string.mctoast_proteins,
                R.string.mctoast_salt,
                R.string.mctoast_price,
                false,
                false
        ));

        Button buttonCroissantWithHam = findViewById(R.id.buttonCroissantWithHam);
        buttonCroissantWithHam.setOnClickListener(v -> DishNavigator.openDishDetail(
                this,
                R.string.back_to_burgers,
                R.string.croissant_with_ham,
                R.mipmap.ic_croissant_with_ham_foreground,
                R.string.croissant_with_ham_description,
                R.string.croissant_with_ham_serving,
                R.string.croissant_with_ham_energy,
                R.string.croissant_with_ham_fat,
                R.string.croissant_with_ham_saturated_fat,
                R.string.croissant_with_ham_carbohidrates,
                R.string.croissant_with_ham_sugar,
                R.string.croissant_with_ham_fibre,
                R.string.croissant_with_ham_proteins,
                R.string.croissant_with_ham_salt,
                R.string.croissant_with_ham_price,
                false,
                false
        ));
    }
}