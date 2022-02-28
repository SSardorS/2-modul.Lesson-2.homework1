package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.Attachment;
import uz.pdp.homework1.projection.AttachmentProjection;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "AttachmentList", excerptProjection = AttachmentProjection.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
