package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private String value;
    private Integer id;
    private static Integer nextId = 1;

    public JobField() {
        this.id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField jobField)) return false;
        return Objects.equals(getId(), jobField.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

}
