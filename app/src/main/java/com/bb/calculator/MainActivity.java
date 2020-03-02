package com.bb.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView userInputTextView;

    private double valueA = 0;
    private double valueB = 0;
    private int operator = 0;

    private String stringValue = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInputTextView = findViewById(R.id.user_input_textview);

    }

    public void calcClick(View view){

        //stringValue = userInputTextView.getText().toString().trim();

        switch(view.getId()){

            case R.id.ac_button:
                valueA = 0;
                valueB = 0;
                userInputTextView.setText("0");
                break;
            case R.id.one_button:
                userInputTextView.setText("1");
                break;
            case R.id.two_button:
                userInputTextView.setText("2");
                break;
            case R.id.three_button:
                userInputTextView.setText("3");
                break;
            case R.id.four_button:
                userInputTextView.setText("4");
                break;
            case R.id.five_button:
                userInputTextView.setText("5");
                break;
            case R.id.six_button:
                userInputTextView.setText("6");
                break;
            case R.id.seven_button:
                userInputTextView.setText("7");
                break;
            case R.id.eight_button:
                userInputTextView.setText("8");
                break;
            case R.id.nine_button:
                userInputTextView.setText("9");
                break;
            case R.id.zero_button:
                userInputTextView.setText("0");
                break;
            case R.id.add_button:
                operator = 0;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.subtract_button:
                operator = 1;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.multiply_button:
                operator = 2;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.division_button:
                operator = 3;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.modulus_button:
                operator = 4;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.decimal_button:
                break;
            case R.id.neg_pos_button:
                break;
            case R.id.equal_button:
                valueB = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.Pi:
            userInputTextView.setText(Math.PI + "");
                break;
            case R.id.left_par:
                userInputTextView.setText("(");
                break;
            case R.id.right_par:
                userInputTextView.setText(")");
                break;
            case R.id.pow:
                operator = 5;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.cubrt:
                operator = 6;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.squrt:
                operator = 7;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.E:
                operator = 8;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.log10:
                operator = 9;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.log:
                operator = 10;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.sin:
                operator = 11;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.cos:
                operator = 12;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.tan:
                operator = 13;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.asin:
                operator = 14;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.acos:
                operator = 15;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.atan:
                operator = 16;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
        }
    }

    public void operation(){
        double answer = 0;
        switch(operator){
            case 0://addition
                answer = (valueA + valueB);
                break;
            case 1://subtraction
                answer = (valueA - valueB);
                break;
            case 2://multiplication
                answer = (valueA * valueB);
                break;
            case 3://division
                answer = (valueA / valueB);
                break;
            case 4://modulus
                answer = (valueA % valueB);
                break;
            case 5://pow
                answer = Math.pow(valueA, valueB);
                break;
            case 6://cubrt
                answer = Math.cbrt(valueA);
                break;
            case 7://squrt
                answer = Math.sqrt(valueA);
                break;
            case 8://E
                answer = Math.exp(valueA);
                break;
            case 9://log10
                answer = Math.log10(valueA);
                break;
            case 10://log
                answer = Math.log(valueA);
                break;
            case 11://sin
                answer = Math.sin(valueA);
                break;
            case 12://cos
                answer = Math.cos(valueA);
                break;
            case 13://tan
                answer = Math.tan(valueA);
                break;
            case 14://asin
                answer = Math.asin(valueA);
                break;
            case 15://acos
                answer = Math.acos(valueA);
                break;
            case 16://atan
                answer = Math.atan(valueA);
                break;
        }
        userInputTextView.setText("" + answer);
    }

}
