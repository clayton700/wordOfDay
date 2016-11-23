/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author clayton
 */
public class Palavra {
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the significado
     */
    public String getSignificado() {
        return significado;
    }

    /**
     * @param significado the significado to set
     */
    public void setSignificado(String significado) {
        this.significado = significado;
    }

    /**
     * @return the posicao_mais_falada
     */
    public int getPosicao_mais_falada() {
        return posicao_mais_falada;
    }

    /**
     * @param posicao_mais_falada the posicao_mais_falada to set
     */
    public void setPosicao_mais_falada(int posicao_mais_falada) {
        this.posicao_mais_falada = posicao_mais_falada;
    }

    /**
     * @return the lingua
     */
    public String getLingua() {
        return lingua;
    }

    /**
     * @param lingua the lingua to set
     */
    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    /**
     * @return the traducao
     */
    public String getTraducao() {
        return traducao;
    }

    /**
     * @param traducao the traducao to set
     */
    public void setTraducao(String traducao) {
        this.traducao = traducao;
    }
    private int id;
    private String nome;
    private String significado;
    private int posicao_mais_falada;
    private String lingua;
    private String traducao;
}
