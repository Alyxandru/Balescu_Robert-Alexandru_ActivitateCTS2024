import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Am folosit mai multe pattern-uri de design recunoscute pentru a structura solutiile intr-un mod mai eficient si
// pentru a facilita intretinerea si extinderea sistemului. Iata cateva dintre aceste pattern-uri si cum au fost
// utilizate:

// Factory Pattern: Utilizat in PersonalSpitalFactory pentru a crea obiecte din diferite clase ce implementeaza
// interfata PersonalSpital in functie de tipul specificat. Acest lucru centralizeaza crearea obiectelor de tip
// personal intr-un singur loc, facilitand managementul si eventuala extindere a tipurilor de personal.

// Singleton Pattern: Utilizat in clasa Reteta pentru a asigura ca o singura instanta a retetei este creata si
// utilizata in tot sistemul. Acest lucru este util pentru gestionarea resurselor si a consistentei in cazul unor
// obiecte care ar trebui sa fie unice in cadrul aplicatiei.

// Strategy Pattern: Implementat prin interfetele de mod de plata (ModPlata) si prin clasele PlataCard si PlataCash.
// Aceasta permite schimbarea comportamentului de plata al pacientului in timpul executiei si faciliteaza adaugarea
// de noi metode de plata fara a modifica clasa Pacient.

// Observer Pattern: Utilizat in SistemNotificari pentru a gestiona subscriptiile pacientilor la notificari.
// Pacient implementeaza interfata Observator, permitand sistemului de notificari sa trimita mesaje tuturor abonatilor
// fara a cunoaste detaliile implementarii lor.

// State Pattern: Utilizat pentru a gestiona diferitele stari ale unui pacient (StarePacient si implementarile
// sale Internat, SubObservatie, Externat). Acest pattern permite schimbarea starii unui pacient intr-un mod controlat,
// fiecare stare avand comportamente specifice.

// Composite Pattern: Folosit pentru a reprezenta structura ierarhica a departamentelor si sectiilor dintr-un spital,
// prin clasele Departament si Sectie. Aceasta permite gestionarea simpla si uniforma a grupurilor de obiecte
// structurate ierarhic.

// Flyweight Pattern (mentionat pentru optimizarea memoriei): Acest pattern nu a fost implementat in codul dat,
// dar am sugerat utilizarea lui pentru eficientizarea memoriei prin partajarea obiectelor comune,
// cum ar fi detaliile repetitive ale pacientilor.

// Aceste pattern-uri de design ajuta la crearea unui cod mai modular, mai usor de inteles si de intretinut, si
// permit extinderea mai usoara a sistemului fara modificari majore. Implementarea acestor pattern-uri intr-un
// sistem real ar ajuta la gestionarea complexitatii si la imbunatatirea flexibilitatii si scalabilitatii aplicatiei.

public class Main {
    public static void main(String[] args) {
        // Crearea unui pacient cu diverse facilitati si asigurare
        Pacient pacient = new Pacient(true, true, true, true, "Ion Popescu", 8, true);

        // Configurare medic si salon
        Medic medic = new Medic();
        // false indica paturi libere
        List<Boolean> paturi = new ArrayList<>(Arrays.asList(false, true, false));
        Salon salon = new Salon(paturi);

        // Crearea sistemului de internare
        SistemInternare sistemInternare = new SistemInternare(medic, salon);

        // Verificare daca pacientul poate fi internat
        if (sistemInternare.poateFiInternat(pacient)) {
            System.out.println(pacient.getNume() + " poate fi internat.");
        } else {
            System.out.println(pacient.getNume() + " nu poate fi internat.");
        }

        // Setarea starii pacientului si actualizarea starii
        pacient.setStare(new Internat());
        // Pacientul este acum internat
        pacient.actualizeazaStare();

        // Setarea modului de plata si efectuarea platii
        pacient.seteazaModPlata(new PlataCard());
        // Pacientul plateste spitalizarea
        pacient.platesteSpitalizarea(500);

        // Configurare si utilizare unui sistem de notificari
        SistemNotificari sistemNotificari = new SistemNotificari();
        sistemNotificari.aboneaza(pacient);
        sistemNotificari.trimiteNotificare("Atentie la virusul gripal din oras!");

        // Schimbare mod de plata si plata din nou
        pacient.seteazaModPlata(new PlataCash());
        // Plata aditionala
        pacient.platesteSpitalizarea(300);

        // Schimbarea starii pacientului la Externat si actualizare stare
        pacient.setStare(new Externat());
        // Pacientul este acum externat
        pacient.actualizeazaStare();
    }
}