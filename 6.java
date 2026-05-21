/*
Ex No: 6

Aim:
To develop a simple Car Auction Network using Hyperledger Fabric concepts and simulate bidding transactions using Java programming.

Procedure:

Install Java
java -version
javac -version

Create Java File
CarAuction.java
*/
import java.util.Scanner;

public class CarAuction {

    static String carName;
    static int highestBid = 0;
    static String highestBidder = "";

    static void registerCar(String name) {

        carName = name;

        System.out.println("\nCar Registered for Auction Successfully.");
        System.out.println("Car Name : " + carName);
    }

    static void placeBid(String bidderName, int bidAmount) {

        System.out.println("\nProcessing Bid...");

        if (bidAmount > highestBid) {

            highestBid = bidAmount;
            highestBidder = bidderName;

            System.out.println("Bid Accepted.");
            System.out.println("Current Highest Bid : " + highestBid);
            System.out.println("Highest Bidder : " + highestBidder);
        }
        else {

            System.out.println("Bid Rejected.");
            System.out.println("Bid amount must be higher than current highest bid.");
        }
    }

    static void displayAuctionResult() {

        System.out.println("\nBlockchain Auction Transaction");
        System.out.println("--------------------------------");
        System.out.println("Car Name : " + carName);
        System.out.println("Winning Bidder : " + highestBidder);
        System.out.println("Winning Amount : " + highestBid);
        System.out.println("Auction Status : SUCCESS");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        String bidder1, bidder2;
        int bid1, bid2;

        System.out.println("======================================");
        System.out.println(" Blockchain Car Auction Network ");
        System.out.println("======================================");

        System.out.print("Enter Car Name : ");
        name = sc.nextLine();

        registerCar(name);

        System.out.print("\nEnter First Bidder Name : ");
        bidder1 = sc.nextLine();

        System.out.print("Enter First Bid Amount : ");
        bid1 = sc.nextInt();
        sc.nextLine();

        placeBid(bidder1, bid1);

        System.out.print("\nEnter Second Bidder Name : ");
        bidder2 = sc.nextLine();

        System.out.print("Enter Second Bid Amount : ");
        bid2 = sc.nextInt();

        placeBid(bidder2, bid2);

        displayAuctionResult();

        sc.close();
    }
}

/*
Compile the Program:
javac CarAuction.java

Run the Program:
java CarAuction

Result:
Thus the Car Auction Network using blockchain concepts was implemented successfully.
*/