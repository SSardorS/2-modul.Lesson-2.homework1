package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.Category;
import uz.pdp.homework1.projection.CategoryProjection;

@RepositoryRestResource(path = "category", collectionResourceRel = "Category List", excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
