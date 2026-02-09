class Kaggle {

    public static void main(String[] args) {
        saveUserRegistration("hanumant@gmail.com", "Hanumant@123", "hanumanta-devu-gouda", true, "Student", "Data Science and Machine Learning", "Beginner");
    }

    static void saveUserRegistration(String email, String password, String username, boolean isEmailVerified, String learningRole, String interestedDomain, String skillLevel) {
        System.out.println("The email ID of the user is : " + email);
        System.out.println("The password of the user is : " + password);
        System.out.println("The username of the user is : " + username);
        System.out.println("The email verification status of the user is : " + isEmailVerified);
        System.out.println("The learning role selected by the user is : " + learningRole);
        System.out.println("The interested domain chosen by the user is : " + interestedDomain);
        System.out.println("The skill level of the user is : " + skillLevel);
    }
}
