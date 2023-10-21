package transport_and_cargo.Service;

import org.springframework.stereotype.Service;
import transport_and_cargo.entity.Cargo;
import transport_and_cargo.entity.Transport;
import transport_and_cargo.util.Consts;

@Service
public class LoadServiceImpl implements LoadService {
    @Override
    public void loadTransport(Transport transport, Cargo cargo){
        if(transport.getType() == Consts.TRANSPORT_PLANE && cargo.getType() == Consts.CARGO_GAS){
            System.out.println("Газ нельзя грузить в самолет");
        } else {
            System.out.println(cargo.getName() + " погружен в " + transport.getName());
        }
    }
}
