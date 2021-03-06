package uz.pdp.homework1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Output  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    @ManyToOne
    private WareHouse wareHouse;

    @ManyToOne
    private Currency currency;

    private String factureNumber;

    @Column(unique = true, nullable = false)
    private String code;

    @ManyToOne
    private Client client;

}
