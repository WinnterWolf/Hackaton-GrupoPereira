package innovatexselfcheckout.repository;

import innovatexselfcheckout.repository.entity.ShoppingProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ShoppingProductRepository extends JpaRepository<ShoppingProductEntity, BigInteger> {
}