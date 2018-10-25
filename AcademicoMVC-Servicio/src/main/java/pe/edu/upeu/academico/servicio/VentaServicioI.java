/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.academico.servicio;

import java.util.List;
import pe.edu.upeu.academico.modelo.Venta;

/**
 *
 * @author john
 */
public interface VentaServicioI {
    public List<Venta> listarEntidad();
    public List<Venta> listarEntidadDato(String dato);
    public Venta buscarEntidadId(int id);
    public void guardarEntidad(Venta venta);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Venta venta);      
}
