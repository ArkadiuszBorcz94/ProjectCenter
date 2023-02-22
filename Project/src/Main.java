import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {

// import danych z pliku
            Scanner importer = new Scanner(new File("Wsad.txt"));
  //Lista wejściowa
            List<Point> listIn = new ArrayList<>();
            // Lista wyjściowa
      //      List<Foundation> listOut= new ArrayList<Foundation>();


            try {



                while (importer.hasNextLine()) {
                    for (int i=0;i<2;i++) {
                        String n = importer.next();
                        double x = importer.nextDouble();
                        double y = importer.nextDouble();
                        double z = importer.nextDouble();

                        Point p = new Point(n, x, y, z);
                        //   System.out.println("Numer: " + p.name + " X: " + p.x + " Y: " + p.y + " Z: " + p.z);
                        listIn.add(p);
                        i++;
                    }



                }
            } catch (InputMismatchException e) {
                System.out.println("Błędny plik z danymi");
            }

           System.out.println( listIn.get(0).getName());
          System.out.println( listIn.get(1).getName());

        //obliczenie nowych X i Y środka przekątnej pomiedzy punktami



            Azimuth az=new Azimuth();
            System.out.println(az.calculatePointOnDiagonalX(listIn.get(0).x,listIn.get(0).y,listIn.get(1).x,listIn.get(1).y));
            System.out.println(az.calculatePointOnDiagonalY(listIn.get(0).x,listIn.get(0).y,listIn.get(1).x,listIn.get(1).y));


            Foundation f=new Foundation(listIn.get(0).name, az.calculatePointOnDiagonalX(listIn.get(0).x,listIn.get(0).y,listIn.get(1).x,listIn.get(1).y),
                    az.calculatePointOnDiagonalY(listIn.get(0).x,listIn.get(0).y,listIn.get(1).x,listIn.get(1).y),listIn.get(0).z);




            importer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }


  //      Point p = new Point("1", 5881181.18, 8433248.391, 138.487);
  //      Point pp = new Point("2", 5881181.09, 8433248.878, 138.5);
  //
  //      Azimuth az=new Azimuth();
  //      System.out.println( az.calculateAzimuth(p.x,p.y,pp.x,pp.y));
  //     System.out.println(az.calculatePointOnDiagonalX(p.x,p.y,pp.x,pp.y));
  //      System.out.println(az.calculatePointOnDiagonalY(p.x,p.y,pp.x,pp.y));
  //      Point ppp =new Point();



    }





}