class Udemy {

    public static void main(String[] args) {
        saveUserRegistration("hanumant@gmail.com", "Udemy@123", true, "Software Development", "Full Stack Developer", "HTML, CSS, JavaScript");
    }

    static void saveUserRegistration(String mobileOrEmail, String password, boolean isEmailVerified, String learningField, String occupationGoal, String interestedSkills) {
        System.out.println("The mobile number or email ID of the user is : " + mobileOrEmail);
        System.out.println("The password of the user is : " + password);
        System.out.println("The email verification status is : " + isEmailVerified);
        System.out.println("The learning field selected by the user is : " + learningField);
        System.out.println("The occupation goal of the user is : " + occupationGoal);
        System.out.println("The interested skills selected by the user are : " + interestedSkills);
    }
}
