import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelecommandeTest {

    /**
     * Methode de test pour l'ajout d'une lampe à une telecommande vide
     */
    @Test
    void testAjout_Vide() {
        //prepa données
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampeTest1");
        //methode testée
        t.ajouterLampe(l);
        //verifications
        assertFalse(t.getLampes()[0].isAllume());
    }

    /**
     * Methode permettant de tester l'ajout dans une telecommande à 1 element
     */
    @Test
    void testAjout_Lampe() {
        //prepa des données
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampeTest1");
        Lampe l2 = new Lampe("lampeTest2");
        //appel methode
        t.ajouterLampe(l);
        t.ajouterLampe(l2);
        //verification
        assertFalse(t.getLampes()[1].isAllume());
        assertTrue(t.getLampes()[1].getNom()==l2.getNom());

    }



}