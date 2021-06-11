package ec.edu.ups.controlador;

import java.io.Serializable;
import java.sql.Date;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.ComidaFacade;
import ec.edu.ups.ejb.PedidoFacade;
import ec.edu.ups.ejb.TarjetaFacade;
import ec.edu.ups.entidades.Pedido;
import ec.edu.ups.entidades.Tarjeta;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class CrearDatos implements Serializable {

	@EJB
	private ComidaFacade ejbComida;
	@EJB
	private PedidoFacade ejbPedido;
	@EJB
	private TarjetaFacade ejbTarjeta;
	
	public void creacionPrincipal() {

		
		
	}
}
