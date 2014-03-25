
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
import com.rms.dao.Room;

/**
 * @author anup
 */
public class RoomsOp {
	
	/*@PersistenceUnit(name="testjpa")
	private EntityManagerFactory entityManagerFactory;*/
	private EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("testjpa");
	
	private List <Room>  roomStat ;
	private Room aroom;
	String selectedItems[];



	public String[] getSelectedItems() {
		return selectedItems;
	}


	public void setSelectedItems(String[] selectedItems) {
		this.selectedItems = selectedItems;
	}


	public String delRoom()	{
		
		try {
			 EntityManager em = entityManagerFactory.createEntityManager();
			 EntityTransaction userTransaction = em.getTransaction();			
			 
			 System.out.println( "abc value of slect check box " +  getSelectedItems().length );
			 
			 for (String id : getSelectedItems()) {
				 userTransaction.begin();
				 Room r =  em.find(Room.class, Integer.parseInt(id) );
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
		Query q = em.createQuery("SELECT a FROM Room a ");
		setRoomStat((List<Room>) q.getResultList());
	}


	
	public String addRoom()	{
		
		try {
			 EntityManager em = entityManagerFactory.createEntityManager();
			 System.out.println("==mysql=====");
			 EntityTransaction userTransaction = em.getTransaction();
			
			 userTransaction.begin();
			 em.persist(aroom);
			 userTransaction.commit();
			 em.close();
		  } catch (Exception e) {
			System.out.println("\n"+ e);
		 }
		populateBean();
		return "success";
	}
	
	
	public String execute() {	
				System.out.println("==populating the rooms list =====");
				populateBean();
	     		return "success";
	}
	
	
	public Room getAroom() {
		return aroom;
	}


	public void setAroom(Room aroom) {
		this.aroom = aroom;
	}


	public List<Room> getRoomStat() {
		return roomStat;
	}


	public void setRoomStat(List<Room> roomStat) {
		this.roomStat = roomStat;
	}
	
	
}
