package solutions.kkr.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class CustomerID extends BaseId<UUID>{

    public CustomerID(UUID value){
        super(value);
    }
}
