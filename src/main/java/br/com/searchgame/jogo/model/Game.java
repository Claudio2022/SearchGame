package br.com.searchgame.jogo.model;

import br.com.searchgame.jogo.dados.AttGame;
import br.com.searchgame.jogo.dados.InsertGame;
import jakarta.persistence.*;

import java.time.Year;

@Entity(name = "searchgame")
@Table(name = "TB_SG_JOGO")
public class Game {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String desenvolvedora;
    private String distribuidora;
    private String idiomas;
    private int numJogadores;
    private Year dataLancamento;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Embedded
    private Requirements requisitos;
    private boolean visivel;

    public Game(){}

    public Game(InsertGame dados) {
        this.titulo = dados.titulo();
        this.desenvolvedora = dados.desenvolvedora();
        this.distribuidora = dados.distribuidora();
        this.idiomas = dados.idiomas();
        this.numJogadores = dados.numJogadores();
        this.dataLancamento = dados.dataLancamento();
        this.gender = dados.gender();
        this.requisitos = new Requirements(dados.requisitos());
        this.visivel = true;
    }

    public void apagarJogo(){
        this.visivel = false;
    }

    public void atualizarJogo(AttGame dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.desenvolvedora() != null) {
            this.desenvolvedora = dados.desenvolvedora();
        }
        if (dados.distribuidora() != null) {
            this.distribuidora = dados.distribuidora();
        }
        if (dados.idiomas() != null) {
            this.idiomas = dados.idiomas();
        }
        if (dados.numJogadores() != null) {
            this.numJogadores = dados.numJogadores();
        }
        if (dados.dataLancamento() != null) {
            this.dataLancamento = dados.dataLancamento();
        }
        if (dados.gender() != null) {
            this.gender = dados.gender();
        }
        if (dados.requisitos() != null) {
            this.requisitos.atualizarJogo(dados.requisitos());
        }

    }


    public Long getId() {
        return id;
    }

    public Game setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Game setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public Game setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
        return this;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public Game setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
        return this;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public Game setIdiomas(String idiomas) {
        this.idiomas = idiomas;
        return this;
    }

    public int getNumJogadores() {
        return numJogadores;
    }

    public Game setNumJogadores(int numJogadores) {
        this.numJogadores = numJogadores;
        return this;
    }

    public Year getDataLancamento() {
        return dataLancamento;
    }

    public Game setDataLancamento(Year dataLancamento) {
        this.dataLancamento = dataLancamento;
        return this;
    }

    public Gender getGenero() {
        return gender;
    }

    public Game setGenero(Gender gender) {
        this.gender = gender;
        return this;
    }

    public Requirements getRequisitos() {
        return requisitos;
    }

    public Game setRequisitos(Requirements requisitos) {
        this.requisitos = requisitos;
        return this;
    }

    public boolean isVisivel() {
        return visivel;
    }

    public Game setVisivel(boolean visivel) {
        this.visivel = visivel;
        return this;
    }
}
