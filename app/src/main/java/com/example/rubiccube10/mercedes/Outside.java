package com.example.rubiccube10.mercedes;

import com.example.rubiccube10.Pair;
import com.example.rubiccube10.Column;
import com.example.rubiccube10.Row;

public class Outside {
    private Pair pairTopLeft;
    private Pair pairTopRight;
    private Pair pairBottom;

    public Outside(Pair pairTopLeft, Pair pairTopRight, Pair pairBottom) {
        this.pairTopLeft = pairTopLeft;
        this.pairTopRight = pairTopRight;
        this.pairBottom = pairBottom;
    }

    public int getPairTopLeft() {
        return pairTopLeft.getColor();
    }

    public void setPairTopLeft(int color) {
        this.pairTopLeft.setColor(color);
    }

    public int getPairTopRight() {
        return pairTopRight.getColor();
    }

    public void setPairTopRight(int color) {
        this.pairTopRight.setColor(color);
    }

    public int getPairBottom() {
        return pairBottom.getColor();
    }

    public void setPairBottom(int color) {
        this.pairBottom.setColor(color);
    }
}
