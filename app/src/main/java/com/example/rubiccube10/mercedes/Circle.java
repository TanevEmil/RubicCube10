package com.example.rubiccube10.mercedes;

import com.example.rubiccube10.Pair;
import com.example.rubiccube10.Column;
import com.example.rubiccube10.Row;

public class Circle {
    private Pair pairTop;
    private Pair pairBottomLeft;
    private Pair pairBottomRight;

    public Circle(Pair pairTop, Pair pairBottomLeft, Pair pairBottomRight) {
        this.pairTop = pairTop;
        this.pairBottomLeft = pairBottomLeft;
        this.pairBottomRight = pairBottomRight;
    }

    public int getPairTop() {
        return pairTop.getColor();
    }

    public void setPairTop(int color) {
        this.pairTop.setColor(color);
    }

    public int getPairBottomLeft() {
        return pairBottomLeft.getColor();
    }

    public void setPairBottomLeft(int color) {
        this.pairBottomLeft.setColor(color);
    }

    public int getPairBottomRight() {
        return pairBottomRight.getColor();
    }

    public void setPairBottomRight(int color) {
        this.pairBottomRight.setColor(color);
    }
}
