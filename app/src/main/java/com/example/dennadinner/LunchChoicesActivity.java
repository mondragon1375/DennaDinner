package com.example.dennadinner;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LunchChoicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_choices);

        ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Food.lunchfoods);
        ListView listFoods = (ListView) findViewById(R.id.list_lunchChoices);
        listFoods.setAdapter(listAdapter);

        // Create a listener to listen for when a Food item is clicked on
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listFoods, View itemView, int position, long id) {

                        // Pass a Food name the user clicks on to the LunchChoicesActivity
                        Intent intent = new Intent(LunchChoicesActivity.this, LunchItemDetailActivity.class);
                        intent.putExtra(LunchItemDetailActivity.EXTRA_FOOD_ID, (int) id );
                        startActivity(intent);

                    }
                };
        // Assign the listener to the list view
        listFoods.setOnItemClickListener(itemClickListener);
    }

}
