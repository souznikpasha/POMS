package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle; import android.view.LayoutInflater; import android.view.View; import android.view.ViewGroup; import android.widget.Button; import android.widget.EditText; import android.widget.TextView; import android.widget.Toast;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;

import java.text.BreakIterator;

public class twoFragment extends Fragment {

        EditText num1;
    EditText num2;
    Button plus;
    Button min;
    Button multiply;
    Button division;
    TextView out_result;

    String oper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        //setContentView(R.layout.twoFragment);

        // находим элементы
        num1 = (EditText) view.findViewById(R.id.num1);
        num2 = (EditText) view.findViewById(R.id.num2);

        plus = (Button) view.findViewById(R.id.plus);
        min = (Button) view.findViewById(R.id.min);
        multiply = (Button) view.findViewById(R.id.multiply);
        division = (Button) view.findViewById(R.id.division);

        out_result = (TextView) view.findViewById(R.id.out_result);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1 = 0;
                float number2 = 0;
                float result = 0;
                if (TextUtils.isEmpty(num1.getText().toString())
                        || TextUtils.isEmpty(num2.getText().toString()))
                    return;
                number1 = Float.parseFloat(num1.getText().toString());
                number2 = Float.parseFloat(num2.getText().toString());
                oper = "+";
                result = number1 + number2;
                out_result.setText(String.valueOf(result));
                Toast toast1 = Toast.makeText(getActivity(), "Результат " + String.valueOf(result)  , Toast.LENGTH_SHORT);
                toast1.show();

            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1 = 0;
                float number2 = 0;
                float result = 0;
                if (TextUtils.isEmpty(num1.getText().toString())
                        || TextUtils.isEmpty(num2.getText().toString()))
                    return;
                number1 = Float.parseFloat(num1.getText().toString());
                number2 = Float.parseFloat(num2.getText().toString());
                oper = "-";
                result = number1 - number2;
                out_result.setText(String.valueOf(result));
                Toast toast1 = Toast.makeText(getActivity(), "Результат " + String.valueOf(result) , Toast.LENGTH_SHORT);
                toast1.show();

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1 = 0;
                float number2 = 0;
                float result = 0;
                if (TextUtils.isEmpty(num1.getText().toString())
                        || TextUtils.isEmpty(num2.getText().toString()))
                    return;
                number1 = Float.parseFloat(num1.getText().toString());
                number2 = Float.parseFloat(num2.getText().toString());
                oper = "*";
                result = number1 * number2;
                out_result.setText(String.valueOf(result));
                Toast toast1 = Toast.makeText(getActivity(), "Результат " + String.valueOf(result)  , Toast.LENGTH_SHORT);
                toast1.show();

            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1 = 0;
                float number2 = 0;
                float result = 0;
                if (TextUtils.isEmpty(num1.getText().toString())
                        || TextUtils.isEmpty(num2.getText().toString()))
                    return;
                number1 = Float.parseFloat(num1.getText().toString());
                number2 = Float.parseFloat(num2.getText().toString());
                oper = "/";
                result = number1 / number2;
                out_result.setText(String.valueOf(result));
                Toast toast1 = Toast.makeText(getActivity(), "Результат " + String.valueOf(result) , Toast.LENGTH_SHORT);
                toast1.show();

            }
        });

        return view;
    }

    public void calcSum(View view) {
        float number1 = 0;
        float number2 = 0;
        float result = 0;
        //Toast toast1 = Toast.makeText(getActivity(), "Результат " + number1 , Toast.LENGTH_SHORT);
        //toast1.show();
    }

    public void sum()
    {
        float number1 = 0;
        float number2 = 0;
        float result = 0;
        if (TextUtils.isEmpty(num1.getText().toString())
            || TextUtils.isEmpty(num2.getText().toString()))
            return;
        number1 = Float.parseFloat(num1.getText().toString());
        number2 = Float.parseFloat(num2.getText().toString());
        oper = "-";
        result = number1 - number2;
        outresult(result, oper);
    }
    public void min()
    {
        float number1 = 0;
        float number2 = 0;
        float result = 0;
        if (TextUtils.isEmpty(num1.getText().toString())
                || TextUtils.isEmpty(num2.getText().toString()))
            return;
        number1 = Float.parseFloat(num1.getText().toString());
        number2 = Float.parseFloat(num2.getText().toString());
        oper = "-";
        result = number1 - number2;
        outresult(result, oper);
    }
    public void multiply()
    {
        float number1 = 0;
        float number2 = 0;
        float result = 0;
        if (TextUtils.isEmpty(num1.getText().toString())
                || TextUtils.isEmpty(num2.getText().toString()))
            return;
        number1 = Float.parseFloat(num1.getText().toString());
        number2 = Float.parseFloat(num2.getText().toString());
        oper = "-";
        result = number1 - number2;
        outresult(result, oper);
    }
    public void division()
    {
        float number1 = 0;
        float number2 = 0;
        float result = 0;
        if (TextUtils.isEmpty(num1.getText().toString())
                || TextUtils.isEmpty(num2.getText().toString()))
            return;
        number1 = Float.parseFloat(num1.getText().toString());
        number2 = Float.parseFloat(num2.getText().toString());
        oper = "-";
        result = number1 - number2;
        outresult(result, oper);
    }
    public void outresult(float result, String b)
    {
        out_result.setText(String.valueOf(result));
        Toast toast1 = Toast.makeText(getActivity(), "Результат " + String.valueOf(result) , Toast.LENGTH_SHORT);
        toast1.show();
    }
    //кнопки для 3 мат операций
   // @Override
//    public void funk1()
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
////        switch (v.getId())
////        {
////            case R.id.min:
////                oper = "-";
////                result = number1 - number2;
////                break;
////            case R.id.plus:
////                oper = "+";
////                result = number1 + number2;
////                break;
////            case R.id.multiply:
////                oper = "*";
////                result = number1 * number2;
////                break;
////            case R.id.division:
////                oper = "/";
////                result = number1 / number2;
////                break;
////            default:
////                break;
////        }
//        //Toast toast1 = Toast.makeText(this, "Результат " + result , Toast.LENGTH_SHORT);
//       // toast1.show();
//        out_result.setText(number1 + " "+ oper + number2 + " " + "= " + result);
//   }

}