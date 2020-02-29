package com.nisansa.sample;

public class sensor {

    private String name;
    private double value;

    @Override
    public String toString() {
        return "sensor{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public String getName() {
        return name;
    }

    public sensor() {
    }

    public sensor(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
