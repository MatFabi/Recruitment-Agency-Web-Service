package com.ctime.service;

import java.util.List;
import com.ctime.entity.Announcement;


public interface AnnouncementService {
	
	public List<Announcement> getAnnouncements();
	
	public void saveAnnouncement(Announcement theAnnouncement);

	public Announcement getAnnouncement(int theId);
}
