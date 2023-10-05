package Part2;

import java.util.ArrayList;
import java.util.Scanner;

class Players {
    public String name;
    public int price;
    public String team;
    private int yearOfBirth;
    //getter and setter for yearOfBirth
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public Players(String name, int price, int yearOfBirth, String team){
        this.name = name;
        this.price = price;
        this.yearOfBirth = yearOfBirth;
        this.team = team;
    }

    public String getDescription(){
        return "Player: " + name + "\nPrice: " + price + "\nYear of birth: " + yearOfBirth + "\nTeam:" + team;
    }
}
class Collection {
    private ArrayList<Players> players = new ArrayList<>();
    //    Players player1 = new Players("Oleksandr Zincheko", 42000000, 1996);
//    Players player2 = new Players("Gabriel Jesus", 7500000, 1997);
    public void addPlayer(Players add){
        players.add(add);
    }
    public void printPlayer(int index) {
        if (index >= 0 && index < players.size()) {
            Players player = players.get(index);
            System.out.println(player.getDescription());
        } else {
            System.out.println("Index error.");
        }
    }
    public void printAllPlayers(){
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).getDescription());
        }
    }
    public void find(String search) {
        boolean match = false;
        for (int i = 0; i < players.size(); i++) {
            Players player = players.get(i);
            if (player.team.equals(search)) {
                System.out.println("Matching player found: ");
                System.out.println(player.getDescription());
                System.out.println();
                match = true;
            }
        }
        if (!match) {
            System.out.println("No matching players found.");
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the players database!");
            System.out.println("Choose the option to proceed:");
            System.out.println("1 - add player to collection" + "\n2 - print all players" + "\n3 - search players by team");
            System.out.println("0 - exit program");
            String answer = in.nextLine();

            Collection FootballCollection = new Collection();
            Players player1 = new Players("Alexandr Zinchenko", 42000000, 1996, "Arsenal");
            Players player2 = new Players("Gabriel Jesus", 75000000, 1997, "Arsenal");
            Players player3 = new Players("Mykhaylo Mudryk", 50000000, 2001, "Chelsea FC");

            FootballCollection.addPlayer(player1);
            FootballCollection.addPlayer(player2);
            FootballCollection.addPlayer(player3);
            switch (answer) {
                case "1":
                    addPlayer(FootballCollection, in);
                    break;
                case "2":
                    FootballCollection.printAllPlayers();
                    break;
                case "3":
                    find(FootballCollection, in);
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }


//        FootballCollection.printPlayer(0);
//                FootballCollection.printPlayer(1);
//        FootballCollection.printPlayer(2);
//                System.out.println();
//
//                FootballCollection.printAllPlayers();
//                System.out.println();
//
//                FootballCollection.find("Arsenal");
//
//                System.out.println();
//        FootballCollection.printAllPlayers();

//                player1.name = "Andriy Yarmolenko";
//                FootballCollection.printPlayer(0);

        }

    public static void addPlayer(Collection collection, Scanner in) {
        System.out.println("Enter new player details. Enter 'exit' for name to stop:");

        while (true) {
            System.out.println("Enter name:");
            String name = in.nextLine();

            if (name.equals("exit")) {
                // If "exit" is entered, stop input
                break;
            }

            System.out.println("Enter price:");
            int price = in.nextInt();
            System.out.println("Enter year of birth:");
            int yearOfBirth = in.nextInt();
            in.nextLine(); // Consume the newline character
            System.out.println("Enter team:");
            String team = in.nextLine();

            Players newPlayer = new Players(name, price, yearOfBirth, team);
            collection.addPlayer(newPlayer);
        }
    }
    public static void find(Collection collection, Scanner in){
        System.out.println("Enter the team: ");
        String team = in.nextLine();
        collection.find(team);
    }
}