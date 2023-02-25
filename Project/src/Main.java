import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Point> listIn;
        Azimuth az;
        List<Foundation> listOut = null;
        try {

// import danych z pliku
            Scanner importer = new Scanner(new File("Wsad.txt"));
            //Lista wejściowa
            listIn = new ArrayList<>();
            // Lista wyjściowa
            listOut = new ArrayList<Foundation>();

            az = new Azimuth();

            try {


                while (importer.hasNextLine()) {
                    for (int i = 0; i < 2; i++) {
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



            //obliczenie nowych X i Y środka przekątnej pomiedzy punktami


            az.calculatePointOnDiagonalX(listIn.get(0).x, listIn.get(0).y, listIn.get(1).x, listIn.get(1).y);
            az.calculatePointOnDiagonalY(listIn.get(0).x, listIn.get(0).y, listIn.get(1).x, listIn.get(1).y);
            System.out.println("Azymut dla punktu 1 i 2 wynosi: "+az.calculateAzimuth(listIn.get(0).x, listIn.get(0).y, listIn.get(1).x, listIn.get(1).y)+" Stopni ");

            //tworzenie obiektu klasy Foundation który będzie miał obliczone współrzędne z dwóch wczytanych, będzie to punkt w połowie przekątnej
            // łączącej punkty

            Foundation f = new Foundation(listIn.get(0).name, az.calculatePointOnDiagonalX(listIn.get(0).x, listIn.get(0).y, listIn.get(1).x, listIn.get(1).y),
                    az.calculatePointOnDiagonalY(listIn.get(0).x, listIn.get(0).y, listIn.get(1).x, listIn.get(1).y), listIn.get(0).z-0.24);


            listOut.add(f);


            importer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

        //Zapis listy wyjściowej do pliku

      String filepath="Output.txt";
       FileWriter exporter=null;
       try{
           exporter= new FileWriter(filepath);
           exporter.write(String.valueOf(listOut.get(0).toString()));


       } finally {
           if (exporter !=null){
               exporter.close();
           }
       }



    }


}