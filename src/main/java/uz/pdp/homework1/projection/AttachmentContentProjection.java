package uz.pdp.homework1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.AttachmanentContent;
import uz.pdp.homework1.entity.Attachment;

@Projection(types = AttachmanentContent.class)
public interface AttachmentContentProjection {
    Long getId();

    byte[] getBytes();

    Attachment getAttachment();
}
