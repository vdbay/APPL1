import java.util.Scanner;
import java.io.*;
public class Warning
{
    public static void main (String[] args)
    {
        int creditHrs; // number of semester hours earned
        double qualityPts; // number of quality points earned
        double gpa; // grade point (quality point) average
        String name, inputName = "students.dat";
        String outputName = "warning.dat";
        try
        {
            Scanner inFile = new Scanner(new File(inputName));
            PrintWriter outFile = new PrintWriter(outputName);
            outFile.println ();
            outFile.println ("Students on Academic Warning");
            outFile.println ();
            while (inFile.hasNextLine())
            {
                String[] lines = inFile.nextLine().split(" ");
                name=lines[0];
                creditHrs=Integer.parseInt(lines[1]);
                qualityPts=Float.parseFloat(lines[2]);
                gpa=qualityPts/creditHrs;
                if((creditHrs<30&&gpa<1.5)||(creditHrs<60&&gpa<1.75)||(creditHrs>60&&gpa<2.0)){
                    outFile.println(name+" "+creditHrs+" "+qualityPts+" "+gpa);
                    System.out.println(name+" "+creditHrs+" "+qualityPts+" "+gpa);
                }
            }
            outFile.close();
        }
        catch (FileNotFoundException exception)
        {
            System.out.println ("The file " + inputName + " was not found.");
        }
        catch (NumberFormatException e)
        {
            System.out.println ("Format error in input file: " + e);
        }
    }
}