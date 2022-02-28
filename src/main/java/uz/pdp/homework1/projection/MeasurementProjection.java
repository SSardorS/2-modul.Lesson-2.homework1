package uz.pdp.homework1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.homework1.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementProjection {
    Long getId();

    String getName();

    String getActive();
}
