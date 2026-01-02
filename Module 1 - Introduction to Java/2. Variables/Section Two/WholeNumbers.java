public class WholeNumbers {
    public static void main(String[] args) {
        // long variable is for large whole numbers exceeding 2 billion range
        // remember 8 bits = 1 byte: 32bit = 4byte, 64bit = 8byte, 16bit = 2byte
        long globalPopulation = 8_000_000_000L;
        System.out.println("The global population is: " + globalPopulation);
        // just use sysout and hit enter to auto complete the print statement
        long dailyGoogleSearches = 8_500_000_000L;
        // Notice the underscores in the long numbers - they are just for readability
        System.out.println("Daily Google searches: " + dailyGoogleSearches);
    }
}