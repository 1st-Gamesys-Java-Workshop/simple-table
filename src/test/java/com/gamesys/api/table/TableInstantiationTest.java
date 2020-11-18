package com.gamesys.api.table;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TableInstantiationTest {

    @Test
    public void testShouldInstantiateTableWithOneCellEmptyByDefault() {
        Table table = new Table();
        Assertions.assertEquals(1, table.getSize());
    }

    @Test
    public void testShouldGetEmptyCellFromDefaultTable() {
        Table table = new Table();
        Cell cell = table.getCellAt(0, 0);

        Assertions.assertNotNull(cell);
        Assertions.assertNull(cell.getValue());
    }

    @Test
    public void testShouldInstantiateTableWithInitialRowAndColumnSize() {
        Table table = new Table(2, 3);
        Cell cell = table.getCellAt(1, 2);

        Assertions.assertNotNull(cell);
        Assertions.assertNull(cell.getValue());
    }

    @Test
    public void testShouldInstantiateTableWithInitialRowSizeAndOneDefaultColumn() {
        Table table = new Table(3);
        Cell cell = table.getCellAt(2, 0);

        Assertions.assertNotNull(cell);
        Assertions.assertNull(cell.getValue());
    }

    @Test
    public void testShouldGetTableRowCountColumnCountAndSize() {
        Table table = new Table(3, 4);

        Assertions.assertEquals(3, table.getRows());
        Assertions.assertEquals(4, table.getColumns());
        Assertions.assertEquals(12, table.getSize());
    }
}
