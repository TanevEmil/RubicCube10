package com.example.rubiccube10;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import android.widget.TextView;

public class Pair {

    private ImageView iv;
    private TextView tv;

    public Pair(ImageView iv, TextView tv) {
        this.iv = iv;
        this.tv = tv;
    }

    public ImageView getIv() {
        return iv;
    }

    public TextView getTv() {
        return tv;
    }
    public static int antiColor(int color) {
        int result = 0;
        switch (color) {
            case Color.BLACK: result = Color.WHITE; break;
            case Color.WHITE: result = Color.BLACK; break;
            case Color.RED: result = Color.CYAN; break;
            case Color.CYAN: result = Color.RED; break;
            case Color.GREEN: result = Color.MAGENTA; break;
            case Color.MAGENTA: result = Color.GREEN; break;
            case Color.BLUE: result = Color.YELLOW; break;
            case Color.YELLOW: result = Color.BLUE; break;
        }
        return result;
    }
    public int getColor(){
        return ((ColorDrawable) iv.getBackground()).getColor();
    }
    public void setColor(int color) {
        iv.setBackgroundColor(color);
        tv.setTextColor(antiColor(color));
    }
}
