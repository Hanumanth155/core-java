class Superset {

    public static void main(String[] args) {
        saveUserRegistration("Hanumanta", "Devu", "Gouda", "15/08/2001", "Male", "ABC Engineering College", "Hanumant@123", "Hanumant@123", true, true);
    }

    static void saveUserRegistration(String firstName, String middleName, String lastName, String dateOfBirth, String gender, String collegeName, String password, String retypePassword, boolean termsAccepted, boolean isHumanVerified) {
        System.out.println("The first name of the user is : " + firstName);
        System.out.println("The middle name of the user is : " + middleName);
        System.out.println("The last name of the user is : " + lastName);
        System.out.println("The date of birth of the user is : " + dateOfBirth);
        System.out.println("The gender of the user is : " + gender);
        System.out.println("The college name of the user is : " + collegeName);
        System.out.println("The password entered by the user is : " + password);
        System.out.println("The re-typed password entered by the user is : " + retypePassword);
        System.out.println("The terms and conditions acceptance status is : " + termsAccepted);
        System.out.println("The human verification status is : " + isHumanVerified);
    }
}
