package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //final int MENU_RESET_ID = 1;
    //final int MENU_QUIT_ID = 2;

    EditText num1;
    EditText num2;
    Button plus;
    Button min;
    Button multiply;
    Button division;
    TextView out_result;

    String oper;
    //@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // находим элементы
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        plus = (Button) findViewById(R.id.plus);
        min = (Button) findViewById(R.id.min);
        multiply = (Button) findViewById(R.id.multiply);
        division = (Button) findViewById(R.id.division);

        out_result = (TextView) findViewById(R.id.out_result);

        plus.setOnClickListener(this);
        min.setOnClickListener(this);
        multiply.setOnClickListener(this);
        division.setOnClickListener(this);
    }
    //кнопки для 3 мат операций
   // @Override
    public void onClick(View v)
    {
        float number1 = 0;
        float number2 = 0;
        float result = 0;

        // поля на пустоту
        if (TextUtils.isEmpty(num1.getText().toString())
            || TextUtils.isEmpty(num2.getText().toString()))
            return;

        number1 = Float.parseFloat(num1.getText().toString());
        number2 = Float.parseFloat(num2.getText().toString());
        // опр нажатую кнопку
        switch (v.getId())
        {
            case R.id.min:
                oper = "-";
                result = number1 - number2;
                break;
            case R.id.plus:
                oper = "+";
                result = number1 + number2;
                break;
            case R.id.multiply:
                oper = "*";
                result = number1 * number2;
                break;
            case R.id.division:
                oper = "/";
                result = number1 / number2;
                break;
            default:
                break;
        }
        Toast toast1 = Toast.makeText(this, "Результат " + result , Toast.LENGTH_SHORT);
        toast1.show();
        out_result.setText(number1 + " "+ oper + number2 + " " + "= " + result);
//        private String getScreenOrientation(){
//        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
//            return "Портретная ориентация";
//        else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
//            return "Альбомная ориентация";
//        else
//            return "";
//    }

//    }
    }
}
