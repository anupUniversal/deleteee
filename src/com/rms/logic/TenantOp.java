
/**
 *	Add record for Room
 */
package com.rms.logic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.metamodel.Metamodel;

import com.rms.dao.Room;
import com.rms.dao.Tenant;

/**
 * @author anup
 */
public class TenantOp {
	
	/*@PersistenceUnit(name="testjpa")
	private EntityManagerFactory entityManagerFactory;*/
	private EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("testjpa");
	
	/**
	 * getter and setter needed for below fields
	*/
	private 	String selectedItems[];
	private List <Tenant>  tenantStat ;  
	private Tenant tenant;

	public Tenant getTenant() {
		return tenant;
	}


	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}




	public String delTenant()	{
		
		try {
			 EntityManager em = entityManagerFactory.createEntityManager();
			 EntityTransaction userTransaction = em.getTransaction();			
			 
			 System.out.println( "list of the items to be deleted" +  getSelectedItems());
			 
			 for (String id : getSelectedItems()) {
				 userTransaction.begin();
				 Tenant r =  em.find(Tenant.class, Integer.parseInt(id) );
				 em.remove(r);
			 	 userTransaction.commit();
			 }
			 
			 em.close();
		  } catch (Exception e) {
			System.out.println("\n"+ e);
		 }
		populateBean();
		return "success";
	}
	
	
	private void populateBean()	{
		EntityManager em = entityManagerFactory.createEntityManager();
		Query q = em.createQuery("SELECT a FROM Tenant a ");		
		setTenStat((List<Tenant>) q.getResultList());
	}


	
	public String addTenant()	{
		
		try {
			 EntityManager em = entityManagerFactory.createEntityManager();
			 System.out.println("==adding the tenant s =====");
			 System.out.print(" check whether room value gets injected ? = " + tenant );
			 EntityTransaction userTransaction = em.getTransaction();
			 userTransaction.begin();
			 em.persist(tenant);
			 userTransaction.commit();
			 em.close();
		  } catch (Exception e) {
			System.out.println("\n"+ e);
		 }
		populateBean();
		return "success";
	}
	
	
	public String execute() {
			
			try {
				System.out.println("==populating tenant bean=====");
				populateBean();
			} catch (Exception e) {
				System.out.println("\n"+ e);
			}
		
	
		return "success";
		
	}
	

	
	public List<Tenant> getTenStat() {
		return tenantStat;
	}


	public void setTenStat(List<Tenant> tenStat) {
		this.tenantStat = tenStat;
	}




	public String[] getSelectedItems() {
		return selectedItems;
	}


	public void setSelectedItems(String[] selectedItems) {
		this.selectedItems = selectedItems;
	}


}
