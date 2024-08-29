package application;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class TocarSom {
    public static void main(String[] args) {
    	int musica = 1;
    	String caminhoArquivoSom = "";
    	switch(musica){
    	case 1:
    		caminhoArquivoSom = "C:\\Users\\sergi\\Documents\\arquivostestes\\Helmet.wav";
    		break;
    	case 2:
    		caminhoArquivoSom = "C:\\Users\\sergi\\Documents\\arquivostestes\\Lithium.wav";
    		break;
    }
        try {
            // Caminho do arquivo de som
        	File arquivoSom = new File(caminhoArquivoSom);	

            // Cria um AudioInputStream
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(arquivoSom);
            
            // Obtém um Clip para tocar o som
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            
            // Toca o som
            clip.start();
            
            // Mantém o programa rodando até o som terminar
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
