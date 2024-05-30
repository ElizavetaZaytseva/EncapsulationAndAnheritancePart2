package App;

    public class Lcv extends Car {

        public Lcv(String brendCar,
                   String modelCar,
                   String gearBoxСar,
                   String bodyType,
                   int yearCarManufacture) {
            super(brendCar, modelCar, gearBoxСar, bodyType, yearCarManufacture);

        }
        @Override
        public void start() {
            this.startElectricity();
            this.startCommand();
            this.startFuelSystem();
        }

        protected void startElectricity() {
            System.out.println("Use electricity");
        }

        protected void startCommand() {
            System.out.println("Use Command");
        }
        protected void startFuelSystem() {
            System.out.println("Use Fuel");
        }
    }



