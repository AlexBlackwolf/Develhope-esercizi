package checkpoint2022two;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;


public class Magazzino {
    private HashMap<Prodotto, Integer> prodottiMagazzino;

    public Magazzino(HashMap<Prodotto, Integer> prodottiMagazzino) {
        this.prodottiMagazzino = prodottiMagazzino;
    }

    public Magazzino() {
    }

    public Map<Prodotto, Integer> getProdottiMagazzino() {
        return prodottiMagazzino;
    }

    public void setProdottiMagazzino(HashMap<Prodotto, Integer> prodottiMagazzino) {
        this.prodottiMagazzino = prodottiMagazzino;
    }

    public void salvaSuFile(String path) throws IOException {
        Files.writeString(Path.of(path), prodottiMagazzino.toString());
    }
       public void caricaDaFile (String path) throws  IOException {
        Files.readString(Path.of(path));
    }
    public void printMagazzino () {
        System.out.println(prodottiMagazzino);
    }
}

