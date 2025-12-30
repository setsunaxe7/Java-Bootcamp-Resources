public class Variables {
    public static void main(String[] args) {
        // Lesson 1: Using data type int to store passengers on bus
        // Golden rule: use smallest amount of memory possible

        int passengers = 6;
        System.out.println(passengers);

        int busTickets = passengers;
        System.out.println(busTickets);

        int maxValue = 2147483647; // 2147483648 will cause java squiggly error! 
        // maxValue is greyed out now because it is declared but never used. Print it to use it.
        // anything higher than maxValue, use long data type!
    }
}
