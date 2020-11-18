package com.gamesys.api.table;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CellAccessTest {

    @Test
    public void testShouldProvideCellListOnOneRow() {
        Table<String> table = new Table<>(3, 2);
        table.setCellAt(0, 0, buildCell("Hello"));
        table.setCellAt(0, 1, buildCell("World"));

        List<String> actual = table.getListAtRow(0);

        List<String> expected = Arrays.asList("Hello", "World");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testShouldProvideCellListOnOneColumn() {
        Table<String> table = new Table<>(3, 2);
        table.setCellAt(0, 0, buildCell("You"));
        table.setCellAt(1, 0, buildCell("are"));
        table.setCellAt(2, 0, buildCell("right"));

        List<String> actual = table.getListAtColumn(0);

        List<String> expected = Arrays.asList("You", "are", "right");
        Assertions.assertEquals(expected, actual);
    }

    private <T> Cell<T> buildCell(T value) {
        Cell<T> cell = new Cell<>();
        cell.setValue(value);
        return cell;
    }

}
