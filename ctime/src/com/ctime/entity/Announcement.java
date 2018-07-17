package com.ctime.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="announcement")
public class Announcement {
	

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_position")
	private String jobPosition;

	@Column(name="company_name")
	private String companyName;
	
	@Column(name="location")
	private String location;
	
	@Column(name="www")
	private String www;
	
	@Column(name="company_about")
	private String companyAbout;
	
	@Column(name="position_about")
	private String positionAbout;
	
	@Column(name="responsibilities")
	private String responsibilities;
	
	@Column(name="requirements")
	private String requirements;

	public Announcement() {
		
	}
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWww() {
		return www;
	}

	public void setWww(String www) {
		this.www = www;
	}

	public String getCompanyAbout() {
		return companyAbout;
	}

	public void setCompanyAbout(String companyAbout) {
		this.companyAbout = companyAbout;
	}

	public String getPositionAbout() {
		return positionAbout;
	}

	public void setPositionAbout(String positionAbout) {
		this.positionAbout = positionAbout;
	}

	public String getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	@Override
	public String toString() {
		return "Announcement [id=" + id + ", jobPosition=" + jobPosition + ", companyName=" + companyName
				+ ", location=" + location + ", www=" + www + ", companyAbout=" + companyAbout + ", positionAbout="
				+ positionAbout + ", responsibilities=" + responsibilities + ", requirements=" + requirements + "]";
	}
	
	
}
