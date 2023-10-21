package transport_and_cargo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import transport_and_cargo.entity.Transport;
import transport_and_cargo.repo.TransportRepo;

import java.util.Optional;

@Service
public class TransportService {
    private final TransportRepo transportRepo;

    @Autowired
    public TransportService(TransportRepo transportRepo) {
        this.transportRepo = transportRepo;
    }

    public Transport getTransportById(int id){
        Optional<Transport> optional = transportRepo.findById(id);
        return optional.isPresent() ? optional.get() : null;
    }
}
