package kg.itacademy.utilities.model;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegionModel {
    private Long id;
    private String regionName;
}
