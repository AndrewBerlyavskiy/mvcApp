package web.model;

import org.springframework.stereotype.Component;

public class Car {
    private String name;
    private String model;
    private int year;

    public Car () {

    }
    public Car (String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString () {
        return name + " " + model + " " + year;
    }
}
