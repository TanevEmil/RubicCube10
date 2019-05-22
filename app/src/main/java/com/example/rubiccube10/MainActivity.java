package com.example.rubiccube10;

import android.hardware.SensorListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.rubiccube10.cubes.Am;
import com.example.rubiccube10.cubes.Odd;
import com.example.rubiccube10.cubes.Pm;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements SensorListener {
    private Column column;
    private static final int SHAKE_THRESHOLD = 5000;
    private float last_x, last_y, last_z;
    private long lastUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SensorManager sensorMgr = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensorMgr.registerListener(this,
                SensorManager.SENSOR_ACCELEROMETER,
                SensorManager.SENSOR_DELAY_GAME);

        final Paker paker = new Paker(this);

        final Pm pm = new Pm(paker);
        final Odd odd = new Odd(paker);
        final Am am = new Am(paker);
        column = odd.clickFront();

        Toast.makeText(this,
                "Shake hard to shuffle ;-)", Toast.LENGTH_LONG).show();

        final Button button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickTopRight(column);
            }
        });
        final Button button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickBottomRight(column);
            }
        });
        final Button button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickBottom(column);
            }
        });
        final Button button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickBottomLeft(column);
            }
        });
        final Button button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickTopLeft(column);
            }
        });
        final Button button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pm.clickTop(column);
            }
        });

        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickTopRight(column);
            }
        });
        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickBottomRight(column);
            }
        });
        final Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickBottom(column);
            }
        });
        final Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickBottomLeft(column);
            }
        });
        final Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickTopLeft(column);
            }
        });
        final Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                odd.clickTop(column);
            }
        });

        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickTopRight(column);
            }
        });
        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickBottomRight(column);
            }
        });
        final Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickBottom(column);
            }
        });
        final Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickBottomLeft(column);
            }
        });
        final Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickTopLeft(column);
            }
        });
        final Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                am.clickTop(column);
            }
        });

        final Button button_am = findViewById(R.id.button_am);
        button_am.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 column = am.clickFront();
            }
        });
        final Button button_odd = findViewById(R.id.button_odd);
        button_odd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                column = odd.clickFront();
            }
        });
        final Button button_pm = findViewById(R.id.button_pm);
        button_pm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                column = pm.clickFront();
            }
        });
    }

    @Override
    public void onAccuracyChanged(int sensor, int accuracy) {

    }

    public void onSensorChanged(int sensor, float[] values) {
        if (sensor == SensorManager.SENSOR_ACCELEROMETER) {
            long curTime = System.currentTimeMillis();
            // only allow one update every 100ms.
            if ((curTime - lastUpdate) > 100) {
                long diffTime = (curTime - lastUpdate);
                lastUpdate = curTime;

                float x = values[SensorManager.DATA_X];
                float y = values[SensorManager.DATA_Y];
                float z = values[SensorManager.DATA_Z];

                float speed = Math.abs(x+y+z - last_x - last_y - last_z) / diffTime * 10000;

                if (speed > SHAKE_THRESHOLD) {
//                    Log.d("sensor", "shake detected w/ speed: " + speed);
//                    Toast.makeText(this, "shake detected w/ speed: " + speed, Toast.LENGTH_SHORT).show();

                    final Paker paker = new Paker(this);

                    final Pm pm = new Pm(paker);
                    final Odd odd = new Odd(paker);
                    final Am am = new Am(paker);

                    column = odd.clickFront();

                    Random r = new Random();

                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickTopRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickBottomRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickBottom(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickBottomLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickTopLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickTop(column);

                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickTopRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickBottomRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickBottom(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickBottomLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickTopLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickTop(column);

                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickTopRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickBottomRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickBottom(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickBottomLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickTopLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickTop(column);

                    column = am.clickFront();

                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickTopRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickBottomRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickBottom(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickBottomLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickTopLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickTop(column);

                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickTopRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickBottomRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickBottom(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickBottomLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickTopLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickTop(column);

                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickTopRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickBottomRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickBottom(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickBottomLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickTopLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickTop(column);

                    column = pm.clickFront();

                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickTopRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickBottomRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickBottom(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickBottomLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickTopLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        pm.clickTop(column);

                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickTopRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickBottomRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickBottom(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickBottomLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickTopLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        odd.clickTop(column);

                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickTopRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickBottomRight(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickBottom(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickBottomLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickTopLeft(column);
                    for(int i = 0; i < r.nextInt(5); i++)
                        am.clickTop(column);

                    column = odd.clickFront();
                }
                last_x = x;
                last_y = y;
                last_z = z;
            }
        }
    }
}
