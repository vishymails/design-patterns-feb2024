package com.bvr.creational.builder;

public class CarParts {
    public static enum carType {
        SEDAN, SPORTS, LUXURY
    };
    public String getName() {
        return "Mahindra";
    };
}

class Engine extends CarParts {
    public String engineNo;

    public Engine(carType car) {
        switch (car) {
            case SEDAN:
                this.engineNo = "SED-Engine";
                break;
            case SPORTS:
                this.engineNo = "SPR-Engine";
                break;
            case LUXURY:
                this.engineNo = "LUX-Engine";
                break;
        }
    }

    public String getName() {
        return this.engineNo;
    }
}


    class Electronics extends CarParts {
        public String electronics;

        public Electronics(carType car) {
            switch (car) {
                case SEDAN:
                    this.electronics = "SED-Electronics";
                    break;
                case SPORTS:
                    this.electronics = "SPR-Electronics";
                    break;
                case LUXURY:
                    this.electronics = "LUX-Electronics";
                    break;
            }
        }

        public String getName() {
            return this.electronics;
        }
    }



class CarBody extends CarParts {
    public String carBodyNo;

    public CarBody(carType car) {
        switch (car) {
            case SEDAN:
                this.carBodyNo = "SED-Body";
                break;
            case SPORTS:
                this.carBodyNo = "SPR-Body";
                break;
            case LUXURY:
                this.carBodyNo = "LUX-Body";
                break;
        }
    }

    public String getName() {
        return this.carBodyNo;
    }
}
