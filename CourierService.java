class CourierService {
    public static void main(String[] args) {

        String companyName = "DTDC";
        String parcelType = "Documents";
        int totalBranches = 1200;
        float rating = 4.3f;
        double deliveryCharge = 120.50;
        long trackingNumber = 8899776655L;
        boolean isInternationalService = true;
        String headOfficeCity = "Mumbai";
        int dailyDeliveries = 50000;
        float averageDeliveryDays = 2.5f;

        System.out.println("The name of the courier company is " + companyName + ".");
        System.out.println("The type of parcel being sent is " + parcelType + ".");
        System.out.println("The company has a total of " + totalBranches + " branches.");
        System.out.println("The customer rating of the company is " + rating + " stars.");
        System.out.println("The delivery charge for this parcel is " + deliveryCharge + " rupees.");
        System.out.println("Your tracking number is " + trackingNumber + ".");
        System.out.println("International service availability: " + isInternationalService + ".");
        System.out.println("The head office of the company is located in " + headOfficeCity + ".");
        System.out.println("The company delivers approximately " + dailyDeliveries + " parcels every day.");
        System.out.println("The average delivery time is " + averageDeliveryDays + " days.");
    }
}
