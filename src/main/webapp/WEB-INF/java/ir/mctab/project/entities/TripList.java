package ir.mctab.project.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TripList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String origin;
    @Column
    private String destination;
    @Column
    private Date date;
    @Column
    private int price;

    @Override
    public String toString() {
        return "TripList{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", date=" + date +
                ", price=" + price + " tomans"+
                '}';
    }

    public TripList() {
    }
}
