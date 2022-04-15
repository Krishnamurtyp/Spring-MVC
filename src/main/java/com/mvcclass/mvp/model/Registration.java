package com.mvcclass.mvp.model;


import javax.validation.constraints.NotEmpty;

public class Registration {

    @NotEmpty(message ="Registration name cannot be empty")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "name='" + name + '\'' +
                '}';
    }
}
