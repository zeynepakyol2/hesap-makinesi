package com.example.hm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button_c,button_open,button_close,button_div;
    Button button_seven,button_eight,button_nine,button_multi;
    Button button_four,button_five,button_six,button_minus;
    Button button_one,button_two,button_three,button_plus;
    Button button_ac,button_zero,button_dot,button_equal;

    TextView result,solution;
    boolean plus,minus,div,multi;

    float valuOne,valuTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.result);
        solution=findViewById(R.id.solution);
        button_c=findViewById(R.id.button_c);
        button_open=findViewById(R.id.button_open);
        button_close=findViewById(R.id.button_close);
        button_div=findViewById(R.id.button_div);
        button_seven=findViewById(R.id.button_seven);
        button_eight=findViewById(R.id.button_eight);
        button_nine=findViewById(R.id.button_nine);
        button_multi=findViewById(R.id.button_multi);
        button_four=findViewById(R.id.button_four);
        button_five=findViewById(R.id.button_five);
        button_six=findViewById(R.id.button_six);
        button_minus=findViewById(R.id.button_minus);
        button_one=findViewById(R.id.button_one);
        button_two=findViewById(R.id.button_two);
        button_three=findViewById(R.id.button_three);
        button_plus=findViewById(R.id.button_plus);
        button_ac=findViewById(R.id.button_ac);
        button_zero=findViewById(R.id.button_zero);
        button_dot=findViewById(R.id.button_dot);
        button_equal=findViewById(R.id.button_equal);

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
                solution.setText(result.getText());
            }
        });
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
                solution.setText(result.getText());
            }
        });
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
                solution.setText(result.getText());
            }
        });
        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
                solution.setText(result.getText());
            }
        });
        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
                solution.setText(result.getText());
            }
        });
        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
                solution.setText(result.getText());
            }
        });
        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
                solution.setText(result.getText());
            }
        });
        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
                solution.setText(result.getText());
            }
        });
        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
                solution.setText(result.getText());
            }
        });
        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
                solution.setText(result.getText());
            }
        });
        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
                solution.setText(result.getText());
            }
        });
        button_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"(");
                solution.setText(result.getText());
            }
        });
        button_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+")");
                solution.setText(result.getText());
            }
        });

        button_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");

            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null){
                    result.setText("");
                }
                else {
                    valuOne=Float.parseFloat(result.getText()+"");
                    plus=true;
                    result.setText(null);
                }
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuOne=Float.parseFloat(result.getText()+"");
                minus=true;
                result.setText(null);
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuOne=Float.parseFloat(result.getText()+"");
                div=true;
                result.setText(null);
            }
        });
        button_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuOne=Float.parseFloat(result.getText()+"");
                multi=true;
                result.setText(null);
            }
        });
        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuTwo=Float.parseFloat(result.getText()+"");
                if (plus==true){
                    result.setText(valuOne+valuTwo+"");
                    solution.setText(valuOne+"+"+valuTwo);
                    plus=false;
                }
                if (minus==true){
                    result.setText(valuOne-valuTwo+"");
                    solution.setText(valuOne+"-"+valuTwo);
                    minus=false;
                }
                if (div==true){
                    result.setText(valuOne/valuTwo+"");
                    solution.setText(valuOne+"/"+valuTwo);
                    div=false;
                }
                if (multi==true){
                    result.setText(valuOne*valuTwo+"");
                    solution.setText(valuOne+"*"+valuTwo);
                    multi=false;
                }
            }
        });
    }
}