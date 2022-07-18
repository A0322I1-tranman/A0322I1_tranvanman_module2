package BT;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addProduct(new Product("Ban phím",2323));
        productManager.addProduct(new Product("Bình đun siêu tốc",2123));
        productManager.addProduct(new Product("Bàn là",2383));
        productManager.addProduct(new Product("Bàn ủi",2923));
        productManager.addProduct(new Product("Điều hòa",2347));
        productManager.addProduct(new Product("Tủ lạnh",1452));
        productManager.displayProduct();
        productManager.removeProduct(2323);
        productManager.editProduct(1,999);
        productManager.findByName("Tủ lạnh");
        System.out.println("After sort ACS");
        productManager.sortPriceASC();
        System.out.println("After sort DESC");
        productManager.sortPriceDesc();
        productManager.displayProduct();
    }
}
