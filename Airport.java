class Airport {
    public static void main(String[] args) {

        String airportName = "Kempegowda International";
        String cityName = "Bangalore";
        int totalTerminals = 2;
        float rating = 4.5f;
        double areaInSqKm = 16.20;
        long airportCode = 560300L;
        boolean isInternational = true;
        int dailyFlights = 450;
        String directorName = "Hari Kumar";
        float openingYear = 2008.0f;

        System.out.println("The name of the airport is " + airportName + ".");
        System.out.println("The airport is located in the city of " + cityName + ".");
        System.out.println("The total number of terminals in the airport is " + totalTerminals + ".");
        System.out.println("The airport has a customer rating of " + rating + " stars.");
        System.out.println("The total area of the airport is " + areaInSqKm + " square kilometers.");
        System.out.println("The airport code of the airport is " + airportCode + ".");
        System.out.println("The airport provides international flight services: " + isInternational + ".");
        System.out.println("The airport handles approximately " + dailyFlights + " flights every day.");
        System.out.println("The name of the airport director is " + directorName + ".");
        System.out.println("The airport was opened in the year " + openingYear + ".");
    }
}
