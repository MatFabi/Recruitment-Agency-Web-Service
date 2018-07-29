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
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Announcement> theQuery = 
				currentSession.createQuery("from Announcement", Announcement.class);
		theQuery.setMaxResults(10);
		List<Announcement> announcements = theQuery.getResultList();
		
			
		return announcements;

	}
	@Override
	public List<Announcement> getAnnouncements(int pageNo) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Announcement> theQuery = 
				currentSession.createQuery("from Announcement", Announcement.class);
		theQuery.setFirstResult((pageNo>1?((pageNo-1)*10):1));
		theQuery.setMaxResults(10);

		
		List<Announcement> announcements = theQuery.getResultList();		
		return announcements;
	}

	@Override
	public void saveAnnouncement(Announcement theAnnouncement) {
		
		
		Session currentSession = sessionFactory.getCurrentSession();				
		currentSession.save(theAnnouncement);

	}

	@Override
	public Announcement getAnnouncement(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
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
