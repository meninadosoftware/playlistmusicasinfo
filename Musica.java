/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlistmusicasinfo;

/**
 *
 * @author camila
 */
public class Musica {

    public String nome;
    public String artista;
    public String paisOrigem;
    public int qtdVezesOuvida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public int getQtdVezesOuvida() {
        return qtdVezesOuvida;
    }

    public void setQtdVezesOuvida(int qtdVezesOuvida) {
        this.qtdVezesOuvida = qtdVezesOuvida;
    }

}
