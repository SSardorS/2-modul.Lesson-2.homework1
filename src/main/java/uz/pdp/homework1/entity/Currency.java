package uz.pdp.homework1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.homework1.entity.abstractPackage.EntityAbstract;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Currency extends EntityAbstract {
    @ManyToOne
    private Category parentCategoryId;

}
