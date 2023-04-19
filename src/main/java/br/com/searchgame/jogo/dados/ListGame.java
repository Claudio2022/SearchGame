package br.com.searchgame.jogo.dados;

import br.com.searchgame.jogo.model.Gender;
import br.com.searchgame.jogo.model.Game;

public record ListGame(

    Long id,
    String titulo,
    String desenvolvedora,
    int numJogadores,
    Gender gender,
    int armazenamento
    ){
    public ListGame(Game game){
        this (
                game.getId(),
                game.getTitulo(),
                game.getDesenvolvedora(),
                game.getNumJogadores(),
                game.getGenero(),
                game.getRequisitos().getArmazenamento()
        );
    }
}
