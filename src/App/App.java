package App;

public class App {

    public static void main(String[] arg) {
        ElectricCar electricCar = new ElectricCar("BMW",
                "i7",
                "Sedan",
                "None",
                2023);

        electricCar.startElectricity();



            MinibusCity minibusCity = new MinibusCity(" Bogdan",
                    "A-09202",
                    "MT",
                    "Minibus",
                    1999);

           minibusCity.startGas();

            Lcv lcv=new Lcv("Toyota",
                    "Prado",
                    "AT",
                    "SUV",
                    2022);
//            lcv.startElectricity();
            lcv.startFuelSystem();
//            lcv.startCommand();

        }
    }





