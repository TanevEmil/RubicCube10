package com.example.rubiccube10.star;

import com.example.rubiccube10.Pair;
import com.example.rubiccube10.Column;
import com.example.rubiccube10.Row;
import com.example.rubiccube10.mercedes.Circle;
import com.example.rubiccube10.mercedes.Origin;
import com.example.rubiccube10.mercedes.Outside;

public abstract class Star {

    protected Origin origin;
    protected Circle circle;
    protected Outside outside;

    protected Pair pairFront;

    protected Pair pairTop;
    protected Pair pairBottomLeft;
    protected Pair pairBottomRight;

    protected Pair pairTopLeft;
    protected Pair pairTopRight;
    protected Pair pairBottom;

    public Star(Pair pairFront,
                    Pair pairTop, Pair pairBottomLeft, Pair pairBottomRight,
                    Pair pairTopLeft, Pair pairTopRight, Pair pairBottom) {
            this.pairFront = pairFront;

            this.pairTop = pairTop;
            this.pairBottomLeft = pairBottomLeft;
            this.pairBottomRight = pairBottomRight;

            this.pairTopLeft = pairTopLeft;
            this.pairTopRight = pairTopRight;
            this.pairBottom = pairBottom;

            origin = new Origin(pairFront);
            circle = new Circle(pairTop, pairBottomLeft, pairBottomRight);
            outside = new Outside(pairTopLeft, pairTopRight, pairBottom);
        }
        protected Star(Circle circle, Origin origin, Outside outside) {
            this.circle = circle;
            this.origin = origin;
            this.outside = outside;
        }

        public abstract Star clickTop();
        public abstract Star clickBottomLeft();
        public abstract Star clickBottomRight();
        public abstract Star clickTopLeft();
        public abstract Star clickTopRight();
        public abstract Star clickBottom();

        public abstract Origin getOrigin();
        public abstract Circle getCircle();
        public abstract Outside getOutside();
}
