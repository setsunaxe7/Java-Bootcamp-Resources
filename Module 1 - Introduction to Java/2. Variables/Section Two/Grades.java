public class Grades {
    public static void main(String[] args) {
        // Lesson 4: Char only stores one letter, which is 2 bytes.
        char potions = 'A'; // note how the grade letter is wrapped in single quotes
        char arithmancy = 'B';
        char charms = 'C';

        System.out.println("Potions grade: " + potions + "\nArithmancy grade: " + arithmancy + "\nCharms grade: " + charms);

        //why not use string? REMEMBER: GOAL IS TO SAVE MEMORY
    }
}
