class SupersetUserRegistration {
    public static void main(String[] args) {

        String firstName = "Hanumanta";
        String middleName = "Devu";
        String lastName = "Gouda";

        String dateOfBirth = "15/08/2001";
        String gender = "Male";

        String collegeName = "ABC Engineering College";

        String password = "Hanumant@123";
        String retypePassword = "Hanumant@123";

        boolean termsAndConditionsAccepted = true;
        boolean isHumanVerified = true;

        System.out.println("First Name              : " + firstName);
        System.out.println("Middle Name             : " + middleName);
        System.out.println("Last Name               : " + lastName);
        System.out.println("Date of Birth           : " + dateOfBirth);
        System.out.println("Gender                  : " + gender);
        System.out.println("College Name            : " + collegeName);
        System.out.println("Password                : " + password);
        System.out.println("Re-type Password        : " + retypePassword);
        System.out.println("Terms Accepted          : " + termsAndConditionsAccepted);
        System.out.println("Human Verification      : " + isHumanVerified);
    }
}
