package com.ctime.dao;

import java.util.List;

import com.ctime.entity.Announcement;

public interface AnnouncementDAO {
	
	public int getRecordsNumber();

	public List<Announcement> getAnnouncements();
	
	public void saveAnnouncement(Announcement theAnnouncement);

	public Announcement getAnnouncement(int theId);

	public List<Announcement> getAnnouncements(int pageNo);
}
