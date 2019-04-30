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
    public Star clickTop(PipesPlusColumn ppc) {
        boolean[] aPPC = origin.getFaceBack().getPPC(ppc);
        origin.setFaceBack(ppc, circle.getFaceTop().getPPC(ppc));
        circle.setFaceTop(ppc, origin.getFaceFront().getPPC(ppc));
        origin.setFaceFront(ppc, outside.getFaceBottom().getPPC(ppc));
        outside.setFaceBottom(ppc, aPPC);
        print();
        return new AntiMercedes(this);
    }
    @Override
    public Star clickBottomLeft(PipesPlusColumn ppc) {
        boolean[] aPPC = origin.getFaceBack().getPPC(ppc);
        origin.setFaceBack(ppc, circle.getFaceBottomLeft().getPPC(ppc));
        circle.setFaceBottomLeft(ppc, origin.getFaceFront().getPPC(ppc));
        origin.setFaceFront(ppc, outside.getFaceTopRight().getPPC(ppc));
        outside.setFaceTopRight(ppc, aPPC);
        print();
        return new AntiMercedes(this);
    }
    @Override
    public Star clickBottomRight(PipesPlusColumn ppc) {
        boolean[] aPPC = origin.getFaceBack().getPPC(ppc);
        origin.setFaceBack(ppc, circle.getFaceBottomRight().getPPC(ppc));
        circle.setFaceBottomRight(ppc, origin.getFaceFront().getPPC(ppc));
        origin.setFaceFront(ppc, outside.getFaceTopLeft().getPPC(ppc));
        outside.setFaceTopLeft(ppc, aPPC);
        print();
        return new AntiMercedes(this);
    }
    @Override
    public Star clickTopLeft(PipesPlusColumn ppc) {
        boolean[] aPPC = origin.getFaceBack().getPPC(ppc);
        origin.setFaceBack(ppc, outside.getFaceTopLeft().getPPC(ppc));
        outside.setFaceTopLeft(ppc, origin.getFaceFront().getPPC(ppc));
        origin.setFaceFront(ppc, circle.getFaceBottomRight().getPPC(ppc));
        circle.setFaceBottomRight(ppc, aPPC);

        aPPC = circle.getFaceTop().getPPC(ppc);
        circle.setFaceTop(ppc, outside.getFaceTopRight().getPPC(ppc));
        outside.setFaceTopRight(ppc, aPPC);

        aPPC = outside.getFaceBottom().getPPC(ppc);
        outside.setFaceBottom(ppc, circle.getFaceBottomLeft().getPPC(ppc));
        circle.setFaceBottomLeft(ppc, aPPC);

        print();
        return new AntiMercedes(this);
    }
    @Override
    public Star clickTopRight(PipesPlusColumn ppc) {
        boolean[] aPPC = origin.getFaceBack().getPPC(ppc);
        origin.setFaceBack(ppc, outside.getFaceTopRight().getPPC(ppc));
        outside.setFaceTopRight(ppc, origin.getFaceFront().getPPC(ppc));
        origin.setFaceFront(ppc, circle.getFaceBottomLeft().getPPC(ppc));
        circle.setFaceBottomLeft(ppc, aPPC);

        aPPC = circle.getFaceTop().getPPC(ppc);
        circle.setFaceTop(ppc, outside.getFaceTopLeft().getPPC(ppc));
        outside.setFaceTopLeft(ppc, aPPC);

        aPPC = outside.getFaceBottom().getPPC(ppc);
        outside.setFaceBottom(ppc, circle.getFaceBottomRight().getPPC(ppc));
        circle.setFaceBottomRight(ppc, aPPC);

        print();
        return new AntiMercedes(this);
    }
    @Override
    public Star clickBottom(PipesPlusColumn ppc) {
        boolean[] aPPC = origin.getFaceBack().getPPC(ppc);
        origin.setFaceBack(ppc, outside.getFaceBottom().getPPC(ppc));
        outside.setFaceBottom(ppc, origin.getFaceFront().getPPC(ppc));
        origin.setFaceFront(ppc, circle.getFaceTop().getPPC(ppc));
        circle.setFaceTop(ppc, aPPC);

        aPPC = circle.getFaceBottomLeft().getPPC(ppc);
        circle.setFaceBottomLeft(ppc, outside.getFaceTopLeft().getPPC(ppc));
        outside.setFaceTopLeft(ppc, aPPC);

        aPPC = circle.getFaceBottomRight().getPPC(ppc);
        circle.setFaceBottomRight(ppc, outside.getFaceTopRight().getPPC(ppc));
        outside.setFaceTopRight(ppc, aPPC);

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
