package fr.cnam.tp12.segment;

import fr.cnam.tp12.point.specification.Point;
import fr.cnam.tp12.segment.specification.Segment;

public class SegmentOptimized implements Segment {
    /**
     * Attributes
     */
    protected Point p1;

    protected Point p2;

    /*
    Optimized
     */
    protected double length;

    /**
     * Constructor
     */
    public SegmentOptimized(Point a_P1, Point a_P2) {

        this.p1 = a_P1;
        this.p2 = a_P2;
        this.setLength();
    }

    /**
     * methods
     */

    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public void translate(double dx, double dy) {

        this.p1.translate(dx, dy);
        this.p2.translate(dx, dy);
    }

    protected void setLength() {
        this.length = this.p1.distance(this.p2);
    }

}
