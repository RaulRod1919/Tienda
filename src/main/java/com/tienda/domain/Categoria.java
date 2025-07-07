package com.tienda.domain;

import jakarta.persistence.*; //Para asignar todo lo relacionado con base de datos @Entity @Table @Column
import java.io.Serializable; //Para pasar los datos como todo en uno a traves de la red o archivos dentro de la maquina
import java.util.List;
//Por medio de un ID Serializable le indicamos al programa que estructura tiene el objeeto (Atributos)
import lombok.Data; //Para ahorrar escritura de código como getters, setters, etc.. con @Data

@Data //Agrega código repetitivo como los getter o setter
@Entity //Indica que esta clase es una entidad dentro de la base de datos
@Table(name="categoria") //Le indica el nombre de esa entidad de la base de datos
public class Categoria implements Serializable { //Implementamos serializable para que se pueda pasar por medio de la red
    
    private static final long serialVersionUID = 1L; //este es el ID del objeto para pasarlo por la red
    
    @Id //Indicamos que el campo va a ser de tipo PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Indicamos que va a ser autoincrementable
    @Column(name="id_categoria") //Esto solo lo hacemos si lo amerita, es para poder cambiar el nombre dentro del código si
    //la variable recibe un nombre diferente dentro de la base de datos, en ese caso le idicamos que va a ser x columna
    private Long idCategoria;
    private String descripcion;
    @Column(name="ruta_imagen")
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_categoria", updatable=false)
    List<Producto> productos;

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Categoria() {
    }

}
