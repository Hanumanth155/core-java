class BusPass {
    public static void main(String[] args) {

        String holderName = "Hanumanth";
        String passType = "Monthly";
        int passNumber = 7890;
        float distanceLimitInKm = 50.0f;
        double passPrice = 1050.00;
        long applicationId = 1122998833L;
        boolean isStudentPass = true;
        String issuingAuthority = "BMTC";
        int validityInDays = 30;
        int issuedYear = 2026;

        System.out.println("Name of the holder is : " + holderName);
        System.out.println("The type of bus pass is : " + passType);
        System.out.println("Bus Pass Number is : " + passNumber);
        System.out.println("Total distance allowed is  : " + distanceLimitInKm + "Km");
        System.out.println("The Price of Bus pass is : " + passPrice);
        System.out.println("Application ID number is : " + applicationId);
        System.out.println("Student Pass available : " + isStudentPass);
        System.out.println("Authority of issued this bus pass is : " + issuingAuthority);
        System.out.println("Validity of the Bus pass is : " + validityInDays);
        System.out.println("Bus pass issued in : " + issuedYear);
    }
}
