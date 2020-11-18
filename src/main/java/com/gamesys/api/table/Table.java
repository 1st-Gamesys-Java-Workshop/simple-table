package com.gamesys.api.table;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private Cell[][] cells;
    private int rows;
    private int columns;

    public Table() {
        this(1);
    }

    public Table(int rows) {
        this(rows, 1);
    }

    public Table(int rows, int columns) {
        cells = new Cell[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                cells[i][j] = new Cell();
            }
        }

        this.rows = rows;
        this.columns = columns;
    }

    public int getSize() {
        return rows * columns;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Cell getCellAt(int row, int column) {
        return cells[row][column];
    }

    public Object getCellValueAt(int row, int column) {
        Cell cell = getCellAt(row, column);
        if (cell != null) {
            return cell.getValue();
        }
        return null;
    }

    public void setCellAt(int row, int column, Cell value) {
        cells[row][column] = value;
    }

    public void setCellValueAt(int row, int column, Object value) {
        Cell cell = getCellAt(row, column);
        cell.setValue(value);
        setCellAt(row, column, cell);
    }

    public List getListAtRow(int row) {
        List list = new ArrayList();
        for (int j = 0; j < columns; j++) {
            list.add(getCellValueAt(row, j));
        }
        return list;
    }

    public List getListAtColumn(int column) {
        List list = new ArrayList();
        for (int i = 0; i < rows; i++) {
            list.add(getCellValueAt(i, column));
        }
        return list;
    }
}
