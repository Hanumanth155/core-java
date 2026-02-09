class LaTeX {

    public static void main(String[] args) {
        saveUserRegistration("hanumant@gmail.com", "Hanumant@123", "Hanumant@123", "Hanumanta Devu Gouda", "Student", "Personal Projects");
    }

    static void saveUserRegistration(String email, String password, String confirmPassword, String fullName, String userRole, String usagePurpose) {
        System.out.println("The email ID of the user is : " + email);
        System.out.println("The password of the user is : " + password);
        System.out.println("The confirmation password entered by the user is : " + confirmPassword);
        System.out.println("The full name of the user is : " + fullName);
        System.out.println("The role selected by the user is : " + userRole);
        System.out.println("The purpose of using LaTeX by the user is : " + usagePurpose);
    }
}
