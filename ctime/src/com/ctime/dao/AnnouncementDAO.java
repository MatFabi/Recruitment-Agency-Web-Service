package com.ctime.dao;

import java.util.List;

import com.ctime.entity.Announcement;

public interface AnnouncementDAO {
	
	public List<Announcement> getAnnouncements();
	
	public void saveAnnouncement(Announcement theAnnouncement);

	public Announcement getAnnouncement(int theId);
}
