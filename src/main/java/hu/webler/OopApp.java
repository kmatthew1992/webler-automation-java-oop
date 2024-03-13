package hu.webler;

import hu.webler.model.Car;

public class OopApp {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car);
        Car opel = new Car("Opel");
        System.out.println(opel);

        String brand = opel.getBrand();
        System.out.println(brand);
        String newBrand = "BMW";
        opel.setBrand(newBrand);
        System.out.println(opel);
        opel.setSpeed(160);
        System.out.println(opel);
        opel.setSpeed(0);
        System.out.println(opel);
        int increasedSpeed = opel.accelerate(123);
        System.out.println("Gyorsulás! A sebesség: " + increasedSpeed);
        System.out.println(opel);
        System.out.println("Elindultunk kirándulni, megtettünk x km-ert. A benzin fogy!!");
        double decreaseFuel = opel.consumeFuel(50);
        System.out.println("Elfogyott benzin mártáke: " + decreaseFuel);
        System.out.println(opel);
        System.out.println(car);
        double increaseCarFuel = car.refillGasoline(22.5);
        System.out.println("Tankoltunk benzint a car pédányba, ennyi litert: " + increaseCarFuel);
        double increaseOpelFuel = opel.refillGasoline(11.32);
        System.out.println("Töltöttünk benzint a BMW típusú Opelünkbe, a üzemanyag új szintje: " + increaseOpelFuel);
        System.out.println(car);
        System.out.println(opel);
    }
}
