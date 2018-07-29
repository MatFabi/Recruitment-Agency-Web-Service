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
		Zaloguj się, aby dodać ogłoszenie
		</h2>
<div class="login-page">
	<div class="form__container">
		<form:form action="/ctime/register/processRegistrationForm" class="form-register form--disabled" modelAttribute="ctimeUser" method="POST">
			<ul class="announcement-form__list">					
				<li class="announcement-form__item">
					<label for="first-name" class="announcement-form__label">Imię<span class="required" >*</span></label>
					<form:input name="first-name" class="form__input" required="" path="firstName"/>
				</li>
				<li class="announcement-form__item">
					<label for="last-name" class="announcement-form__label">Nazwisko<span class="required">*</span></label>
					<form:input name="last-name" class="form__input" required="required" path="lastName" />
				</li>
				<li class="announcement-form__item">
					<label for="company-name" class="announcement-form__label">Nazwa firmy <span class="required">*</span></label>
					<form:input name="company-name" class="form__input" path="companyName" />
				</li>
				<li class="announcement-form__item">				
					<label for="company-email" class="announcement-form__label">E-mail firmowy <span class="required">*</span></label>
					<form:input name="company-email" class="form__input" path="companyEmail" />
				</li>	
				<li class="announcement-form__item">
					<label for="username" class="announcement-form__label">Nazwa użytkownika <span class="required">*</span></label>
					<form:input name="username" class="form__input" required="required" path="username" />
				</li>		
				<li class="announcement-form__item">
					<label for="password" class="announcement-form__label">Hasło<span class="required" >*</span></label>
					<form:input name="password" class="form__input" required="required" type="password" path="password"/>
				</li>
				<input type="submit" value="Wyślij" class="form__button">
					<p class="form__message">Masz konto? <a href="#" class="toggler">Zaloguj się</a></p>
			</ul>
			
		</form:form>
		<form:form action="authenticateUser" class="form-login" modelAttribute="ctimeUser" method="POST">
		<ul class="announcement-form__list">	
			<li class="announcement-form__item">
					<label for="username" class="announcement-form__label">Nazwa użytkownika <span class="required">*</span></label>
					<form:input name="username" class="form__input" required="required" path="username" />
				</li>		
				<li class="announcement-form__item">
					<label for="password" class="announcement-form__label">Hasło<span class="required" >*</span></label>
					<form:input name="password" class="form__input" required="required" type="password" path="password"/>
				</li>
				<input type="submit" value="Wyślij" class="form__button">
					<p class="form__message">Nie jesteś zarejestrowany? <a href="#" class="toggler">Stwórz konto</a></p>
			</ul>
		</form:form>
	</div>
</div>
</section>
<footer>
		
</footer>
	
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/main.js"> </script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/Ogloszenie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/login-forms.js"></script>		

</body>
</html>