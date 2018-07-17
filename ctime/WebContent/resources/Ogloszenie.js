function wywolaj(){
let announcementJobTitle = document.querySelector('.announcement__job-title');
let announcementCompanyName = document.querySelector('.announcement__company-name');
let announcementCompanyLocation = document.querySelector('.announcement__location');
let announcementCompanyWWW = document.querySelector('.announcement__www-address');
let announcementCompanyAbout = document.querySelector('.announcement__about-company');
let announcementPositionAbout = document.querySelector('.announcement__about-position');
let announcementPositionResponsibilities = document.querySelector('.announcement__responsibilities');
let announcementCandidateDemands = document.querySelector('.announcement__demands');


let jobTitle =localStorage.getItem('jobPosition');
let companyName=localStorage.getItem('companyName');
let companyLocation=localStorage.getItem('jobLocation');
let companyWWW=localStorage.getItem('www');
let companyAbout=localStorage.getItem('aboutCompany');
let positionAbout=localStorage.getItem('aboutPosition');
let responsibilities=localStorage.getItem('responsibilities');
let candidateDemands=localStorage.getItem('demands');
	if(localStorage.length!==0)
{
	if(jobTitle!=="")
announcementJobTitle.innerHTML=jobTitle;		
	if(companyName!=="")
announcementCompanyName.innerHTML=companyName;
	if(companyLocation!=="")
announcementCompanyLocation.innerHTML=companyLocation;
	if(companyWWW!=="")
announcementCompanyWWW.innerHTML=companyWWW;
	if(companyAbout!=="")
announcementCompanyAbout.innerHTML=companyAbout;
	if(positionAbout!=="")
announcementPositionAbout.innerHTML=positionAbout;
	if(responsibilities!=="")
announcementPositionAbout.innerHTML=positionAbout;
	if(candidateDemands!=="")
announcementCandidateDemands.innerHTML=candidateDemands;
}
};
document.querySelector('#klik').addEventListener('click', wywolaj);