package uz.pdp.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.homework1.entity.AttachmanentContent;
import uz.pdp.homework1.entity.Attachment;
import uz.pdp.homework1.projection.AttachmentContentProjection;

@RepositoryRestResource(path = "attachamentContent", collectionResourceRel = "AttachmentContentList", excerptProjection = AttachmentContentProjection.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmanentContent, Long> {

}
