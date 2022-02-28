package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.Supplier;
import uz.pdp.homework1.projection.InputProductProjection;
import uz.pdp.homework1.projection.SupplierProjection;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "Supplier", excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
