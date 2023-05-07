package EsercizioLive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<DispositiviDigitali> dispositivi = new ArrayList<>();
        dispositivi.add(new Laptop(799.99,"4560", 0.25,8,180, "intel7" ));
        dispositivi.add(new Laptop(599.99,"4561", 0.25,16,240, "Amd Ryzen" ));
        dispositivi.add(new Laptop(999.99,"4562", 0.25,4,320, "intel9" ));

        //la riga sopra è uguale alle due righe sotto(the code above requires on line whyle the syntax below will require
        //for you input the command dispositivi.add(laptop) to add it to the array list
        //start using the one above only u write and you don't look retarded

        Laptop laptop = new Laptop(899.99,"6789",0.25,8,1000,"Razor4000superX");
        dispositivi.add(laptop);

        //List,set and Map are interfaces while HashMap, HashSet are classes to use Polymorphism to assign an interface
        //one implementation by using HashMap with Map
        //The syntax is Map<keys,values> "name of the map.remove the ("")" = new HashMap<>(); //<---instancing class
        //convert
        //for(class nome variabile : list){
        //name of map.put(nome variabile.Key requested, value assigned to key in this case is dispositivo);
        //}


        Map<String, DispositiviDigitali> mappaDispositivi = new HashMap<>();
        for(DispositiviDigitali dispostivo : dispositivi){
            mappaDispositivi.put(dispostivo.getBarcode(),dispostivo);
            }
        //
            for(DispositiviDigitali v : mappaDispositivi.values()) {
                if(v.getPrezzoAlConsumatore() > 1000) {
                    v.stampaOgetto();
                    //quando si itera su valori metti v quando su keys metti k
                    //chiamata a metodo = ()
            }
        }

        mappaDispositivi=dispositivi.stream().collect(Collectors.toMap(DispositiviDigitali::getBarcode, Function.identity()));

        //function identity piglia e mi ristituisce quello che mi arriva in ingresso

        //gergo corretto MappaDispositivi richiama la funzione che restituisce i valori mappaDispositivi.values()
        //.stream è un metodo della interfaccia collection che restituisce un instanza della classe/ogetto stream
        //.filter è un metodo che mi mette una condizione che poi mi andrà a restituire gli ogetti che rispettano
        // quella condizione
        //
        //functional interface ITS FUCKING IMPORTANT NEED TO LEARN AND READ IT WELL ALONG WITH STREAM
        //lambda is a theoric concept and function interface is how lambda were implemented to be used
        //filter prende in input un predicato=è una funzione (not method) che prende in input qualsiasi cosa
        //e ritorna true or false (booleano)
        //filter prende in input un singolo elemento dello stream in questo caso è dispositiviDigitali=singolo dispositivoDigitale
        //->delimitia l'input da sinastra a destra dell'output del predicato, quindi gli mette una condizione per farmi
        //true or false dispsitivoDigitale.getPrezzo........() > 1000)
        //ora prendo ogni singolo valore è lo passo tramite la condizione di filtro utilizando il predicate
        //forEach è un altro metodo dello stream (il for each è un metodo utilizzato dalle strutture itereative)
        //
        mappaDispositivi.values().stream().filter(dispositivoDigitale -> dispositivoDigitale.getPrezzoAlConsumatore() >1000 )
                //.forEach(DispositiviDigitali::stampaOgetto);
                //è meglio utilizzare il metodo sopra (sono la stessa cosa)
                //in questo caso si usa la freccetta non per avere un predicate, ma per avere un consumer
                //che è sempre una function che prende in input qualsiasi cosa ma torna sempre void
                //si chiama consumer perchè prende l'ogetto e lo consuma
                //variabile frecceta variabile.metodo
                .forEach(dispositivoDigitale->dispositivoDigitale.stampaOgetto());
        }
}
