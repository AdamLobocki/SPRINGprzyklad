package pl.al.wspolnoty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Wspolnota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;
    @OneToMany(mappedBy = "wspolnota")
    private List<Budynek> budynek;

    public List<Budynek> getBudynek() {
        return budynek;
    }

    public void setBudynek(List<Budynek> budynek) {
        this.budynek = budynek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wspolnota() {
    }

    public Wspolnota(String name) {
        this.name = name;
    }
}
