class InternetPlan {
    public static void main(String[] args) {

        String providerName = "Jio";
        String planName = "Unlimited 5G";
        int dataLimitInGb = 300;
        float speedInMbps = 150.0f;
        double monthlyCost = 999.00;
        long planId = 1122334455L;
        boolean isRoamingAvailable = true;
        int validityInDays = 28;
        String networkType = "5G";
        float customerRating = 4.6f;

        System.out.println("The name of the service provider is : " + providerName);
        System.out.println("The name of the internet plan is : " + planName);
        System.out.println("The total data limit in GB is : " + dataLimitInGb);
        System.out.println("The internet speed in Mbps is : " + speedInMbps);
        System.out.println("The monthly cost of the plan is : " + monthlyCost);
        System.out.println("The plan ID number is : " + planId);
        System.out.println("Roaming service availability is : " + isRoamingAvailable);
        System.out.println("The validity of the plan in days is : " + validityInDays);
        System.out.println("The type of network provided is : " + networkType);
        System.out.println("The customer rating for this plan is : " + customerRating);
    }
}
