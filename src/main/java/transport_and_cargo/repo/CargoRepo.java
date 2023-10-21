package transport_and_cargo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import transport_and_cargo.entity.Cargo;

public interface CargoRepo extends JpaRepository<Cargo, Integer> {

}
