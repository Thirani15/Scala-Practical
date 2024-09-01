class Account(val accountNumber: String, private var balance: Double) {
  
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    if (amount <= balance) {
      balance -= amount
    } else {
      println(s"Insufficient balance. Current balance: $$${balance}")
    }
  }

  def transfer(toAccount: Account, amount: Double): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    if (amount <= balance) {
      this.withdraw(amount)
      toAccount.deposit(amount)
    } else {
      println(s"Transfer failed. Insufficient balance in account ${this.accountNumber}.")
    }
  }

  def applyInterest(): Unit = {
    if (balance > 0) balance += balance * 0.05
    else balance += balance * 0.1
  }

  def getBalance: Double = balance

  override def toString: String = s"Account($accountNumber, Balance: $$${balance})"
}

class Bank(val accounts: List[Account]) {

  // 4.1 List of Accounts with Negative Balances
  def accountsWithNegativeBalances: List[Account] = 
  {
    accounts.filter(_.getBalance < 0)
  }

  // 4.2 Calculate the Sum of All Account Balances
  def totalBalance: Double = 
  {
    accounts.map(_.getBalance).sum
  }

  // 4.3 Calculate Final Balances After Applying Interest
  def applyInterestToAllAccounts(): Unit = 
  {
    accounts.foreach(_.applyInterest())
  }

  override def toString: String = 
  {
    accounts.mkString("\n")
  }
}

object Q4 {

  def main(args: Array[String]): Unit = 
  {
    // Create some accounts
    val account1 = new Account("123456", 1000.0)
    val account2 = new Account("654321", -200.0)
    val account3 = new Account("789012", 500.0)
    val account4 = new Account("345678", -50.0)

    // Create a bank with these accounts
    val bank = new Bank(List(account1, account2, account3, account4))

    // 4.1 List of Accounts with Negative Balances
    val negativeAccounts = bank.accountsWithNegativeBalances
    println("Accounts with Negative Balances:")
    negativeAccounts.foreach(println)

    // 4.2 Calculate the Sum of All Account Balances
    val totalBalance = bank.totalBalance
    println(s"\nTotal Balance of All Accounts: $$${totalBalance}")

    // 4.3 Calculate Final Balances After Applying Interest
    bank.applyInterestToAllAccounts()
    println("\nFinal Balances After Applying Interest:")
    println(bank)
  }
}
