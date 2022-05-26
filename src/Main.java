import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("________________");
        System.out.println("Hello DND world!");
        System.out.println("________________");
        Scanner scanner = new Scanner(System.in);

        boolean inputOk = false;
        while (inputOk == false) {
            System.out.println("Choisissez votre personnage:");
            // On parcourt l'enum et on affiche Ordinale/Value
            for (CPersonage.PersonageType t : CPersonage.PersonageType.values()) {
                System.out.println(t.ordinal() + "  " + t);
            }
            System.out.println("Choix:");
            int valueToCheck = scanner.nextInt();
            if (valueToCheck < CPersonage.PersonageType.values().length) {
                CPersonage.PersonageType choicePersonageType = CPersonage.PersonageType.values()[valueToCheck];
                System.out.println(choicePersonageType);
                inputOk = true;
            } else {
                System.out.println("Je n'ai pas compris votre choix!!!!");
            }
        }

        scanner.close();

        //CMagician mag1 = new CMagician("Merlin");
        //CWarrior war1 = new CWarrior("Connan");
        //System.out.println(mag1);
        //System.out.println(war1);
    }
}