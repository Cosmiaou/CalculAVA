//Pour mieux supporter de futures améliorations, toutes les interactions sont stockées ici. Main.java ne contient donc que l'appel de cette fonction, et l'appel du futur UI

package co.exampl;

public class InteractionUtilisateur {

    void interaction() {
        System.out.println("Bonjour, bienvenue dans CalculAVA, système de calculatrice entièrement codé en Java.");

        PremierNombre premierNombre = new PremierNombre();
        float nombre1 = premierNombre.premierChiffre();

        SecondNombre secondNombre = new SecondNombre();
        float nombre2 = secondNombre.secondChiffre();

        ChoixOperation choixOperation = new ChoixOperation();
        choixOperation.ChoixOperateur(nombre1, nombre2);
    }
}