package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.Client;
import uz.pdp.homework1.projection.ClientProjection;

@RepositoryRestResource(path = "client", collectionResourceRel = "Client", excerptProjection = ClientProjection.class)
public interface ClientRepository extends JpaRepository<Client, Long> {
}
