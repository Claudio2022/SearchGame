package br.com.searchgame.jogo.dados;

import br.com.searchgame.jogo.model.Gender;
import jakarta.validation.constraints.*;

import java.time.Year;

public record AttGame(
        String titulo,
        String desenvolvedora,
        String distribuidora,
        String idiomas,
        @Min(1) @Max(4)
        Integer numJogadores,
        @PastOrPresent
        Year dataLancamento,
        Gender gender,
        RequirementsGame requisitos
) {



}
