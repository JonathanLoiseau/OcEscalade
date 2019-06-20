
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<title>Creation de compte</title>
</head>
<body>
<%@include file="menu.jsp" %>
<h3 class="h3Account"> Merci de bien vouloir renseigner les champs suivants:</h3>
				<form method="post" action="traitement.java">
					<fieldset class="Accountfield">
						<legend>Sexe</legend>
						<input type="radio" name="sexe" value="homme" id="homme"><label for="homme">Homme</label><br/>
						<input type="radio" name="sexe" value="femme" id="femme"><label for="femme">Femme</label><br/>
					</fieldset>

					<fieldset class="Accountfield">
						<legend>  Age</legend>
						<label for= "age">Date de naissance </label>
						<input type="Date" name="age" value="age" id="age">
					</fieldset>

					<fieldset class="Accountfield">
						<legend>Nationalité</legend>
						<label for="Nationalité">Pays de naissance</label><br/>
						<select name ="Nationalité" id="Nationalité">
							<option value="France">France</option>
							<option value="Angleterre">Angleterre </option>
							<option value="Espagne">Espagne </option>
							<option value="Belgique">Belgique </option>
							<option value="Suisse">Suisse </option>
							<option value="Italie"> Italie</option>
							<option value="Hors UE">Hors UE </option>
						</select>
					</fieldset>	

					<fieldset class="Accountmail">
						<legend>Mail</legend>

						<label for="Mail"> Votre adresse mail</label>
						<input type="email" name="Mail" id="Mail"  placeholder=" ex:Joze@gmail.com">

						<label for="confirmMail"> Confirmez votre adresse mail</label>
						<input type="email" name="MailConfirm" id="confirmMail">
					</fieldset>

					<input class="Validez" type="submit" value="Valider et créer mon compte ">
				</form>

</body>
</html>