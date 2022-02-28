package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.Users;
import uz.pdp.homework1.projection.AttachmentContentProjection;
import uz.pdp.homework1.projection.UsersProjection;

@RepositoryRestResource(path = "users", collectionResourceRel = "UsersList", excerptProjection = UsersProjection.class)
public interface UserRepository extends JpaRepository<Users, Long> {
}
