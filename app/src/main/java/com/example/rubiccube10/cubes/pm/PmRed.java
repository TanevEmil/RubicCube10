package com.example.rubiccube10.cubes.pm;

import com.example.rubiccube10.DTO;
import com.example.rubiccube10.cubes.OddFront;
import com.example.rubiccube10.cubes.AmFront;
import com.example.rubiccube10.cubes.PmFront;
import com.example.rubiccube10.star.Mercedes;
import com.example.rubiccube10.star.Star;
import com.example.rubiccube10.Paker;

public class PmRed {
    private Star redStar;
    private Star greenStar;
    private Star blueStar;

    private AmFront amFront;
    private OddFront oddFront;
    private PmFront pmFront;

    private DTO dtoAm;
    private DTO dto12;
    private DTO dto4;
    private DTO dto8;
    private DTO dto10;
    private DTO dto2;
    private DTO dto6;

    private DTO dtoOdd;
    private DTO dto11;
    private DTO dto3;
    private DTO dto7;
    private DTO dto9;
    private DTO dto1;
    private DTO dto5;

    private DTO dtoPm;
    private DTO dto24;
    private DTO dto16;
    private DTO dto20;
    private DTO dto22;
    private DTO dto14;
    private DTO dto18;

    public PmRed(Paker paker) {
        pmFront = new PmFront(paker);
        dtoPm = paker.getDtoPm();
        dto24 = paker.getDto24();
        dto20 = paker.getDto20();
        dto16 = paker.getDto16();
        dto22 = paker.getDto22();
        dto14 = paker.getDto14();
        dto18 = paker.getDto18();
        blueStar = new Mercedes(dtoPm.getPmRed(), dto24.getPmRed(), dto20.getPmRed(),
                dto16.getPmRed(), dto22.getPmRed(), dto14.getPmRed(), dto18.getPmRed());

        oddFront = new OddFront(paker);
        dtoOdd = paker.getDtoOdd();
        dto11 = paker.getDto11();
        dto7 = paker.getDto7();
        dto3 = paker.getDto3();
        dto9 = paker.getDto9();
        dto1 = paker.getDto1();
        dto5 = paker.getDto5();
        greenStar = new Mercedes(dtoOdd.getPmRed(), dto11.getPmRed(), dto7.getPmRed(),
                dto3.getPmRed(), dto9.getPmRed(), dto1.getPmRed(), dto5.getPmRed());

        amFront = new AmFront(paker);
        dtoAm = paker.getDtoAm();
        dto12 = paker.getDto12();
        dto8 = paker.getDto8();
        dto4 = paker.getDto4();
        dto10 = paker.getDto10();
        dto2 = paker.getDto2();
        dto6 = paker.getDto6();
        redStar = new Mercedes(dtoAm.getPmRed(), dto12.getPmRed(), dto8.getPmRed(),
                dto4.getPmRed(), dto10.getPmRed(), dto2.getPmRed(), dto6.getPmRed());
    }
    public void clickTop(){
        redStar = redStar.clickTop();
        greenStar = greenStar.clickTop();
        blueStar = blueStar.clickTop();
    }
    public void clickBottomLeft(){
        redStar = redStar.clickBottomLeft();
        greenStar = greenStar.clickBottomLeft();
        blueStar = blueStar.clickBottomLeft();
    }
    public void clickBottomRight(){
        redStar = redStar.clickBottomRight();
        greenStar = greenStar.clickBottomRight();
        blueStar = blueStar.clickBottomRight();
    }
    public void clickTopLeft(){
        redStar = redStar.clickTopLeft();
        greenStar = greenStar.clickTopLeft();
        blueStar = blueStar.clickTopLeft();
    }
    public void clickTopRight(){
        redStar = redStar.clickTopRight();
        greenStar = greenStar.clickTopRight();
        blueStar = blueStar.clickTopRight();
    }
    public void clickBottom(){
        redStar = redStar.clickBottom();
        greenStar = greenStar.clickBottom();
        blueStar = blueStar.clickBottom();
    }
    public void clickFront(){
        pmFront.clickFront();
    }
}
