class Canva {

    public static void main(String[] args) {
        saveUserRegistration("hanumant@gmail.com", true, "Hanumanta", "Devu Gouda", "15/08/2001", "Personal");
    }

    static void saveUserRegistration(String email, boolean isOtpVerified, String firstName, String lastName, String dateOfBirth, String usagePurpose) {
        System.out.println("The email ID of the user is : " + email);
        System.out.println("The OTP verification status of the user is : " + isOtpVerified);
        System.out.println("The first name of the user is : " + firstName);
        System.out.println("The last name of the user is : " + lastName);
        System.out.println("The date of birth of the user is : " + dateOfBirth);
        System.out.println("The purpose of using Canva by the user is : " + usagePurpose);
    }
}
