package ro.mycode.models;

public class Vehicle {
    private String producer = "";
    private int id = 0;
    private int year = 0;

    private String type;


    public Vehicle(String prop) {
        String[] split = prop.split(",");
        this.type=split[0];
        this.producer = split[1];
        this.id = Integer.parseInt(split[2]);
        this.year = Integer.parseInt(split[3]);

    }

    public Vehicle() {
        System.out.println("eu sunt constructorul fara parametrii");
    }

    public Vehicle(String producer, int id, int year, String type) {
        // System.out.println("eu sunt constructorul cu 3 parametrii(toti param) din vehicul");
        this.producer = producer;
        this.id = id;
        this.year = year;
        this.type = type;
    }

    public Vehicle(String producer, int id) {
        //System.out.println("eu sunt constructorul cu 2 parametrii");
        this.producer = producer;
        this.id = id;
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String descriereVehicle() {
        return "Eu sunt un vehicul de la:  " + this.producer + "\n constuit in anul:" + this.year + "\n id-ul:" + this.id;
    }


    public String toSaveVehicle(){
        return type+","+producer+","+id+","+year;
    }
}

