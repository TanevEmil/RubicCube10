package com.example.rubiccube10.cubes;

import com.example.rubiccube10.Column;
import com.example.rubiccube10.Paker;
import com.example.rubiccube10.cubes.am.AmBlue;
import com.example.rubiccube10.cubes.am.AmGreen;
import com.example.rubiccube10.cubes.am.AmRed;
import com.example.rubiccube10.cubes.odd.OddRed;
import com.example.rubiccube10.cubes.pm.PmRed;

public class Am {

    private AmRed amRed;
    private OddRed oddRed;
    private PmRed pmRed;
    
    private AmFront amFront;

    public Am(Paker paker) {
        amRed = new AmRed(paker);
        oddRed = new OddRed(paker);
        pmRed = new PmRed(paker);
        amFront = new AmFront(paker);
    }

    public void clickTop(Column column){
        switch (column) {
            case FIRST: amRed.clickTop(); break;
            case SECOND: oddRed.clickTop(); break;
            case THIRD: pmRed.clickTop(); break;
        }
    }
    public void clickBottomLeft(Column column){
        switch (column) {
            case FIRST: amRed.clickBottomLeft(); break;
            case SECOND: oddRed.clickBottomLeft(); break;
            case THIRD: pmRed.clickBottomLeft(); break;
        }
    }
    public void clickBottomRight(Column column){
        switch (column) {
            case FIRST: amRed.clickBottomRight(); break;
            case SECOND: oddRed.clickBottomRight(); break;
            case THIRD: pmRed.clickBottomRight(); break;
        }
    }
    public void clickTopLeft(Column column){
        switch (column) {
            case FIRST: amRed.clickTopLeft(); break;
            case SECOND: oddRed.clickTopLeft(); break;
            case THIRD: pmRed.clickTopLeft(); break;
        }
    }
    public void clickTopRight(Column column){
        switch (column) {
            case FIRST: amRed.clickTopRight(); break;
            case SECOND: oddRed.clickTopRight(); break;
            case THIRD: pmRed.clickTopRight(); break;
        }
    }
    public void clickBottom(Column column){
        switch (column) {
            case FIRST: amRed.clickBottom(); break;
            case SECOND: oddRed.clickBottom(); break;
            case THIRD: pmRed.clickBottom(); break;
        }
    }
    public Column clickFront(){
        amFront.clickFront();
        return Column.THIRD;
    }
}
