/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_juanmolina_11621058;

/**
 *
 * @author Hwan
 */

public class Animales {
    
    public Animales(String nombreCientifico, String nombreComun, String habitat, String alimentacion, String descripcionRasgos, String distribucionGeografica, int vida) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.descripcionRasgos = descripcionRasgos;
        this.distribucionGeografica = distribucionGeografica;
        this.vida = vida;
    }
    
    private String nombreCientifico;
    private String nombreComun;
    private String habitat;
    private String alimentacion;
    private String descripcionRasgos;
    private String distribucionGeografica;
    private int vida;
    
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getDescripcionRasgos() {
        return descripcionRasgos;
    }

    public String getDistribucionGeografica() {
        return distribucionGeografica;
    }

    public int getVida() {
        return vida;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void setDescripcionRasgos(String descripcionRasgos) {
        this.descripcionRasgos = descripcionRasgos;
    }

    public void setDistribucionGeografica(String distribucionGeografica) {
        this.distribucionGeografica = distribucionGeografica;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Animales{" + "Nombre Cientifico=" + nombreCientifico + ", Nombre Comun=" + nombreComun + ", Habitat=" + habitat + ", Alimentacion=" + alimentacion + ", Descripcion Rasgos=" + descripcionRasgos + ", Distribucion Geografica=" + distribucionGeografica + ", Vida=" + vida + '}';
    }
    
}
