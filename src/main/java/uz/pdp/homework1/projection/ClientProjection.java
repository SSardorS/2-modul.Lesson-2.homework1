package uz.pdp.homework1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.Client;

@Projection(types = Client.class)
public interface ClientProjection {

    Long getId();

    String getName();

    String getPhoneNumber();
}
