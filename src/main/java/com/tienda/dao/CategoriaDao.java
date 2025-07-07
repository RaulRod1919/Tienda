
package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository; //Trabaja todas las consultas y lo relacionado a la BD

public interface CategoriaDao extends JpaRepository <Categoria, Long> { //Le indicamos que clase es una entidad de la BD y su tipo
    //de ID que sería LONG en este caso
    
}
