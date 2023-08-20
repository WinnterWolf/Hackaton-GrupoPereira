package innovatexselfcheckout.repository;

import innovatexselfcheckout.model.Product;
import innovatexselfcheckout.repository.entity.ProductEntity;
import innovatexselfcheckout.repository.entity.ShoppingProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ProductRepository extends JpaRepository<ProductEntity, BigInteger> {
}