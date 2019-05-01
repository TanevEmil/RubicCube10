package com.example.rubiccube10.mercedes;


import com.example.rubiccube10.Pair;
import com.example.rubiccube10.Column;
import com.example.rubiccube10.Row;

public class Origin {
    private Pair faceFront;
    public Origin(Pair pair) {
        this.faceFront = pair;
    }

    public int getPairFront() {
        return faceFront.getColor();
    }

    public void setPairFront(int color) {
        this.faceFront.setColor(color);
    }

    public int getPairBack() {
        return Pair.antiColor(faceFront.getColor());
    }

//    public void setPairBack(int color) {
//        this.faceFront.setColor(color);
//    }
}
