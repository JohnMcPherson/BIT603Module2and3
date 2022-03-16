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

        final TextView textViewPersonName = findViewById(R.id.personName);
        final Button button = findViewById(R.id.buttonHello);
        final TextView textViewOutput = findViewById(R.id.textViewOutput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewOutput.setText("Hi, " + textViewPersonName.getText() + "!");
            }
        });
    }
}