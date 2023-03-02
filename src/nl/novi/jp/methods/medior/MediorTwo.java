package nl.novi.jp.methods.medior;

/**
 * Gegeven: Een methode die true of false (boolean) teruggeeft op basis van de gegeven leeftijd.
 *
 * Roep deze methode (is oldEnough) vanuit de main-methode aan. Op basis van de return value, roep je
 * of printUnderAgeWarning() of printProceed() uit.
 */
public class MediorTwo {

    public static void main(String[] args) {
        // if statement die zegt als de boolean isOldEnough waar is print dan de methode printProceed, else print de methode printUnderAgeWarning. Je voert als argument een int in, die test of de boolean methode >17  true of <17 false is.
        if (isOldEnough(12)==true){
            printProceed();
        }else {
            printUnderAgeWarning();
        }

    }

    public  static boolean isOldEnough(int age) {
        if(age > 17) {
            return true;
        } else {
            return false;
        }
    }

    public static void printUnderAgeWarning() {
        System.out.println("You are not old enough for this activity!");
    }

    public static void printProceed() {
        System.out.println("No warning!");
    }
}
