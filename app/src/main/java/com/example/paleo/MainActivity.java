package com.example.paleo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //create all the buttons within the main activity
    private Button mineralBtn;// button which shows stats for minerals, etc below
    private Button vitaminBtn;
    private Button waterBtn;
    private Button proteinBtn;
    private Button fatBtn;
    private Button carbBtn;
    private Button restartBtn;  // button which recalibrates the daily intake to zero
    private Button addBtn;     // button which adds a meal or snack

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mineralBtn = findViewById(R.id.mineralBtn);
        vitaminBtn = findViewById(R.id.vitaminBtn);
        waterBtn = findViewById(R.id.waterBtn);
        proteinBtn = findViewById(R.id.proteinBtn);
        fatBtn = findViewById(R.id.fatBtn);
        carbBtn = findViewById(R.id.carbBtn);
        restartBtn = findViewById(R.id.restartBtn);
        addBtn = findViewById(R.id.addBtn);

        mineralBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragments(MineralFragment.class);
            }
        });

        vitaminBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragments(VitaminFragment.class);
            }
        });

        waterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragments(WaterFragment.class);
            }
        });

        proteinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragments(ProteinFragment.class);
            }
        });

        fatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragments(FatFragment.class);
            }
        });
        carbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragments(CarbohydrateFragment.class);
            }
        });
        restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FoodActivity.class));
            }
        });
    }

    public void replaceFragments(Class fragmentClass) {
        Fragment fragment = null;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment_container_view, fragment)
                .commit();
    }
}