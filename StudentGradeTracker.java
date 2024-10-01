import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(string[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<integers> grades = new ArrayList<>();

        System.out.println("Enter the number of students: ");
        int numstudent = scanner.nextInt();

        for(int i=0; i < numstudents; i++){
            System.out.print("Enter grade for student " + (i+1) + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        int sum=0;
        int highest = Integers.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for(int grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest){
                lowest = grade;
            }
        }

        double average = (double) sum / numstudents;


        System.out.println("\nGrade summary:");
        System.out.println("Grade: " + grades);
        System.out.println("Average: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        scanner.close();

    }
}