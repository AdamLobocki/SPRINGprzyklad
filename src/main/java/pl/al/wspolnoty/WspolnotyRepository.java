package pl.al.wspolnoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface WspolnotyRepository extends JpaRepository<Wspolnota, Integer>{
}
