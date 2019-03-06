<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Nouveau Collaborateur</h1>
	<div class="container">
		<form action="" method="post">
			<div class="nom">
				<div class="left col-sm-4">
					<p>Nom</p>
				</div>
				<div class="right col-sm-8">
					<input type="text" name="nom">
				</div>
			</div>
			<div class="prenom">
				<div class="left col-sm-4">
					<p>Prénom</p>
				</div>
				<div class="right col-sm-8">
					<input type="text"  name="prenom">
				</div>
			</div>
			<div class="dateNaissance">
				<div class="left col-sm-4">
					<p>Date de naissance</p>
				</div>
				<div class="right col-sm-8">
					<input type="date"  name="dateNaissance">
				</div>
			</div>
			<div class="adresse">
				<div class="left col-sm-4">
					<p>Adresse</p>
				</div>
				<div class="right col-sm-8">
					<TEXTAREA name="adresse" rows=3 cols=40></TEXTAREA>
				</div>
			</div>
			<div class="numSecurite">
				<div class="left col-sm-4">
					<p>Numéro de sécurité sociale</p>
				</div>
				<div class="right col-sm-8">
					<TEXTAREA type="number"  name="numSecurite" length=15></TEXTAREA>
				</div>
			</div>
			<div class="buttonCreate">
				<div class="left left--end col-sm-11"></div>
				<div class="right right--button col-sm-1">
					<input type="submit" name="creer" value="Créer">
				</div>
			</div>
		</form>
	</div>
</body>
</html>