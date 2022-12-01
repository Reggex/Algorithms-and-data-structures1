package com.company.Cars;

public enum Car{

    CAMRY("Камри", 200, 3000000, Color.BLACK, Brand.TOYOTA),
    RIO("Рио", 160, 1300000, Color.WHITE, Brand.KIA),
    SOUL("Соул", 180, 1700000, Color.RED, Brand.KIA),
    SUPERB("Суперб", 210, 3500000, Color.SILVER, Brand.SKODA),
    OCTAVIA("Октавия", 190, 2700000, Color.SILVER, Brand.SKODA);

    private final String model;
    private int speed;
    private int cost;
    private String color;
    private final String brand;

    /**
     * Конструктор
     * @param model - модель машины
     * @param speed - макс. скорость
     * @param cost - стоимость
     * @param color - цвет
     * @param brand - марка
     */
    Car(String model, int speed, int cost, Color color, Brand brand) {
        this.model = model;
        this.speed = speed;
        this.cost = cost;
        switch(color){
            case SILVER:
                this.color = Color.SILVER.getName();
                break;
            case BLACK:
                this.color = Color.BLACK.getName();
                break;
            case WHITE:
                this.color = Color.WHITE.getName();
                break;
            case RED:
                this.color = Color.RED.getName();
                break;
            default:
                this.color = "Выбран некорректный цвет";
                break;
        }
        switch(brand){
            case KIA:
                this.brand = Brand.KIA.getName();
                break;
            case SKODA:
                this.brand = Brand.SKODA.getName();
                break;
            case TOYOTA:
                this.brand = Brand.TOYOTA.getName();
                break;
            default:
                this.brand = "Выбрана некорректная марка";
                break;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Переопределение метода toString.
     * @return все параметры автомобиля
     */
    @Override
    public String toString() {
        return getBrand() + " " + getModel()  + "\n Стоимость: " + getCost()
                + "\n Макс. скорость: " + getSpeed() + "\n Цвет: " + getColor()
                + "\n-------------------------------------------------------";
    }
}
