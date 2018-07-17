package com.ctime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ctime.entity.Announcement;
import com.ctime.service.AnnouncementService;



@Controller
@RequestMapping("/announcement")
public class AnnouncementController {
	
	@Autowired
	private AnnouncementService announcementService;
	
	@GetMapping("/new")
	public String showFormForAdd(Model theModel) {
		
		Announcement theAnnouncement = new Announcement();
		theModel.addAttribute("announcement", theAnnouncement);
		
		return "newad";
	}
	@GetMapping("/main")
	private String mainPage(Model theModel) {
		List<Announcement>  theAnnouncements = announcementService.getAnnouncements();
		theModel.addAttribute("announcement", theAnnouncements);
		
		return "main";
	}
	
	@PostMapping("/saveAnnouncement")
	public String saveAnnouncement(@ModelAttribute("announcement") Announcement theAnnouncement) {
		
		announcementService.saveAnnouncement(theAnnouncement);
		return "redirect:/announcement/new";
	}
}
