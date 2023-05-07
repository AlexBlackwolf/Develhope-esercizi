package checkpoint2022two;

import java.math.BigDecimal;
import java.util.Objects;

public class    Prodotto {
    private String codiceProdotto;
    private String descrizione;
    private BigDecimal prezzo;
    public Prodotto(String codiceProdotto, String descrizione, BigDecimal prezzo) {
        this.codiceProdotto = codiceProdotto;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }
    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setCodiceProdotto(String codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "codiceProdotto='" + codiceProdotto + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prodotto prodotto)) return false;
        return Objects.equals(getCodiceProdotto(), prodotto.getCodiceProdotto()) && Objects.equals(getDescrizione(), prodotto.getDescrizione()) && Objects.equals(getPrezzo(), prodotto.getPrezzo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodiceProdotto(), getDescrizione(), getPrezzo());
    }
}

