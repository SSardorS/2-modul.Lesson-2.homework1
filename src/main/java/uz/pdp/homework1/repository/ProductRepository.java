package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.Product;
import uz.pdp.homework1.projection.ProductProjection;

@RepositoryRestResource(path = "product", collectionResourceRel = "ProductList", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Long> {
}
