package EsercizioLive;

public abstract class DispositiviDigitali {
    protected Double prezzo;
    protected String barcode;
    protected Double iva;

    public DispositiviDigitali(Double prezzo, String barcode, Double iva) {
        this.prezzo = prezzo;
        this.barcode = barcode;
        this.iva = iva;
    }

    public Double getPrezzoAlConsumatore() {
        return prezzo + prezzo * iva;
    }

    public abstract void stampaOgetto();
    public String getBarcode() {

        return barcode;
    }
}

