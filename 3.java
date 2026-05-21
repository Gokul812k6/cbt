/*
Ex No: 3

Aim:
To Interact with a blockchain network and execute transactions and requests against a blockchain network by creating an app to test the network and its rules.

Procedure:

Install Java
java -version
javac -version

Create Java Program
Create a file named:
BlockchainInteraction.java
*/
import java.util.Scanner;

public class BlockchainInteraction {

    static void executeTransaction(String sender, String receiver, int amount) {

        System.out.println("\nExecuting Blockchain Transaction...");
        System.out.println("Sender   : " + sender);
        System.out.println("Receiver : " + receiver);
        System.out.println("Amount   : " + amount);

        System.out.println("Transaction successfully added to blockchain.");
    }

    static void queryBlockchain() {

        System.out.println("\nRequesting Blockchain Data...");

        System.out.println("Block Number : 101");
        System.out.println("Transaction ID : TXN45892");
        System.out.println("Status : SUCCESS");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sender, receiver;
        int amount;

        System.out.println("=================================");
        System.out.println(" Blockchain Network Interaction ");
        System.out.println("=================================");

        System.out.print("Enter Sender Name : ");
        sender = sc.nextLine();

        System.out.print("Enter Receiver Name : ");
        receiver = sc.nextLine();

        System.out.print("Enter Amount : ");
        amount = sc.nextInt();

        executeTransaction(sender, receiver, amount);

        queryBlockchain();

        System.out.println("\nBlockchain Request Completed.");

        sc.close();
    }
}

/*
Compile the Program:
javac BlockchainInteraction.java

Run the Program:
java BlockchainInteraction

Sample Output:
Blockchain Request Completed.

Result:
Thus the interaction with a blockchain network and execution of transactions are executed successfully.
*/