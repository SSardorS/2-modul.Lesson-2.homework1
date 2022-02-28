package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.WareHouse;
import uz.pdp.homework1.projection.AttachmentContentProjection;
import uz.pdp.homework1.projection.WareHouseProjection;

@RepositoryRestResource(path = "wareHouse", collectionResourceRel = "WareHouseList", excerptProjection = WareHouseProjection.class)
public interface WareHouseRepository extends JpaRepository<WareHouse, Long> {
}
