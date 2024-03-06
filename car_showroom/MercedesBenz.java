
package com.mycompany.carshowroom;

public class MercedesBenz {
    int no;
    static int count; 
    private String[] model;
    private int[] year;
    private double[] price;
    private String[] color;

    static{
       count = 1;
    }
    
    public MercedesBenz() {
        model = new String[]{"C-Class", "E-Class", "S-Class", "GLC", "GLE", "GLA", "AMG GT"};
        year = new int[]{2022, 2021, 2020, 2023, 2022, 2021, 2020};
        price = new double[]{4500000, 6000000, 9500000, 3500000, 5500000, 3000000, 11000000};
        color = new String[] {"Black", "White", "Silver", "Red", "Blue", "Grey", "Yellow"};
    }

    public void getMercedesBenzCars() {
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
        public static void printMercedesBenzInfo() {
            MercedesBenz mercedesBenz = new MercedesBenz();
            mercedesBenz.getMercedesBenzCars();
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
