package fr.cnam.tp12.tests;

import fr.cnam.tp12.point.PointOptimized;
import fr.cnam.tp12.point.specification.Point;
import fr.cnam.tp12.segment.SegmentOptimized;
import fr.cnam.tp12.segment.specification.Segment;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SegmentOptimizedTest {
    /**
     * Constants
     */
    protected final static double precision = 0.0001;

    /**
     * Attributes
     */
    protected Point p1;
    protected Point p2;
    protected Segment s1;


    @Before
    public void setUp() throws Exception {
        this.p1 = new PointOptimized(0, 0);
        this.p2 = new PointOptimized(0, 10);
        this.s1 = new SegmentOptimized(p1, p2);
    }

    @Test
    public void getLengthWithoutAnyTranslatingTest() {
        //Must be pass in this Part #1 implementation
        assertEquals(10, this.s1.getLength(), precision);
    }

    @Test
    public void getLengthWithTranslatingSegment() {
        //Must be pass in Part #1 implementation
        //Do segment Translation
        this.s1.translate(20, 20);
        assertEquals(10, this.s1.getLength(), precision);
    }

    @Test
    public void getLengthWithTranslatingPointOnly() {
        //Must be fail in Part #1 implementation
        //Do Point Translation
        this.p1.translate(0, -10);
        assertEquals(20, this.s1.getLength(), precision);
    }
}