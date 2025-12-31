public class JoiningStrings {
    public static void main(String[] args) {
        // Lesson 3: Use String to store text
        // Process: Identify a type that can store text, name variable with lowerCamelCase, set variable to a value
        int year = 2010;
        String winner = "Spain";

        // Debug for strings does not work because they just skip over. DO NOT USE F5(Continue), use F10(Step Over) instead.

        String announcement = "The winner of the " + year + " world cup are " + winner;
        System.err.println(announcement);
        // We used the + operator to join (concatenate) strings and variables together
    }
}