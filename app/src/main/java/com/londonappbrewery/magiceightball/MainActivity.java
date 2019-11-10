package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = findViewById(R.id.askButton);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.imageView2);

        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
              //* Between the two curly braces { } after onClick(), create a new Random object with: Random randomNumberGenerator = new Random();

                Random rn = new Random();

                //* Use the random object’s nextInt() method to generate a random number and
                // store it in a new variable called number. Recall there are 5 dice images and programmers like to start counting from 0.

                int number = rn.nextInt(5);

                // * Use setImageResource(), the ballArray, and the number to give the ballDisplay a random 8 ball image to display.

                ballDisplay.setImageResource(ballArray[number]);

            }

        });

    }
}


