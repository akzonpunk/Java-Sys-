/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.academico.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.academico.SysDataAccess;
import pe.edu.upeu.academico.modelo.Venta;

/**
 *
 * @author LAB_SOFTWARE-DTI
 */
@Repository
public class VentaDaoImpl extends SysDataAccess<Integer, Venta> implements VentaDaoI{
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Venta> listarEntidad(){ return getListAll();}    
        
    
    @Override
    public List<Venta> listarEntidadDato(String dato){
        return (List<Venta>)sessionFactory.getCurrentSession()
                .createQuery("SELECT p from Venta p WHERE p.nombre LIKE ? ")
                .setString(0, "%"+dato+"%")
                .list();                
                }
    
    @Override
    public Venta buscarEntidadId(int id){ return getById(id);}
    
    @Override
    public void guardarEntidad(Venta venta){savev(venta);}
    @Override
    public void eliminarEntidad(int id){delete(id);}
    @Override
    public void modificarEntidad(Venta venta){update(venta);}

}
