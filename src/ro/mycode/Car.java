package ro.mycode;

public class Car extends Vehicle {
    private String model;
    private String culoare;
    private int nrUsi;

    public Car(String model, String culoare, int nrUsi){

        super("test",1,1993);
        System.out.println("Eu sunt constructorul din Car cu 3 param (toti parametrii)");
        this.model=model;
        this.culoare=culoare;
        this.nrUsi=nrUsi;
    }

    public Car(String producer, int id, int year, String model, String culoare, int nrUsi) {
        super(producer, id, year);
        System.out.println("Eu sunt constructorul din Car cu  (toti parametrii)");
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

    public String descriereCar() {

        String text = "Eu sunt car cu prorietatile:";

        text += "producer: " + super.getProducer() + "\n";
        text += "id: " + super.getId() + "\n";
        text += "year: " + super.getYear() + "\n";
        text += " model: " + this.model;
        text += " culoare: " + this.culoare;
        text += "nr Usi: " + this.nrUsi;

        return text;
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
}
