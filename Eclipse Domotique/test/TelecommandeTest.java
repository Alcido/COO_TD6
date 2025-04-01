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
        assertSame(t.getLampes()[1].getNom(), l2.getNom());
    }

    /**
     * methode permettant de tester l'activation d'une lampe en position 0
     */
    @Test
    void testActivation_0() {
        //prepa donnée
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampeTest1");
        t.ajouterLampe(l);
        //methode testée
        t.getLampes()[0].allumer();
        //verifications
        assertTrue(t.getLampes()[0].isAllume());
    }

    /**
     * methode permettant de tester l'activation d'une lampe en position 1
     */
    @Test
    void testActivation_1() {
        //prepa donnée
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampeTest1");
        Lampe l2 = new Lampe("lampeTest2");
        t.ajouterLampe(l);
        t.ajouterLampe(l2);
        //methode testée
        t.getLampes()[0].allumer();
        //verifications
        assertTrue(t.getLampes()[1].isAllume());
    }

    /**
     * methode permettant de tester l'activation d'une lampe inexistante
     */
    @Test
    void testActivation_null() {
        boolean erreurLevee = false;
        try {
            //prepa données
            Telecommande t = new Telecommande();
            //methode testée
            t.getLampes()[0].allumer();
        } catch (NullPointerException e) {
            erreurLevee = true;
        }
        assertTrue(erreurLevee);
    }
    
}