class Fan {

    static boolean isRunning = true;

    static boolean startOrStop() {

        if (isRunning == false) {
            isRunning = true;
            System.out.println("The Fan is running...");
        } else {
            isRunning = false;
            System.out.println("The Fan is stopped...");
        }

        return isRunning;
    }
}
