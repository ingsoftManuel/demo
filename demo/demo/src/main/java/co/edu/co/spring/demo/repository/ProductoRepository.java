package co.edu.co.spring.demo.repository;

import co.edu.co.spring.demo.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Product,Long> {
}
