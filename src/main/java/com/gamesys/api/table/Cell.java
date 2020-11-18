package com.gamesys.api.table;

import java.util.Objects;

public class Cell {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return Objects.equals(value, cell.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
