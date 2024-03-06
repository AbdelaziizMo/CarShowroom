
package com.mycompany.carshowroom;

public class Nissan {
    int no;
    static int count; 
    private String[] model;
    private int[] year;
    private double[] price;
    private String[] color;

    static{
       count = 1;
    }
    
    public Nissan() {
        model = new String[]{"Altima", "Maxima", "Sentra", "Rogue", "Pathfinder", "370Z", "GT-R"};
        year = new int[]{2022, 2021, 2020, 2023, 2022, 2021, 2020};
        price = new double[]{2550000, 3500000, 1800000, 4200000, 5500000, 6000000, 10500000};
        color = new String[] {"Black", "White", "Silver", "Red", "Blue", "Grey", "Yellow"};
    }

    public void getNissanCars() {
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
        public static void printNissanInfo() {
            Nissan nissan = new Nissan();
            nissan.getNissanCars();
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