package ec.edu.ups.entidades;


import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;
	private Date fecha;
	private String nombreCliente;
	private float subtotal;
	private float iva;
	private float total;
	private String observaciones;
	
	
	@ManyToOne
	@JoinColumn
	@JsonbTransient
	private Tarjeta tarjeta;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
	private List<Comida> comidas= new ArrayList<Comida>();


	public Pedido(int numero, Date fecha, String nombreCliente, float subtotal, float iva, float total,
			String observaciones) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.nombreCliente = nombreCliente;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.observaciones = observaciones;
	}
	public Pedido() {
		super();
	}

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public float getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}


	public float getIva() {
		return iva;
	}


	public void setIva(float iva) {
		this.iva = iva;
	}


	public float getTotal() {
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public Tarjeta getTarjeta() {
		return tarjeta;
	}


	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}


	public List<Comida> getComidas() {
		return comidas;
	}


	public void setComidas(List<Comida> comidas) {
		this.comidas = comidas;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comidas == null) ? 0 : comidas.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + Float.floatToIntBits(iva);
		result = prime * result + ((nombreCliente == null) ? 0 : nombreCliente.hashCode());
		result = prime * result + numero;
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + Float.floatToIntBits(subtotal);
		result = prime * result + ((tarjeta == null) ? 0 : tarjeta.hashCode());
		result = prime * result + Float.floatToIntBits(total);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (comidas == null) {
			if (other.comidas != null)
				return false;
		} else if (!comidas.equals(other.comidas))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (Float.floatToIntBits(iva) != Float.floatToIntBits(other.iva))
			return false;
		if (nombreCliente == null) {
			if (other.nombreCliente != null)
				return false;
		} else if (!nombreCliente.equals(other.nombreCliente))
			return false;
		if (numero != other.numero)
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (Float.floatToIntBits(subtotal) != Float.floatToIntBits(other.subtotal))
			return false;
		if (tarjeta == null) {
			if (other.tarjeta != null)
				return false;
		} else if (!tarjeta.equals(other.tarjeta))
			return false;
		if (Float.floatToIntBits(total) != Float.floatToIntBits(other.total))
			return false;
		return true;
	}



	
	


		

}
