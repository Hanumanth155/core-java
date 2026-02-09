class AdobeExpress {

    public static void main(String[] args) {
        saveUserRegistration("hanumant_gouda", "Adobe@123", "Adobe@123", 1234, "hanumanta", "gouda", "India", true);
    }

    static void saveUserRegistration(String userName, String password, String passwordVerification, int otp, String firstName, String lastName, String country, boolean isNewUser) {
        System.out.println("The username of the user is : " + userName);
        System.out.println("The password of the user is : " + password);
        System.out.println("The password verification of the user is : " + passwordVerification);
        System.out.println("The OTP entered by the user is : " + otp);
        System.out.println("The first name of the user is : " + firstName);
        System.out.println("The last name of the user is : " + lastName);
        System.out.println("The country of the user is : " + country);
        System.out.println("The user is registering for the first time : " + isNewUser);
    }
}

