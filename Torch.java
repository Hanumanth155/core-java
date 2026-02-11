class Torch {

    static boolean activeStatus;

    static boolean switchTorch() {

        if (activeStatus == false) {
            activeStatus = true;
            System.out.println("Torch light is ON...");
        } else {
            activeStatus = false;
            System.out.println("Torch light is OFF...");
        }

        return activeStatus;
    }
}
