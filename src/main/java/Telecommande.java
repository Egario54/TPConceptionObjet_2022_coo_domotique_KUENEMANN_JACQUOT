import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Lampe> lampes;
    private List<Hifi> hifi;

    public Telecommande() {
        this.lampes = new ArrayList<>();
        this.hifi = new ArrayList<>();
    }

    public void ajouterHifi(Hifi hi) {
        hifi.add(hi);
    }

    public void ajouterLampe(Lampe lmp) {
        lampes.add(lmp);
    }

    public void activerHifi(int indiceHifi) {
        try {
            hifi.get(indiceHifi - 1).allumer();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La chaine Hi-Fi selectionne n'est pas dans la liste !!!!");
        }
    }

    public void activerLampe(int indiceLampe) {
        try {
            lampes.get(indiceLampe - 1).allumer();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La lampe selectionne n'est pas dans la liste !!!!");
        }
    }

    public void desactiverHifi(int indiceHifi) {
        try {
            hifi.get(indiceHifi - 1).eteindre();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La chaine Hi-Fi selectionne n'est pas dans la liste !!!!");
        }
    }

    public void desactiverLampe(int indiceLampe) {
        try {
            lampes.get(indiceLampe - 1).eteindre();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La lampe selectionne n'est pas dans la liste !!!!");
        }
    }

    public void activerTout() {
        for (Lampe lampe : lampes) {
            lampe.allumer();
        }
        for (Hifi h: hifi) {
            h.allumer();
        }
    }

    @Override
    public String toString() {
        return "Telecommande{" +
                "lampes=" + lampes +
                '}';
    }

    /**
     * Getter des lampes pour les tests
     */
    public List<Lampe> getLampes() {
        return lampes;
    }
}
