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

    public boolean isAllume() {
        return allume;
    }

    /**
     * surcharge de la methode d'affichage sous la forme "nom+On" ou "nom+off"
     * @return Sa description
     */
    @Override
    public String toString() {
        String s = "";
        if (isAllume()) {
            s = nom +": On";
        }else {
            s = nom +": off";
        }
        return s;
    }
}
