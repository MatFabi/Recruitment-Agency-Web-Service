package com.ctime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ctime.entity.Announcement;
import com.ctime.service.AnnouncementService;

@Controller
public class MainController {
	@Autowired
	private AnnouncementService announcementService;
	
	
	@GetMapping(value="/main")
	private String mainPage(Model theModel) {
		int allRecords;
		int lastPage;
		int startPage=1;
		
		allRecords = announcementService.getRecordsNumber();		
		if (allRecords%10 ==0){ 
			lastPage=allRecords/10;
		}
		else if (allRecords>10) {
			lastPage= (allRecords/10)+1;
		}		
		else {
			lastPage=1;
		}	
		
		System.out.println(allRecords +" " + lastPage+ " " + startPage);
		List<Announcement>  theAnnouncements = announcementService.getAnnouncements();			
		
		theModel.addAttribute("announcement", theAnnouncements);	
		theModel.addAttribute("lastPage", lastPage);
		theModel.addAttribute("startPage", startPage);
		
		return "main";
	}
	
	@GetMapping(value="/main", params="pageNo")
	public String showPage(@RequestParam("pageNo") int pageNo, Model theModel) {
		int allRecords;
		int lastPage;
		int startPage;
		int currentPage= pageNo;
		
		allRecords = announcementService.getRecordsNumber();
		
		if (allRecords%10 ==0){ 
			lastPage=allRecords/10;
		}
		else if (allRecords>10) {
			lastPage= (allRecords/10)+1;
		}		
		else {
			lastPage=1;
		}
		
		if(lastPage>=1 && lastPage<10) {
			startPage=1;
		}
		else if(lastPage>=10 && currentPage<7) {
			lastPage=10;
			startPage=1;
		}else if(currentPage>=7 && lastPage>= currentPage+4) {
			startPage=currentPage-5;
			lastPage=currentPage+4;
		} else {			
			startPage=currentPage-9-(currentPage-lastPage);
		}

		List<Announcement>  theAnnouncements = announcementService.getAnnouncements(pageNo);	
		theModel.addAttribute("announcement", theAnnouncements);
		theModel.addAttribute("currentPageNo", pageNo);
		theModel.addAttribute("lastPage", lastPage);
		theModel.addAttribute("startPage", startPage);
		
		return "main";		
	}
	@GetMapping("/jobOffer")
	public String showJobOffer (@RequestParam("announcementId") int theId, Model theModel) {
	
		Announcement theAnnouncement = announcementService.getAnnouncement(theId);		
		theModel.addAttribute("announcement", theAnnouncement);
		
		return "company";
	}
}
