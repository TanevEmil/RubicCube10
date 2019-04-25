package com.example.rubiccube10;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    enum Token {AM, ODD, PM}
    Token token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ThreeColumns threeColumns = new ThreeColumns(this);
        token = Token.PM;

        final Button button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });

        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });

        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });
        final Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
            }
        });

        final Button button_am = findViewById(R.id.button_am);
        button_am.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                token = Token.AM;
                threeColumns.clickButtonAm();
            }
        });
        final Button button_odd = findViewById(R.id.button_odd);
        button_odd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                token = Token.ODD;
                threeColumns.clickButtonOdd();

            }
        });
        final Button button_pm = findViewById(R.id.button_pm);
        button_pm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                token = Token.PM;
                threeColumns.clickButtonPm();
            }
        });

    }

}
