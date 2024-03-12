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
    }
}
