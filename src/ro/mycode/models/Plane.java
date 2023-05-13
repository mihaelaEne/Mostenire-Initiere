package ro.mycode.models;

public class Plane extends Vehicle{
    private String aeroportHome;
    private int nrLocuri;
    private String companie;


    public Plane(String aeroportHome, int nrLocuri, String companie){
        super("PlaneManual", 2,2020,"type3");
      //  System.out.println("Eu sunt const din Plane cu 3 param ");
        this.aeroportHome=aeroportHome;
        this.nrLocuri=nrLocuri;
        this.companie=companie;

    }

    public Plane(String producer, int id, int year,String aeroportHome, int nrLocuri, String companie ){
        super(producer, id, year,"palne");
       // System.out.println("Eu sunt constructorul din Plane cu  (toti param)+ mostenire");
        this.aeroportHome=aeroportHome;
        this.nrLocuri=nrLocuri;
        this.companie=companie;
    }

    public Plane(String producer, int id,String aeroportHome, int nrLocuri, String companie ){
        super(producer, id);
        this.aeroportHome=aeroportHome;
        this.nrLocuri=nrLocuri;
        this.companie=companie;
    }

    public Plane(String producer, String aeroportHome, int nrLocuri, String companie ){
        super(producer);
        this.aeroportHome=aeroportHome;
        this.nrLocuri=nrLocuri;
        this.companie=companie;
    }


    public Plane(String prop){
        super(prop);
        String [] split=prop.split(",");
        this.aeroportHome=split[4];
        this.nrLocuri=Integer.parseInt(split[5]);
        this.companie=split[6];
    }


    public String getAeroportHome() {
        return aeroportHome;
    }

    public void setAeroportHome(String aeroportHome) {
        this.aeroportHome = aeroportHome;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }
    public String descriereAvion(){
        String text="";
        text+="Eu sunt un avion cu urmatoarele propr: "+"\n";
        text += "producer: " + super.getProducer() + "\n";
        text += "id: " + super.getId() + "\n";
        text += "year: " + super.getYear() + "\n";
        text+= "aeroportul Home"+this.aeroportHome+"\n";
        text+="nr Locuri "+this.nrLocuri;
        text+="companie: "+this.companie;
        return text;
    }
}
