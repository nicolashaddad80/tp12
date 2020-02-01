package fr.cnam.tp12.segment.specification;

import fr.cnam.tp12.mypatterns.MyObserver;

public interface Segment extends MyObserver {

    double getLength();

    void translate(double dx, double dy);

}
