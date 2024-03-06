
package com.mycompany.carshowroom;

public class Volkswagen {
    int no;
    static int count; 
    private String[] model;
    private int[] year;
    private double[] price;
    private String[] color;

    static{
       count = 1;
    }
    
    public Volkswagen() {
        model = new String[]{"Golf", "Passat", "Tiguan", "Polo", "Arteon", "Touareg", "Up"};
        year = new int[]{2022, 2021, 2020, 2023, 2022, 2021, 2020};
        price = new double[]{4500000, 6000000, 5500000, 3500000, 9000000, 8500000, 2000000};
        color = new String[] {"White", "Black", "Silver", "Red", "Blue", "Grey", "Yellow"};
    }

    public void getVolkswagenCars() {
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
        public static void printVolkswagenInfo() {
            Volkswagen volkswagen = new Volkswagen();
            volkswagen.getVolkswagenCars();
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
