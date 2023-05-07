package mx.com.gm.servicio;

import org.springframework.transaction.annotation.Transactional;
import mx.com.gm.dao.PersonaDao;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class PersonaServiceImplement  implements PersonaService{

    @Autowired
    private PersonaDao personaDao;



    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarpersonas() {
       return (List<Persona>) personaDao.findAll();
    }


    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }


    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }



    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
       return personaDao.findById(persona.getIdPersona()).orElse(null);
    }

}