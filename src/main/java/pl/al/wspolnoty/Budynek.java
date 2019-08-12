package pl.al.wspolnoty;

import javax.persistence.*;

@Entity
public class Budynek {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String number;
    @ManyToOne
    private Wspolnota wspolnota;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Wspolnota getWspolnota() {
        return wspolnota;
    }

    public void setWspolnota(Wspolnota wspolnota) {
        this.wspolnota = wspolnota;
    }

    public Budynek() {
    }

    public Budynek(String street, String number, Wspolnota wspolnota) {
        this.street = street;
        this.number = number;
        this.wspolnota = wspolnota;
    }
}
