package com.gamesys.api.table;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TableInstantiationTest {

    @Test
    public void testShouldInstantiateTableWithOneCellEmptyByDefault() {
        Table<Integer> table = new Table<>();
        Assertions.assertEquals(1, table.getSize());
    }

    @Test
    public void testShouldGetEmptyCellFromDefaultTable() {
        Table<Integer> table = new Table<>();
        Cell<Integer> cell = table.getCellAt(0, 0);

        Assertions.assertNotNull(cell);
        Assertions.assertNull(cell.getValue());
    }

    @Test
    public void testShouldInstantiateTableWithInitialRowAndColumnSize() {
        Table<Boolean> table = new Table<>(2, 3);
        Cell<Boolean> cell = table.getCellAt(1, 2);

        Assertions.assertNotNull(cell);
        Assertions.assertNull(cell.getValue());
    }

    @Test
    public void testShouldInstantiateTableWithInitialRowSizeAndOneDefaultColumn() {
        Table<String> table = new Table<>(3);
        Cell<String> cell = table.getCellAt(2, 0);

        Assertions.assertNotNull(cell);
        Assertions.assertNull(cell.getValue());
    }

    @Test
    public void testShouldGetTableRowCountColumnCountAndSize() {
        Table<Double> table = new Table<>(3, 4);

        Assertions.assertEquals(3, table.getRows());
        Assertions.assertEquals(4, table.getColumns());
        Assertions.assertEquals(12, table.getSize());
    }
}
