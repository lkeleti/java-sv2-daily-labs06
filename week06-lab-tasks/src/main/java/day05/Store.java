package day05;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public List<ProductWithPiece> numberOfProductsByType(){
        List<ProductWithPiece> result = new ArrayList<>();
        for (Product product: products){
            if (!containsProduct(product, result)){
                result.add(new ProductWithPiece(product.getType()));
            }
        }
        return result;
    }

    private boolean containsProduct(Product product, List<ProductWithPiece> products) {
        for (ProductWithPiece pwp: products){
            if (product.getType() == pwp.getType()){
                pwp.incrementCount();
                return true;
            }
        }
        return false;
    }
}
