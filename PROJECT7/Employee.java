import java.io.Serializable;
import java.util.ArrayList;

class Employee implements Serializable {
    public String matricule;
    public String nom;
    public String prenom;
    public int salaire;

    public Employee(String matricule, String nom, String prenom, int salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire; }
    @Override
    public String toString() {
        return "Employee{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}