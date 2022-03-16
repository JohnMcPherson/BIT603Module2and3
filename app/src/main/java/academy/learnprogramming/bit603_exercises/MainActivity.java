package academy.learnprogramming.bit603_exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonBold = findViewById(R.id.buttonBold);
        final Button buttonItalic = findViewById(R.id.buttonItalic);
        final TextView outputText = findViewById(R.id.outputText);

        buttonBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // More work required to keep existing italic setting
                Typeface existingTypeface = outputText.getTypeface();
                outputText.setTypeface(existingTypeface, Typeface.BOLD);
            }
        });

        buttonItalic.setOnClickListener(v -> {
            // More work required to keep existing bold setting
            Typeface existingTypeface = outputText.getTypeface();
            outputText.setTypeface(existingTypeface, Typeface.BOLD_ITALIC);
        });
    }
}