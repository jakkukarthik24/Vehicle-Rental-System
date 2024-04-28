import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentalSystem rental=new RentalSystem();
        Car car1 = new Car("Suzuki","Swift","Ts1",2015,700.0,5,"Diesel");
        Car car2= new Car("Toyota","Innova","Ts2",2020,1000.0,7, "Petrol");
        Car car3 = new Car("Tata","Punch","Ts3",2022,700.0,5,"Diesel");
        Car car4= new Car("Mahindra","XUV700","Ts4",2020,1100.0,7, "Diesel");
        Car car5 = new Car("Ford","Eco sport","Ts5",2019,900.0,5,"Petrol");
        rental.addCar(car1);
        rental.addCar(car2);
        rental.addCar(car3);
        rental.addCar(car4);
        rental.addCar(car5);
        Bike bike1=new Bike("Hero Honda","Passion pro","ts6",2004,200.0,false);
        Bike bike2=new Bike("Jawa","Bobber","ts7",2024,500.0,true);
        Bike bike3=new Bike("RE","Classic","ts8",2021,450.0,true);
        Bike bike4=new Bike("Duke","300","ts9",2022,400.0,false);
        Bike bike5=new Bike("Honda","Activa","ts10",2024,400.0,true);
        rental.addBike(bike1);
        rental.addBike(bike2);
        rental.addBike(bike3);
        rental.addBike(bike4);
        rental.addBike(bike5);

        while(true){
            System.out.println();
            System.out.println("*****===== Vehicle Rental System =====*****");
            System.out.println();
            System.out.println("1. Rent a Vehicle");
            System.out.println("2. Return a Vehicle");
            System.out.println("3. Display complete rental information");
            System.out.println("4. Exit the system");
            System.out.println();
            System.out.println("Enter  your choice: ");
            int ch=sc.nextInt();
            switch (ch) {
                case 1 : {
                    System.out.println("1. Rent a Car");
                    System.out.println("2. Rent a Bike");
                    System.out.println("Enter your choice :");
                    int n=sc.nextInt();
                    sc.nextLine();
                    if(n==1){
                        rental.displayAvailableCars();
                        System.out.println("Enter Brand");
                        String brand=sc.nextLine();
                        System.out.println("Enter Model");
                        String model=sc.nextLine();
                        Car selected=null;
                        for(Car car : rental.getAvailableCars()){
                            if(car.getBrand().equalsIgnoreCase(brand) && car.getModel().equalsIgnoreCase(model)){
                                selected=car;
                            }
                        }
                        if(selected!=null){
                            rental.rentCar(selected);
                            selected.displayInfo();
                            System.out.println("Enter rental duration in days");
                            int days=sc.nextInt();
                            double rent=rental.calculateRent(selected.getRate(), days);
                            System.out.println("Total amount to be paid is "+rent);
                        }
                        else{
                            System.out.println("No such vehicle available!");
                        }
                    }
                    else if(n==2){
                        rental.displayAvailableBikes();
                        System.out.println("Enter Brand");
                        String brand=sc.nextLine();
                        System.out.println("Enter Model");
                        String model=sc.nextLine();
                        Bike selected = null;
                        for(Bike bike : rental.getAvailableBikes()){
                            if(bike.getBrand().equalsIgnoreCase(brand) && bike.getModel().equalsIgnoreCase(model)){
                                selected=bike;
                            }
                        }
                        if(selected!=null){
                            rental.rentBike(selected);
                            selected.displayInfo();
                            System.out.println("Enter rental duration in days");
                            int days=sc.nextInt();
                            double rent=rental.calculateRent(selected.getRate(), days);
                            System.out.println("Total amount to be paid is "+rent);
                        }
                        else{
                            System.out.println("No such vehicle available!");
                        }
                    }
                    else{
                        System.out.println("You have entered a wrong option");
                    }
                    break;
                }

                case 2:{
                    System.out.println("1. Return a Car");
                    System.out.println("2. Return a Bike");
                    System.out.println("Enter your choice : ");
                    int n1=sc.nextInt();
                    sc.nextLine();
                    if(n1==1){
                        rental.displayRentedCars();
                        System.out.println("Enter Brand : ");
                        String brand=sc.nextLine();
                        System.out.println("Enter Model : ");
                        String model=sc.nextLine();
                        Car selected=null;
                        for(Car car : rental.getRenCars()){
                            if(car.getBrand().equalsIgnoreCase(brand) && car.getModel().equalsIgnoreCase(model)){
                                selected=car;
                            }
                        }
                        if(selected!=null){
                            rental.returnCar(selected);
                            System.out.println("Car returned successfully");
                        }
                        else{
                            System.out.println("Car not rented ! ");
                        }
                    }
                    else if(n1==2){
                        rental.displayRentedBikes();
                        System.out.println("Enter Brand : ");
                        String brand=sc.nextLine();
                        System.out.println("Enter Model : ");
                        String model=sc.nextLine();
                        Bike selected=null;
                        for(Bike bike : rental.getRentedBikes()){
                            if(bike.getBrand().equalsIgnoreCase(brand) && bike.getModel().equalsIgnoreCase(model)){
                                selected=bike;
                            }
                        }
                        if(selected!=null){
                            rental.returnBike(selected);
                            System.out.println("Bike returned successfully");
                        }
                        else{
                            System.out.println("Bike not rented ! ");
                        }

                    }
                    break;
                
                }
                case 3: {
                    rental.displayRentalInfo();
                    break;  
                }
                case 4: {
                    System.out.println("Thank you for using the rental service...");
                    sc.close();
                    System.exit(0);
                }
                default: {
                    System.out.println( "Invalid choice! Please enter a valid option.");
                    continue;
                }
            }
        }
    }
    
}
