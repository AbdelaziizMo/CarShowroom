
package car_showroom;

public class BMW extends CompanyName {
    int no;
    static int count; 
    private String[] model;
    private int[] year;
    private double[] price;
    private String[] color;

    static{
       count = 1;
    }

    public BMW(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }
    
    /*public BMW() {
        model = new String[]{"M3", "X7", "M5", "Z4", "X5", "320I", "I8"};
        year = new int[]{2022, 2019, 2018, 2020, 2017, 2023, 2020};
        price = new double[]{7500000, 5850000, 9720000, 16402970, 3000000, 2400000, 2750000};
        color = new String[] {"Black", "Blue", "White", "Red", "Grey", "Black", "Brown"};
    }*/

    public void getBMWCars() {
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
/*
    public static class CarUtils {
        public static void printBMWInfo() {
            BMW bmw = new BMW();
            bmw.getBMWCars();
        }
    }
  */  
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
