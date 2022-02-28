package uz.pdp.homework1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.Supplier;
import uz.pdp.homework1.projection.helper.InterfaceEntity;


@Projection(types = Supplier.class)
public interface SupplierProjection extends InterfaceEntity {
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

    String getPhoneNumber();
}
