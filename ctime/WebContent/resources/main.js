
function Announcement(jobPosition, companyName, jobLocation, www, aboutCompany, aboutPosition, responsibilities,requirements){
	this.jobPosition=jobPosition;
	this.companyName=companyName;
	this.jobLocation=jobLocation;
	this.www=www;
	this.aboutCompany=aboutCompany;
	this.aboutPosition=aboutPosition;
	this.responsibilities=responsibilities;
	this.requirements=requirements;
}
let previewBtn = document.querySelector('.preview');
previewBtn.addEventListener('click', addAnnouncement, false);
	function addAnnouncement(){
		let	jobPosition=document.getElementsByName('jobPosition')[0].value;
		let companyName=document.getElementsByName('companyName')[0].value;
		let	jobLocation=document.getElementsByName('location')[0].value;
		let	www=document.getElementsByName('www')[0].value;
		let	aboutCompany=document.getElementsByName('companyAbout')[0].value;
		let	aboutPosition=document.getElementsByName('positionAbout')[0].value;
		let	responsibilities=document.getElementsByName('responsibilities')[0].value;
		let	requirements=document.getElementsByName('requirements')[0].value;
			let dreamJob= new Announcement(jobPosition, companyName, jobLocation, www, aboutCompany, aboutPosition, responsibilities,requirements);
				localStorage.setItem('jobPosition', dreamJob.jobPosition);
				localStorage.setItem('companyName', dreamJob.companyName);
				localStorage.setItem('jobLocation', dreamJob.jobLocation);
				localStorage.setItem('www', dreamJob.www);
				localStorage.setItem('aboutCompany', dreamJob.aboutCompany);
				localStorage.setItem('aboutPosition', dreamJob.aboutPosition);
				localStorage.setItem('responsibilities', dreamJob.responsibilities);
				localStorage.setItem('requirements', dreamJob.requirements);
};

	let inputs = document.getElementsByClassName('announcement-form__input');

// Adding p - required field!!
previewBtn.addEventListener('click', function(){
[].forEach.call(inputs,function(e){
	if(e.required==true && e.value!=="" && e.nextSibling.nodeName=="P")
		e.nextSibling.remove();
	if(e.required==true && e.value=="" & e.nextSibling.nodeName!=="P"){
		let requiredSpan = document.createElement('p');
		requiredSpan.innerHTML='<span class="required"> To pole jest wymagane </span>';
		e.parentNode.insertBefore(requiredSpan, e.nextSibling);
}})
	
});

// Appearance modal placed on current view
previewBtn.addEventListener('click', function(){
document.querySelector('.pop-up-content').style.top=window.pageYOffset+"px"
});

// Setting modal unvisible by click on close item
closeWindow = document.querySelector('.close');
	closeWindow.addEventListener('click', function (){
		let invisible = document.querySelectorAll(".pop-up-content, .pop-up");
			[].forEach.call(invisible, function(e){
			e.style.display="none";
			})
		}
);

// Setting modal invisible by click outside the pop-up box
popUpView = document.querySelector('.pop-up');
popUpView.addEventListener('click', function(){
	let invisible = document.querySelectorAll(".pop-up-content, .pop-up");
		[].forEach.call(invisible, function(e){
			e.style.display="none";
		})
});
// Setting modal visible if every input has value
previewBtn.addEventListener('click', function(){
	let inputsArr = Array.prototype.slice.call(inputs);
			if (inputsArr.some(function(e){
				return (e.required==true && e.value=="")})==false){
					let visible = document.querySelectorAll(".pop-up-content, .pop-up");
						[].forEach.call(visible, function(e){
							e.style.display="block";
						})
					}	
});


