package uz.pdp.homework1.projection;

import uz.pdp.homework1.entity.OutputProduct;
import uz.pdp.homework1.entity.Product;

public interface OutputProductProjection {

    Long getId();


    Product getProduct();

    Double getPrice();

    Double getAmount();

    OutputProduct getOutput();
}
