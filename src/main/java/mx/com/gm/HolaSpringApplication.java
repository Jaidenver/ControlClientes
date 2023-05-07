package mx.com.gm;


import mx.com.gm.web.ControladorInicio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;


@SpringBootApplication
public class HolaSpringApplication implements CommandLineRunner{


	ControladorInicio controladorInicio;

	public HolaSpringApplication(ControladorInicio controladorInicio){
		this.controladorInicio = controladorInicio;
	}




	public static void main(String[] args) {
		SpringApplication.run(HolaSpringApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		Model model = new ExtendedModelMap();
		controladorInicio.inicio(model);
	}



}
