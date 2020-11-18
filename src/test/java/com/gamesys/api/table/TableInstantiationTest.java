package com.gamesys.api.table;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TableInstantiationTest {

    @Test
    @DisplayName("Table can be instantiated with one cell by default")
    public void testShouldInstantiateTableWithOneCellEmptyByDefault() {
        Table<Integer> table = new Table<>();
        Table table = new Table();

        Assertions.assertEquals(1, table.getRows());
        Assertions.assertEquals(1, table.getColumns());
        Assertions.assertEquals(1, table.getSize());
    }

    @Test
    @DisplayName("Tables instantiated by default should contain one empty cell")
    public void testShouldGetEmptyCellFromDefaultTable() {
        Table table = new Table();
        Cell cell = table.getCellAt(0, 0);

        Assertions.assertNotNull(cell);
        Assertions.assertNull(cell.getValue());
    }

    @Test
    @DisplayName("Table can be instantiated with initial no. of rows and columns")
    public void testShouldInstantiateTableWithInitialRowAndColumnSize() {
        Table<Boolean> table = new Table<>(2, 3);
        Cell<Boolean> cell = table.getCellAt(1, 2);

        Assertions.assertEquals(2, table.getRows());
        Assertions.assertEquals(3, table.getColumns());
        Assertions.assertNotNull(cell);
        Assertions.assertNull(cell.getValue());
    }

    @Test
    @DisplayName("Table can be instantiated with initial no. of rows and one column by default")
    public void testShouldInstantiateTableWithInitialRowSizeAndOneDefaultColumn() {
        Table<String> table = new Table<>(3);
        Cell<String> cell = table.getCellAt(2, 0);

        Assertions.assertEquals(3, table.getRows());
        Assertions.assertEquals(1, table.getColumns());
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
