package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.OutputProduct;
import uz.pdp.homework1.projection.OutputProductProjection;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "OutputList", excerptProjection = OutputProductProjection.class)
public interface OutPutProductRepository extends JpaRepository<OutputProduct, Long> {
}
