package com.gamesys.api.table;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CellMutationTest {

    @Test
    public void testShouldMutateCellAtGivenPosition() {
        Table<Long> table = new Table<>();
        Cell<Long> cell = new Cell<>();
        cell.setValue(15L);
        table.setCellAt(0, 0, cell);

        Cell<Long> actual = table.getCellAt(0, 0);

        Cell<Long> expected = buildCell(15L);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testShouldMutateCellValueAtGivenPosition() {
        Table<Long> table = new Table<>();
        table.setCellValueAt(0, 0, 16L);

        Cell<Long> actual = table.getCellAt(0, 0);

        Cell<Long> expected = buildCell(16L);
        Assertions.assertEquals(expected, actual);
    }

    private <T> Cell<T> buildCell(T value) {
        Cell<T> cell = new Cell<>();
        cell.setValue(value);
        return cell;
    }

}
