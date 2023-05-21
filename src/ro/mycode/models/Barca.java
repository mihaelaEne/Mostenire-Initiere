package ro.mycode.models;

public class Barca extends Vehicle {
    private int nrKg;
    private String nume;
    private String port;


    public Barca(int nrKg, String nume, String port) {
        super("BarcaManual", 1, 1993, "type1");
        // System.out.println("Eu sunt constructorul din Barca cu 3 param (toti parametrii)");
        this.nrKg = nrKg;
        this.nume = nume;
        this.port = port;
    }

    public Barca(String producer, int id, int year, int nrKg, String nume, String port) {
        super(producer, id, year, "barca");
        // System.out.println("Eu sunt constructorul din Barca cu toti param, si din veh");

        this.nrKg = nrKg;
        this.nume = nume;
        this.port = port;
    }

    public Barca(String producer, int id, int nrKg, String nume, String port) {
        super(producer, id);
        this.nrKg = nrKg;
        this.nume = nume;
        this.port = port;
    }

    public Barca(String producer, int nrKg, String nume, String port) {
        super(producer);
        this.nrKg = nrKg;
        this.nume = nume;
        this.port = port;
    }

    public Barca(String prop) {
        super(prop);
        String[] split = prop.split(",");
        this.nrKg = Integer.parseInt(split[4]);
        this.nume = split[5];
        this.port = split[6];
    }

    public int getNrKg() {
        return nrKg;
    }

    public void setNrKg(int nrKg) {
        this.nrKg = nrKg;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String descriereBarca() {
        String text = "";
        text += "Eu sunt o barca cu urm prop: ";
        text += "producer: " + super.getProducer() + "\n";
        text += "id: " + super.getId() + "\n";
        text += "year: " + super.getYear() + "\n";
        text += "nr kg: " + this.nrKg + "\n";
        text += "nume: " + this.nume + "\n";
        text += "port: " + this.port;

        return text;
    }

    public String toSaveBarca(){return super.toSaveVehicle()+","+nrKg+","+nume+","+port;}
}
