package com.portfolio.la.Interface;

import com.portfolio.la.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traigo una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero se busco por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona (Long id);
}
