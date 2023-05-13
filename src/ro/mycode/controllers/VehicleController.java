package ro.mycode.controllers;

import ro.mycode.models.Barca;
import ro.mycode.models.Car;
import ro.mycode.models.Plane;
import ro.mycode.models.Vehicle;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleController {


    private ArrayList<Vehicle> vehicles;

    public VehicleController(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public VehicleController() {
        this.vehicles = new ArrayList<>();
        this.load();
    }


    public void load() {
        try {
            File file = new File("C:\\mycode\\OOP\\mostenirea\\mostenireaInitiere\\src\\ro\\mycode\\data\\vehicle.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                switch (text.split(",")[0]) {
                    case "Car":
                        this.vehicles.add(new Car(text));
                        break;
                    case "Barca":
                        this.vehicles.add(new Barca(text));
                        break;
                    case "Plane":
                        this.vehicles.add(new Plane(text));
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisareVehicul() {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) instanceof Car) {
                Car car = (Car) vehicles.get(i);
                System.out.println(car.descriereCar());
                System.out.println("\n");
            }else if (vehicles.get(i) instanceof Plane) {
                Plane plane = (Plane) vehicles.get(i);
                System.out.println(plane.descriereAvion());
                System.out.println("\n");
            }else{
                Barca barca = (Barca) vehicles.get(i);
                System.out.println(barca.descriereBarca());
                System.out.println("\n");
            }
        }
    }


}



