package transport_and_cargo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "cargo")
@Getter
@Setter
@ToString
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int type;

    public Cargo() {
    }

    public Cargo(String name, int type) {
        this.name = name;
        this.type = type;
    }
}
