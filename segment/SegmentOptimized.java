package fr.cnam.tp12.segment;

import fr.cnam.tp12.point.PointObservable;
import fr.cnam.tp12.segment.specification.Segment;

public class SegmentOptimized implements Segment {
    /**
     * Attributes
     */
    private PointObservable p1;

    private PointObservable p2;

    /*
    Optimized
     */
    private double length;

    /**
     * Constructor
     */
    public SegmentOptimized(PointObservable a_P1, PointObservable a_P2) {

        this.p1 = a_P1;
        this.p1.addObserver(this);
        this.p2 = a_P2;
        this.p2.addObserver(this);
        this.updateLength();
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

    private void updateLength() {
        this.length = this.p1.distance(this.p2);
    }

    @Override
    public void update() {
        this.updateLength();
    }

    @Override
    public void destroy() {
            this.p1.deleteObserver(this);
            this.p1.deleteObserver(this);
    }

}
