package Dersler.ikinci_ders_oop;



public class ikinci_ders {
    public static void main(String[] args) {
        Product product1 = new Product(); //Örnek oluştruma, referans oluşturma
        product1.id = 1;
        product1.name = "Lenovo V14";
        product1.unitPrice = 15000;
        product1.detail = "16 GB Ram";

        Product product2 = new Product();
        product2.id = 2;
        product2.name = "Lenovo V15";
        product2.unitPrice = 16000;
        product2.detail = "32 GB Ram";

        Product product3 = new Product();
        product3.id = 3;
        product3.name = "HP 15";
        product3.unitPrice = 10000;
        product3.detail = "8 GB Ram";

        Product product4 = new Product(4, "Monster Abra A5", 15000, "8 GB Ram");

        Product[] products = {product1, product2, product3, product4};
        System.out.println(products.length);
        for(Product product : products) {
            System.out.println(product.name);
        }
        Category category1 = new Category();
        category1.id=1;
        category1.name="Bilgisayar";

        Category category2 = new Category();
        category2.id=2;
        category2.name="Ev/Bahçe";
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product4);
        }
    
}
