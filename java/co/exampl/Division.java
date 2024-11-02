package co.exampl;

public class Division {

    float Diviseur(final float nombre1, final float nombre2) {
        try {
            return nombre1 / nombre2;
        } catch (Exception e) { //Erreur en cas de division par 0
            System.out.println("Erreur : la division par 0 n'est pas possible.");
            return 0;
        }
    }
}