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

    public Face getFaceTopLeft() {
        return faceTopLeft;
    }

    public void setFaceTopLeft(PipesPlusColumn ppc, boolean[] aTopLeft) {
        this.faceTopLeft.setPPC(ppc, aTopLeft);
    }

    public Face getFaceTopRight() {
        return faceTopRight;
    }

    public void setFaceTopRight(PipesPlusColumn ppc, boolean[] aTopRight) {
        this.faceTopRight.setPPC(ppc, aTopRight);
    }

    public Face getFaceBottom() {
        return faceBottom;
    }

    public void setFaceBottom(PipesPlusColumn ppc, boolean[] aBottom) {
        this.faceBottom.setPPC(ppc, aBottom);
    }

    public void print() {
        faceTopLeft.print(dtoTopLeft);
        faceTopRight.print(dtoTopRight);
        faceBottom.print(dtoBottom);
    }
}
