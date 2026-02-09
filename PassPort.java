class PassPort {

    public static void main(String[] args) {
        saveUserRegistration("5", "hanumanthgouda93gmail.com", true, "Hanumanta", "Hanumanta_Devu_Gouda", "Hanumanta@17");
    }

    static void saveUserRegistration(String dcdrLocation, String email, boolean emailLoginSame, String userName, String userId, String password) {
        System.out.println("The name of the user is : " + userName);
        System.out.println("The user ID is : " + userId);
        System.out.println("The email ID of the user is : " + email);
        System.out.println("The email login status same as username is : " + emailLoginSame);
        System.out.println("The passport verification location code is : " + dcdrLocation);
        System.out.println("The password of the user is : " + password);
    }
}
