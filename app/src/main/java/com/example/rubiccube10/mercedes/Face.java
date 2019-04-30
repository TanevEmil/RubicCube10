package com.example.rubiccube10.mercedes;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import com.example.rubiccube10.DTO;
import com.example.rubiccube10.PipesPlusColumn;

public class Face {

    private boolean amRed, oddRed, pmRed;
    private boolean amGreen, oddGreen, pmGreen;
    private boolean amBlue, oddBlue, pmBlue;

    public Face(DTO dto) {

        this.amRed = ((ColorDrawable) dto.getIv_1().getBackground()).getColor() == Color.WHITE;
        this.amGreen = ((ColorDrawable) dto.getIv_4().getBackground()).getColor() == Color.WHITE;
        this.amBlue = ((ColorDrawable) dto.getIv_7().getBackground()).getColor() == Color.WHITE;

        this.oddRed = ((ColorDrawable) dto.getIv_2().getBackground()).getColor() == Color.WHITE;
        this.oddGreen = ((ColorDrawable) dto.getIv_5().getBackground()).getColor() == Color.WHITE;
        this.oddBlue = ((ColorDrawable) dto.getIv_8().getBackground()).getColor() == Color.WHITE;

        this.pmRed = ((ColorDrawable) dto.getIv_3().getBackground()).getColor() == Color.WHITE;
        this.pmGreen = ((ColorDrawable) dto.getIv_6().getBackground()).getColor() == Color.WHITE;
        this.pmBlue = ((ColorDrawable) dto.getIv_9().getBackground()).getColor() == Color.WHITE;
    }
    private Face(boolean b1, boolean b2, boolean b3,
                 boolean b4, boolean b5, boolean b6,
                 boolean b7, boolean b8, boolean b9) {
        amRed = b1; oddRed = b2; pmRed = b3;
        amGreen = b4; oddGreen = b5; pmGreen = b6;
        amBlue = b7; oddBlue = b8; pmBlue = b9;
    }
    public Face invert() {
        return new Face(!amRed, !oddRed, !pmRed, !amGreen, !oddGreen, !pmGreen, !amBlue, !oddBlue, !pmBlue);
    }
//    public Face clone() {
//        return new Face(amRed, oddRed, pmRed, amGreen, oddGreen, pmGreen, amBlue, oddBlue, pmBlue);
//    }
    public void print(DTO dto){
        dto.printV_1(amRed);
        dto.printV_4(amGreen);
        dto.printV_7(amBlue);
        dto.printV_2(oddRed);
        dto.printV_5(oddGreen);
        dto.printV_8(oddBlue);
        dto.printV_3(pmRed);
        dto.printV_6(pmGreen);
        dto.printV_9(pmBlue);
    }
    public void setPPC(PipesPlusColumn pipesPlusColumn, boolean[] a) {
        switch (pipesPlusColumn) {
            case FIRST: amRed = a[0]; amGreen = a[1]; amBlue = a[2]; break;
            case SECOND: oddRed = a[0]; oddGreen = a[1]; oddBlue = a[2]; break;
            case THIRD: pmRed = a[0]; pmGreen = a[1]; pmBlue = a[2]; break;
        }
    }
    public boolean[] getPPC(PipesPlusColumn pipesPlusColumn) {
        boolean[] a = {false, false, false};
        switch (pipesPlusColumn) {
            case FIRST: a[0] = amRed; a[1] = amGreen; a[2] = amBlue; break;
            case SECOND: a[0] = oddRed; a[1] = oddGreen; a[2] = oddBlue; break;
            case THIRD: a[0] = pmRed; a[1] = pmGreen; a[2] = pmBlue; break;
        }
        return a;
    }
}
