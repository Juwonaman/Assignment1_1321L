import java.util.Scanner;
public class Assignment1B
{
    public static void main(String[] args)
    {
        double labgrade, assignmentgrade, midtermgrade, finalgrade;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your average lab grade: ");
        labgrade = scan.nextDouble();
        System.out.println("Enter your average assignment grade: ");
        assignmentgrade = scan.nextDouble();
        System.out.println("Enter your midterm exam grade: ");
        midtermgrade = scan.nextDouble();
        System.out.println("Enter your final exam grade: ");
        finalgrade = scan.nextDouble();
        float avglab, avgassign, avgmidterm, avgfinal;
        avglab = (float)(labgrade * .10);
        avgassign =(float)(assignmentgrade * .40);
        avgmidterm =(float)(midtermgrade * .20);
        avgfinal =(float) (finalgrade * .30);

        float avgCourseGrade = avglab + avgassign + avgmidterm + avgfinal;
        System.out.println("Your weighted lab average is " + avglab);
        System.out.println("Your weighted assignment average is " + avgassign);
        System.out.println("Your weighted midterm exam average is "+ avgmidterm);
        System.out.println("Your weighted final exam average is "+ avgfinal);
        System.out.println("Adding numbers...");

        System.out.println ("Your final grade in CSE 1321L is " + avgCourseGrade);



    }
}

