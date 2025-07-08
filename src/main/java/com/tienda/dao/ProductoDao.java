
package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductoDao extends JpaRepository <Producto, Long> {
    
    
    //Ejemplo de metodo utilizando Query
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioinf, double precioSup);
    
    //Ejemplo de mÃ©todo utilizando Consultas con JPQL
    @Query(value="SELECT a FROM Producto a where a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Producto> metodoJPQList(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);
   
    //Ejemplo de mÃ©todo utilizando Consultas con SQL nativo
    @Query(nativeQuery=true,
            value="SELECT * FROM producto where producto.precio BETWEEN :precioInf AND :precioSup ORDER BY producto.descripcion ASC")
    public List<Producto> metodoNativo(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup); 
}
