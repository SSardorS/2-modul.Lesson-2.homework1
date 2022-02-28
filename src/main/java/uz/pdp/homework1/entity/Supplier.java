package uz.pdp.homework1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.homework1.entity.abstractPackage.EntityAbstract;

import javax.persistence.Column;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Supplier extends EntityAbstract {

    @Column(nullable = false)
    private String phoneNumber;
}
