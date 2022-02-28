package uz.pdp.homework1.entity;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.homework1.entity.abstractPackage.EntityAbstract;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product extends EntityAbstract {

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment photo;

    private String code;

    @ManyToOne
    private Measurement measurement;

}
