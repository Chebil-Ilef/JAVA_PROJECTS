import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter math grade (0-20): ");
        int mathGrade = input.nextInt();

        System.out.print("Enter science grade (0-20): ");
        int scienceGrade = input.nextInt();

        System.out.print("Enter english grade (0-20): ");
        int englishGrade = input.nextInt();

        validateGrades(mathGrade, scienceGrade, englishGrade);
    }
        public static void validateGrades(int mathGrade, int scienceGrade, int englishGrade) {
        assert mathGrade >= 0 && mathGrade <= 20 : "Invalid math grade value! Grade must be between 0 and 20.";
        assert scienceGrade >= 0 && scienceGrade <= 20 : "Invalid science grade value! Grade must be between 0 and 20.";
        assert englishGrade >= 0 && englishGrade <= 20 : "Invalid english grade value! Grade must be between 0 and 20.";
        System.out.println("All grades are valid.");
    }
}


