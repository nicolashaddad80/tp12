package fr.cnam.tp12.segment;

import fr.cnam.tp12.mypatterns.MyObserver;


public  class SegmentLengthUpdate implements MyObserver {


    private SegmentOptimized segmentOptimized;

    public SegmentLengthUpdate(SegmentOptimized segmentOptimized) {
        this.segmentOptimized = segmentOptimized;
    }

    @Override
    public void update() {
        this.segmentOptimized.updateLength();
    }

}
