package com.ctime.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctime.dao.AnnouncementDAO;
import com.ctime.entity.Announcement;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

	@Autowired
	private AnnouncementDAO announcementDAO;
	
	
	@Override
	@Transactional
	public List<Announcement> getAnnouncements() {

		return announcementDAO.getAnnouncements();
	}

	@Override
	@Transactional
	public void saveAnnouncement(Announcement theAnnouncement) {
		
		announcementDAO.saveAnnouncement(theAnnouncement);
	}

	@Override
	@Transactional
	public Announcement getAnnouncement(int theId) {
		return announcementDAO.getAnnouncement(theId);
	}

	@Override
	@Transactional
	public List<Announcement> getAnnouncements(int pageNo) {
		
		return announcementDAO.getAnnouncements(pageNo);
	}

	@Override
	@Transactional
	public int getRecordsNumber() {
	
		return announcementDAO.getRecordsNumber();
	}

}
