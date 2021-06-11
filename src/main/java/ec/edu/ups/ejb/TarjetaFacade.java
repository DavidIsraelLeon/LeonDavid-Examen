package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Pedido;
import ec.edu.ups.entidades.Tarjeta;

@Stateless
public class TarjetaFacade extends AbstractFacade<Tarjeta> {
	
	@PersistenceContext(unitName = "LeonDavid-Examen")
    private EntityManager em;

	public TarjetaFacade() {
		super(Tarjeta.class);
	}
	
	 @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	
}
