import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

// import danych z pliku
            Scanner importer = new Scanner(new File("Wsad.txt"));
            try {

                while (importer.hasNextLine()) {
                    String n = importer.next();
                    double x = importer.nextDouble();
                    double y = importer.nextDouble();
                    double z = importer.nextDouble();

                    //     System.out.println("Numer: " +n+ " X: "+x+" Y: "+y+" Z: "+z);


                    Point p = new Point(n, x, y, z);
                    System.out.println("Numer: " + p.name + " X: " + p.x + " Y: " + p.y + " Z: " + p.z);


                }


            } catch (InputMismatchException e) {
                System.out.println("Błędny plik z danymi");
            }

            importer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }


        Point p = new Point("1", 5881181.18, 8433248.391, 138.487);
        Point pp = new Point("2", 5881181.09, 8433248.878, 138.5);

        Azimuth az=new Azimuth();



        System.out.println( az.calculateAzimuth(p.x,p.y,pp.x,pp.y));
        System.out.println( az.calculatePiontDiagonal(p.x,p.y,pp.x,pp.y));


    }





}