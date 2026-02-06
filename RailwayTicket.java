class RailwayTicket {
    public static void main(String[] args) {

        String passengerName = "Hanumanth";
        String trainName = "Rajdhani Express";
        int seatNumber = 45;
        float journeyDistance = 560.5f;
        double ticketPrice = 1450.75;
        long ticketNumber = 9988776655L;
        boolean isConfirmed = true;
        String coachType = "AC 2 Tier";
        int journeyHours = 10;
        float platformNumber = 3.0f;

        System.out.println("Name of the passenger is : " + passengerName);
        System.out.println("The name of the train is : " + trainName);
        System.out.println("The seat number allotted is : " + seatNumber);
        System.out.println("The total journey distance is : " + journeyDistance + " Km");
        System.out.println("The price of the railway ticket is : " + ticketPrice);
        System.out.println("The ticket number is : " + ticketNumber);
        System.out.println("Ticket confirmation status is : " + isConfirmed);
        System.out.println("The type of coach is : " + coachType);
        System.out.println("Total journey time in hours is : " + journeyHours);
        System.out.println("The platform number for boarding is : " + platformNumber);
    }
}
