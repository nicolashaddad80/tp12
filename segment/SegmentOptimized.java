package fr.cnam.tp12.segment;

import fr.cnam.tp12.point.specification.Point;
import fr.cnam.tp12.segment.specification.Segment;

public class SegmentOptimized implements Segment {
    /**
     * Attibutes
     */
    private Point p1;

    private Point p2;

    /*
    Optimized
     */
    private double lengh;

    /**
     * Constructor
     */
    public SegmentOptimized(Point a_P1, Point a_P2) {

        this.p1 = a_P1;
        this.p2 = a_P2;
        this.lengh = this.p1.distance(this.p2);
    }

    /**
     * methodes
     */

    @Override
    public double getLength() {
        return this.lengh;
    }

    @Override
    public void translate(double dx, double dy) {

        this.p1.translate(dx, dy);
        this.p2.translate(dx, dy);
    }

    @Override
    public void refreshLength() {
        this.lengh = this.p1.distance(this.p2);
    }
}
