package com.example.rubiccube10;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rubiccube10.cubes.Am;
import com.example.rubiccube10.cubes.Odd;
import com.example.rubiccube10.cubes.Pm;

public class MainActivity extends AppCompatActivity {
    private PipesPlusColumn pipesPlusColumn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pipesPlusColumn = PipesPlusColumn.FIRST;
        final Paker paker = new Paker(this);
        final Am am = new Am(paker);
        final Odd odd = new Odd(paker);
        final Pm pm = new Pm(paker);

        final Button button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickTopRight(pipesPlusColumn);
            }
        });
        final Button button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickBottomRight(pipesPlusColumn);
            }
        });
        final Button button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickBottom(pipesPlusColumn);
            }
        });
        final Button button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickBottomLeft(pipesPlusColumn);
            }
        });
        final Button button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickTopLeft(pipesPlusColumn);
            }
        });
        final Button button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickTop(pipesPlusColumn);
            }
        });

        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickTopRight(pipesPlusColumn);
            }
        });
        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickBottomRight(pipesPlusColumn);
            }
        });
        final Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickBottom(pipesPlusColumn);
            }
        });
        final Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickBottomLeft(pipesPlusColumn);
            }
        });
        final Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickTopLeft(pipesPlusColumn);
            }
        });
        final Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickTop(pipesPlusColumn);
            }
        });

        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickTopRight(pipesPlusColumn);
            }
        });
        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickBottomRight(pipesPlusColumn);
            }
        });
        final Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickBottom(pipesPlusColumn);
            }
        });
        final Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickBottomLeft(pipesPlusColumn);
            }
        });
        final Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickTopLeft(pipesPlusColumn);
            }
        });
        final Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickTop(pipesPlusColumn);
            }
        });

        final Button button_am = findViewById(R.id.button_am);
        button_am.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pipesPlusColumn = am.clickFront();
            }
        });
        final Button button_odd = findViewById(R.id.button_odd);
        button_odd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pipesPlusColumn = odd.clickFront();

            }
        });
        final Button button_pm = findViewById(R.id.button_pm);
        button_pm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pipesPlusColumn = pm.clickFront();
            }
        });

    }

}
