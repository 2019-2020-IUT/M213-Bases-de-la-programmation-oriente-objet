package vehiculev2;

public class Camion extends VehiculeAMoteur {

    private double Volume;


/*==========================================================Getter & Setters====================================================================*/
        /**
         * @return the nombrePlace
         */
        public double getVolume() {
            return Volume;
        }
    
        /**
         * @param nombrePlace the nombrePlace to set
         */
        public void setVolume(int Volume) {
            this.Volume = Volume;
        }
/*==========================================================Getter & Setters====================================================================*/

        public Camion(double v, double c) {
            super(c);
            this.Volume = v;
        }

        public String toString() {
            return super.toString() + " et un réservoir de" + this.Volume + "m^3.";
        }


}
