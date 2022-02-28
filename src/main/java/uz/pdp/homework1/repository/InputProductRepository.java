package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.InputProduct;
import uz.pdp.homework1.projection.InputProductProjection;
import uz.pdp.homework1.projection.MeasurementProjection;

@RepositoryRestResource(path = "inputProduct", collectionResourceRel = "InputProduct", excerptProjection = InputProductProjection.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Long> {
}
