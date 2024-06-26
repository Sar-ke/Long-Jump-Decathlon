package fr.stageLIS.long_jump_serveur.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@Builder
public class PartieDto {

    private Long id;

    private Long idJoueur;
    private int scoreFinal;
    private int place;
}
