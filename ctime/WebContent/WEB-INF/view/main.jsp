<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>


<!DOCTYPE html>
<html lang="pl">
<head>
	<meta charset="UTF-8">
	<title>Career Time</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" class="rel">
	<script defer src="https://use.fontawesome.com/releases/v5.0.10/js/all.js" integrity="sha384-slN8GvtUJGnv6ca26v8EzVaR9DC58QEwsIk9q1QXdCU8Yu8ck/tL/5szYlBbqmS+" crossorigin="anonymous"></script>
</head>
<body>
	<header class="page-head">
		<div class="wrapper">
			<nav class="topnav">
				<div class="topnav__logo">
					<h2 class="topnav__name">
					
						<a href="${pageContext.request.contextPath}/announcement/main"  class="topnav__home-link">Career Time
					</h2>
					<p class="topnav__signature">Portal niestandardowej rekrutacji</p></a>
				</div>	
				<ul class="topnav__list">
					<a href="${pageContext.request.contextPath}/announcement/new" class="topnav__link"><li class="topnav__item">Dodaj Ogłoszenie</li></a>
				</ul>
		</nav>
	</div>
	</header>
		<section class="layout">
			<h2 class="layout__welcome-message layout__welcome-message--big-size">
				<strong>Najnowsze oferty pracy i staży</strong>
			</h2>
			<div class="legend">
				<div class="legend__recruitment legend__recruitment--case-study">Case Study</div>
				<p class="legend__description">Rekrutacja odbywa się przy wykorzystaniu zadań rekrutacyjnych</p>
			</div>
			<div class="flex">
				<ul class="ads">				
					<c:forEach var="freshAnnouncements" items="${announcement}" >					
					<c:url var="announcementLink" value="/announcement/showJobOffer">
						<c:param name="announcementId" value="${freshAnnouncements.id}" />
					</c:url>
					
						<li class="ad__item">
						
							<div class="ad__logo">
								<img width="100px" height="49px">
							</div>
							<div class="ad__wrapper">
								<div class="ad__application-wrap">
								
									<h2 class="ad__job-position">
										<a href="${announcementLink}">
											${freshAnnouncements.jobPosition}
										</a>
									</h2>
									<h3 class="ad__company-name">
										${freshAnnouncements.companyName}
									</h3>								
									<p class="ad__location">
										${freshAnnouncements.location}
										</p>	
									</div>								
									<div class="ad__application-details">
										<div class="ad__application-form ad__application-form--color-casestudy">Case Study</div>
										<p class="ad__application-deadline">
											<time datetime="2018-11-12" class="ad__date">12 październik 2018</time>
										</p>
									</div>
							</div>
							
						</li>
						
					</c:forEach>				
				</ul>
			
			<aside class="sidebar-frame">
				<p class="sidebar-frame__header">Ostatnio dodane oferty</p>
				<ul class="suggestions">
			
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
		<footer class="contact">
			<div class="copyright">CareerTime 2018&copy;</div>
		</footer>

</body>
</html>







