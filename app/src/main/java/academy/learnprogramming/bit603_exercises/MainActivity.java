package academy.learnprogramming.bit603_exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button firstButton = findViewById(R.id.buttonFirst);
        final Button secondButton = findViewById(R.id.buttonSecond);
        final Button thirdButton = findViewById(R.id.buttonThird);
        final TextView resultIndicator = findViewById(R.id.resultIndicator);
        final String youWonStartText = "You won ";

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultIndicator.setText(youWonStartText + "Gold!");
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultIndicator.setText(youWonStartText + "Silver!");
            }
        });

        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultIndicator.setText(youWonStartText + "Bronze!");
            }
        });
    }
}