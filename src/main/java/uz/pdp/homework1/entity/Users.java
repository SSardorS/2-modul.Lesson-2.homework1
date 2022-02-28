package uz.pdp.homework1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false)
    private String password;

    private boolean active;

    @ManyToMany
    private Set<WareHouse> wareHouse;
}
