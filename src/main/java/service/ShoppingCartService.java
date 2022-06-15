package service;

public class ShoppingCartService {

    import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zorba.shoppingCart.DTO.CustomerDTO;
import com.zorba.shoppingCart.DTO.ItemsDTO;
import com.zorba.shoppingCart.entity.Customer;
import com.zorba.shoppingCart.entity.Items;
import com.zorba.shoppingCart.repository.ShoppingCartRepository;

    @Service
    public class ShoppingCartService {

        @Autowired
        private ShoppingCartRepository shoppingCartRepository;

        public Boolean saveRecords(List<CustomerDTO> customers) {
            return true;
        }

        public Customer fetchItemsSelectedByCustomer(Long custId) {
            Customer customer = new Customer();
            return customer;
        }

        public Boolean deleteCustomerRecords(Long custId) {
            return true;
        }
    }
