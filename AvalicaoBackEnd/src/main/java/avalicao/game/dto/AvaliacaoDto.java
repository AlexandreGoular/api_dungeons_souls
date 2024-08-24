package avalicao.game.dto;

import jakarta.validation.constraints.NotBlank;

public record AvaliacaoDto (@NotBlank String emailPessoa, @NotBlank String avaliacao){
}
