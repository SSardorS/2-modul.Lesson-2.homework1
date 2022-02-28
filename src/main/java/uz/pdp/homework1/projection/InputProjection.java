package uz.pdp.homework1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.Currency;
import uz.pdp.homework1.entity.Input;
import uz.pdp.homework1.entity.Supplier;
import uz.pdp.homework1.entity.WareHouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface InputProjection {
    Long getId();

    Timestamp getDate();

    WareHouse getWareHouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
