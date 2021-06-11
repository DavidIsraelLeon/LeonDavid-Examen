package ec.edu.ups.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Tarjeta implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String numeroTarjeta;
	private String nombreTitular;
	private Date fechaCaducidad;
	private int cvv;
	
	@OneToMany
	@JoinColumn
	@JsonbTransient
	private List<Pedido> pedidos;

	public Tarjeta(String numeroTarjeta, String nombreTitular, Date fechaCaducidad, int cvv) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.nombreTitular = nombreTitular;
		this.fechaCaducidad = fechaCaducidad;
		this.cvv = cvv;
	}

	public Tarjeta() {
		super();
	}


	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}




	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}




	public String getNombreTitular() {
		return nombreTitular;
	}




	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}




	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}




	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}




	public int getCvv() {
		return cvv;
	}




	public void setCvv(int cvv) {
		this.cvv = cvv;
	}




	public List<Pedido> getPedidos() {
		return pedidos;
	}




	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cvv;
		result = prime * result + ((fechaCaducidad == null) ? 0 : fechaCaducidad.hashCode());
		result = prime * result + ((nombreTitular == null) ? 0 : nombreTitular.hashCode());
		result = prime * result + ((numeroTarjeta == null) ? 0 : numeroTarjeta.hashCode());
		result = prime * result + ((pedidos == null) ? 0 : pedidos.hashCode());
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
		Tarjeta other = (Tarjeta) obj;
		if (cvv != other.cvv)
			return false;
		if (fechaCaducidad == null) {
			if (other.fechaCaducidad != null)
				return false;
		} else if (!fechaCaducidad.equals(other.fechaCaducidad))
			return false;
		if (nombreTitular == null) {
			if (other.nombreTitular != null)
				return false;
		} else if (!nombreTitular.equals(other.nombreTitular))
			return false;
		if (numeroTarjeta == null) {
			if (other.numeroTarjeta != null)
				return false;
		} else if (!numeroTarjeta.equals(other.numeroTarjeta))
			return false;
		if (pedidos == null) {
			if (other.pedidos != null)
				return false;
		} else if (!pedidos.equals(other.pedidos))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Tarjeta [numeroTarjeta=" + numeroTarjeta + ", nombreTitular=" + nombreTitular + ", fechaCaducidad="
				+ fechaCaducidad + ", cvv=" + cvv + ", pedidos=" + pedidos + "]";
	}
	
	


}
