object Q1
{
    //To print item name and the quantity
    def displayInventory(itemNames: Array[String], itemQuantities: Array[Int]): Unit = 
    {
        println("Current Inventory:")
        for (i <- itemNames.indices) 
        {
            println(s"${itemNames(i)}: ${itemQuantities(i)}")
        }
    }

    //To restock items
    def restockItem(itemNames: Array[String], itemQuantities: Array[Int], itemName: String, quantity: Int): Unit = 
    {
        val index = itemNames.indexOf(itemName)
        if (index != -1) 
        {
            itemQuantities(index) += quantity
            println(s"Restocked $quantity units of $itemName. New quantity: ${itemQuantities(index)}")
        } 
        else 
        {
            println(s"Item $itemName does not exist in inventory.")
        }
    }

    //To sell items 
    def sellItem(itemNames: Array[String], itemQuantities: Array[Int], itemName: String, quantity: Int): Unit = 
    {
        val index = itemNames.indexOf(itemName)
        if (index != -1) 
        {
            if (itemQuantities(index) >= quantity) 
            {
                itemQuantities(index) -= quantity
                println(s"Sold $quantity units of $itemName. New quantity: ${itemQuantities(index)}")
            } 
            else 
            {
                println(s"Not enough stock to sell $quantity units of $itemName.")
            }
        } 
        else 
        {
            println(s"Item $itemName does not exist in inventory.")
        }
    }

    def main(Args : Array[String]) : Unit =
    {
        val itemNames = Array("Carrot", "Brinjal", "Guava")
        val itemQuantities = Array(10, 23, 41)


        displayInventory(itemNames, itemQuantities)
        restockItem(itemNames, itemQuantities, "Carrot", 5)
        sellItem(itemNames, itemQuantities, "Guava", 3)
        sellItem(itemNames, itemQuantities, "Brinjal", 25)
        sellItem(itemNames, itemQuantities, "Carrot", 5)
    }

}