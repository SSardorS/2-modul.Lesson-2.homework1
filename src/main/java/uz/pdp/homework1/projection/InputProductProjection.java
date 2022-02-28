package uz.pdp.homework1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.Input;
import uz.pdp.homework1.entity.InputProduct;
import uz.pdp.homework1.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductProjection {
    Long getId();

    Product getProduct();

    Double getPrice();

    Date getExpireDate();

    Input getInput();
}
