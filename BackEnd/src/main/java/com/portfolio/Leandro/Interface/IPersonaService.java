
package com.portfolio.Leandro.Interface;

import com.portfolio.Leandro.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer una persona
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo buscamos por ID
    public void deletePesona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
