package uz.pdp.homework1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.homework1.entity.abstractPackage.EntityAbstract;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Category extends EntityAbstract {

    @ManyToOne
    private Category parentCategoryId;

}
