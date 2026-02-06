class ElectricityBill {
    public static void main(String[] args) {

        String consumerName = "Hanumanth";
        String meterNumber = "MTR90876";
        int unitsConsumed = 320;
        float taxPercentage = 5.0f;
        double totalAmount = 1850.75;
        long billNumber = 9988776655L;
        boolean isPaid = false;
        String billingMonth = "January";
        int dueDays = 10;
        float previousReading = 1250.5f;

        System.out.println("The name of the electricity consumer is " + consumerName + ".");
        System.out.println("The meter number of the consumer is " + meterNumber + ".");
        System.out.println("The total number of units consumed is " + unitsConsumed + ".");
        System.out.println("The tax percentage applied to this bill is " + taxPercentage + " percent.");
        System.out.println("The total amount to be paid for this bill is " + totalAmount + " rupees.");
        System.out.println("The bill number for this electricity bill is " + billNumber + ".");
        System.out.println("The payment status of this bill is " + isPaid + ".");
        System.out.println("The billing month for this electricity bill is " + billingMonth + ".");
        System.out.println("The bill is due to be paid within " + dueDays + " days.");
        System.out.println("The previous meter reading was " + previousReading + " units.");
    }
}
