class VTUInternship {

    public static void main(String[] args) {
        saveUserRegistration("Hanumanta Devu Gouda", "hanumanthgouda93@gmail.com", 8217279387L, "Hnumanta@123", "Hnumanta@123", true);
    }

    static void saveUserRegistration(String fullName, String emailAddress, long mobileNumber, String password, String confirmPassword, boolean agreeToTerms) {
        System.out.println("The full name of the user is : " + fullName);
        System.out.println("The email address of the user is : " + emailAddress);
        System.out.println("The mobile number of the user is : " + mobileNumber);
        System.out.println("The password entered by the user is : " + password);
        System.out.println("The confirmation password entered by the user is : " + confirmPassword);
        System.out.println("The agreement to terms and conditions status is : " + agreeToTerms);
    }
}
