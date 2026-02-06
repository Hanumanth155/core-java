class SportsTeam {
    public static void main(String[] args) {

        String teamName = "Royal Challengers";
        String captainName = "Virat";
        int totalPlayers = 11;
        float winPercentage = 62.5f;
        double teamValueInCrores = 850.75;
        long teamId = 3344556677L;
        boolean isNationalTeam = false;
        String sportName = "Cricket";
        int totalMatches = 120;
        float averageScore = 175.5f;

        System.out.println("The name of the sports team is " + teamName + ".");
        System.out.println("The captain of the team is " + captainName + ".");
        System.out.println("The total number of players in the team is " + totalPlayers + ".");
        System.out.println("The team has a win percentage of " + winPercentage + " percent.");
        System.out.println("The total value of the team is " + teamValueInCrores + " crores.");
        System.out.println("The unique team identification number is " + teamId + ".");
        System.out.println("The team is a national team: " + isNationalTeam + ".");
        System.out.println("The sport played by the team is " + sportName + ".");
        System.out.println("The team has played a total of " + totalMatches + " matches.");
        System.out.println("The average score of the team is " + averageScore + ".");
    }
}
