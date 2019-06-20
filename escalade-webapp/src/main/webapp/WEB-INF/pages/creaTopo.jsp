
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<meta charset="UTF-8">
<title>CreaTopo</title>
</head>
<body>
<%@ include file = "menu.jsp" %>
<h3 class="h3TopoCrea"> Je crée mon topo</h3>

			<form method="post">
				<fieldset> 
					<legend> Information sur votre topo</legend>

					<label for="nomTopo"> Nom de votre topo</label>
					<input  type="text" name="nomTopo" id="nomTopo"> <br/>

					<label for="lieux"> Lieu (essayez d'être le plus précis possible) </label>
					<input type="text" name="lieux" id="lieux"> <br/>

					<label for="date">Date de parution</label>
					<input type="Date" name="date" id="date"><br/>

					<label for="commentTopo">Descriptif du topo </label>
					<textarea type=" textarea" name="commentTopo" id="commentTopo " rows="15" cols="70"></textarea>



				</fieldset>

			</form>

</body>
</html>