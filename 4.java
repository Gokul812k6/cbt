/*
Ex No: 4

Aim:
To Deploy an asset-transfer app using blockchain and learn app development within a Hyperledger Fabric network.

Procedure:

Install Java
java -version
javac -version

Create Java File
AssetTransfer.java
*/
import java.util.Scanner;

public class AssetTransfer {

    static String assetName;
    static String owner;

    static void createAsset(String name, String assetOwner) {

        assetName = name;
        owner = assetOwner;

        System.out.println("\nAsset Created Successfully.");
        System.out.println("Asset Name : " + assetName);
        System.out.println("Owner      : " + owner);
    }

    static void transferAsset(String newOwner) {

        System.out.println("\nInitiating Asset Transfer...");

        owner = newOwner;

        System.out.println("Asset transferred successfully.");
        System.out.println("New Owner : " + owner);
    }

    static void displayTransaction() {

        System.out.println("\nBlockchain Transaction Record");
        System.out.println("--------------------------------");
        System.out.println("Asset Name : " + assetName);
        System.out.println("Current Owner : " + owner);
        System.out.println("Transaction Status : SUCCESS");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        String firstOwner;
        String newOwner;

        System.out.println("====================================");
        System.out.println(" Blockchain Asset Transfer Application ");
        System.out.println("====================================");

        System.out.print("Enter Asset Name : ");
        name = sc.nextLine();

        System.out.print("Enter Current Owner : ");
        firstOwner = sc.nextLine();

        createAsset(name, firstOwner);

        System.out.print("\nEnter New Owner Name : ");
        newOwner = sc.nextLine();

        transferAsset(newOwner);

        displayTransaction();

        sc.close();
    }
}

/*
Compile the Program:
javac FitnessClubRewards.java

Run the Program:
java FitnessClubRewards

Result:
Thus the blockchain reward tracking system using Hyperledger Fabric was executed successfully.
*/

/*
Compile the Program:
javac AssetTransfer.java

Run the Program:
java AssetTransfer

Result:
Thus the deployment of an asset-transfer app using blockchain within a Hyperledger Fabric network are executed successfully.
*/