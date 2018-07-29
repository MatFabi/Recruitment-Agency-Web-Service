<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html lang="pl">
<head>
	<meta charset="UTF-8">
	<title>Career Time</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" class="css">
</head>
<body>
	<header class="page-head">
		<div class="wrapper">
			<nav class="topnav">
				<div class="topnav__logo">
					<h2 class="topnav__name">
						<a href="${pageContext.request.contextPath}/main" class="topnav__home-link">Career Time
					</h2>
					<p class="topnav__signature">Portal niestandardowej rekrutacji</p></a>
				</div>				
		</nav>
	</div>
	</header>
	<section class="layout">
	<div class="flex">
			<div class="announcement">
			<div class="announcement__header">
		<div class="announcement__header-content">
				<h2 class="announcement__job-title announcement__job-title--big-size">${announcement.jobPosition}</h2>
				<p class="announcement__company-name"><a class="announcement__link">${announcement.companyName}</a></p>
				<p class="announcement__location">${announcement.location}</p>
				</div>
				<div class="announcement__header-image-holder">
					<img height="100px" width="100px">
					</div>
				</div>
				<h3 class="announcement__item-header">Informacje o firmie</h3>
				<p class="announcement__www-address announcement__item"><b>Adres:</b> ${announcement.www}</p>
				<p class="announcement__about-company announcement__item">${announcement.companyAbout}</p>
				<h3 class="announcement__item-header"> O stanowisku</h3>
				<p class="announcement__about-position announcement__item">${announcement.positionAbout}</p>
				<h3 class="announcement__item-header">Zakres obowiązków</h4>
				<p class="announcement__responsibilities announcement__item">${announcement.responsibilities}</p>
				<h3 class="announcement__item-header">Wymagania</h4>
				<p class="announcement__demands announcement__item">${announcement.requirements}</p>
			</div>
			<aside class="sidebar-frame">
				<p class="sidebar-frame__header">Ostatnio dodane oferty</p>
				<ul class="suggestions">
					</li>
					<li class="suggestions__item">SEM  - marketing internetowy 
						<div class="ad__application-form ad__application-form--color-casestudy">
							Case Study
						</div>
						<p><b>Twoja firma!</b> - <span> lokalizacja Twojej firmy!</span></p>
					</li>
					<li class="suggestions__item">SEM  - marketing internetowy 
						<div class="ad__application-form ad__application-form--color-casestudy">
							Case Study
						</div>
						<p><b>Twoja firma!</b> - <span> lokalizacja Twojej firmy!</span></p>
					</li>
					<li class="suggestions__item">SEM  - marketing internetowy 
						<div class="ad__application-form ad__application-form--color-casestudy">
							Case Study
						</div>
						<p><b>Twoja firma!</b> - <span> lokalizacja Twojej firmy!</span></p>
					</li>
					<li class="suggestions__item">SEM  - marketing internetowy 
						<div class="ad__application-form ad__application-form--color-casestudy">
							Case Study
						</div>
						<p><b>Twoja firma!</b> - <span> lokalizacja Twojej firmy!</span></p>
					</li>
				</ul>
			</aside>
		</div>
	</section>
	<footer>
		
	</footer>
</body>
</html>