package com.example.rubiccube10.star;

import com.example.rubiccube10.DTO;
import com.example.rubiccube10.PipesPlusColumn;
import com.example.rubiccube10.mercedes.Circle;
import com.example.rubiccube10.mercedes.Face;
import com.example.rubiccube10.mercedes.Origin;
import com.example.rubiccube10.mercedes.Outside;

public class Mercedes extends Star{

    public Mercedes(DTO dtoFront,
                    DTO dtoTop, DTO dtoBottomLeft, DTO dtoBottomRight,
                    DTO dtoTopLeft, DTO dtoTopRight, DTO dtoBottom) {
        super(dtoFront, dtoTop, dtoBottomLeft, dtoBottomRight, dtoTopLeft, dtoTopRight, dtoBottom);
    }
    public Mercedes(AntiMercedes antiMercedes) {
        super(antiMercedes.getCircle(), antiMercedes.getOrigin(), antiMercedes.getOutside());
    }
    @Override
    public Star clickTop(PipesPlusColumn pipesPlusColumn) {
        Face face = origin.getFaceBack();
        origin.setFaceBack(circle.getFaceTop());
        circle.setFaceTop(origin.getFaceFront());
        origin.setFaceFront(outside.getFaceBottom());
        outside.setFaceBottom(face);
        print();
        return new AntiMercedes(this);
    }
    @Override
    public Star clickBottomLeft(PipesPlusColumn pipesPlusColumn) {
        Face face = origin.getFaceBack();
        origin.setFaceBack(circle.getFaceBottomLeft());
        circle.setFaceBottomLeft(origin.getFaceFront());
        origin.setFaceFront(outside.getFaceTopRight());
        outside.setFaceTopRight(face);
        print();
        return new AntiMercedes(this);
    }
    @Override
    public Star clickBottomRight(PipesPlusColumn pipesPlusColumn) {
        Face face = origin.getFaceBack();
        origin.setFaceBack(circle.getFaceBottomRight());
        circle.setFaceBottomRight(origin.getFaceFront());
        origin.setFaceFront(outside.getFaceTopLeft());
        outside.setFaceTopLeft(face);
        print();
        return new AntiMercedes(this);
    }
    @Override
    public Star clickTopLeft(PipesPlusColumn pipesPlusColumn) {
        Face face = origin.getFaceBack();
        origin.setFaceBack(outside.getFaceTopLeft());
        outside.setFaceTopLeft(origin.getFaceFront());
        origin.setFaceFront(circle.getFaceBottomRight());
        circle.setFaceBottomRight(face);

        face = circle.getFaceTop();
        circle.setFaceTop(outside.getFaceTopRight());
        outside.setFaceTopRight(face);

        face = outside.getFaceBottom();
        outside.setFaceBottom(circle.getFaceBottomLeft());
        circle.setFaceBottomLeft(face);

        print();
        return new AntiMercedes(this);
    }
    @Override
    public Star clickTopRight(PipesPlusColumn pipesPlusColumn) {
        Face face = origin.getFaceBack();
        origin.setFaceBack(outside.getFaceTopRight());
        outside.setFaceTopRight(origin.getFaceFront());
        origin.setFaceFront(circle.getFaceBottomLeft());
        circle.setFaceBottomLeft(face);

        face = circle.getFaceTop();
        circle.setFaceTop(outside.getFaceTopLeft());
        outside.setFaceTopLeft(face);

        face = outside.getFaceBottom();
        outside.setFaceBottom(circle.getFaceBottomRight());
        circle.setFaceBottomRight(face);

        print();
        return new AntiMercedes(this);
    }
    @Override
    public Star clickBottom(PipesPlusColumn pipesPlusColumn) {
        Face face = origin.getFaceBack();
        origin.setFaceBack(outside.getFaceBottom());
        outside.setFaceBottom(origin.getFaceFront());
        origin.setFaceFront(circle.getFaceTop());
        circle.setFaceTop(face);

        face = circle.getFaceBottomLeft();
        circle.setFaceBottomLeft(outside.getFaceTopLeft());
        outside.setFaceTopLeft(face);

        face = circle.getFaceBottomRight();
        circle.setFaceBottomRight(outside.getFaceTopRight());
        outside.setFaceTopRight(face);

        print();
        return new AntiMercedes(this);
    }

    public Origin getOrigin() {
        return origin;
    }

    public Circle getCircle() {
        return circle;
    }

    public Outside getOutside() {
        return outside;
    }
}
