package co.exampl;
import java.util.Scanner;

public class ChoixOperation {

    float number1, number2;

//La variable demande à l'utilisateur son opération, et récupère en secret les deux numéros pour les envoyer à "envoie" sans complexifier Main et InteractionUtilisateur
    void ChoixOperateur(float chiffre1, float chiffre2) { 
        Scanner myObj = new Scanner(System.in);
        String operation = "";

        number1 = chiffre1;
        number2 = chiffre2;
        
        System.out.println("Merci d'indiquer l'opération désirée : +, -, *, /");
        operation = myObj.next();
        
        envoie(operation); //Envoie vers la variable "envoie", qui envoie l'opérateur vers la classe appropriée, ou en cas d'erreur renvoie l'utilisateur ici
        myObj.close();
    }
    
    void envoie(String operation) {
        switch (operation) {
            case "+" -> {
                Addition addNumbers = new Addition();
                float result = addNumbers.Additionneur(number1, number2);
                System.out.println(number1 + " + " + number2 + " = " + result);
            }
            case "-" -> {
                Soustraction sousNumbers = new Soustraction();
                float result = sousNumbers.Soustracteur(number1, number2);
                System.out.println(number1 + " - " + number2 + " = " + result);
            }
            case "*" -> {
                Multiplication mulNumbers = new Multiplication();
                float result = mulNumbers.Multiplicateur(number1, number2);
                System.out.println(number1 + " * " + number2 + " = " + result);
            }
            case "/" -> {
                Division divNumbers = new Division();
                float result = divNumbers.Diviseur(number1, number2);
                System.out.println(number1 + " / " + number2 + " = " + result);
            }
            default -> {
                System.out.println("Erreur : opération invalide. Merci de choisir une addition, soustraction, multiplication ou une division.");
                ChoixOperateur(number1, number2);
                }
        }
    }
}