package com.company.Months;

public enum Months {
    JANUARY(1,"Январь"),
    FEBRUARY(2,"Февраль"),
    MARCH(3,"Март"),
    APRIL(4,"Апрель"),
    MAY(5,"Май"),
    JUNE(6,"Июнь"),
    JULY(7,"Июль"),
    AUGUST(8,"Август"),
    SEPTEMBER(9,"Сентябрь"),
    OCTOBER(10,"Октябрь"),
    NOVEMBER(11,"Ноябрь"),
    DECEMBER(12,"Декабрь");

    private final int number;           // Номер месяца
    private final String name;          // Название месяца на русском языке

    /**
     * Конструктор месяцев.
     * @param number - номер месяца.
     * @param name - название месяца на русском языке.
     */
    Months(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    /**
     * Переопределение метода toString (вывода месяца).
     * @return название месяца на русском языке.
     */
    @Override
    public String toString() {
        return getName();
    }
}
