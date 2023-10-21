package transport_and_cargo.Service;

import transport_and_cargo.entity.Cargo;
import transport_and_cargo.entity.Transport;

public interface LoadService {
    public void loadTransport(Transport transport, Cargo cargo);
}
