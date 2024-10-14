import java.util.Scanner;
public class Assignment1A
{
    // a program that takes in the width and height in pixels, as well as the resolution.
    public static void main(String[] args)
    {
        int width, height, resolution;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width (in pixels): ");
        width = scan.nextInt();
        System.out.println("Enter the height (in pixels): ");
        height = scan.nextInt();
        System.out.println("Enter the resolution (PPI): ");
        resolution = scan.nextInt();

        float widthInch = (float)width/(float)resolution;
        float heightInch = (float)height/(float)resolution;

        System.out.println ("At" + " " + resolution + " " + "PPI, the image is " + " " + widthInch +  "\"" + " wide by " + " " + heightInch + "\" " + " high.");
    }
}