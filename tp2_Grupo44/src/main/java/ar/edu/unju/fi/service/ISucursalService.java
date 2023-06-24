package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.entity.Sucursal;

public interface ISucursalService {
    
    //#region Methods
    public List<Sucursal> getSucursales();

    public void addSucursal(Sucursal sucursalAgregar);

    public Sucursal findSucursalByIdentifier(long identificador);

    public void deleteSucursalByIdentifier(Sucursal sucursalEliminar);

	public Sucursal getSucursal();
    //#endregion

}
