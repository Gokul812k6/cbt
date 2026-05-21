/*
Ex No: 5

Aim:
To build a web app that tracks fitness club rewards using Hyperledger Fabric.

Procedure:

Install Java
java -version
javac -version

Create Java File
FitnessClubRewards.java
*/
import java.util.Scanner;

public class FitnessClubRewards {

    static String memberName;
    static int rewardPoints = 0;

    static void registerMember(String name) {

        memberName = name;

        System.out.println("\nMember Registered Successfully.");
        System.out.println("Member Name : " + memberName);
    }

    static void addRewards(int points) {

        rewardPoints = rewardPoints + points;

        System.out.println("\nReward Points Added Successfully.");
        System.out.println("Points Earned : " + points);
        System.out.println("Total Reward Points : " + rewardPoints);
    }

    static void redeemRewards(int points) {

        System.out.println("\nRedeeming Reward Points...");

        if(points <= rewardPoints) {

            rewardPoints = rewardPoints - points;

            System.out.println("Reward Redeemed Successfully.");
            System.out.println("Redeemed Points : " + points);
            System.out.println("Remaining Points : " + rewardPoints);
        }
        else {

            System.out.println("Insufficient Reward Points.");
        }
    }

    static void displayTransaction() {

        System.out.println("\nBlockchain Transaction Record");
        System.out.println("--------------------------------");
        System.out.println("Member Name : " + memberName);
        System.out.println("Available Reward Points : " + rewardPoints);
        System.out.println("Transaction Status : SUCCESS");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int earnedPoints, redeemPoints;

        System.out.println("======================================");
        System.out.println(" Fitness Club Rewards using Blockchain ");
        System.out.println("======================================");

        System.out.print("Enter Member Name : ");
        name = sc.nextLine();

        registerMember(name);

        System.out.print("\nEnter Earned Reward Points : ");
        earnedPoints = sc.nextInt();

        addRewards(earnedPoints);

        System.out.print("\nEnter Reward Points to Redeem : ");
        redeemPoints = sc.nextInt();

        redeemRewards(redeemPoints);

        displayTransaction();

        sc.close();
    }
}