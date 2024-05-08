package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    Shape ShapeObj;
    Color ColorObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText shape = findViewById(R.id.shape);
        EditText color = findViewById(R.id.color);
        EditText radius = findViewById(R.id.radius);
        EditText side = findViewById(R.id.side);
        EditText side1 = findViewById(R.id.side1);
        EditText side2 = findViewById(R.id.side2);
        EditText side3 = findViewById(R.id.side3);

        TextView display = findViewById(R.id.display);
        Button submit = findViewById(R.id.submit);
        Button area = findViewById(R.id.area);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shape_name = shape.getText().toString();
                String color_name = color.getText().toString();

                if(shape_name.equals("circle")){
                    ShapeObj = new Circle();
                    ShapeObj.setShape(shape_name);
                    radius.setVisibility(View.VISIBLE);
                    side.setVisibility(View.GONE);
                    side1.setVisibility(View.GONE);
                    side2.setVisibility(View.GONE);
                    side3.setVisibility(View.GONE);
                } else if(shape_name.equals("square")){
                    ShapeObj = new Square();
                    ShapeObj.setShape(shape_name);
                    radius.setVisibility(View.GONE);
                    side.setVisibility(View.VISIBLE);
                    side1.setVisibility(View.GONE);
                    side2.setVisibility(View.GONE);
                    side3.setVisibility(View.GONE);
                } else if(shape_name.equals("triangle")){
                    ShapeObj = new Triangle();
                    ShapeObj.setShape(shape_name);
                    radius.setVisibility(View.GONE);
                    side.setVisibility(View.GONE);
                    side1.setVisibility(View.VISIBLE);
                    side2.setVisibility(View.VISIBLE);
                    side3.setVisibility(View.VISIBLE);
                }

                if(color_name.equals("red")){
                    ColorObj = new Red();
                    ColorObj.setColor(color_name);
                } else if(color_name.equals("green")){
                    ColorObj = new Green();
                    ColorObj.setColor(color_name);
                } else if(color_name.equals("blue")){
                    ColorObj = new Blue();
                    ColorObj.setColor(color_name);
                }
                Toast.makeText(MainActivity.this, ShapeObj.name + " " + ColorObj.name, Toast.LENGTH_SHORT).show();
            }
        });

        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set the text color of the TextView
                if(ShapeObj instanceof Circle){
                    double radiusValue = Double.parseDouble(radius.getText().toString());
                    ((Circle) ShapeObj).setRadius(radiusValue);
                }
                else if(ShapeObj instanceof Square){
                    double sideValue = Double.parseDouble(side.getText().toString());
                    ((Square) ShapeObj).setSquare(sideValue);
                }
                else if(ShapeObj instanceof Triangle){
                    double side_val1 = Double.parseDouble(side1.getText().toString());
                    double side_val2 = Double.parseDouble(side2.getText().toString());
                    double side_val3 = Double.parseDouble(side3.getText().toString());
                    ((Triangle) ShapeObj).setTriangle(side_val1,side_val2,side_val3);
                }

                if (ColorObj instanceof Red) {
                    display.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                } else if (ColorObj instanceof Green) {
                    display.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                } else if (ColorObj instanceof Blue) {
                    display.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.blue));
                }

                display.setText(String.valueOf(ShapeObj.area()));
            }
        });
    }
}