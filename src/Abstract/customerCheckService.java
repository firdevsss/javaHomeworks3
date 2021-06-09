package Abstract;
import Entities.Concrete.Customer;

public interface customerCheckService {
    boolean CheckIfRealPerson(Customer customer);
}
