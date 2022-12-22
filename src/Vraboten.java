//Класа вработен, со приватни атрибути за име, презиме и плата.
public class Vraboten {
    private String ime;
    private String prezime;
    private Double plata;

    public Vraboten(String ime, String prezime, Double plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.plata = plata;
    }

    public  String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Double getPlata() {
        return plata;
    }

    public void setPlata(Double plata) {
        this.plata = plata;
    }
}
