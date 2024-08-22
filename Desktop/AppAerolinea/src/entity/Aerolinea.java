/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Esteban
 */
public class Aerolinea {
    private String codigo;
    private String NombreAerolinea;
    private int antiguedad;
    private String direccionAerolinea;

    public Aerolinea(String codigo, String NombreAerolinea, int antiguedad, String direccionAerolinea) {
        this.codigo = codigo;
        this.NombreAerolinea = NombreAerolinea;
        this.antiguedad = antiguedad;
        this.direccionAerolinea = direccionAerolinea;
    }

    public String getDireccionAerolinea() {
        return direccionAerolinea;
    }

    public void setDireccionAerolinea(String direccionAerolinea) {
        this.direccionAerolinea = direccionAerolinea;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreAerolinea() {
        return NombreAerolinea;
    }

    public void setNombreAerolinea(String NombreAerolinea) {
        this.NombreAerolinea = NombreAerolinea;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
            
            
}
