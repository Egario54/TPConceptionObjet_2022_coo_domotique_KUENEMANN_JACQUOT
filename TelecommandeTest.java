import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {
    /**
     * test methode ajout de lampe
     * cas où la télécommande ne contient pas de lame auparavant
     */
    @Test
    public void test1_ajoutLampeATelecommandeVide(){
        //preparation des valeurs
        Telecommande telecommande = new Telecommande();
        Lampe lmp = new Lampe("Lampe");
        //methode testee
        telecommande.ajouterLampe(new Lampe("Lampe"));
        //tests
        assertTrue(telecommande.getLampes().get(0).equals(lmp), "Ajout de lampe echoue");
    }
    /**
     * test methode ajout de lampe
     * cas où la télécommande contient deja une lampe
     */
    @Test
    public void test2_ajoutLampeATelecommandePasVide(){
        //preparation des valeurs
        Telecommande telecommande = new Telecommande();
        Lampe lmp1 = new Lampe("Lampe");
        Lampe lmp2 = new Lampe("Seconde lampe");
        //methode testee
        telecommande.ajouterLampe(new Lampe("Lampe"));
        telecommande.ajouterLampe(new Lampe("Seconde lampe"));
        //tests
        assertTrue(telecommande.getLampes().get(0).equals(lmp1)&&telecommande.getLampes().get(1).equals(lmp2),"Ajout de lampes sur le test 2 echoue");
    }
    /**
     * test methode activation de lampe
     * cas position de lampe = 0
     */
    @Test
    public void test3_activationLampe0(){
        //preparation des valeurs
        Telecommande telecommande = new Telecommande();

        Lampe lmp1 = new Lampe("Lampe");
        lmp1.allumer();
        Lampe lmp2 = new Lampe("Seconde lampe");

        telecommande.ajouterLampe(new Lampe("Lampe"));
        telecommande.ajouterLampe(new Lampe("Seconde lampe"));
        //methode testee
        telecommande.activerLampe(0);
        //tests
        assertTrue(telecommande.getLampes().get(0).equals(lmp1)&&telecommande.getLampes().get(1).equals(lmp2),"Activation de lampes echoue");
    }
    /**
     * test methode activation de lampe
     * cas position de lampe = 1
     */
    @Test
    public void test4_activationLampe1(){
        //preparation des valeurs
        Telecommande telecommande = new Telecommande();

        Lampe lmp1 = new Lampe("Lampe");
        Lampe lmp2 = new Lampe("Seconde lampe");
        lmp2.allumer();

        telecommande.ajouterLampe(new Lampe("Lampe"));
        telecommande.ajouterLampe(new Lampe("Seconde lampe"));
        //methode testee
        telecommande.activerLampe(1);
        //tests
        assertTrue(telecommande.getLampes().get(0).equals(lmp1)&&telecommande.getLampes().get(1).equals(lmp2),"Activation de lampes echoue");
    }
    /**
     * test methode activation de lampe
     * cas lampe inexistante
     */
    @Test
    public void test5_activationLampeInexistante(){
        //preparation des valeurs
        Telecommande telecommande = new Telecommande();
        //tests
        assertThrows(NullPointerException.class,()->{telecommande.activerLampe(0);},"Exception non relevee ou mauvaise exception");
    }

}
