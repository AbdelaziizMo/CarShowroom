
package com.mycompany.carshowroom;

public class Toyota {
    int no;
    static int count; 
    private String[] model;
    private int[] year;
    private double[] price;
    private String[] color;

    static{
       count = 1;
    }
    
    public Toyota() {
        model = new String[]{"Camry", "Corolla", "Prius", "Hilux", "Land Cruiser", "RAV4", "Yaris"};
        year = new int[]{2022, 2021, 2020, 2023, 2022, 2021, 2020};
        price = new double[]{6500000, 5500000, 3800000, 7500000, 12500000, 4200000, 3200000};
        color = new String[] {"Silver", "Red", "White", "Black", "Blue", "Grey", "Green"};
    }

    public void getToyotaCars() {
        for (int i = 0; i < model.length; i++) {
            this.no = count;
            System.out.println(this.no + ": ");
            System.out.println(model[i]);
            System.out.println("Year is " + year[i]);
            System.out.println("Price is " + price[i]);
            System.out.println("Color is " + color[i]);
            System.out.println("------------------");
            count++;
        }
    }

    public static class CarUtils {
        public static void printToyotaInfo() {
            Toyota toyota = new Toyota();
            toyota.getToyotaCars();
        }
    }
    
    public String[] getModel() {
        return model;
    }

    public void setModel(String[] model) {
        this.model = model;
    }

    public int[] getYear() {
        return year;
    }

    public void setYear(int[] year) {
        this.year = year;
    }

    public double[] getPrice() {
        return price;
    }

    public void setPrice(double[] price) {
        this.price = price;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }
}

