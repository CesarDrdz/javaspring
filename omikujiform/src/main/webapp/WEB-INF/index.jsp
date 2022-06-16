<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji Form</title>
</head>
<body>
	<h1>Hello World</h1>
	<form action="/login" method="post">
		<label>Enter the name of any City:</label>
		<input type="text" name="city">
		<label>Enter a real person:</label>
		<input type="text" name="person">

		<div class="row">
			<div class="col-25">
				<label for="hoby">Enter in a professional endeavor or hobby</label>
			</div>
			<div class="col-75">
				<input type="text" id="hoby" name="hoby"
					placeholder="Your endeavor/hoby..">
			</div>
		</div>
		<div class="row">
			<div class="col-25">
				<label for="thing">Enter any type of living thing.</label>
			</div>
			<div class="col-75">
				<input type="text" id="thing" name="thing"
					placeholder="Living thing..">
			</div>
		</div>
				<div class="row">
			<div class="col-25">
				<label for="subject">Subject</label>
			</div>
			<div class="col-75">
				<textarea id="subject" name="subject"
					placeholder="Write something.." style="height: 200px"></textarea>
			</div>
		</div>
		<div class="row">
			<input type="submit" value="Submit">
		</div>
	</form>

</body>
</html>