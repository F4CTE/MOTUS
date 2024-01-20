package fr.esgi.tusmo.business;

public class Word {
    private String nom;

    public Word() {
        // Constructeur par défaut
    }

    public Word(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Word{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
