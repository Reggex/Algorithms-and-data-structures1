package com.company.Cars;

public enum Brand {
    KIA("Киа"),
    SKODA("Шкода"),
    TOYOTA("Тойота");

    private final String name;

    public String getName() {
        return name;
    }

    Brand(String name) {
        this.name = name;
    }

}
