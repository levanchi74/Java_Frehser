package practice;

import java.util.Comparator;

public class OrderComparatorWithId implements Comparator<Order> {

	@Override
    public int compare(Order o1, Order o2) {
 
        if (o1.getId() < o2.getId()) {
            return -1;
        } else if (o1.getId() == o2.getId()) {
            return 0;
        } else {
            return 1;
        }
    }

	
}
