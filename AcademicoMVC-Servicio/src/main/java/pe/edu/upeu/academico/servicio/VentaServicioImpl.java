/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.academico.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.academico.dao.VentaDaoI;
import pe.edu.upeu.academico.modelo.Venta;

/**
 *
 * @author john
 */
@Service
@Transactional
public class VentaServicioImpl implements VentaServicioI{
    
    @Autowired
    public VentaDaoI daoI;
    
    @Override
    public List<Venta> listarEntidad() {
       return daoI.listarEntidad();
    }

    @Override
    public List<Venta> listarEntidadDato(String dato) {
       return daoI.listarEntidadDato(dato);
    }

    @Override
    public Venta buscarEntidadId(int id) {
        return daoI.buscarEntidadId(id);
    }

    @Override
    public void guardarEntidad(Venta venta) {
        daoI.guardarEntidad( venta);
    }

    @Override
    public void eliminarEntidad(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarEntidad(Venta venta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
