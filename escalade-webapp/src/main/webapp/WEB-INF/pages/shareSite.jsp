
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<h3 class="h3SiteShare"> Partagez vos connaissances</h3>
			<form method="post">
				<fieldset class="findSiteField">
					<legend> Présentez votre site grâce aux filtres ci-dessous</legend>
					<div id="conteneurShare">
						<div class="lieuFind">
						<label for="lieuSiteshare">Lieu</label>
							<select name ="lieuSite" id="lieuSiteshare">
								<option value="ici">Ici</option>
								<option value="ailleurs">Ailleurs </option>
								<option value="inconnu" selected="">Inconnu </option><br/>
							</select>
						</div>
						<div class="cotationFind"> 
						<label for="cotationShare">Cotation</label>
							<select name ="cotation" id="cotationShare">
								<option value="3">3</option>
								<option value="4">4 </option>
								<option value="5">5 </option>
								<option value="6">6 </option>
								<option value="7">7 </option>
								<option value="8">8 </option>
								<option value="9">9 </option>
								<option value="inconnu" selected="">Inconnu </option> <br/>
							</select>
						</div>
						<div class ="nbSecteurFind">
						<label for="nbSecteurShare">Nombre de Secteurs</label>
							<select name ="nbSecteur" id="nbSecteurShare">
								<option value="1+">1+</option>
								<option value="2+">2+</option>
								<option value="3+">3+</option>
								<option value="4+">4+ </option>
								<option value="5+">5+ </option>
								<option value="inconnu" selected="">Inconnu </option> <br/>
							</select>
							</div>
							<div class="nbVoiesFind">		
						<label for="nbVoiesShare">Nombre de Voies</label>
							<select name ="nbSecteur" id="nbSecteurShare">
								<option value="1+">1+</option>
								<option value="30+">30+</option>
								<option value="50+">50+</option>
								<option value="100+">100+ </option>
								<option value="inconnu" selected="">Inconnu </option> <br/>
							</select>
							</div>
					</div>
				</fieldset>
				<fieldset class="CommentShareField"> 
					<legend> Donnez des informations sur le site</legend>
					<label for="commentSite">Descriptif du site </label>
					<textarea type=" textarea" name="commentSite" id="commentSite " rows="15" cols="70"></textarea>
				</fieldset>
				<input class="buttonValidershare"type="submit" value="Valider">
			</form>

</body>
</html>