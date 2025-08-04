package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface ReporteService {
/*ResponseEntity<T>: Es una clase genérica de Spring que representa una respuesta HTTP completa, que incluye:
el código de estado (como 200 OK, 404 Not Found, etc.),
los encabezados (headers), y
el cuerpo de la respuesta (T es el tipo del cuerpo).*/
    public ResponseEntity<Resource> generaReporte(String reporte, 
            Map<String, Object> parametros, 
            String tipo)
            throws IOException;
}