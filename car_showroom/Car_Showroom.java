package car_showroom;

public class Car_Showroom {
    int no;
    static int count = 1;
    private String name = "A... MOTORS....";
    private String address = "12 street....";
    private String[] cars;
    
    public Car_Showroom() {
        cars = new String[]{
            "Toyota", "Ford", "Volkswagen", "Honda", "Nissan", "BMW", "Mercedes-Benz",
            "Audi", "Hyundai", "Kia", "Lexus", "Subaru", "Tesla", "Renault", "Porsche",
            "Peugeot", "Mitsubishi", "Rolls-Royce", "Bentley", "Lamborghini", "Ferrari",
            "Aston Martin", "Maserati", "Bugatti", "Alfa Romeo", "McLaren", "Citroën",
            "Opel", "Skoda", "SEAT"
        };
    }
        public void getCars() {
            System.out.println(name); 
            System.out.println(address);    
            for (String car : cars) {
                this.no = count;
                System.out.println(this.no + ": ");
                System.out.println(car);
                System.out.println("------------------");
                count++;
            }
    }
}

    
    
    
    
    
