package repos;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Long> {
	
}