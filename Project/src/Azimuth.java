public class Azimuth {




    // metoda obliczająca azymut
        public double calculateAzimuth(double x1, double y1, double x2, double y2){

            double deltaX=x2-x1;
            double deltaY=y2-y1;
            double quadrantal=Math.toDegrees(Math.atan2(deltaY,deltaX));
            double azimuth = 0;

//wzory decydujace w której ćwiartce układu współrzędnych znajduje się czwartak co ma wpływ na wartoś azymutu

           if (deltaY>0&&deltaX>0){
                azimuth=quadrantal;

            }else if (deltaY>0&&deltaX<0){

                azimuth=180+quadrantal;

            } else if (deltaY<0&&deltaX<0) {

                azimuth=180+quadrantal;

            } else if (deltaY<0&&deltaX>0){

                azimuth=360+quadrantal;

            }
            return azimuth;
        }

    //Metoda która liczy odległość pomiędzy punktami
        public double calculatePointDiagonal(double x1, double y1, double x2, double y2){
            double deltaX=x2-x1;
            double deltaY=y2-y1;
            double diagonal=Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));
            return diagonal/2;
        }
    //Metoda która liczy współrzedną X punktu na przekątnej

        public double calculatePointOnDiagonalX(double x1, double y1, double x2, double y2){
            double deltaX=x2-x1;
            double deltaY=y2-y1;
            double diagonal=Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));

            double deltaXdiagonal=diagonal*(deltaX/diagonal);

            return x1+(deltaXdiagonal)/2;
        }

    //Metoda która liczy współrzedną Y punktu na przekątnej

        public double calculatePointOnDiagonalY(double x1, double y1, double x2, double y2){
            double deltaX=x2-x1;
            double deltaY=y2-y1;
            double diagonal=Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));
            double deltaYdiagonal=diagonal*(deltaY/diagonal);


            return y1+(deltaYdiagonal)/2;




    }







}
