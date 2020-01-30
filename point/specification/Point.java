package fr.cnam.tp12.point.specification;

public interface Point {
    double getX();

    double getY();

    double distance(Point other);

    void translate(double dx, double dy);
}
