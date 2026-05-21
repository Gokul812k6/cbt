/*
Ex No: 1

Aim:
To Install and understand Docker container, Node.js, Java and Hyperledger Fabric, Ethereum and
perform necessary software installation on local machine/create instance on cloud to run.

Procedure:

Install Docker
Download Docker Desktop
Docker Desktop

docker --version
docker run hello-world

Expected Output:
Hello from Docker!

Install Node.js
Download Node.js
node -v
npm -v

Install Java
Download Java JDK -> Oracle Java Downloads
java -version
javac -version

Install Hyperledger Fabric
Install Fabric Samples:
curl -sSL https://bit.ly/2ysbOFE | bash -s

Start Network:
cd fabric-samples/test-network
./network.sh up

Create Channel:
./network.sh createChannel

Install Ethereum (Ganache)
Download Ganache

Install Truffle:
npm install -g truffle
truffle version
*/

/*
Aim:
To Install and understand Docker container, Node.js, Java and Hyperledger Fabric, Ethereum and
perform necessary software installation on local machine/create instance on cloud to run.
*/

/*
========================================
Installation Steps
========================================
*/

/*
Install Docker
Download Docker Desktop
Docker Desktop
docker --version
docker run hello-world

Expected Output:
Hello from Docker!
*/

/*
Install Node.js
Download Node.js
node -v
npm -v
*/

/*
Install Java
Download Java JDK -> Oracle Java Downloads
java -version
javac -version
*/

/*
Install Hyperledger Fabric
Install Fabric Samples:
curl -sSL https://bit.ly/2ysbOFE | bash -s

Start Network:
cd fabric-samples/test-network
./network.sh up

Create Channel:
./network.sh createChannel
*/

/*
Install Ethereum (Ganache)
Download Ganache

Install Truffle:
npm install -g truffle
truffle version
*/

public class JavaTest {

    public static void main(String[] args) {

        System.out.println("Java Installed Successfully");
    }
}

/*
Compile and Run:
javac JavaTest.java
java JavaTest

Output:
Java Installed Successfully

Result:
Thus the Installation of Docker Container, Node.js,
Hyperledger Fabric and Ethereum Network are executed successfully.
*/