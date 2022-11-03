# System aukcyjny

## Wprowadzenie

Specyfikacja wymagań funkcjonalnych w ramach informatyzacji procesu sprzedaży produktów w oparciu o mechanizm aukcyjny. 

## Procesy biznesowe

---
<a id="bc1"></a>
### BC1: Sprzedaż aukcyjna 

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Opis:** Proces biznesowy opisujący sprzedaż za pomocą mechanizmu aukcyjnego. |

**Scenariusz główny:**
1. [Sprzedający](#ac1) wystawia produkt na aukcję. ([UC1](#uc1))
2. [Kupujący](#ac2) oferuje kwotę za produkt wyższą od aktualnie najwyższej oferty. ([BR1](#br1))
3. [Kupujący](#ac2) wygrywa aukcję ([BR2](#br2))
4. [Kupujący](#ac2) przekazuje należność Sprzedającemu.
5. [Sprzedający](#ac1) przekazuje produkt Kupującemu.

**Scenariusze alternatywne:** 

2.A. Oferta Kupującego została przebita, a [Kupujący](#ac2) pragnie przebić aktualnie najwyższą ofertę.
* 2.A.1. Przejdź do kroku 2.

3.A. Czas aukcji upłynął i [Kupujący](#ac2) przegrał aukcję. ([BR2](#br2))
* 3.A.1. Koniec przypadku użycia.

---

## Aktorzy

<a id="ac1"></a>
### AC1: Sprzedający

Osoba oferująca towar na aukcji.

<a id="ac2"></a>
### AC2: Kupujący

Osoba chcąca zakupić produkt na aukcji.


## Przypadki użycia poziomu użytkownika

### Aktorzy i ich cele

[Sprzedający](#ac1):
* [UC1](#uc1): Wystawienie produktu na aukcję
* [UC4](#uc4): Wysyłanie kuriera 

[Kupujący](#ac2)
* [UC2](#uc2): Przebicie Oferty
* [UC3](#uc3): Przekazanie Płatności


---
<a id="uc1"></a>
### UC1: Wystawienie produktu na aukcję

**Aktorzy:** [Sprzedający](#ac1)

**Scenariusz główny:**
1. [Sprzedający](#ac1) zgłasza do systemu chęć wystawienia produktu na aukcję.
2. System prosi o podanie danych produktu i ceny wywoławczej.
3. [Sprzedający](#ac1) podaje dane produktu oraz cenę wywoławczą.
4. System weryfikuje poprawność danych.
5. System informuje o pomyślnym wystawieniu produktu na aukcję.

**Scenariusze alternatywne:** 

4.A. Podano niepoprawne lub niekompletne dane produktu.
* 4.A.1. System informuje o błędnie podanych danych.
* 4.A.2. Przejdź do kroku 2.

---






<a id="uc2"></a>
### UC2: Przebicie Oferty

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. System weryfikuje kupującego.
2. [Kupujący](#ac2) zgłasza chęć kupna produktu, oferując cenę wyższą min. o 1zł niż poprzednia.
2. System weryfikuje ostateczną cenę i sprawdza,że jest wyższa poprzedniej.
3. [Sprzedający](#ac1) czeka nowej wyższej ceny lub zatwierdza ostateczną cenę po czasie.
5. System weryfikuje poprawność ostatecznej ceny.
6. System informuje użytkownikow o ostatecznej cenie.


**Scenariusze alternatywne:** 

1.A. Nikt nie zgłosił chęć kupna produktu
* 4.A.1. System informuję użytkownika o tym. 
* 4.A.2  Przejdż do kroku [UC1](#uc1) 1.

---


<a id="uc3"></a>
### UC3: Przekazanie Płatności

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. [Kupujący](#ac2) wysyła pieniądże za produkt do sprzedawcy.
2. System weryfikuje poprawność płatności.
3. System informuje użytkownikow o przekazaniu płatności.


**Scenariusze alternatywne:** 

2.A. Płatność nie przeszła
* 4.A.1. System informuję użytkownika o tym. 
* 4.A.2  Przejdż do kroku 2.

---

<a id="uc4"></a>
### UC4: Wysyłanie kuriera 

**Aktorzy:** [Sprzedający](#ac1)

**Scenariusz główny:**
1. [Sprzedający](#ac1) wysyła kuriera z produktem do kupującego.
2. System czeka na zatwierdzenie przez kuriera o otrzymaniu produktu przez kupującego.
3. System informuje o pomyślnej sprzedaży produktu.


**Scenariusze alternatywne:** 

1.A. Kurier nie dostarczył produkt do kupującego
* 4.A.1. System informuję użytkownika o tym. 
* 4.A.2  System będzie czekać na zatwierdzenie przez pocztę o otrzymaniu produktu przez kupującego.
* 4.A.3  Przejdż do kroku 3.


---

## Obiewkty biznesowe (inaczje obiekty dziedzinowe lub informatycjne)

### BO1: Aukcja

Aukcja jest formą zawierania transakcji kupna-sprzedaży, w której Sprzedający określa cenę wywoławczą produktu, natomiast Kupujący mogą oferować własną ofertę zakupu każdorazowo proponując kwotę wyższą od aktualnie oferowanej kwoty. Aukcja kończy się po upływie określonego czasu. Jeśli złożona została co najmniej jedna oferta zakupy produkt nabywa ten Kupujący, który zaproponował najwyższą kwotę. 

### BO2: Produkt

Fizyczny lub cyfrowy obiekt, który ma zostać sprzedany w ramach aukcji.

## Reguły biznesowe

<a id="br1"></a>
### BR1: Złożenie oferty

Złożenie oferty wymaga zaproponowania kwoty wyższej niż aktualnie oferowana o minimum 1,00 PLN.


<a id="br2"></a>
### BR2: Rozstrzygnięcie aukcji

Aukcję wygrywa ten z [Kupujący](#ac2)ch, który w momencie jej zakończenia (upłynięcia czasu) złożył najwyższą ofertę.

## Macierz CRUDL


| Przypadek użycia                                  | Aukcja | Produkt | ... |
| ------------------------------------------------- | ------ | ------- | --- |
| UC1: Wystawienia produktu na aukcję               |    C   |    C    | ... |
| ???                                               |  ...   |  ...    | ... |


