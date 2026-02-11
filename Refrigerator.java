class Refrigerator {

    static boolean powerStatus;

    static boolean switchPower() {

        if (powerStatus == false) {
            powerStatus = true;
            System.out.println("Refrigerator is turned ON...");
        } else {
            powerStatus = false;
            System.out.println("Refrigerator is turned OFF...");
        }

        return powerStatus;
    }
}
