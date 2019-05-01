package com.example.rubiccube10;

import android.widget.ImageView;
import android.widget.TextView;

public class DTO {
    private Pair amRed, oddRed, pmRed;
    private Pair amGreen, oddGreen, pmGreen;
    private Pair amBlue, oddBlue, pmBlue;

//    public DTO(Pair amRed, Pair oddRed, Pair pmRed,
//               Pair amGreen, Pair oddGreen, Pair pmGreen,
//               Pair amBlue, Pair oddBlue, Pair pmBlue) {
//        this.amRed = amRed;
//        this.oddRed = oddRed;
//        this.pmRed = pmRed;
//        this.amGreen = amGreen;
//        this.oddGreen = oddGreen;
//        this.pmGreen = pmGreen;
//        this.amBlue = amBlue;
//        this.oddBlue = oddBlue;
//        this.pmBlue = pmBlue;
//    }
    public DTO(ImageView iAmRed, ImageView iOddRed, ImageView iPmRed,
               ImageView iAmGreen, ImageView iOddGreen, ImageView iPmGreen,
               ImageView iAmBlue, ImageView iOddBlue, ImageView iPmBlue,
               
               TextView tAmRed, TextView tOddRed, TextView tPmRed,
               TextView tAmGreen, TextView tOddGreen, TextView tPmGreen,
               TextView tAmBlue, TextView tOddBlue, TextView tPmBlue) {
        this.amRed = new Pair(iAmRed, tAmRed);
        this.amGreen = new Pair(iAmGreen, tAmGreen);
        this.amBlue = new Pair(iAmBlue, tAmBlue);

        this.oddRed = new Pair(iOddRed, tOddRed);
        this.oddGreen = new Pair(iOddGreen, tOddGreen);
        this.oddBlue = new Pair(iOddBlue, tOddBlue);

        this.pmRed = new Pair(iPmRed, tPmRed);
        this.pmGreen = new Pair(iPmGreen, tPmGreen);
        this.pmBlue = new Pair(iPmBlue, tPmBlue);
    }

    public Pair getAmRed() {
        return amRed;
    }

    public Pair getOddRed() {
        return oddRed;
    }

    public Pair getPmRed() {
        return pmRed;
    }

    public Pair getAmGreen() {
        return amGreen;
    }

    public Pair getOddGreen() {
        return oddGreen;
    }

    public Pair getPmGreen() {
        return pmGreen;
    }

    public Pair getAmBlue() {
        return amBlue;
    }

    public Pair getOddBlue() {
        return oddBlue;
    }

    public Pair getPmBlue() {
        return pmBlue;
    }

}
