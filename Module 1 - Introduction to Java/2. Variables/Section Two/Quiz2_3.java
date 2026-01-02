public class Quiz2_3 {
    public static void main(String[] args) {
        int apples = 10;
        int fans = 50000;
        int cellsInHumanBody = 37200000000000;               //37 trillion
        int usaPopulation = 328200000;                       //328 million

        //q1: cellsInHumanBody is too large for int, change it to long
        //q2: how fix? change to long and add L at the end of the number

        long apples = 10000;
        //q3: this ok but what wrong? not a super big number for long, use int!

        int salary = 4000;

        int age = 32;

        int weight = 75.7;


        int dividend = 20;
        int divisor = 6;
        System.out.println(dividend/divisor);
        // print 3 not 3.33333 because int/int=int


    }
    
}
