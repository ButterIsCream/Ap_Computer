package Prog702q;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog702q.txt"));

            ArrayList<Vehicle> vehicles = new ArrayList<>();

            while(input.hasNext()) {
                int type = input.nextInt();
                String name = input.next();
                int tires = input.nextInt();

                if(type == 1) {
                    double worth = input.nextDouble();
                    vehicles.add(new Car(type,name,tires,worth));
                } else if(type == 2) {
                    double miles = input.nextDouble();
                    vehicles.add(new Truck(type,name,tires,miles));
                } else {
                    String city = input.next();
                    vehicles.add(new Buss(type,name,tires,city));
                }
            }

            System.out.println("Total Number of Vehciles : " + vehicles.size());
            double carWorth = 0;
            double totalWorth = 0;
            String truckName = "";
            String city = "";
            int length = 0;
            int leastMiles = 1000000000;
            int t1 = 0;
            int t2 = 0;
            int t3 = 0;

            for(Vehicle vehicle : vehicles) {
                if(vehicle.getType() == 1) {
                    carWorth += vehicle.getValue();
                    t1 += vehicle.getTire();
                }

                if(vehicle.getType() == 3) {
                    String c = ((Buss)vehicle).getCity();

                    if(c.length() > length) {
                        length = c.length();
                        city = c;
                    }

                    t3 += vehicle.getTire();
                }

                if(vehicle.getType() == 2) {
                    double value = ((Truck)vehicle).getMiles();

                    if(leastMiles < value) {
                        leastMiles = (int)value;
                        truckName = vehicle.getName();
                    }

                    t2 += vehicle.getTire();
                }

                totalWorth += vehicle.getValue();
            }

            System.out.println("Total amount of worth : " + totalWorth);
            System.out.println("Cars are worth : " + carWorth);
            System.out.println("Longest Home Destination : " + city);
            System.out.println("Truck with least miles : " + leastMiles);
            System.out.println("Cars Tires : " + t1 + "\t" + "Truck Tires : " + t2 + "\t" + "Buss Tires : " + t3);
        } catch (IOException e) {

        }
    }
}
