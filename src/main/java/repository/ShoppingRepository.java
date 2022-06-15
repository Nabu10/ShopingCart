package repository;

public class ShoppingRepository {

    import org.springframework.data.repository.CrudRepository;

import com.zorba.shoppingCart.entity.Customer;

    public interface ShoppingCartRepository extends CrudRepository<Customer, Long> {


    }
