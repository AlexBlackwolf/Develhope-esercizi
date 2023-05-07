package checkpoint2022two;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Prodotto, Integer>  prodotti = new HashMap<>();

        Prodotto prodotto1 = new Prodotto("123456", "vernice rossa", new BigDecimal(50.55).setScale(2, RoundingMode.HALF_EVEN));
        Prodotto prodotto2 = new Prodotto("654321", "vernice blu", new BigDecimal(60.66).setScale(2, RoundingMode.HALF_EVEN));
        Prodotto prodotto3 = new Prodotto("123654", "vernice verde", new BigDecimal(70.77).setScale(2, RoundingMode.HALF_EVEN));

        prodotti.put(prodotto1, 10);
        prodotti.put(prodotto2, 20);
        prodotti.put(prodotto3, 30);

        Magazzino magazzino1 = new Magazzino(prodotti);

        magazzino1.salvaSuFile("magazzino.txt");
        magazzino1.printMagazzino();
    }
}
