#BlockIoBalanceApp
This is a console application that gets your wallet balance in block.io and writes it to CSV file.
You just need to provide access to block.io and paste the API key in the application input field

Make the steps below for checking the application:

1. Create an account on https://block.io/
2. Log in to https://block.io/ with a User with a non-empty Bitcoin TestNet Wallet
   (You can add testnet Bitcoins using a third-party application)
3. Add your public IP address on [settings](https://block.io/dashboard/settings) page in Restrict Access block
4. Copy the API key for Bitcoin (TESTNET!) on Wallet page

##Launching the application

For launching BlockIoBalanceApp 
1. download BlockIoBalanceApp-1.0-SNAPSHOT-jar-with-dependencies.jar and startBlockIoBalanceApp.bat file
2. click on .bat file


If you changed the application source code
you should create a new .jar file

- run this command in a command prompt opened in the project directory

`mvn clean compile assembly:single`

- run this command in a command prompt opened in the /target directory with .jar file

`java -jar BlockIoBalanceApp-1.0-SNAPSHOT-jar-with-dependencies.jar`

You can find a balance.csv with user balance in a root project directory



