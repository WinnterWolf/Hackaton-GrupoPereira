package innovatexselfcheckout.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ShoppingRepository extends JpaRepository<ShoppingEntity, BigInteger> {
}
