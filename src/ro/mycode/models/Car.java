package ro.mycode.models;

public class Car extends Vehicle {
    private String model;
    private String culoare;
    private int nrUsi;

    public Car(String model, String culoare, int nrUsi){

        super("CarManual",1,1993,"type2");
       // System.out.println("Eu sunt constructorul din Car cu 3 param (toti parametrii)");
        this.model=model;
        this.culoare=culoare;
        this.nrUsi=nrUsi;
    }

    public Car(String producer, int id, int year, String model, String culoare, int nrUsi) {
        super(producer, id, year,"car");
       // System.out.println("Eu sunt constructorul din Car cu  (toti parametrii)");
        this.model = model;
        this.culoare = culoare;
        this.nrUsi = nrUsi;
    }

    public Car(String producer, int id, String model, String culoare, int nrUsi) {
        super(producer, id);
        this.model = model;
        this.culoare = culoare;
        this.nrUsi = nrUsi;
    }

    public Car(String producer, String model, String culoare, int nrUsi) {
        super(producer);
        this.model = model;
        this.culoare = culoare;
        this.nrUsi = nrUsi;
    }

    public Car(String prop){
        super(prop);
        String [] split=prop.split(",");
        this.model=split[4];
        this.culoare=split[5];
        this.nrUsi=Integer.parseInt(split[6]);
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public void setNrUsi(int nrUsi) {
        this.nrUsi = nrUsi;
    }
    public String descriereCar() {

        String text = "Eu sunt car cu prorietatile:"+"\n";

        text += "producer: " + super.getProducer() + "\n";
        text += "id: " + super.getId() + "\n";
        text += "year: " + super.getYear() + "\n";
        text += "model: " + this.model+ "\n";
        text += "culoare: " + this.culoare+ "\n";
        text += "nr Usi: " + this.nrUsi;

        return text;
    }
}
