class AbhiBus {

    public static void main(String[] args) {
        saveUserRegistration("9876543210", true, "hanumant@gmail.com", "Hanumanta Devu Gouda");
    }

    static void saveUserRegistration(String mobileNumber, boolean isOtpVerified, String email, String fullName) {
        System.out.println("The mobile number of the user is : " + mobileNumber);
        System.out.println("The OTP verification status of the user is : " + isOtpVerified);
        System.out.println("The email ID of the user is : " + email);
        System.out.println("The full name of the user is : " + fullName);
    }
}
