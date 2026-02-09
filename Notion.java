class Notion {

    public static void main(String[] args) {
        saveUserRegistration("hanumant@gmail.com", 789456, "Hanumanta", "Devu Gouda", "15/08/2001");
    }

    static void saveUserRegistration(String email, int verificationCode, String firstName, String lastName, String dateOfBirth) {
        System.out.println("The email ID of the user is : " + email);
        System.out.println("The verification code entered by the user is : " + verificationCode);
        System.out.println("The first name of the user is : " + firstName);
        System.out.println("The last name of the user is : " + lastName);
        System.out.println("The date of birth of the user is : " + dateOfBirth);
    }
}
