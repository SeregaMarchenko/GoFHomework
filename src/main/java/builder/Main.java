package main.java.builder;

public class Main {
    public static void main(String[] args) {
        Car car_1 = new Car.Builder()
                .price(122)
                .color("Red")
                .model("BMW")
                .build();
        Car car_2 = new Car.Builder()
                .price(1223)
                .weight(32)
                .height(124)
                .build();
        System.out.println(car_1);
        System.out.println(car_2);
    }
}
