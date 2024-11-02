package co.exampl;
import java.util.Scanner;

public class SecondNombre {

    public float nombre = 0;

    public float secondChiffre() {
        Scanner myObj = new Scanner(System.in);
        boolean valide = false;

        while (!valide) { //Boucle jusqu'à ce qu'un integer correct soit inséré par l'utilisateur
            System.out.println("Merci d'indiquer votre second chiffre");

            try {
                    nombre = myObj.nextFloat();
                    valide = true;
                } catch (Exception e) {
                    System.out.println("Merci d'entrer un nombre valide");
                    myObj.next();
                }
        }
        return nombre;
    }
} //Il y a un avertissement sur l'IDE car je ne peux pas fermer myObj sans créer d'erreur. Libre à toi de tester.