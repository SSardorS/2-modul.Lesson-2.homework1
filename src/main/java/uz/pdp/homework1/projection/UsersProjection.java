package uz.pdp.homework1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.Supplier;
import uz.pdp.homework1.entity.Users;
import uz.pdp.homework1.entity.WareHouse;

import java.util.Set;

@Projection(types = Users.class)
public interface UsersProjection {
    Long getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    boolean getActive();

    Set<WareHouse> getWareHouse();

}
