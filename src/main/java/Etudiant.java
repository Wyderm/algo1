import java.time.LocalDate;

public class Etudiant {
    private String nom;
    private LocalDate naissance;

    public Etudiant(String nom, LocalDate naissance) {
        this.nom = nom;
        this.naissance = naissance;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Etudiant e)) {
            return false;
        }
        return this.nom.equals(e.nom) && this.naissance.equals(e.naissance);
    }

    public int hashCode() {
        return nom.hashCode() + 31 * naissance.hashCode();
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getNaissance() {
        return naissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNaissance(LocalDate naissance) {
        this.naissance = naissance;
    }

    public String toString() {
        return "Etudiant(nom=" + nom + ", naissance=" + naissance + ")";
    }
}
