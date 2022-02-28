package uz.pdp.homework1.projection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.Category;
import uz.pdp.homework1.repository.CategoryRepository;

@Projection(types = Category.class)
public interface CategoryProjection {


    Long getId();

    String getName();

    String getActive();

    Category getParentCategoryId();

}
