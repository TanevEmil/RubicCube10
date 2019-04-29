package com.example.rubiccube10.cubes;

import com.example.rubiccube10.DTO;
import com.example.rubiccube10.PipesPlusColumn;
import com.example.rubiccube10.mercedes.Face;
import com.example.rubiccube10.star.Mercedes;
import com.example.rubiccube10.star.Star;
import com.example.rubiccube10.Paker;

public class Odd {
    private OddFront oddFront;
    private Star star;

    private DTO dtoOdd;
    private DTO dto11;
    private DTO dto3;
    private DTO dto7;
    private DTO dto9;
    private DTO dto1;
    private DTO dto5;

    public Odd(Paker paker) {
        oddFront = new OddFront(paker);
        dtoOdd = paker.getDtoOdd();
        dto11 = paker.getDto11();
        dto7 = paker.getDto7();
        dto3 = paker.getDto3();
        dto9 = paker.getDto9();
        dto1 = paker.getDto1();
        dto5 = paker.getDto5();
        star = new Mercedes(dtoOdd, dto11, dto7, dto3, dto9, dto1, dto5);
    }
    public void clickTop(PipesPlusColumn pipesPlusColumn){
        star = star.clickTop(pipesPlusColumn);
    }
    public void clickBottomLeft(PipesPlusColumn pipesPlusColumn){
        star = star.clickBottomLeft(pipesPlusColumn);
    }
    public void clickBottomRight(PipesPlusColumn pipesPlusColumn){
        star = star.clickBottomRight(pipesPlusColumn);
    }
    public void clickTopLeft(PipesPlusColumn pipesPlusColumn){
        star = star.clickTopLeft(pipesPlusColumn);
    }
    public void clickTopRight(PipesPlusColumn pipesPlusColumn){
        star = star.clickTopRight(pipesPlusColumn);
    }
    public void clickBottom(PipesPlusColumn pipesPlusColumn){
        star = star.clickBottom(pipesPlusColumn);
    }
    public PipesPlusColumn clickFront(){
        oddFront.clickFront();
        return PipesPlusColumn.SECOND;
    }
}
