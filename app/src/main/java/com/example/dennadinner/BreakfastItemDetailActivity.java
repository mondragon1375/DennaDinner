package com.example.dennadinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BreakfastItemDetailActivity extends AppCompatActivity {

    public static final String EXTRA_FOOD_ID = "foodchoice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_item_detail);

        Intent intent = getIntent();
        int foodID = intent.getIntExtra(EXTRA_FOOD_ID, 0);

        Food myFood = Food.breakfastfoods[foodID];

        ImageView photo = (ImageView) findViewById(R.id.food_pic);
        TextView name = (TextView) findViewById(R.id.food_name);
        TextView desc = (TextView) findViewById(R.id.food_desc);
        TextView price = (TextView) findViewById(R.id.food_price);

        photo.setImageResource(myFood.getImageResourceID());
        name.setText(myFood.getFoodName());
        desc.setText(myFood.getDescription());
        price.setText("$" + myFood.getPrice());

    }
}
