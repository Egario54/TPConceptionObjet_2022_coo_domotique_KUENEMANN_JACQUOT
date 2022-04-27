import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Lampe> lampes;

    public Telecommande (){
        this.lampes = new ArrayList<>();
    }

    public void ajouterLampe(Lampe lmp){
        lampes.add(lmp);
    }
    public void activerLampe(int indiceLampe){
        lampes.get(indiceLampe).allumer();
    }
    public void desactiverLampe(int indiceLampe){
        lampes.get(indiceLampe).eteindre();
    }
    public void activerTout(){
        for(int i = 0; i< lampes.size();i++){
            lampes.get(i).allumer();
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
