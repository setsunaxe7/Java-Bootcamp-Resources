public class Test {
    public static void main(String[] args) {
        // Test code can be added here if needed
        int sales = 3;
        sales = sales - 5;
        sales = sales - 10;
        sales = sales + 2;
        System.out.println("Total sales: " + sales);

        int apples = 50;
        int goneBad = 5;
        int rotten = 20;
        int sold = 20;
        
        apples -= goneBad;
        apples -= rotten;
        apples -= sold;
        System.out.println("Apples left: " + apples);

        int score = 0;
        int goal = 1;
        score += goal;
        score += goal;
        score += goal;
        score += goal;
        System.out.println("Final score: " + score);

        int foo = 2;
 
        int bar = foo - 6;
        foo += bar;
        System.out.println("Value of foo: " + foo);
    }
}
