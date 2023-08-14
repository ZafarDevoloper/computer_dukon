package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Cart;
import uz.pdp.pcmarket.entity.Customer;
import uz.pdp.pcmarket.entity.Product;

@Projection(types = Cart.class)
public interface CartProjection {
    Long getId();

    int getQuantity();

    Product getProduct();

    Customer getCustomer();
}
