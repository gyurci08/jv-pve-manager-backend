package hu.jandzsogyorgy.jvpvemanagerbackend.auth.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "roles")
public class Role {
    @Id
    private Long id;
    private String name;
}
