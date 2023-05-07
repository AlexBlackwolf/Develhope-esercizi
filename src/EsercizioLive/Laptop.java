package EsercizioLive;

public class Laptop extends DispositiviDigitali {
    private int ram;
    private int hardrive;
    private String cpu;
    public Laptop(Double prezzo, String barcode, Double iva, Integer ram, Integer hardrive, String cpu) {
        super(prezzo, barcode, iva);
        this.ram=ram;
        this.hardrive=hardrive;
        this.cpu=cpu;
    }
    @Override
    public void stampaOgetto() {
        System.out.println("laptop barcode: "+ barcode + "Prezzo al consumatore :" +getPrezzoAlConsumatore() +getPrezzoAlConsumatore());
    }
}
