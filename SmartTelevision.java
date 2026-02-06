class SmartTelevision {
    public static void main(String[] args) {

        String brandName = "Sony";
        String modelName = "Bravia X75";
        int screenSizeInInches = 55;
        float refreshRate = 60.0f;
        double price = 64999.50;
        long serialNumber = 4455667788L;
        boolean isSmartTv = true;
        String resolution = "4K";
        int warrantyInYears = 2;
        float weightInKg = 14.5f;

        System.out.println("The brand name of the television is " + brandName + ".");
        System.out.println("The model name of the television is " + modelName + ".");
        System.out.println("The screen size of the television is " + screenSizeInInches + " inches.");
        System.out.println("The refresh rate of the television is " + refreshRate + " Hz.");
        System.out.println("The price of the television is " + price + " rupees.");
        System.out.println("The serial number of the television is " + serialNumber + ".");
        System.out.println("This television is a smart TV: " + isSmartTv + ".");
        System.out.println("The resolution supported by the television is " + resolution + ".");
        System.out.println("The warranty period of the television is " + warrantyInYears + " years.");
        System.out.println("The weight of the television is " + weightInKg + " kilograms.");
    }
}
