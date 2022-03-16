package Dersler.ikinci_ders_oop;

public class Product {
    // Constructor bloğu
    public Product(int id, String name, double unitPrice, String detail) {
        this.id=id;
        this.name=name;
        this.unitPrice=unitPrice;
        this.detail=detail;
    }

    public Product() {

    }


    int id;
    String name;
    double unitPrice;
    String detail;

}
