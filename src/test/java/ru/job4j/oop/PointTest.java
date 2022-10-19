package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

public class PointTest {

    @Test
    public void when10to20then1() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        int expected = 1;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when01to02then1() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 2);
        int expected = 1;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when33to55then2dot82() {
        Point a = new Point(3, 3);
        Point b = new Point(5, 5);
        double expected = 2.82;
        assertThat(a.distance(b)).isCloseTo(expected, offset(0.01));
    }
}