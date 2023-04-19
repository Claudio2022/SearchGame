package br.com.searchgame.jogo.dados;

import br.com.searchgame.jogo.model.Gender;
import jakarta.validation.constraints.*;

import java.time.Year;

public record InsertGame(
        @NotBlank
        String titulo,
        @NotBlank
        String desenvolvedora,
        String distribuidora,
        @NotBlank
        String idiomas,
        @NotNull @Min(1) @Max(4)
        Integer numJogadores,
        @NotNull @PastOrPresent
        Year dataLancamento,
        @NotNull
        Gender gender,
        @NotNull
        RequirementsGame requisitos

    ){
}
