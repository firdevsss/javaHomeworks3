package mernisAdapter;

import Abstract.customerCheckService;
import Entities.Concrete.Customer;


public class MernisServiceAdapter implements customerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return false;
    }
}
