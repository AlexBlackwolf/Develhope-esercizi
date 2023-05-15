esercizio 1:
CONCAT(COLUMN1, COLUMN2) AS CONCAT_COLUMN,
- combina due colonne in una singola colonna, con COLUMN1 e COLUMN2 che rappresentano i nomi delle colonne. La funzione restituisce una nuova colonna che contiene i valori concatenati delle due colonne.

LOWER(COLUMN) AS LOWER_COLUMN,
 - converte tutti i caratteri di una colonna specificata in minuscolo. La funzione restituisce una nuova colonna con tutti i caratteri in minuscolo.

UPPER(COLUMN) AS UPPER_COLUMN,
 - converte tutti i caratteri di una colonna specificata in maiuscolo. La funzione restituisce una nuova colonna con tutti i caratteri in maiuscolo.

TRIM(COLUMN) AS TRIMMED_COLUMN,
 - rimuove eventuali spazi iniziali o finali da una colonna specificata. La funzione restituisce una nuova colonna senza spazi.

LENGTH(COLUMN) AS COLUMN_LENGTH,
 - restituisce la lunghezza di una colonna specificata in caratteri. La funzione restituisce un singolo valore, non una colonna.

SUBSTRING(COLUMN, START, LENGTH) AS SUBSTRING_COLUMN,
 - estrae una sottostringa da una colonna specificata, a partire da una posizione specificata (START) e per una lunghezza specificata (LENGTH). La funzione restituisce una nuova colonna con la sottostringa estratta.

ROUND(COLUMN, DECIMAL_PLACES) AS ROUNDED_VALUE,
 - arrotonda una colonna numerica a un numero specificato di cifre decimali (DECIMAL_PLACES). La funzione restituisce una nuova colonna con i valori arrotondati.

DATE_ADD(COLUMN, INTERVAL EXPRESSION UNIT) AS DATE_ADDED,
 - aggiunge un intervallo di tempo specificato (EXPRESSION UNIT) a una colonna di tipo data o datetime (COLUMN). La funzione restituisce una nuova colonna con la data o il datetime aggiornati.

DATE_SUB(COLUMN, INTERVAL EXPRESSION UNIT) AS DATE_SUBTRACTED,
 - sottrae un intervallo di tempo specificato (EXPRESSION UNIT) da una colonna di tipo data o datetime (COLUMN). La funzione restituisce una nuova colonna con la data o il datetime aggiornati.

FORMAT(COLUMN, FORMAT_STRING) AS FORMATTED_VALUE
 - formatta una colonna numerica (COLUMN) in base a una stringa di formato specificata (FORMAT_STRING). La funzione restituisce una nuova colonna con i valori formattati.

esercizio 2:

SELECT DATE_ADD(DATE_ADD(NOW(), INTERVAL 17 DAY), INTERVAL 8 MONTH) AS BIRTHDAY_DATE

SELECT DATE_FORMAT(DATE_ADD(NOW(),17,8), '00:00:00') AS MIDNIGHT;