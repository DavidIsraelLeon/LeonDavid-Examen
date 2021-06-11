package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.List;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Comida implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private double precio;
	
	
	@ManyToOne
	@JoinColumn
	@JsonbTransient
	private Pedido pedido;


	public Comida(int codigo, String nombre, double precio, Pedido pedido) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pedido = pedido;
	}
	public Comida(int codigo, String nombre, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pedido = pedido;
	}
	public Comida() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Comida other = (Comida) obj;
		if (codigo != other.codigo)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		return true;
	}
	
	




}
