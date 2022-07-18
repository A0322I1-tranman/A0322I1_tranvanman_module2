package BT;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager {
private ArrayList<Product> arrayListProduct = new ArrayList<>();
private Product productR = new Product("TV",13123);
public ProductManager(Product product){
    addProduct(product);
}

    public ProductManager() {
    }
    public void addProduct(Product product){
    arrayListProduct.add(product);
    }
    public void displayProduct(){
    for (Product product: arrayListProduct){
        System.out.println(product.toString());
    }
    }
    public void editProduct(int ID, double price){
    Product productEdit = null;
    for (Product product : arrayListProduct){
        if (product.getID()==ID){
            productEdit = product;
            break;
        }
        if (productEdit == null){
            System.out.println("No product have ID "+ID+" so no Edit");
        }else {

            productEdit.setPrice(price);
        }
    }
    }
    public void editProduct(int ID, String name){
    Product productEdit = null;
    for (Product product: arrayListProduct){
        if (product.getID()==ID){
            productEdit = product;
            break;
        }
        if (productEdit==null){
            System.out.println("No product have ID "+ID+" so no Edit");
        }else {
            productEdit.setName(name);
        }
    }
    }
    public void removeProduct(int ID){
    int index = -1;
    for (Product Obj: this.arrayListProduct){
        index++;
        if (Obj.getID()==ID){
            break;
        }
    }
    if (index==-1){
        System.out.println("No product have ID "+ID+ " so no Remove");
    }else {
        arrayListProduct.remove(index);
    }
    }
    public void findByName(String name){
    Product productFind = null;
    for (Product Obj: this.arrayListProduct){
        if (Obj.getName().equals(name)){
            productFind = Obj;
            System.out.println("Product have name "+ name + " is "+Obj.toString());
        }
    }
    if (productFind==null){
        System.out.println("No Product is found");
    }
    }
    public void sortPriceASC(){
     PriceACS priceACS = new PriceACS();
        Collections.sort(this.arrayListProduct,priceACS);
    }
    public void sortPriceDesc(){
    PriceDesc priceDesc = new PriceDesc();
    Collections.sort(this.arrayListProduct,priceDesc);
    }
}
