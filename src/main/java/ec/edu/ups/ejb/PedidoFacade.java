package ec.edu.ups.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Pedido;
import ec.edu.ups.entidades.Persona;

@Stateless
public class PedidoFacade extends AbstractFacade<Pedido> {

	@PersistenceContext(unitName = "LeonDavid-Examen")
    private EntityManager em;

	public PedidoFacade() {
		super(Pedido.class);
	}
	
	 @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	 
	public List<Pedido> pedidosRe(){
		 List<Pedido> ped=new ArrayList<Pedido>();
		 String consulta="Select p From Pedido pc order by pc.numero desc";
		 try {
			 ped=em.createQuery(consulta).getResultList();
		 }
		 catch(Exception e) {
			 System.out.println("Buscar por tarjeta"+e.getMessage());
		 }
		 return ped;
		 
	 }
	
	public Pedido buscarPorCedula (String cedula) {
    	Persona persona=null;
    	String consulta = "Select per From Persona per Where per.cedula=:cedula";
    	try {
    		persona= (Persona) em.createQuery(consulta).setParameter("cedula", cedula).getSingleResult();
    	}catch(Exception e) {
    		System.out.println(">>>Warning (PersonaFacade:buscarPorCedula: )"+e.getMessage());
    	}
    	return persona;
    }
	


}
