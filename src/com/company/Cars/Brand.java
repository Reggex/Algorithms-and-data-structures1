package com.company.Cars;

public enum Brand {
    KIA("Киа"), //рио и соул
    SKODA("Шкода"), //октавия,суперб
    TOYOTA("Тойота"); //камри

    private final String name;

    public String getName() {
        return name;
    }

    Brand(String name) {
        this.name = name;
    }

}
