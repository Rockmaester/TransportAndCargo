package transport_and_cargo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import transport_and_cargo.entity.Cargo;
import transport_and_cargo.repo.CargoRepo;

import java.util.Optional;

@Service
public class CargoService {
    private final CargoRepo cargoRepo;

    @Autowired
    public CargoService(CargoRepo cargoRepo) {
        this.cargoRepo = cargoRepo;
    }

    public Cargo getCargoById(int id){
        Optional<Cargo> optional = cargoRepo.findById(id);
        return optional.isPresent() ? optional.get() : null;
    }
}
