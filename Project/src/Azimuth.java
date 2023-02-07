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


        public double calculatePiontDiagonal(double x1, double y1, double x2, double y2){
            double deltaX=x2-x1;
            double deltaY=y2-y1;
            double diagonal=Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));
            return diagonal/2;

        }








}
