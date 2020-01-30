package fr.cnam.tp12.segment;


import fr.cnam.tp12.point.specification.Point2;
import fr.cnam.tp12.segment.specification.Segment2;

public class SegmentOptimized2 extends SegmentOptimized implements Segment2 {
    /**
     * Attributes
     */


    /**
     * Constructor
     *
     * @param a_p1: First Point
     * @param a_p2: Second Point
     */

    public SegmentOptimized2(Point2 a_p1, Point2 a_p2) {
        super(a_p1,a_p2);
        ((Point2)this.p1).addSegmentToNotification(this);
        ((Point2)this.p2).addSegmentToNotification(this);
    }

    @Override
    public void refreshLength() {
        this.setLength();
    }
}
