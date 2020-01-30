package fr.cnam.tp12.point;

import fr.cnam.tp12.point.specification.Point2;
import fr.cnam.tp12.segment.specification.Segment2;

import java.util.Vector;

public class PointOptimized2 extends PointOptimized implements Point2 {

    private Vector<Segment2> myBelongingSegments = new Vector<>();

    /**
     * Le constructeur de notre Point
     *
     * @param a_x : L'Abscisse de notre Point
     * @param a_y : L'Ordonnee de notre Point
     */
    public PointOptimized2(double a_x, double a_y) {
        super(a_x, a_y);
    }

    @Override
    public void addSegmentToNotification(Segment2 a_segment2) {
        this.myBelongingSegments.add(a_segment2);
    }

    @Override
    public void translate(double a_x, double a_y) {
        super.translate(a_x, a_y);
        this.notifyAllSegments();
    }

    private void notifyAllSegments() {
        for (Segment2 segment : myBelongingSegments) segment.refreshLength();
    }
}
