class PowerBank {
    public static void main(String[] args) {

        String brandName = "Mi";
        String modelName = "PB20000";
        int capacityInMah = 20000;
        float weightInKg = 0.42f;
        double price = 1799.99;
        long serialNumber = 5544332211L;
        boolean isFastChargingSupported = true;
        String color = "Black";
        int warrantyInMonths = 12;
        float chargingTimeInHours = 4.5f;

        System.out.println("The brand name of the power bank is " + brandName + ".");
        System.out.println("The model name of the power bank is " + modelName + ".");
        System.out.println("The capacity of the power bank is " + capacityInMah + " mAh.");
        System.out.println("The weight of the power bank is " + weightInKg + " kilograms.");
        System.out.println("The price of the power bank is " + price + " rupees.");
        System.out.println("The serial number of the power bank is " + serialNumber + ".");
        System.out.println("Fast charging support availability in this power bank is " + isFastChargingSupported + ".");
        System.out.println("The color of the power bank is " + color + ".");
        System.out.println("The warranty period of the power bank is " + warrantyInMonths + " months.");
        System.out.println("The charging time of the power bank is approximately " + chargingTimeInHours + " hours.");
    }
}
