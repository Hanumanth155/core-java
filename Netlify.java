class Netlify {

    public static void main(String[] args) {
        saveUserRegistration("Personal Projects", "Hanumanta Devu Gouda", "hanumant@gmail.com", "Hanumant@123", true);
    }

    static void saveUserRegistration(String planType, String fullName, String email, String password, boolean isEmailVerified) {
        System.out.println("The plan type selected by the user is : " + planType);
        System.out.println("The full name of the user is : " + fullName);
        System.out.println("The email ID of the user is : " + email);
        System.out.println("The password of the user is : " + password);
        System.out.println("The email verification status of the user is : " + isEmailVerified);
    }
}
