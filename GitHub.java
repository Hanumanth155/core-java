class GitHub {

    public static void main(String[] args) {
        saveUserRegistration("hanumant@gmail.com", "Hanumant@12345", "hanumant-devu-gouda", "India", true);
    }

    static void saveUserRegistration(String email, String password, String username, String countryOrRegion, boolean emailPreferences) {
        System.out.println("The email ID of the user is : " + email);
        System.out.println("The password of the user is : " + password);
        System.out.println("The username chosen by the user is : " + username);
        System.out.println("The country or region of the user is : " + countryOrRegion);
        System.out.println("The email preference status of the user is : " + emailPreferences);
    }
}
