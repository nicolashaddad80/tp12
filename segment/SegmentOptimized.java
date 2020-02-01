package fr.cnam.tp12.segment;

import fr.cnam.tp12.mypatterns.MyObserver;
import fr.cnam.tp12.point.PointObservable;
import fr.cnam.tp12.segment.specification.Segment;

public class SegmentOptimized implements Segment {

    /**
     * Internal Classes
     */
    private static class LengthUpdate implements MyObserver{
        private SegmentOptimized segmentOptimized;

        public LengthUpdate(SegmentOptimized segmentOptimized) {
            this.segmentOptimized = segmentOptimized;
        }

        @Override
        public void update() {
            this.segmentOptimized.updateLength();
        }
    }


    /**
     * Attributes
     */
    private PointObservable p1;

    private PointObservable p2;

    private MyObserver p1Observer;
    private MyObserver p2Observer;

    /*
    Optimized
     */
    private double length;

    /**
     * Constructor
     */
    public SegmentOptimized(PointObservable a_P1, PointObservable a_P2) {
        this.p1Observer = new LengthUpdate(this);
        this.p1 = a_P1;
        this.p1.addObserver(this.p1Observer);

        this.p2Observer = new LengthUpdate(this);
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

    public void updateLength() {
        this.length = this.p1.distance(this.p2);
    }

    @Override
    public void destroy() {
        this.p1.deleteObserver(this.p1Observer);
        this.p2.deleteObserver(this.p2Observer);
    }

}
