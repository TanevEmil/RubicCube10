package com.example.rubiccube10.mercedes;

import com.example.rubiccube10.DTO;
import com.example.rubiccube10.PipesPlusColumn;

public class Outside {
    private Face faceTopLeft;
    private Face faceTopRight;
    private Face faceBottom;

    private DTO dtoTopLeft;
    private DTO dtoTopRight;
    private DTO dtoBottom;

    public Outside(DTO dtoTopLeft, DTO dtoTopRight, DTO dtoBottom) {
        this.dtoTopLeft = dtoTopLeft;
        this.dtoTopRight = dtoTopRight;
        this.dtoBottom = dtoBottom;

        this.faceTopLeft = new Face(dtoTopLeft);
        this.faceTopRight = new Face(dtoTopRight);
        this.faceBottom = new Face(dtoBottom);
    }
    public Outside(Circle circle) {
        this.faceTopLeft = circle.getFaceBottomRight();
        this.faceTopRight = circle.getFaceBottomLeft();
        this.faceBottom = circle.getFaceTop();
    }

    public Face getFaceTopLeft() {
        return faceTopLeft;
    }

    public void setFaceTopLeft(Face faceTopLeft) {
        this.faceTopLeft = faceTopLeft;
    }

    public Face getFaceTopRight() {
        return faceTopRight;
    }

    public void setFaceTopRight(Face faceTopRight) {
        this.faceTopRight = faceTopRight;
    }

    public Face getFaceBottom() {
        return faceBottom;
    }

    public void setFaceBottom(Face faceBottom) {
        this.faceBottom = faceBottom;
    }

    public DTO getDtoTopLeft() {
        return dtoTopLeft;
    }

    public void setDtoTopLeft(DTO dtoTopLeft) {
        this.dtoTopLeft = dtoTopLeft;
    }

    public DTO getDtoTopRight() {
        return dtoTopRight;
    }

    public void setDtoTopRight(DTO dtoTopRight) {
        this.dtoTopRight = dtoTopRight;
    }

    public DTO getDtoBottom() {
        return dtoBottom;
    }

    public void setDtoBottom(DTO dtoBottom) {
        this.dtoBottom = dtoBottom;
    }

    public void print() {
        faceTopLeft.print(dtoTopLeft);
        faceTopRight.print(dtoTopRight);
        faceBottom.print(dtoBottom);
    }
//    public Outside(Outside outside, Circle circle, PipesPlusColumn pipesPlusColumn) {
//        circle.bottomRight.changeColumn(pipesPlusColumn, outside.topLeft);
//        circle.bottomLeft.changeColumn(pipesPlusColumn, outside.topRight);
//        circle.top.changeColumn(pipesPlusColumn, outside.bottom);
//        this.topLeft = circle.bottomRight;
//        this.topRight = circle.bottomLeft;
//        this.bottom = circle.top;
//    }
//
//    public Outside(Circle circle) {
//        this.topLeft = circle.bottomRight.clone();
//        this.topRight = circle.bottomLeft.clone();
//        this.bottom = circle.top.clone();

//    }
}
