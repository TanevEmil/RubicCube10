package com.example.rubiccube10.star;

import com.example.rubiccube10.DTO;
import com.example.rubiccube10.PipesPlusColumn;
import com.example.rubiccube10.mercedes.Circle;
import com.example.rubiccube10.mercedes.Face;
import com.example.rubiccube10.mercedes.Origin;
import com.example.rubiccube10.mercedes.Outside;

public abstract class Star {

    protected Origin origin;
    protected Circle circle;
    protected Outside outside;

    protected DTO dtoFront;

    protected DTO dtoTop;
    protected DTO dtoBottomLeft;
    protected DTO dtoBottomRight;

    protected DTO dtoTopLeft;
    protected DTO dtoTopRight;
    protected DTO dtoBottom;

    public Star(DTO dtoFront,
                    DTO dtoTop, DTO dtoBottomLeft, DTO dtoBottomRight,
                    DTO dtoTopLeft, DTO dtoTopRight, DTO dtoBottom) {
            this.dtoFront = dtoFront;

            this.dtoTop = dtoTop;
            this.dtoBottomLeft = dtoBottomLeft;
            this.dtoBottomRight = dtoBottomRight;

            this.dtoTopLeft = dtoTopLeft;
            this.dtoTopRight = dtoTopRight;
            this.dtoBottom = dtoBottom;

            origin = new Origin(dtoFront);
            circle = new Circle(dtoTop, dtoBottomLeft, dtoBottomRight);
            outside = new Outside(dtoTopLeft, dtoTopRight, dtoBottom);
        }
        protected Star(Circle circle, Origin origin, Outside outside) {
            this.circle = circle;
            this.origin = origin;
            this.outside = outside;
        }

        public abstract Star clickTop(PipesPlusColumn pipesPlusColumn);
        public abstract Star clickBottomLeft(PipesPlusColumn pipesPlusColumn);
        public abstract Star clickBottomRight(PipesPlusColumn pipesPlusColumn);
        public abstract Star clickTopLeft(PipesPlusColumn pipesPlusColumn);
        public abstract Star clickTopRight(PipesPlusColumn pipesPlusColumn);
        public abstract Star clickBottom(PipesPlusColumn pipesPlusColumn);

        public abstract Origin getOrigin();
        public abstract Circle getCircle();
        public abstract Outside getOutside();

        protected void print() {
            origin.print();
            circle.print();
            outside.print();
        }
}
