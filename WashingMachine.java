class WashingMachine {
    public static void main(String[] args) {

        String brandName = "LG";
        String modelName = "TurboWash";
        int capacityInKg = 8;
        float powerConsumption = 0.85f;
        double price = 28999.99;
        long serialNumber = 9988665544L;
        boolean isFullyAutomatic = true;
        String color = "White";
        int warrantyInYears = 2;
        float drumSpeedRpm = 1200.0f;

        System.out.println("The brand name of the washing machine is " + brandName + ".");
        System.out.println("The model name of the washing machine is " + modelName + ".");
        System.out.println("The capacity of the washing machine is " + capacityInKg + " kilograms.");
        System.out.println("The power consumption of the washing machine is " + powerConsumption + " units.");
        System.out.println("The price of the washing machine is " + price + " rupees.");
        System.out.println("The serial number of the washing machine is " + serialNumber + ".");
        System.out.println("This washing machine is fully automatic: " + isFullyAutomatic + ".");
        System.out.println("The color of the washing machine is " + color + ".");
        System.out.println("The warranty period of the washing machine is " + warrantyInYears + " years.");
        System.out.println("The drum speed of the washing machine is " + drumSpeedRpm + " RPM.");
    }
}
