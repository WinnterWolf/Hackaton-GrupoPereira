package innovatexselfcheckout.repository;

import innovatexselfcheckout.repository.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ProductRepository extends JpaRepository<ProductEntity, BigInteger> {
}