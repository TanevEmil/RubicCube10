package com.example.rubiccube10;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rubiccube10.cubes.Am;
import com.example.rubiccube10.cubes.Odd;
import com.example.rubiccube10.cubes.Pm;

public class MainActivity extends AppCompatActivity {
    private Am am;
    private Odd odd;
    private Pm pm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Paker paker = new Paker(this);
        am = new Am(paker);
        odd = new Odd(paker);
        pm = new Pm(paker);

        final Button button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickTopRight();
            }
        });
        final Button button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickBottomRight();
            }
        });
        final Button button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickBottom();
            }
        });
        final Button button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickBottomLeft();
            }
        });
        final Button button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickTopLeft();
            }
        });
        final Button button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickTop();
            }
        });

        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickTopRight();
            }
        });
        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickBottomRight();
            }
        });
        final Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickBottom();
            }
        });
        final Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickBottomLeft();
            }
        });
        final Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickTopLeft();
            }
        });
        final Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickTop();
            }
        });

        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickTopRight();
            }
        });
        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickBottomRight();
            }
        });
        final Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickBottom();
            }
        });
        final Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickBottomLeft();
            }
        });
        final Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickTopLeft();
            }
        });
        final Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickTop();
            }
        });

        final Button button_am = findViewById(R.id.button_am);
        button_am.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 am.clickFront();
            }
        });
        final Button button_odd = findViewById(R.id.button_odd);
        button_odd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 odd.clickFront();

            }
        });
        final Button button_pm = findViewById(R.id.button_pm);
        button_pm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 pm.clickFront();
            }
        });

    }
}
