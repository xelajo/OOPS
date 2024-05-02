class Product {
    int pcode;
    String pname;
    double price;

    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {

        Product product1 = new Product(101, "Laptop", 899.99);
        Product product2 = new Product(102, "Smartphone", 499.99);
        Product product3 = new Product(103, "Tablet", 349.99);
	
	System.out.println("Alex John \n 23MCA011 \n 13/02/2024");
        System.out.println("Product Details:");
        product1.display();
        product2.display();
        product3.display();

        Product lowestPriceProduct = product1;
        if (product2.price < lowestPriceProduct.price) {
            lowestPriceProduct = product2;
        }
        if (product3.price < lowestPriceProduct.price) {
            lowestPriceProduct = product3;
        }

        System.out.println("\nProduct with the lowest price:");
        lowestPriceProduct.display();
    }
}

