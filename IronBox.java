class IronBox {

    static boolean heatingStatus;

    static boolean pressControl() {

        if (heatingStatus == false) {
            heatingStatus = true;
            System.out.println("Iron Box is heating...");
        } else {
            heatingStatus = false;
            System.out.println("Iron Box is cooling down...");
        }

        return heatingStatus;
    }
}
