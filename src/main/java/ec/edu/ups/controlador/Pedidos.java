package ec.edu.ups.controlador;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.ComidaFacade;
import ec.edu.ups.ejb.PedidoFacade;
import ec.edu.ups.ejb.TarjetaFacade;
import ec.edu.ups.entidades.Pedido;
import ec.edu.ups.entidades.Persona;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class Pedidos {
	
	private static final long serialVersionUID = 1L;


	@EJB
	private ComidaFacade ejbComida;
	@EJB
	private PedidoFacade ejbPedido;
	@EJB
	private TarjetaFacade ejbTarjeta;
	
	
	
	private int numero;
	private Date fecha;
	private String nombreCliente;
	private float subtotal;
	private float iva;
	private float total;
	private String observaciones;
	
	public static Pedido pedido;
	public static List<Pedido> pedidoss = new ArrayList<Pedido>();
	
	@PostConstruct
	public void init(){
		pedidoss=ejbPedido.pedidosRe();
				
		
	}
	
	 public void agregarPedido() {
	    	pedido = null;
	    	
	    	
	    	if(nombre!=null && nombre.equals("")!=true && persona==null ) {
	    		System.out.println("No se repite");
	    		Persona persona2= new Persona(0, nombre, apellido, cedula, direccion, telefono, correo, password, 'C');
	        	ejbPersonaFacade.create(persona2);
	        	nombre="";
	        	apellido="";
	        	direccion="";
	        	telefono="";
	        	cedula="";
	        	correo="";
	    	}
	    		
	    }

	public ComidaFacade getEjbComida() {
		return ejbComida;
	}

	public void setEjbComida(ComidaFacade ejbComida) {
		this.ejbComida = ejbComida;
	}

	public PedidoFacade getEjbPedido() {
		return ejbPedido;
	}

	public void setEjbPedido(PedidoFacade ejbPedido) {
		this.ejbPedido = ejbPedido;
	}

	public TarjetaFacade getEjbTarjeta() {
		return ejbTarjeta;
	}

	public void setEjbTarjeta(TarjetaFacade ejbTarjeta) {
		this.ejbTarjeta = ejbTarjeta;
	}

	public static List<Pedido> getPedidoss() {
		return pedidoss;
	}

	public static void setPedidoss(List<Pedido> pedidoss) {
		Pedidos.pedidoss = pedidoss;
	}

	public String getNumeroCed() {
		return numeroCed;
	}

	public void setNumeroCed(String numeroCed) {
		this.numeroCed = numeroCed;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
