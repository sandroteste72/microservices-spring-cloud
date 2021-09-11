package digitalinnovation.one.experts.shoppingcart.repository;

import digitalinnovation.one.experts.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {

    Cart findByCustomerId(Long customerId);

}
