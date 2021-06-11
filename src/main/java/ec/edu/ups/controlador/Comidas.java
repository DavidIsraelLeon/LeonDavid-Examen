package ec.edu.ups.controlador;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.ComidaFacade;
import ec.edu.ups.ejb.PedidoFacade;
import ec.edu.ups.ejb.TarjetaFacade;
import ec.edu.ups.entidades.Comida;
import ec.edu.ups.entidades.Pedido;
import ec.edu.ups.entidades.Producto;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class Comidas {

	

	@EJB
	private ComidaFacade ejbComida;
	@EJB
	private PedidoFacade ejbPedido;
	@EJB
	private TarjetaFacade ejbTarjeta;
	
	private int codigo;
	private String nombre;
	private double precio;
	
	public void crearComida() {		
		Comida comidaAuxiliar= new Comida(1,nombre,precio);
		ejbComida.create(comidaAuxiliar);
	}

}
