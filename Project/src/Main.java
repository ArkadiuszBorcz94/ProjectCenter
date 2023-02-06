import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try {


            Scanner importer = new Scanner(new File("Wsad.txt"));
            try {
                while (importer.hasNextLine()) {
                    String n = importer.next();
                    double x = importer.nextDouble();
                    double y = importer.nextDouble();
                    double z = importer.nextDouble();

                    System.out.println("Numer: " +n+ " X: "+x+" Y: "+y+" Z: "+z);


                    Point p =new Point(n,x,y,z);
                    System.out.println("Numer: " +p.name+ " X: "+p.x+" Y: "+p.y+" Z: "+p.z);


                }







            } catch(InputMismatchException e){
                System.out.println("Błędny plik z danymi");
            }

           importer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }








}