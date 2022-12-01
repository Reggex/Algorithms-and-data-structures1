package com.company.Cars;

public enum Color {
    BLACK("Чёрный"),
    SILVER("Серебристый"),
    WHITE("Белый"),
    RED("Красный");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
