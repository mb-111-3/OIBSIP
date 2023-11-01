package com.example.unit_converter_application;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements MainActivity1 {

    private Spinner inputEditText;
    private Spinner fromUnitSpinner;
    private Spinner toUnitSpinner;
    private Spinner convertButton;
    private Spinner resultTextView;
    private long contentView;


    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText = findViewById(R.id.inputEditText);
        fromUnitSpinner = findViewById(R.id.fromUnitSpinner);
        toUnitSpinner = findViewById(R.id.toUnitSpinner);
        convertButton = findViewById(R.id.convertButton);
        resultTextView = findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertUnits();
            }
        });
    }

    private Spinner findViewById(int inputEditText) {
        return null;
    }

    private void convertUnits() {
        // Get the input value
        double inputValue;
        inputValue = Double.parseDouble(String.valueOf(inputEditText.getTextDirection()));

        // Get the selected units
        String fromUnit = fromUnitSpinner.getSelectedItem().toString();
        String toUnit = toUnitSpinner.getSelectedItem().toString();

        // Perform the conversion
        double result = performConversion(inputValue, fromUnit, toUnit);

        // Display the result
        resultTextView.setTextDirection(Integer.parseInt(String.valueOf(result)));
    }

    private double performConversion(double value, String fromUnit, String toUnit) {
        // Perform the conversion logic here
        // Return the converted value
        return value;
    }

    public void setContentView(int contentView) {
        this.contentView = contentView;
    }
}
