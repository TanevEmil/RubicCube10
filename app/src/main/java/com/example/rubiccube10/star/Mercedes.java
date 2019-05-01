package com.example.rubiccube10.star;

import com.example.rubiccube10.Pair;
import com.example.rubiccube10.Column;
import com.example.rubiccube10.Row;
import com.example.rubiccube10.mercedes.Circle;
import com.example.rubiccube10.mercedes.Origin;
import com.example.rubiccube10.mercedes.Outside;

public class Mercedes extends Star{

    public Mercedes(Pair pairFront,
                    Pair pairTop, Pair pairBottomLeft, Pair pairBottomRight,
                    Pair pairTopLeft, Pair pairTopRight, Pair pairBottom) {
        super(pairFront, pairTop, pairBottomLeft, pairBottomRight, pairTopLeft, pairTopRight, pairBottom);
    }
    public Mercedes(AntiMercedes antiMercedes) {
        super(antiMercedes.getCircle(), antiMercedes.getOrigin(), antiMercedes.getOutside());
    }
    @Override
    public Star clickTop() {
        int color = origin.getPairBack();
        circle.setPairTop(origin.getPairFront());
        origin.setPairFront(outside.getPairBottom());
        outside.setPairBottom(color);
        
        return new AntiMercedes(this);
    }
    @Override
    public Star clickBottomLeft() {
        int color = origin.getPairBack();
        circle.setPairBottomLeft(origin.getPairFront());
        origin.setPairFront(outside.getPairTopRight());
        outside.setPairTopRight(color);
        
        return new AntiMercedes(this);
    }
    @Override
    public Star clickBottomRight() {
        int color = origin.getPairBack();
        circle.setPairBottomRight(origin.getPairFront());
        origin.setPairFront(outside.getPairTopLeft());
        outside.setPairTopLeft(color);
        
        return new AntiMercedes(this);
    }
    @Override
    public Star clickTopLeft() {
        int color = origin.getPairBack();
        outside.setPairTopLeft(origin.getPairFront());
        origin.setPairFront(circle.getPairBottomRight());
        circle.setPairBottomRight(color);

        color = circle.getPairTop();
        circle.setPairTop(outside.getPairTopRight());
        outside.setPairTopRight(color);

        color = outside.getPairBottom();
        outside.setPairBottom(circle.getPairBottomLeft());
        circle.setPairBottomLeft(color);
        
        return new AntiMercedes(this);
    }
    @Override
    public Star clickTopRight() {
        int color = origin.getPairBack();
        outside.setPairTopRight(origin.getPairFront());
        origin.setPairFront(circle.getPairBottomLeft());
        circle.setPairBottomLeft(color);

        color = circle.getPairTop();
        circle.setPairTop(outside.getPairTopLeft());
        outside.setPairTopLeft(color);

        color = outside.getPairBottom();
        outside.setPairBottom(circle.getPairBottomRight());
        circle.setPairBottomRight(color);
        
        return new AntiMercedes(this);
    }
    @Override
    public Star clickBottom() {
        int color = origin.getPairBack();
        outside.setPairBottom(origin.getPairFront());
        origin.setPairFront(circle.getPairTop());
        circle.setPairTop(color);

        color = circle.getPairBottomLeft();
        circle.setPairBottomLeft(outside.getPairTopLeft());
        outside.setPairTopLeft(color);

        color = circle.getPairBottomRight();
        circle.setPairBottomRight(outside.getPairTopRight());
        outside.setPairTopRight(color);
        
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
