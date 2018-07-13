package subclasses;

/**
 * Write two classes. Class_01 should have the main().
 * Class_02 should have various instance variables. At least one of must be static.
 *
 * Within class_01 create at least 3 instances of class_02.
 *
 * Set the instance variables of class_02.
 *
 * Then, just once, in one place, set the static instance variable in class_02.
 *
 * Afterwards, print out the value of each instance variable and the static variable for each class.
 */

class TeamConstructor {

    public static void main(String[] args) {

        FootballTeam liverpool = new FootballTeam();
        FootballTeam everton = new FootballTeam();
        FootballTeam chelsea = new FootballTeam();
        FootballTeam hibs = new FootballTeam();


        liverpool.setDivision('E');
        liverpool.setLeague("AL");

        everton.setLeague("AL");
        everton.setDivision('C');

        chelsea.setLeague("NL");
        chelsea.setDivision('C');

        hibs.setLeague("Scottish League");
        hibs.setDivision('A');

        FootballTeam.numOfPlayers=32;

        System.out.println("Liverpool have " + " " + FootballTeam.numOfPlayers + " " + "players");
        System.out.println("Liverpool are in the" + " " + liverpool.getLeague());


    }

}


class FootballTeam {

    private String league;
    private char division;

    static int numOfPlayers;


    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public static int getNumOfPlayers() {
        return numOfPlayers;
    }

    public static void setNumOfPlayers(int numOfPlayers) {
        FootballTeam.numOfPlayers = numOfPlayers;

    }
}


