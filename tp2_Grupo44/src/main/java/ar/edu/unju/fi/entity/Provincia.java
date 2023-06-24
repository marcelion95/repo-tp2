package ar.edu.unju.fi.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Component
@Entity
@Table(name = "provincias")
public class Provincia {

    //#region Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "provincia_identificador")
    private long identificador;

    @Column(name = "estado", columnDefinition = "boolean default true")
    private boolean estado;

    @NotBlank(message = "Debes introducir un nombre")
	@Size(min = 5, max = 15, message = "El nombre solo puede contener entre 5 y 15 caracteres")
	@Pattern(regexp = "[a-zA-Z]+", message = "Debe contener solo letras")
    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "provincia")
    private List<Sucursal> listaSucursales;
    // #endregion

    //#region Constructors
    public Provincia() {
        this.estado = true;
    }

    public Provincia(
            long identificador,
            boolean estado,
            String nombre,
            List<Sucursal> listaSucursales) {

        this.identificador = identificador;
        this.estado = estado;
        this.nombre = nombre;
        this.listaSucursales = listaSucursales;

    }
    //#endregion

    //#region Getters and Setters
    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Sucursal> getListaSucursal() {
        return listaSucursales;
    }

    public void setListaSucursal(List<Sucursal> listaSucursales) {
        this.listaSucursales = listaSucursales;
    }
    //#endregion

}
