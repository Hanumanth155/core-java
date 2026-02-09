class DigiLocker {

    public static void main(String[] args) {
        saveUserRegistration("9876543210", true, "1234 5678 9012", true, "Hanumanta Devu Gouda", "15/08/2001", "Male", "hanumant@gmail.com");
    }

    static void saveUserRegistration(String mobileNumber, boolean isOtpVerified, String aadhaarNumber, boolean isAadhaarVerified, String fullName, String dateOfBirth, String gender, String email) {
        System.out.println("The mobile number of the user is : " + mobileNumber);
        System.out.println("The OTP verification status of the user is : " + isOtpVerified);
        System.out.println("The Aadhaar number of the user is : " + aadhaarNumber);
        System.out.println("The Aadhaar verification status of the user is : " + isAadhaarVerified);
        System.out.println("The full name of the user is : " + fullName);
        System.out.println("The date of birth of the user is : " + dateOfBirth);
        System.out.println("The gender of the user is : " + gender);
        System.out.println("The email ID of the user is : " + email);
    }
}
