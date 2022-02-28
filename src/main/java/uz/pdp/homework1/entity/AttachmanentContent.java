package uz.pdp.homework1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class AttachmanentContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] bytes;

    @OneToOne
    private Attachment attachment;
}
