package com.example.rubiccube10.cubes;

import com.example.rubiccube10.DTO;
import com.example.rubiccube10.PipesPlusColumn;
import com.example.rubiccube10.star.Mercedes;
import com.example.rubiccube10.star.Star;
import com.example.rubiccube10.Paker;

public class Am {
    private AmFront amFront;
    private Star star;

    private DTO dtoAm;
    private DTO dto12;
    private DTO dto4;
    private DTO dto8;
    private DTO dto10;
    private DTO dto2;
    private DTO dto6;

    public Am(Paker paker) {
        amFront = new AmFront(paker);
        dtoAm = paker.getDtoAm();
        dto12 = paker.getDto12();
        dto8 = paker.getDto8();
        dto4 = paker.getDto4();
        dto10 = paker.getDto10();
        dto2 = paker.getDto2();
        dto6 = paker.getDto6();
        star = new Mercedes(dtoAm, dto12, dto8, dto4, dto10, dto2, dto6);
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
        amFront.clickFront();
        return PipesPlusColumn.THIRD;
    }
}
