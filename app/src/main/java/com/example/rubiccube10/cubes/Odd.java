package com.example.rubiccube10.cubes;

import com.example.rubiccube10.Column;
import com.example.rubiccube10.Paker;
import com.example.rubiccube10.cubes.am.AmGreen;
import com.example.rubiccube10.cubes.odd.OddGreen;
import com.example.rubiccube10.cubes.pm.PmGreen;

public class Odd {
    private AmGreen amGreen;
    private OddGreen oddGreen;
    private PmGreen pmBlue;
    private OddFront oddFront;

    public Odd(Paker paker) {
        amGreen = new AmGreen(paker);
        oddGreen = new OddGreen(paker);
        pmBlue = new PmGreen(paker);
        oddFront = new OddFront(paker);
    }

    public void clickTop(Column column){
        switch (column) {
            case FIRST: amGreen.clickTop(); break;
            case SECOND: oddGreen.clickTop(); break;
            case THIRD: pmBlue.clickTop(); break;
        }
    }
    public void clickBottomLeft(Column column){
        switch (column) {
            case FIRST: amGreen.clickBottomLeft(); break;
            case SECOND: oddGreen.clickBottomLeft(); break;
            case THIRD: pmBlue.clickBottomLeft(); break;
        }
    }
    public void clickBottomRight(Column column){
        switch (column) {
            case FIRST: amGreen.clickBottomRight(); break;
            case SECOND: oddGreen.clickBottomRight(); break;
            case THIRD: pmBlue.clickBottomRight(); break;
        }
    }
    public void clickTopLeft(Column column){
        switch (column) {
            case FIRST: amGreen.clickTopLeft(); break;
            case SECOND: oddGreen.clickTopLeft(); break;
            case THIRD: pmBlue.clickTopLeft(); break;
        }
    }
    public void clickTopRight(Column column){
        switch (column) {
            case FIRST: amGreen.clickTopRight(); break;
            case SECOND: oddGreen.clickTopRight(); break;
            case THIRD: pmBlue.clickTopRight(); break;
        }
    }
    public void clickBottom(Column column){
        switch (column) {
            case FIRST: amGreen.clickBottom(); break;
            case SECOND: oddGreen.clickBottom(); break;
            case THIRD: pmBlue.clickBottom(); break;
        }
    }
    public Column clickFront(){
        oddFront.clickFront();
        return Column.SECOND;
    }
}
