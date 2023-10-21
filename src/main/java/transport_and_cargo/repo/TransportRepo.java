package transport_and_cargo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import transport_and_cargo.entity.Transport;

public interface TransportRepo extends JpaRepository<Transport, Integer> {

}
