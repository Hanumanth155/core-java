class ElectricKettle {

    static boolean boilingProcess;

    static boolean boilSwitch() {

        if (boilingProcess == false) {
            boilingProcess = true;
            System.out.println("Water is boiling...");
        } else {
            boilingProcess = false;
            System.out.println("Kettle turned off...");
        }

        return boilingProcess;
    }
}
