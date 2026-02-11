class Printer {

    static boolean printingMode = true;

    static boolean controlPrinter() {

        if (printingMode == false) {
            printingMode = true;
            System.out.println("Printer is turned on ..");
        } else {
            printingMode = false;
            System.out.println("Printer is turned off ..");
        }

        return printingMode;
    }
}
