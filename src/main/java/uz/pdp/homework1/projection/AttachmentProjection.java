package uz.pdp.homework1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.Attachment;

@Projection(types = Attachment.class)
public interface AttachmentProjection {
    Long getId();

    String getOrginalName();

    String getGeneretedName();

    String getContentType();

    Long getSize();

}
