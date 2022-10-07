package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5Elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOf3Elements() {
        int[] data = new int[] {6, 0, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOf4Elements() {
        int[] data = new int[] {3, 1, 3, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 3, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOf6Elements() {
        int[] data = new int[] {0, 4, 1, 5, -6, -2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-6, -2, 0, 1, 4, 5};
        assertThat(result).containsExactly(expected);
    }
}