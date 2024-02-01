package main.java.builder;

public class Car {
    private String model;
    private String color;
    private Integer price;
    private Integer weight;
    private Integer height;

    public Car(String model, String color, Integer price, Integer weight, Integer height) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.height = height;
    }

    public Car() {
    }

    public static class Builder {
        private String model;
        private String color;
        private Integer price;
        private Integer weight;
        private Integer height;

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder price(Integer price) {
            this.price = price;
            return this;
        }

        public Builder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public Builder height(Integer height) {
            this.height = height;
            return this;
        }

        public Car build() {
            return new Car(model, color, price, weight, height);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
