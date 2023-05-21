package ro.mycode.controllers;

import ro.mycode.models.Barca;
import ro.mycode.models.Car;
import ro.mycode.models.Plane;
import ro.mycode.models.Vehicle;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleController {

    private Scanner scanner;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Barca> barci;
    private ArrayList<Car> cars;
    private ArrayList<Plane> planes;

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

    public void addVehicle(Vehicle vehicle){this.vehicles.add(vehicle);}
    public void removeVehicle(Vehicle vehicle){this.vehicles.remove(vehicle);}
    public int getNumberOfBarci() {
        int nrBarci = 0;

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) instanceof Barca) {
                nrBarci++;
            }
        }
        return nrBarci;
    }

    public String toSave() {
        String text="";
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) instanceof Car) {
                Car car = (Car) vehicles.get(i);
                text+=car.toSaveCar()+"\n";

            }else if (vehicles.get(i) instanceof Plane) {
                Plane plane = (Plane) vehicles.get(i);
                text+=plane.toSavePlane()+"\n";

            }else{
                Barca barca = (Barca) vehicles.get(i);

                text+=barca.toSaveBarca()+"\n";

            }
        }
        return text;
    }

    public void save(){
        try {
            File file=new File("C:\\mycode\\OOP\\mostenirea\\mostenireaInitiere\\src\\ro\\mycode\\data\\vehicle.txt");
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(fileWriter);
           printWriter.print(toSave());
           printWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public Vehicle findById(int id){
        for(int i=0; i<vehicles.size(); i++){
            if(vehicles.get(i).getId()==id){
                return vehicles.get(i);
            }
        }
        return null;
    }



}

