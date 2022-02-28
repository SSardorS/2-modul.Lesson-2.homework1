package uz.pdp.homework1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.Supplier;
import uz.pdp.homework1.entity.WareHouse;
import uz.pdp.homework1.projection.helper.InterfaceEntity;

@Projection(types = WareHouse.class)
public interface WareHouseProjection  {
//    @Override
//    default Long getId() {
//        return InterfaceEntity.super.getId();
//    }
//
//    @Override
//    default String getName() {
//        return InterfaceEntity.super.getName();
//    }
//
//    @Override
//    default boolean getActive() {
//        return InterfaceEntity.super.getActive();
//    }

    Long getId();

    String getName();

    boolean getActive();
}
