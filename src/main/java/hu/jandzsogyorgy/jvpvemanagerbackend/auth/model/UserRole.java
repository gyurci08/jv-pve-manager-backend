package hu.jandzsogyorgy.jvpvemanagerbackend.auth.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("user_role")
public class UserRole {
    @Id
    private Long id;
    private Long userId;
    private Long roleId;
}
