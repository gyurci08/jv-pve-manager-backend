package hu.jandzsogyorgy.jvpvemanagerbackend.auth.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.Set;

@Data
public class User {
    @Id
    private Long id;
    private String username;
    private String password;

    @MappedCollection(idColumn = "user_id")
    private Set<UserRole> roles;
}
