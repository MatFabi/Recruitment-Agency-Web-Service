<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>


<!DOCTYPE html>
<html lang="pl">
<head>
	<meta charset="UTF-8">
	<title>Career Time</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
	<script src="http://code.jquery.com/jquery-latest.js"></script>

</head>
<body>

	<header class="page-head">
		<div class="wrapper">
			<nav class="topnav">
				<div class="topnav__logo">
					<h2 class="topnav__name">
						<a href="${pageContext.request.contextPath}/main"  class="topnav__home-link">Career Time
					</h2>
					<p class="topnav__signature">Portal niestandardowej rekrutacji</p></a>
				</div>	

		</nav>
	</div>
	</header>
	<section class="layout">
		<h2 class="layout__welcome-message layout__welcome-message--big-size">
		Dodaj ogłoszenie
		</h2>
		<form:form action="saveAnnouncement" modelAttribute="announcement" method="POST">
		
			<ul class="announcement-form__list">
				<li class="announcement-form__item">
				<label for="job-position" class="announcement-form__label">Nazwa stanowiska <span class="required">*</span></label>
					<form:input name="job-position" class="announcement-form__input" required="required" path="jobPosition" />
				</li>			
				<li class="announcement-form__item">
					<label for="company-name" class="announcement-form__label">Nazwa firmy<span class="required" >*</span></label>
					<form:input name="company-name" class="announcement-form__input" required="" path="companyName"/>
				</li>
				<li class="announcement-form__item">
					<label for="location" class="announcement-form__label">lokalizacja<span class="required">*</span></label>
					<form:input name="location" class="announcement-form__input" required="required" path="location" />
				</li>
				<li class="announcement-form__item">
					<label for="www" class="announcement-form__label">Adres strony www</label>
					<form:input name="www" class="announcement-form__input" path="www" />
				</li>
				<li class="announcement-form__item">
					<label for="about-company" class="announcement-form__label">Informacje o firmie </label>
					<form:textarea name="about-company" class="announcement-form__input" path="companyAbout" />
				</li>
				<li class="announcement-form__item">
					<label for="about-position" class="announcement-form__label">Informacje o stanowisku<span class="required">*</span></label>
					<form:textarea name="about-position" class="announcement-form__input" required="required" path="positionAbout" />
				</li> 
				<li class="announcement-form__item">
					<label for="responsibilities" class="announcement-form__label">Zakres obowiązków<span class="required">*</span></label>
					<form:textarea name="responsibilities" class="announcement-form__input" required="required" path="responsibilities" />
				</li>
				<li class="announcement-form__item">
					<label for="demands" class="announcement-form__label" >Wymagania<span class="required">*</span></label>
					<form:textarea name="demands" class="announcement-form__input" required="required" path="requirements" />
				</li>				
				<input type="button" value="Podgląd" class="btn preview" id="klik" />
				<input type="submit" value="Wyślij" class="btn submit-button">
		</ul>
	</form:form>
</section>
<footer>
		
</footer>
	<div class="pop-up">
		
	</div>
	<div class="pop-up-content">
<div class="close"><a href="#" class="close__item">&times;</a></div>
	<section class="layout">
	<div class="flex">
			<div class="announcement">
			<div class="announcement__header">
		<div class="announcement__header-content">
				<h2 class="announcement__job-title announcement__job-title--big-size"></h2>
				<p class="announcement__company-name"><a class="announcement__link"></a></p>
				<p class="announcement__location"></p>
				</div>
				<div class="announcement__header-image-holder">
					<img height="100px" width="100px">
					</div>
				</div>
				<h3 class="announcement__item-header">Informacje o firmie</h3>
				<p class="announcement__www-address announcement__item"><b>www:</b></p>
				<p class="announcement__about-company announcement__item"></p>
				<h3 class="announcement__item-header"> O stanowisku</h3>
				<p class="announcement__about-position announcement__item"></p>
				<h3 class="announcement__item-header">Zakres obowiązków</h4>
				<p class="announcement__responsibilities announcement__item"></p>
				<h3 class="announcement__item-header">Wymagania</h4>
				<p class="announcement__demands announcement__item"></p>
			</div>

		</div>
	</section>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/main.js"> </script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/Ogloszenie.js"></script>		

</body>
</html>