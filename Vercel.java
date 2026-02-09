class Vercel {

    public static void main(String[] args) {
        saveUserRegistration("Personal Projects", "Hanumanta Devu Gouda", "hanumant@gmail.com", true, true);
    }

    static void saveUserRegistration(String planType, String fullName, String email, boolean isEmailOtpVerified, boolean isMobileOtpVerified) {
        System.out.println("The plan type selected by the user is : " + planType);
        System.out.println("The full name of the user is : " + fullName);
        System.out.println("The email ID of the user is : " + email);
        System.out.println("The email OTP verification status is : " + isEmailOtpVerified);
        System.out.println("The mobile OTP verification status is : " + isMobileOtpVerified);
    }
}
