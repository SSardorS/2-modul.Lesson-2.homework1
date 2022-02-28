package uz.pdp.homework1.repository;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.Client;
import uz.pdp.homework1.entity.Currency;
import uz.pdp.homework1.entity.Output;
import uz.pdp.homework1.entity.WareHouse;

import java.util.Date;

@Projection(types = Output.class)
public interface OutputProjection {
    Long getId();

    Date getDate();

    WareHouse getWareHouse();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();

    Client getClient();
}
