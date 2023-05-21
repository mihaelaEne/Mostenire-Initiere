package ro.mycode.view;

import ro.mycode.controllers.VehicleController;
import ro.mycode.models.Vehicle;

import java.util.Scanner;
import java.util.SortedMap;

public class ViewVehicle {
    private Scanner scanner;
    private VehicleController vehicleController;




    public ViewVehicle() {
        vehicleController = new VehicleController();
        scanner = new Scanner(System.in);
        play();
    }

    public void meniu() {
        System.out.println("Buna ziua!");
        System.out.println("Apasa tasta 1 pentru a afisa toate vehiculele");
        System.out.println("Apasa tasta 2 pentru a adauga un vehicul ");
        System.out.println("Apasa tasta 3 pentru a sterge un vehicul ");
        System.out.println("Apasa tasta 4 pentru a salva si a te deloga");
    }

    public void play() {
        int alegere = 0;
        boolean running = true;
        while (running) {
            meniu();
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    vehicleController.afisareVehicul();
                    break;
                case 2:
                    adaugareVehicle();
                    break;
                case 3:
                    stergereVehicle();
                    break;
                case 4:
                    running=false;
                    vehicleController.toSave();
                    break;
                default:
                    System.out.println("Alegere incorecta");
                    break;

            }
        }
    }

    private void adaugareVehicle() {
        System.out.println("Producer:");
        String producer = scanner.nextLine();
        System.out.println("Id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Year:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Type:");
        String type = scanner.nextLine();

        Vehicle vehicle = vehicleController.findById(id);

        if (vehicle == null) {
            Vehicle vNou = new Vehicle(producer, id, year, type);
            vehicleController.addVehicle(vNou);
        } else {
            System.out.println("Vehiculul exista deja");
        }
    }


    private void stergereVehicle() {
        System.out.println("Introduceti id-ul: ");
        int id = Integer.parseInt(scanner.nextLine());
        Vehicle vehicle = vehicleController.findById(id);
        if (vehicle == null) {
            System.out.println("Nu exista vehiculul ");
        } else {
            vehicleController.removeVehicle(vehicle);
            System.out.println("Vehiculul a fost sters");
        }
    }


}
