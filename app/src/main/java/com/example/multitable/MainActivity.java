package com.example.multitable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Thanks for using", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int a = Integer.parseInt(s);
                textView.setText(a + " * " + 1 + " = " + (a*1) + "\n" +a + " * " + 2 + " = " + (a*2) + "\n" +a + " * " + 3 + " = " + (a*3) + "\n" +a + " * " + 4 + " = " + (a*4) + "\n" +a + " * " + 5 + " = " + (a*5) + "\n" +a + " * " + 6 + " = " + (a*6) + "\n" +a + " * " + 7 + " = " + (a*7) + "\n" +a + " * " + 8 + " = " + (a*8) + "\n" +a + " * " + 9 + " = " + (a*9) + "\n" +a + " * " + 10 + " = " + (a*10));
            }
        });
    }
}