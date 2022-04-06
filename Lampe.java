public class Lampe {
    private String nom;
    private boolean allume;

    public Lampe(String nom) {
        this.nom = nom;
        this.allume = false;
    }

    public void allumer() {
        this.allume = true;
    }

    public void eteindre() {
        this.allume = false;
    }

    @Override
    public String toString() {
        return "Lampe{" +
                "nom='" + nom + '\'' +
                ", allume=" + allume +
                '}';
    }
}
