package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.Currency;
import uz.pdp.homework1.projection.MeasurementProjection;

@RepositoryRestResource(path = "currency", collectionResourceRel = "measurement", excerptProjection = MeasurementProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
