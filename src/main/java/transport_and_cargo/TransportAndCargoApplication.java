package transport_and_cargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import transport_and_cargo.Service.CargoService;
import transport_and_cargo.Service.LoadService;
import transport_and_cargo.Service.TransportService;

@SpringBootApplication
public class TransportAndCargoApplication implements CommandLineRunner {
    TransportService transportService;
    CargoService cargoService;
    LoadService loadService;

    @Autowired
    public TransportAndCargoApplication(TransportService transportService, CargoService cargoService,LoadService loadService) {
        this.transportService = transportService;
        this.cargoService = cargoService;
        this.loadService = loadService;
    }

    public static void main(String[] args) {
        SpringApplication.run(TransportAndCargoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        loadService.loadTransport(transportService.getTransportById(1), cargoService.getCargoById(2)); // Бензин 20 тонн погружен в Ту-154
        loadService.loadTransport(transportService.getTransportById(1), cargoService.getCargoById(1)); // Газ нельзя грузить в самолет
    }
}
