public class Quiz2_2 {
    public static void main(String[] args) {
        String name = "Rayan";
        String course = "Java";
        String mood = "happy";
        char grade = 'A';
        int review = 5;

        String course = "chemistry";
        char grade = "B";
        System.out.println("I got a " + grade + " in " + course);

        String course = "chemistry";
 
        String grade = "A"; // this should be a char to save memory
        
        System.out.println("I got an " + grade + " in " + course);

        // If string is more flexible, why use char?
        // ans: memory and performance - char use less memory, and char is faster than string
    }
}
