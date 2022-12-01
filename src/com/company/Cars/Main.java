package com.company.Cars;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите максимальную сумму, которую вы хотите потратить на машину: ");
        int sum = scanner.nextInt();
        List<Car> cars = new ArrayList<>();
        cars.add(Car.CAMRY);
        cars.add(Car.RIO);
        cars.add(Car.SOUL);
        cars.add(Car.OCTAVIA);
        cars.add(Car.SUPERB);
        cars.sort(new Comparator<Car>() {       // переопределение сортировки объектов cars по макс скорости по убыванию
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });
        for (Car car : cars) {
            if (car.getCost() <= sum) {
                System.out.println(car);
            }
        }

    }
}
