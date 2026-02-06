class Camera {
    public static void main(String[] args) {

        String brandName = "Canon";
        String modelName = "EOS 1500D";
        int megapixels = 24;
        float weightInKg = 0.48f;
        double price = 38999.99;
        long serialNumber = 7788990011L;
        boolean isDslr = true;
        String lensType = "18-55mm";
        int warrantyInYears = 2;
        float batteryLifeInHours = 4.5f;

        System.out.println("The brand name of the camera is " + brandName + ".");
        System.out.println("The model name of the camera is " + modelName + ".");
        System.out.println("The camera has a resolution of " + megapixels + " megapixels.");
        System.out.println("The weight of the camera is " + weightInKg + " kilograms.");
        System.out.println("The price of the camera is " + price + " rupees.");
        System.out.println("The serial number of the camera is " + serialNumber + ".");
        System.out.println("This camera is a DSLR: " + isDslr + ".");
        System.out.println("The lens type provided with the camera is " + lensType + ".");
        System.out.println("The warranty period of the camera is " + warrantyInYears + " years.");
        System.out.println("The battery life of the camera is approximately " + batteryLifeInHours + " hours.");
    }
}
