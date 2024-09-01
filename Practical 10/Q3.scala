class Account(val accountNumber: String, private var balance: Double) {
  
  // To deposit money into the account
  def deposit(amount: Double): Unit = 
  {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
    println(s"Deposited $$${amount}. New balance: $$${balance}")
  }

  // To withdraw money from the account
  def withdraw(amount: Double): Unit = 
  {
    require(amount > 0, "Withdrawal amount must be positive")
    if (amount <= balance) {
      balance -= amount
      println(s"Withdrew $$${amount}. New balance: $$${balance}")
    } else {
      println(s"Insufficient balance. Current balance: $$${balance}")
    }
  }

  // To transfer money from this account to another account
  def transfer(toAccount: Account, amount: Double): Unit = 
  {
    require(amount > 0, "Transfer amount must be positive")
    if (amount <= balance) {
      this.withdraw(amount)
      toAccount.deposit(amount)
      println(s"Transferred $$${amount} from account ${this.accountNumber} to account ${toAccount.accountNumber}.")
    } else {
      println(s"Transfer failed. Insufficient balance in account ${this.accountNumber}.")
    }
  }

  // To check the current balance
  def getBalance: Double = balance
}

object Q3 {

  def main(args: Array[String]): Unit = 
  {
    val account1 = new Account("123456", 1000.0)
    val account2 = new Account("654321", 500.0)

    account1.deposit(200.0)
    account1.withdraw(100.0)
    account1.transfer(account2, 300.0)

    println(s"Account 1 balance: $$${account1.getBalance}")
    println(s"Account 2 balance: $$${account2.getBalance}")
  }
}

