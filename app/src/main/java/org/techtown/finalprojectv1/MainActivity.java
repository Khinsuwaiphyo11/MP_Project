package org.techtown.finalprojectv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPlace, btnCode, btnMore;
    EditText etTypein;
    TextView tvResult;
    ListView lView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign values to each control on the layout
        btnPlace = findViewById(R.id.buttonPlace);
        btnCode = findViewById(R.id.buttonCode);
        btnMore = findViewById(R.id.buttonMore);

        etTypein = findViewById(R.id.editTextTypein);
        tvResult = findViewById(R.id.textViewResult);
        lView = findViewById(R.id.listView);

        //click listener for each button

        btnPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You typed " + etTypein.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });

        btnCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You typed " + etTypein.getText().toString() , Toast.LENGTH_SHORT).show();

            }
        });
        btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You Clicked Get More Info", Toast.LENGTH_SHORT).show();

            }
        });







    }
}