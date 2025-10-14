# Project Review: Java Exceptions & Interfaces

## Step 1: Understand the Given Code

### **1. Interface Review**
- What methods are defined in `Transaction.java`?

- What is the purpose of an interface in Java?

- Why do you think the `Transaction` interface does not contain any method implementations?


### **2. BankDemo.java Analysis**
- What does `BankDemo` do? Can you summarize its functionality?

- What object is expected to be created inside `BankDemo`?

- Which methods from the `Transaction` interface does `BankDemo` call?

- What happens inside the `try-catch` block? What types of exceptions are handled?


## Step 2: Plan Your `BankAccount.java` Implementation

### **3. Creating the Class**
- What class should you create to implement `Transaction`?

- How will you store the balance? (Hint: Should it be `private` or `public`?)

- What constructor parameters should `BankAccount` have?

- What other methods should this class include?


### **4. Handling Deposits and Withdrawals**
- What should happen when a deposit is made?

- What should happen when a withdrawal exceeds the balance?

- What Java exception can be used if an invalid operation occurs?

### **5. Error Handling**
- How does `BankDemo` handle invalid deposits or withdrawals?

- Why is `IllegalArgumentException` used instead of creating a custom exception?
