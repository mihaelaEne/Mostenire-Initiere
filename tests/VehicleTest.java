import org.junit.jupiter.api.Test;
import ro.mycode.models.Barca;
import ro.mycode.models.Car;
import ro.mycode.models.Plane;
import ro.mycode.models.Vehicle;

import java.util.ArrayList;

public class VehicleTest {

    @Test
    public void ex() {


        Car c1 = new Car("producator1",1111,2023,"modelMasina1", "albastru", 4);
        Car c2 = new Car("modelMasina2", "negru", 4);
        Car c3 = new Car("modelMasina3", "visinie", 4);


        Plane p1 = new Plane("OTP", 100, "Tarom");
        Plane p2 = new Plane("BCM", 200, "WizzAir");
        Plane p3 = new Plane("SUJ", 300, "Rynair");


        Barca b1 = new Barca(1000, "numeBarca1", "port1");
        Barca b2 = new Barca(2000, "numeBarca2", "port2");
        Barca b3 = new Barca(3000, "numeBarca3", "port3");


//        Vehicle vehicle = b1;
//        vehicle = p2;
//        System.out.println(vehicle.descriereVehicle());


        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(c3);

        vehicles.add(p1);
        vehicles.add(p2);
        vehicles.add(p3);

        vehicles.add(b1);
        vehicles.add(b2);
        vehicles.add(b3);


        for(int i=0; i<vehicles.size();i++){

          if(vehicles.get(i) instanceof Car){
              Car car=(Car)vehicles.get(i);
              System.out.println(car.descriereCar());
          }

            if(vehicles.get(i) instanceof Plane){
                Plane plane=(Plane)vehicles.get(i);
                System.out.println(plane.descriereAvion());
            }
            if(vehicles.get(i) instanceof Barca){
                Barca barca =(Barca) vehicles.get(i);
                System.out.println(barca.descriereBarca());
            }

            System.out.println("\n");
        }



    }


}
