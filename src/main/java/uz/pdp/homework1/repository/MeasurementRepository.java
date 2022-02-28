package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.Measurement;
import uz.pdp.homework1.projection.MeasurementProjection;

@RepositoryRestResource(path = "measurement", collectionResourceRel = "measurement", excerptProjection = MeasurementProjection.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
}
