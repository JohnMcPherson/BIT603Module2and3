package academy.learnprogramming.bit603_exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button redButton = findViewById(R.id.buttonRed);
        final Button greenButton = findViewById(R.id.buttonGreen);

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redButton.setBackgroundColor(Color.RED);
                greenButton.setBackgroundColor(Color.BLUE);
            }
        });

        greenButton.setOnClickListener(v -> {
            redButton.setBackgroundColor(Color.BLUE);
            greenButton.setBackgroundColor(Color.GREEN);
        });
    }
}