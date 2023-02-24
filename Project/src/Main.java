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

            System.out.println(listIn.get(0).getName());
            System.out.println(listIn.get(1).getName());

            //obliczenie nowych X i Y środka przekątnej pomiedzy punktami


            System.out.println(az.calculatePointOnDiagonalX(listIn.get(0).x, listIn.get(0).y, listIn.get(1).x, listIn.get(1).y));
            System.out.println(az.calculatePointOnDiagonalY(listIn.get(0).x, listIn.get(0).y, listIn.get(1).x, listIn.get(1).y));

            //tworzenie obiektu klasy Foundation który będzie miał obliczone współrzędne z dwóch wczytanych, będzie to punkt w połowie przekątnej łączącej

            Foundation f = new Foundation(listIn.get(0).name, az.calculatePointOnDiagonalX(listIn.get(0).x, listIn.get(0).y, listIn.get(1).x, listIn.get(1).y),
                    az.calculatePointOnDiagonalY(listIn.get(0).x, listIn.get(0).y, listIn.get(1).x, listIn.get(1).y), listIn.get(0).z);


            listOut.add(f);

            System.out.println(listOut.get(0).toString());


            importer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

        //Zapis listy wyjściowej do pliku

//    try {
//        PrintWriter exporter = new PrintWriter("out");
//        exporter.println(listOut);
//
//        exporter.close();
//
//    }catch (FileNotFoundException e){
//        e.printStackTrace();
//    }

       String filepath="Output.txt";
        FileWriter exporter=null;
        try{
            exporter= new FileWriter(filepath);
            exporter.write(String.valueOf(listOut));

        } finally {
            if (exporter !=null){
                exporter.close();
            }
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