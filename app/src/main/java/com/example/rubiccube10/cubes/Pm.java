package com.example.rubiccube10.cubes;

import com.example.rubiccube10.DTO;
import com.example.rubiccube10.PipesPlusColumn;
import com.example.rubiccube10.star.Mercedes;
import com.example.rubiccube10.Paker;
import com.example.rubiccube10.mercedes.Face;
import com.example.rubiccube10.star.Star;

public class Pm {
    private PmFront pmFront;
    private Star star;

    private DTO dtoPm;
    private DTO dto24;
    private DTO dto16;
    private DTO dto20;
    private DTO dto22;
    private DTO dto14;
    private DTO dto18;

    public Pm(Paker paker) {
        pmFront = new PmFront(paker);
        dtoPm = paker.getDtoPm();
        dto24 = paker.getDto24();
        dto20 = paker.getDto20();
        dto16 = paker.getDto16();
        dto22 = paker.getDto22();
        dto14 = paker.getDto14();
        dto18 = paker.getDto18();
        star = new Mercedes(dtoPm, dto24, dto20, dto16, dto22, dto14, dto18);
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
        pmFront.clickFront();
        return PipesPlusColumn.THIRD;
    }
}
