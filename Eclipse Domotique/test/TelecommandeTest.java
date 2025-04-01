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
        //

    }

}