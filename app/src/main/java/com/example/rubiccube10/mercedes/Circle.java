package com.example.rubiccube10.mercedes;

import com.example.rubiccube10.DTO;
import com.example.rubiccube10.PipesPlusColumn;

public class Circle {
    private Face faceTop;
    private Face faceBottomLeft;
    private Face faceBottomRight;

    private DTO dtoTop;
    private DTO dtoBottomLeft;
    private DTO dtoBottomRight;

    public Circle(DTO dtoTop, DTO dtoBottomLeft, DTO dtoBottomRight) {
        this.dtoTop = dtoTop;
        this.dtoBottomLeft = dtoBottomLeft;
        this.dtoBottomRight = dtoBottomRight;

        this.faceTop = new Face(dtoTop);
        this.faceBottomLeft = new Face(dtoBottomLeft);
        this.faceBottomRight = new Face(dtoBottomRight);
    }

    public Circle(Outside outside){
        this.faceTop = outside.getFaceBottom();
        this.faceBottomLeft = outside.getFaceTopRight();
        this.faceBottomRight = outside.getFaceTopLeft();
    }

    public Face getFaceTop() {
        return faceTop;
    }

    public void setFaceTop(Face faceTop) {
        this.faceTop = faceTop;
    }

    public Face getFaceBottomLeft() {
        return faceBottomLeft;
    }

    public void setFaceBottomLeft(Face faceBottomLeft) {
        this.faceBottomLeft = faceBottomLeft;
    }

    public Face getFaceBottomRight() {
        return faceBottomRight;
    }

    public void setFaceBottomRight(Face faceBottomRight) {
        this.faceBottomRight = faceBottomRight;
    }

    public DTO getDtoTop() {
        return dtoTop;
    }

    public void setDtoTop(DTO dtoTop) {
        this.dtoTop = dtoTop;
    }

    public DTO getDtoBottomLeft() {
        return dtoBottomLeft;
    }

    public void setDtoBottomLeft(DTO dtoBottomLeft) {
        this.dtoBottomLeft = dtoBottomLeft;
    }

    public DTO getDtoBottomRight() {
        return dtoBottomRight;
    }

    public void setDtoBottomRight(DTO dtoBottomRight) {
        this.dtoBottomRight = dtoBottomRight;
    }

    public void print() {
        faceTop.print(dtoTop);
        faceBottomLeft.print(dtoBottomLeft);
        faceBottomRight.print(dtoBottomRight);
    }
//    public Circle(Circle circle, Outside outside, PipesPlusColumn pipesPlusColumn) {
//        outside.bottom.changeColumn(pipesPlusColumn, circle.top);
//        outside.topRight.changeColumn(pipesPlusColumn, circle.bottomLeft);
//        outside.topLeft.changeColumn(pipesPlusColumn, circle.bottomRight);
//        this.top = outside.bottom;
//        this.bottomLeft = outside.topRight;
//        this.bottomRight = outside.topLeft;
//    }
//    public Circle(Outside outside){
//        this.top = outside.bottom.clone();
//        this.bottomLeft = outside.topRight.clone();
//        this.bottomRight = outside.topLeft.clone();
//    }
}
