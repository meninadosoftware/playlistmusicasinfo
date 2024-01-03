package playlistmusicasinfo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author camila
 */
public class PlaylistMusicasInfo {

    public static void main(String[] args) {
        // Declaração da classe | class declaration
        Musica playlist = new Musica();
       // inputs
        playlist.nome = JOptionPane.showInputDialog("Digite o nome da música?");
        playlist.artista = JOptionPane.showInputDialog("Digite o/a artista?");
        playlist.paisOrigem = JOptionPane.showInputDialog("Digite o pais de origem da música?");
        playlist.qtdVezesOuvida = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes você ouviu a música?"));

        // outputs
        JOptionPane.showMessageDialog(null,
                "Nome da música: " + playlist.nome
                + "\nArtista: " + playlist.artista
                + "\nPais de origem: " + playlist.paisOrigem
                + "\nVezes que foi ouvida: " + playlist.qtdVezesOuvida);
        // verificação | verification of condition.
        if (playlist.qtdVezesOuvida > 50) {

            JOptionPane.showMessageDialog(null, "Favorita!!!");

        }

    }
}
