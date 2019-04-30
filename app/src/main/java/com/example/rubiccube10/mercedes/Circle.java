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

    public Face getFaceTop() {
        return faceTop;
    }

    public void setFaceTop(PipesPlusColumn ppc, boolean[] aTop) {
        this.faceTop.setPPC(ppc, aTop);
    }

    public Face getFaceBottomLeft() {
        return faceBottomLeft;
    }

    public void setFaceBottomLeft(PipesPlusColumn ppc, boolean[] aBottomLeft) {
        this.faceBottomLeft.setPPC(ppc, aBottomLeft);
    }

    public Face getFaceBottomRight() {
        return faceBottomRight;
    }

    public void setFaceBottomRight(PipesPlusColumn ppc, boolean[] aBottomRight) {
        this.faceBottomRight.setPPC(ppc, aBottomRight);
    }

    public void print() {
        faceTop.print(dtoTop);
        faceBottomLeft.print(dtoBottomLeft);
        faceBottomRight.print(dtoBottomRight);
    }
}
