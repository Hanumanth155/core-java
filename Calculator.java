class Calculator {

    static boolean powerMode;

    static boolean powerControl() {

        if (powerMode == false) {
            powerMode = true;
            System.out.println("Calculator powered ON...");
        } else {
            powerMode = false;
            System.out.println("Calculator powered OFF...");
        }

        return powerMode;
    }
}
