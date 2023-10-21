package transport_and_cargo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "transport")
@ToString
@Getter
@Setter
public class Transport {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int type;

    public Transport() {
    }

    public Transport(String name, int type) {
        this.name = name;
        this.type = type;
    }
}
