package App;

    public class MinibusCity extends Car {

        public MinibusCity(String brendCar,
                           String modelCar,
                           String gearBoxСar,
                           String bodyType,
                           int yearCarManufacture) {
            super(brendCar, modelCar, gearBoxСar, bodyType, yearCarManufacture);

        }

        @Override
        public void start() {
            this.startFuelSystem();
            this.startGas();
        }

        protected void startFuelSystem() {
            System.out.println("Use Fuel");
        }

        protected void startGas() {
            System.out.println("Start gas");
        }
    }






