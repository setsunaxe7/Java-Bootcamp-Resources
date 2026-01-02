public class Decimals {
    public static void main(String[] args) {
        // double variable to store decimal numbers up to 15 decimal places
        double percentage = 73.5;
        System.out.println(percentage + "% of percentages are made up");

        // no int for math calculations!!! Use double instead - if use int then java will cut away the decimals
        int wallet = 20;
        int people = 3;
        // 20/3 = 6.66 but using int will give 6
        double fairShare = (double) wallet / people;
        // casting int to double to get decimal result (above statement)
        System.out.println("Each person gets: $" + fairShare);

        //OR use double from the beginning, at least one variable is double then decimal result will appear
        double wallet2 = 20;
        int people2 = 3;
        System.out.println(wallet2/people2);

    }
    
}
