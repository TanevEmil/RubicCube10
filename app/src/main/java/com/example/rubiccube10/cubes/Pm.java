package com.example.rubiccube10.cubes;

import com.example.rubiccube10.Column;
import com.example.rubiccube10.Paker;
import com.example.rubiccube10.cubes.am.AmBlue;
import com.example.rubiccube10.cubes.odd.OddBlue;
import com.example.rubiccube10.cubes.pm.PmBlue;

public class Pm {
    private AmBlue amBlue;
    private OddBlue oddBlue;
    private PmBlue pmBlue;
    private PmFront pmFront;

    public Pm(Paker paker) {
        amBlue = new AmBlue(paker);
        oddBlue = new OddBlue(paker);
        pmBlue = new PmBlue(paker);
        pmFront = new PmFront(paker);
    }

    public void clickTop(Column column){
        switch (column) {
            case FIRST: amBlue.clickTop(); break;
            case SECOND: oddBlue.clickTop(); break;
            case THIRD: pmBlue.clickTop(); break;
        }
    }
    public void clickBottomLeft(Column column){
        switch (column) {
            case FIRST: amBlue.clickBottomLeft(); break;
            case SECOND: oddBlue.clickBottomLeft(); break;
            case THIRD: pmBlue.clickBottomLeft(); break;
        }
    }
    public void clickBottomRight(Column column){
        switch (column) {
            case FIRST: amBlue.clickBottomRight(); break;
            case SECOND: oddBlue.clickBottomRight(); break;
            case THIRD: pmBlue.clickBottomRight(); break;
        }
    }
    public void clickTopLeft(Column column){
        switch (column) {
            case FIRST: amBlue.clickTopLeft(); break;
            case SECOND: oddBlue.clickTopLeft(); break;
            case THIRD: pmBlue.clickTopLeft(); break;
        }
    }
    public void clickTopRight(Column column){
        switch (column) {
            case FIRST: amBlue.clickTopRight(); break;
            case SECOND: oddBlue.clickTopRight(); break;
            case THIRD: pmBlue.clickTopRight(); break;
        }
    }
    public void clickBottom(Column column){
        switch (column) {
            case FIRST: amBlue.clickBottom(); break;
            case SECOND: oddBlue.clickBottom(); break;
            case THIRD: pmBlue.clickBottom(); break;
        }
    }
    public Column clickFront(){
        pmFront.clickFront();
        return Column.FIRST;
    }
}
