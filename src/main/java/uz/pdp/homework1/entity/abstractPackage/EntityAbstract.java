package uz.pdp.homework1.entity.abstractPackage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public abstract class EntityAbstract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private boolean active;

    public EntityAbstract(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
