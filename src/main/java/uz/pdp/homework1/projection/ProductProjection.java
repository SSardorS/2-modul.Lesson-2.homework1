package uz.pdp.homework1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.Attachment;
import uz.pdp.homework1.entity.Category;
import uz.pdp.homework1.entity.Measurement;
import uz.pdp.homework1.entity.Product;
import uz.pdp.homework1.projection.helper.InterfaceEntity;

@Projection(types = Product.class)
public interface ProductProjection extends InterfaceEntity {
    @Override
    default Long getId() {
        return InterfaceEntity.super.getId();
    }

    @Override
    default String getName() {
        return InterfaceEntity.super.getName();
    }

    @Override
    default boolean getActive() {
        return InterfaceEntity.super.getActive();
    }

    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();
}
