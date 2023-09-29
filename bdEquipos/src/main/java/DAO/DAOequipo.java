/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author dchri
 */
public class DAOequipo {
    private String _VCH_NOMBRE_EQUIPO;
 
    public String getVCH_NOMBRE_EQUIPO() {
        return _VCH_NOMBRE_EQUIPO;
    }
 
    public void setVCH_NOMBRE_EQUIPO(String _VCH_NOMBRE_EQUIPO) {
        this._VCH_NOMBRE_EQUIPO = _VCH_NOMBRE_EQUIPO;
    }
    public DAOequipo() {
       
    }
 
    public DAOequipo(String _VCH_NOMBRE_EQUIPO) {
        this._VCH_NOMBRE_EQUIPO = _VCH_NOMBRE_EQUIPO;
    }
    
    public Boolean ValidaSubida( String nom){
        Boolean flag = true;
        if(!nom.isEmpty()){ setVCH_NOMBRE_EQUIPO(nom); }else{return false;}
        
        return flag;
    }
    
    
}