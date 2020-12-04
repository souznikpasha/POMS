package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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

public class MainActivity extends AppCompatActivity{
    oneFragment fr1;
    twoFragment fr2;
    Button viewfragment1, viewfragment2;
    boolean flag = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fr1 = new oneFragment();
        fr2 = new twoFragment();
        viewfragment1 = findViewById(R.id.viewfragment1);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.FrameAddit, fr1);
        transaction.commit();

        viewfragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft = fm.beginTransaction();
                if(flag)
                {
                    ft.replace(R.id.FrameAddit, fr2);
                    flag = false;
                }
                else
                {
                    ft.replace(R.id.FrameAddit, fr1);
                    flag = true;
                }
                ft.commit();
            }
        });
        }
    }
//    public void Change (View v)
//    {
//        Fragment Fragment= null;
//
//        switch (v.getId())
//        {
//            case R.id.viewfragment1:
//                Fragment = new oneFragment();
//                break;
//            case R.id.viewfragment2:
//                Fragment = new twoFragment();
//                break;
//        }
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.replace(R.id.fragment_place, Fragment);
//        ft.commit();
//    }


//    EditText num1;
//    EditText num2;
//    Button plus;
//    Button min;
//    Button multiply;
//    Button division;
//    TextView out_result;
//
//    String oper;
//    //@Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // находим элементы
//        num1 = (EditText) findViewById(R.id.num1);
//        num2 = (EditText) findViewById(R.id.num2);
//
//        plus = (Button) findViewById(R.id.plus);
//        min = (Button) findViewById(R.id.min);
//        multiply = (Button) findViewById(R.id.multiply);
//        division = (Button) findViewById(R.id.division);
//
//        out_result = (TextView) findViewById(R.id.out_result);
//
//        plus.setOnClickListener(this);
//        min.setOnClickListener(this);
//        multiply.setOnClickListener(this);
//        division.setOnClickListener(this);
//    }
//    //кнопки для 3 мат операций
//   // @Override
//    public void onClick(View v)
//    {
//        float number1 = 0;
//        float number2 = 0;
//        float result = 0;
//
//        // поля на пустоту
//        if (TextUtils.isEmpty(num1.getText().toString())
//            || TextUtils.isEmpty(num2.getText().toString()))
//            return;
//
//        number1 = Float.parseFloat(num1.getText().toString());
//        number2 = Float.parseFloat(num2.getText().toString());
//        // опр нажатую кнопку
//        switch (v.getId())
//        {
//            case R.id.min:
//                oper = "-";
//                result = number1 - number2;
//                break;
//            case R.id.plus:
//                oper = "+";
//                result = number1 + number2;
//                break;
//            case R.id.multiply:
//                oper = "*";
//                result = number1 * number2;
//                break;
//            case R.id.division:
//                oper = "/";
//                result = number1 / number2;
//                break;
//            default:
//                break;
//        }
//        Toast toast1 = Toast.makeText(this, "Результат " + result , Toast.LENGTH_SHORT);
//        toast1.show();
//        out_result.setText(number1 + " "+ oper + number2 + " " + "= " + result);
//   }
