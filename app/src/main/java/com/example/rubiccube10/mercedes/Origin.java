package com.example.rubiccube10.mercedes;


import com.example.rubiccube10.DTO;

public class Origin {
    private Face faceFront;
    private Face faceBack;
    private DTO dto;
    public Origin(DTO dto) {
        this.dto = dto;
        this.faceFront = new Face(dto);
        this.faceBack = this.faceFront.invert();
    }
    public Origin(Origin origin) {
        this.dto = origin.dto;
        this.faceFront = origin.faceBack.clone();
        this.faceBack = origin.faceFront.clone();
    }

    public Face getFaceFront() {
        return faceFront;
    }

    public void setFaceFront(Face faceFront) {
        this.faceFront = faceFront;
    }

    public Face getFaceBack() {
        return faceBack;
    }

    public void setFaceBack(Face faceBack) {
        this.faceBack = faceBack;
    }

    public DTO getDto() {
        return dto;
    }

    public void setDto(DTO dto) {
        this.dto = dto;
    }

    public void print(){
        faceFront.print(dto);
    }
    //    }
//        this.back = origin.back;
//        this.front = origin.front;
//        origin.back.changeColumn(pipesPlusColumn, antiOorigin.back);
//        origin.front.changeColumn(pipesPlusColumn, antiOorigin.front);
//    public Origin(Origin origin, Origin antiOorigin, PipesPlusColumn pipesPlusColumn) {
}
