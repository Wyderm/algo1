import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Random r = new Random(0);
        Set<Etudiant> set = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            int alea = r.nextInt(10000);
            Etudiant e = new Etudiant("E" + alea, LocalDate.of(2000, 1, 1).plusDays(r.nextInt(10000)));
            set.add(e);
        }
        System.out.println(set.size());
    }
}
