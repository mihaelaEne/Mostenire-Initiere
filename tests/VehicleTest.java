import org.junit.jupiter.api.Test;
import ro.mycode.models.Barca;
import ro.mycode.models.Car;
import ro.mycode.models.Plane;
import ro.mycode.models.Vehicle;

public class VehicleTest {

    @Test
    public void ex(){


        Car c1 = new Car("modelMasina1", "albastru", 4);
        Car c2 = new Car("modelMasina2", "negru", 4);
        Car c3 = new Car("modelMasina3", "visinie", 4);


        Plane p1 = new Plane("OTP", 100, "Tarom");
        Plane p2 = new Plane("BCM", 200, "WizzAir");
        Plane p3 = new Plane("SUJ", 300, "Rynair");


      Barca b1 = new Barca(1000, "numeBarca1", "port1");
        Barca b2 = new Barca(2000, "numeBarca2", "port2");
        Barca b3 = new Barca(3000, "numeBarca3", "port3");



        Vehicle vehicle=b1;


        vehicle=p2;

        


        System.out.println(vehicle.descriereVehicle());

    }





}
