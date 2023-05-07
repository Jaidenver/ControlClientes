package mx.com.gm.servicio;

import mx.com.gm.domain.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> listarpersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);
}
