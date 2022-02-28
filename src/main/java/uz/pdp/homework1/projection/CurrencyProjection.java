package uz.pdp.homework1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.Category;
import uz.pdp.homework1.entity.Currency;
import uz.pdp.homework1.projection.helper.InterfaceEntity;

@Projection(types = Currency.class)
public interface CurrencyProjection extends InterfaceEntity {

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

    Category getParentCategoryId();
}
