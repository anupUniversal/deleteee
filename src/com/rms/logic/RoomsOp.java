
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
	
	public List<Room> getRoomStat() {
		return roomStat;
	}


	public void setRoomStat(List<Room> roomStat) {
		this.roomStat = roomStat;
	}
	
	private void populateBean()	{
		EntityManager em = entityManagerFactory.createEntityManager();
		Query q = em.createQuery("SELECT a FROM Room a ");
		setRoomStat((List<Room>) q.getResultList());
	}
	
	/*@PersistenceUnit(name="testjpa")
	private EntityManagerFactory entityManagerFactory;*/
	private EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("testjpa");
	
	public List <Room>  roomStat ;
	
		public String execute() {
			
			try {
				
		
				EntityManager em = entityManagerFactory.createEntityManager();
				System.out.println("==mysql=====");
				EntityTransaction userTransaction = em.getTransaction();
				
				userTransaction.begin();
				
				Room room= new Room();
				room.setFeatures("ASL;DFK");
				room.setRoomName("A;SLDKF");
				room.setType("AL;SDFJK");
			
				em.persist(room);
				userTransaction.commit();
				em.close();
				populateBean();
				entityManagerFactory.close();
			} catch (Exception e) {
				System.out.println("\n"+ e);
			}
		
	
		return "success";
		
	}
}
