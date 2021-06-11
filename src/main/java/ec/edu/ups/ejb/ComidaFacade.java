package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Comida;
import ec.edu.ups.entidades.Pedido;

@Stateless
public class ComidaFacade extends AbstractFacade<Comida> {
	
	
	@PersistenceContext(unitName = "LeonDavid-Examen")
    private EntityManager em;

	public ComidaFacade() {
		super(Comida.class);
	}

	
	 @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }

}
