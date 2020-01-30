package fr.cnam.tp12.tests;

import fr.cnam.tp12.point.PointOptimized2;
import fr.cnam.tp12.point.specification.Point2;
import fr.cnam.tp12.segment.SegmentOptimized2;
import org.junit.Before;

public class SegmentOptimized2Test extends SegmentOptimizedTest {

    @Override
    @Before
    public void setUp() throws Exception {
        this.p1 = new PointOptimized2(0, 0);
        this.p2 = new PointOptimized2(0, 10);
        this.s1 = new SegmentOptimized2((Point2) p1, (Point2) p2);
    }
}