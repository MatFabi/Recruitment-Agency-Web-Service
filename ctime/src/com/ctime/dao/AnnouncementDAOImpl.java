package com.ctime.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ctime.entity.Announcement;

@Repository
public class AnnouncementDAOImpl implements AnnouncementDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Announcement> getAnnouncements() {
		
		//Get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create query
		Query<Announcement> theQuery = 
				currentSession.createQuery("from Announcement", Announcement.class);
		//execute query and get result list
		List<Announcement> announcements = theQuery.getResultList();
		
		//return the results		
		return announcements;

	}
	@Override
	public List<Announcement> getAnnouncements(int pageNo) {
		
		//Get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create query
		Query<Announcement> theQuery = 
				currentSession.createQuery("from Announcement", Announcement.class);
		//execute query and get result list
		List<Announcement> announcements = theQuery.getResultList();
		
		//return the results		
		return announcements;
	}

	@Override
	public void saveAnnouncement(Announcement theAnnouncement) {
		//get current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer..
		currentSession.save(theAnnouncement);

	}

	@Override
	public Announcement getAnnouncement(int theId) {
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// retrieve/read from db using the primary key
		Announcement theAnnouncement = currentSession.get(Announcement.class, theId);
			
		return theAnnouncement;
	}
	@Override
	public int getRecordsNumber() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		int recordsNumber =
				((Long) currentSession.createQuery("select count(*) from Announcement").uniqueResult()).intValue();
		return recordsNumber;
	}	
	
}
