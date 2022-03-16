package academy.learnprogramming.bit603_exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView inputNumber1 = findViewById(R.id.inputNumber1);
        final TextView inputNumber2 = findViewById(R.id.inputNumber2);
        final Button button = findViewById(R.id.buttonAdd);
        final TextView textViewOutput = findViewById(R.id.textViewOutput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1Value = Float.valueOf(inputNumber1.getText().toString());
                float number2Value = Float.valueOf(inputNumber2.getText().toString());
                float sum = number1Value + number2Value;

                textViewOutput.setText(String.valueOf(sum));
            }
        });
    }
}