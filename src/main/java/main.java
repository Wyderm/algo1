import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("Alice", LocalDate.of(2000, 1, 15));
        Etudiant etudiant2 = new Etudiant("Bob", LocalDate.of(1999, 5, 30));
        Etudiant etudiant3 = new Etudiant("Charlie", LocalDate.of(2001, 8, 22));
        Etudiant etudiant4 = new Etudiant("Diana", LocalDate.of(2000, 12, 5));
        Etudiant etudiant5 = new Etudiant("Ethan", LocalDate.of(1998, 3, 10));
        Etudiant doublon = new Etudiant("Alice", LocalDate.of(2000, 1, 15));

        HashSet<Etudiant> etudiants = new HashSet<>();
        etudiants.add(etudiant1);
        etudiants.add(etudiant2);
        etudiants.add(etudiant3);
        etudiants.add(etudiant4);
        etudiants.add(etudiant5);
        System.out.println(etudiants);

        System.out.println(etudiants.contains(doublon));

        Etudiant etudiant7 = new Etudiant("Alice", LocalDate.of(2000, 1, 15));
        Etudiant etudiant8 = new Etudiant("Bob", LocalDate.of(1999, 5, 30));
        Etudiant etudiant9 = new Etudiant("Frank", LocalDate.of(2002, 7, 19));
        Etudiant etudiant10 = new Etudiant("Grace", LocalDate.of(2001, 11, 3));

        HashSet<Etudiant> etudiants2 = new HashSet<>(List.of(etudiant7, etudiant8, etudiant9, etudiant10));
        System.out.println(etudiants2);

        HashSet<Etudiant> union = new HashSet<>(etudiants);
        union.addAll(etudiants2);
        System.out.println("Union des deux ensembles :");
        for (Etudiant e : union) {
            System.out.println(e);
        }

        HashSet<Etudiant> intersection = new HashSet<>();
        for (Etudiant e : etudiants) {
            if (etudiants2.contains(e)) {
                intersection.add(e);
            }
        }
        System.out.println("Intersection des deux ensembles :");
        for (Etudiant e : intersection) {
            System.out.println(e);
        }
    }
}
