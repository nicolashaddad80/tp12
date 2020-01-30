package fr.cnam.tp12.point.specification;

import fr.cnam.tp12.segment.SegmentOptimized2;

public interface Point {
    double getX();

    double getY();

    double distance(Point other);

    void translate(double dx, double dy);


}
