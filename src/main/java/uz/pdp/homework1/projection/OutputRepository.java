package uz.pdp.homework1.projection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.Output;
import uz.pdp.homework1.repository.OutputProjection;

@RepositoryRestResource(path = "output", collectionResourceRel = "OutputList", excerptProjection = OutputProjection.class)
public interface OutputRepository extends JpaRepository<Output, Long> {
}
