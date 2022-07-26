package courseSpringBoot.courseSpringBoot.repositories;

import courseSpringBoot.courseSpringBoot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
