package com.joaquim.dscatalog.entities;

import java.io.Serial;
import java.io.Serializable;

public class Category implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String description;

    public Category() {
    }

    public Category(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Category other = (Category) o;
        if (id == null) {
            if (other.id != null) {
                return false;
            } else if (!id.equals(other.id)) return false;
        }
        return true;
    }

}
