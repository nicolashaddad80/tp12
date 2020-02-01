package fr.cnam.tp12.segment;

import fr.cnam.tp12.mypatterns.MyObserver;
import fr.cnam.tp12.point.PointObservable;
import fr.cnam.tp12.segment.specification.Segment;

public class SegmentOptimized implements Segment {

    /**
     * Attributes
     */
    /* Points */
    private PointObservable p1;
    private PointObservable p2;

    /*Points Observers*/
    private MyObserver p1Observer;
    private MyObserver p2Observer;

    /*
    Optimized Attributes
     */
    private double length;

    /**
     * Constructor
     */
    public SegmentOptimized(PointObservable a_P1, PointObservable a_P2) {
        this.p1Observer = this::updateLength;
        this.p1 = a_P1;
        this.p1.addObserver(this.p1Observer);

        this.p2Observer = this::updateLength;
        this.p2 = a_P2;
        this.p2.addObserver(p2Observer);
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
    public void destroy() {
        this.p1.deleteObserver(this.p1Observer);
        this.p2.deleteObserver(this.p2Observer);
    }

}
