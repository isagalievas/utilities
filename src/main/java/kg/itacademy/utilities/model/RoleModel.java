package kg.itacademy.utilities.model;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleModel {
    @NotBlank
    private String name;
}
