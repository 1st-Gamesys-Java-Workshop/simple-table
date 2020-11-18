package com.gamesys.api.table;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CellMutationTest {

    @Test
    public void testShouldMutateCellAtGivenPosition() {
        Table table = new Table();
        Cell cell = new Cell();
        cell.setValue(15L);
        table.setCellAt(0, 0, cell);

        Cell actual = table.getCellAt(0, 0);

        Cell expected = buildCell(15L);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testShouldMutateCellValueAtGivenPosition() {
        Table table = new Table();
        table.setCellValueAt(0, 0, 16L);

        Cell actual = table.getCellAt(0, 0);

        Cell expected = buildCell(16L);
        Assertions.assertEquals(expected, actual);
    }

    private Cell buildCell(Object value) {
        Cell cell = new Cell();
        cell.setValue(value);
        return cell;
    }

}
