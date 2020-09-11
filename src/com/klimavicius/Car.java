package com.klimavicius;

public class Car {

    private Brand brand;
    private Color color;
    private String type;

    // Only once //
//    static {
//        System.out.println("A new Instance of car was created!");
//    }

    // Every time an instance is created //
//    {
//        System.out.println("A new Instance of car was created!");
//    }

    // Enums //
    public enum Color {
        BLUE,
        YELLOW,
        RED
    }

    public Car() {

    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    @ToDo("By Vytautas Klimavicius")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }




    public class Brand {

        private String name;

        public Brand() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Brand{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}

interface ICar {

    String sayName(String name);
}
