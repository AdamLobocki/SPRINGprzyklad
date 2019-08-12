package pl.al.wspolnoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudynekRepository extends JpaRepository<Budynek, Integer> {
}
