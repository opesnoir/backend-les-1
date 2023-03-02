package nl.novi.jp.methods.medior;

/**
 * Gegeven: Een methode waarin je een string kunt stoppen. Deze methode transformeert de String op zo'n manier dat
 * alleen de eerste letter een hoofdletter is.
 *
 * De methode wordt echter nog niet gebruikt voor printName(), waardoor de namen nu allemaal rare hoofdletters hebben.
 *
 * Los dit op!
 */
public class MediorThree {

    public static void main(String[] args) {
        printName("SjAaK", "Patat");
        printName("henk","spaghetti");
        printName("Doerak", "BELL");
    }

    public static void printName(String firstName, String lastName) {

        // je zet eerst de string input om naar lowercase
        String transformFirstName = firstName.toLowerCase();
        String transformLastName = lastName.toLowerCase();

        // daarna zet je de eerste letter om naar een hoofdletter (0,1) zegt van index 0 tot aan 1 omzetten in hoofdletter, en gebruik de methode transformfurstname (die de tekst omzet in lowercase) vanaf indexnummer 1 in.
        transformFirstName = transformLastName.substring(0,1).toUpperCase() + transformFirstName.substring(1);
        transformLastName = transformLastName.substring(0,1).toUpperCase() + transformLastName.substring(1);

        // vervolgens print je de getransformeerde vorm van first- en die van last name:
        System.out.println("Naam: " + transformFirstName + " " + transformLastName);
    }

    public static String firstLetterToUpperCase(String name) {

        String transformedName = name.toLowerCase();
        transformedName = transformedName.substring(0,1).toUpperCase() + transformedName.substring(1);

        return transformedName;
    }

}
