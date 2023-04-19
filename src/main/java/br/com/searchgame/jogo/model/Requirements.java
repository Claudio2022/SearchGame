package br.com.searchgame.jogo.model;

import br.com.searchgame.jogo.dados.RequirementsGame;
import jakarta.persistence.Embeddable;

@Embeddable
public class Requirements {

    private String sistemaOperacional;
    private String processador;
    private String memoria;
    private String placaDeVideo;
    private int armazenamento;

    public Requirements() {
    }

    public Requirements(RequirementsGame dados) {
        this.sistemaOperacional = dados.sistemaOperacional();
        this.processador = dados.processador();
        this.memoria = dados. memoria();
        this.placaDeVideo = dados.placaDeVideo();
        this.armazenamento = dados.armazenamento();
    }

    public void atualizarJogo(RequirementsGame dados) {
        if (dados.armazenamento() != null) {
            this.armazenamento = dados.armazenamento();
        }
        if (dados.memoria() != null) {
            this.memoria = dados.memoria();
        }
        if (dados.sistemaOperacional() != null) {
            this.sistemaOperacional = dados.sistemaOperacional();
        }
        if (dados.placaDeVideo() != null) {
            this.placaDeVideo = dados.placaDeVideo();
        }
        if (dados.processador() != null) {
            this.processador = dados.processador();
        }
    }

    public Requirements(String sistemaOperacional, String processador, String memoria, String placaDeVideo, int armazenamento) {
        this.sistemaOperacional = sistemaOperacional;
        this.processador = processador;
        this.memoria = memoria;
        this.placaDeVideo = placaDeVideo;
        this.armazenamento = armazenamento;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public Requirements setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public String getProcessador() {
        return processador;
    }

    public Requirements setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public String getMemoria() {
        return memoria;
    }

    public Requirements setMemoria(String memoria) {
        this.memoria = memoria;
        return this;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public Requirements setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public Requirements setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }
}
