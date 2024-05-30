package App;

public abstract class Car {


    private String brendCar;
    private String modelCar;
    private String gearBoxСar;
    private String bodyType;
    private int yearCarManufacture;

    public Car(String brendCar,
               String modelCar,
               String gearBoxСar,
               String bodyType,
               int yearCarManufacture) {
        this.brendCar = brendCar;
        this.modelCar = modelCar;
        this.gearBoxСar = gearBoxСar;
        this.bodyType = bodyType;
        this.yearCarManufacture = yearCarManufacture;
    }

    public String getBrendCar() {
        return brendCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public String getGearBoxСar() {
        return gearBoxСar;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getYearCarManufacture() {
        return yearCarManufacture;
    }

    public void setBrendCar(String brendCar) {
        this.brendCar = brendCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public void setGearBoxСar(String gearBoxСar) {
        this.gearBoxСar = gearBoxСar;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setYearCarManufacture(int yearCarManufacture) {
        this.yearCarManufacture = yearCarManufacture;
    }

    public abstract void start();
}

//    {
//          startElectricity();
//         startCommand();
//        startFuelSystem();
//
//        }
//
//    }



//    public void startFuelSystem() {
//        this.petrolfuel();
//        this.dieselfuel();}
//
//    protected void petrolfuel() {
//        System.out.println("Use petrol");
//    }
//
//    protected void dieselfuel() {
//        System.out.println("Use diesel");
//    } }








