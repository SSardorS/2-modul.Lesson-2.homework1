package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.Input;
import uz.pdp.homework1.projection.InputProjection;

@RepositoryRestResource(path = "input", collectionResourceRel = "InputList", excerptProjection = InputProjection.class)
public interface InputRepository extends JpaRepository<Input, Long> {
}
