
package com.mycompany.carshowroom;

public class Ford {
    int no;
    static int count; 
    private String[] model;
    private int[] year;
    private double[] price;
    private String[] color;

    static{
       count = 1;
    }
    
    public Ford() {
        model = new String[]{"Mustang", "F-150", "Focus", "Explorer", "Escape", "Edge", "Ranger"};
        year = new int[]{2022, 2021, 2019, 2020, 2023, 2018, 2022};
        price = new double[]{5950000, 8200000, 4000000, 6700000, 3500000, 4800000, 5600000};
        color = new String[] {"Red", "Black", "Blue", "White", "Silver", "Grey", "Green"};
    }

    public void getFordCars() {
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
        public static void printFordInfo() {
            Ford ford = new Ford();
            ford.getFordCars();
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
