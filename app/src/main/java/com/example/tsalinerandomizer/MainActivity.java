package com.example.tsalinerandomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button mTapHereButton;
    private ImageButton mRightArrow;
    private ImageButton mLeftArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTapHereButton = findViewById(R.id.tap_here_button);
        mRightArrow = findViewById(R.id.right_arrow);
        mLeftArrow = findViewById(R.id.left_arrow);

        mTapHereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showRandomArrow();
            }
        });

        mRightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });

        mLeftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });

    }

    private void showRandomArrow() {

        //Remove Button
        mTapHereButton.setVisibility(View.GONE);

        // Pick a random boolean
        boolean rightArrow = new Random().nextBoolean();

        if (rightArrow) {
            mRightArrow.setVisibility(View.VISIBLE);
        } else {
            mLeftArrow.setVisibility(View.VISIBLE);
        }
    }

    private void reset() {

        //Remove arrows by setting visibility to 'gone'
        mRightArrow.setVisibility(View.GONE);
        mLeftArrow.setVisibility(View.GONE);

        // And show button
        mTapHereButton.setVisibility(View.VISIBLE);
    }
}
