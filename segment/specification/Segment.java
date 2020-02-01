package fr.cnam.tp12.segment.specification;


import fr.cnam.tp12.mypatterns.OptimizedClass;

public interface Segment extends OptimizedClass {

    double getLength();

    void translate(double dx, double dy);

}
