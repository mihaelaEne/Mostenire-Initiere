import ro.mycode.controllers.VehicleController;
import ro.mycode.models.Car;

public class Main {
    public static void main(String[] args) {
//
//        Car c1=new Car("model1", "culoare1",2);
//        Car c2=new Car("model2", "culoare2",2);
//        Car c3=new Car("producator1", 1,2010,"model3", "culoare3",3);
//
//        System.out.println(c3.descriereCar());

        VehicleController vehicleController=new VehicleController();
      //vehicleController.afisareVehicul();

        System.out.println(vehicleController.getNumberOfBarci());
    }
}