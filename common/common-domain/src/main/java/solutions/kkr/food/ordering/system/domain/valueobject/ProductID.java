package solutions.kkr.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class ProductID extends BaseId<UUID>{
    public ProductID(UUID value){
        super(value);
    }
}
