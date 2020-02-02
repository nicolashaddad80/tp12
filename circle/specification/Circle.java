package fr.cnam.tp12.circle.specification;

import fr.cnam.tp12.mypatterns.OptimizedClass;
import fr.cnam.tp12.point.specification.Point;

public interface Circle extends OptimizedClass {
    Point getCenter();

    double getRadius();
}
