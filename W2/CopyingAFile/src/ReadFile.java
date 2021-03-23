import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        String lagi = "y";
        while (lagi.equalsIgnoreCase("y")){
            System.out.println("Input file name with extension : ");
            Scanner scanner = new Scanner(System.in);
            String filename = scanner.next();
            try{
                Scanner scanFile = new Scanner(new File(filename));
                while (scanFile.hasNextLine()) {
                    String line = scanFile.nextLine();
                    System.out.println(line);
                }
            }catch(FileNotFoundException e){
                System.out.println(filename+" Not Found!");
            }
            System.out.println("Lagi? (y/n)");
            lagi=scanner.next();
        }
    }
}

