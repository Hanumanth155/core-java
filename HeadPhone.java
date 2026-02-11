class HeadPhone {

    static boolean soundEnabled;

    static boolean switchSound() {

        if (soundEnabled == false) {
            soundEnabled = true;
            System.out.println("HeadPhone is turned ON...");
        } else {
            soundEnabled = false;
            System.out.println("HeadPhone is turned OFF...");
        }

        return soundEnabled;
    }
}
