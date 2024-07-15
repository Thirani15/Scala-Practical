object Q1 
{
    //To get the product list from user
    def getProductList(): List[String] = 
    {
        var productsList = List[String]()
        var flag = true

        while (flag) 
        {
            val product = scala.io.StdIn.readLine("Enter a product name (type 'done' to finish): ")
            if (product == "done") 
            {
                flag = false
            } 
            else 
            {
                productsList = productsList :+ product
            }
        }

        productsList
    }

    //To print the product list
    def printProductList(productsList: List[String]): Unit = 
    {
        for ((product, index) <- productsList.zipWithIndex) 
        {
            println(s"${index + 1} - $product")
        }
    }

    //To calculate the total products
    def getTotalProducts(productsList: List[String]): Int = 
    {
        productsList.length
    }

    //Main
    def main(args: Array[String]): Unit = 
    {
        val product_List = getProductList()
        println("\nProduct List:")
        printProductList(product_List)
        println(s"\nTotal number of products: ${getTotalProducts(product_List)}")
    }
}