package com.example.rubiccube10.mercedes;


import com.example.rubiccube10.DTO;
import com.example.rubiccube10.PipesPlusColumn;

public class Origin {
    private Face faceFront;
    private Face faceBack;
    private DTO dto;
    public Origin(DTO dto) {
        this.dto = dto;
        this.faceFront = new Face(dto);
        this.faceBack = this.faceFront.invert();
    }

    public Face getFaceFront() {
        return faceFront;
    }

    public void setFaceFront(PipesPlusColumn ppc, boolean[] aFront) {
        this.faceFront.setPPC(ppc, aFront);
    }

    public Face getFaceBack() {
        return faceBack;
    }

    public void setFaceBack(PipesPlusColumn ppc, boolean[] aBack) {
        this.faceBack.setPPC(ppc, aBack);
    }

//    public DTO getDto() {
//        return dto;
//    }
//
//    public void setDto(DTO dto) {
//        this.dto = dto;
//    }

    public void print(){
        faceFront.print(dto);
    }
}
