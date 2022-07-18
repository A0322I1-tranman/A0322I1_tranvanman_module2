package BT;

import java.util.Comparator;

public class PriceDesc implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice()-o1.getPrice());
    }
}
