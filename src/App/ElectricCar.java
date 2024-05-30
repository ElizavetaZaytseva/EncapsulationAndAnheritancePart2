package App;

    public class ElectricCar extends Car {

        public ElectricCar(String brendCar,
                           String modelCar,
                           String bodyType,
                           String gearBoxСar,
                           int yearCarManufacture) {
            super(brendCar, modelCar, bodyType, gearBoxСar, yearCarManufacture);

        }
        @Override
        public void start() {
            this.startElectricity();

        }

        protected void startElectricity() {
            System.out.println("Use electricity");
        }


        }







