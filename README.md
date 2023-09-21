# Banking With Java Application
## Introduction to the project
In this project, we have created a simple banking system using Java programming language with a graphical user interface (GUI) built using Swing. The project allows users to interact with a basic banking system, perform operations like crediting and debiting money, and view account details.

## Running of Project
### Dependencies
<ul>
  <li>I used Java version "17.0.8" (I recommend using that only)</li>
  <li>VS code for editing and running the code (You can use any ide or editor)</li>
  <span>If you receive any error related to JDK or java/javac not found then first check the system environment variable and add the bin location there.</span>
</ul>
<div>
  <b>For running this project</b> on your local machine,<br>
  first download the project files from GitHub, then<br>
  make a folder named BankingWithJava (you can change the name),<br>
  put the Java files inside that folder and <br>
  click the option of debug/run.<br>
  <br>Now you will see a small window on the top left corner of the screen.<br>
  Feel free to edit and make it more responsive.
</div>

## Use of OOPS Concept
### Classes and Objects:
The project defines two classes: BankAccount and BankingSystemGUI.
BankAccount represents a bank account and encapsulates its attributes (account number, account holder, balance) and methods (crediting and debiting money).
BankingSystemGUI is responsible for creating a graphical user interface to interact with the bank account.
### Encapsulation:
The BankAccount class encapsulates the account-related data (attributes) and provides methods to access and modify this data. For example, it uses private instance variables (accountNumber, accountHolder, balance) and public methods (credit, debit, getBalance) to control access to the data.
### Constructor:
Both classes have constructors (BankAccount and BankingSystemGUI) to initialize object states when they are created.
