
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<meta charset="UTF-8">
<title>find Site</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<h3 class="h3SiteFind"> Choississez le site de vos rêves!</h3>
			<form method="post">
				<fieldset class="findSiteField">
					<legend> Trouvez votre site grâce aux filtres ci-dessous</legend>
					<div id="conteneurFind">
						<div class="lieuFind">
						<label for="lieuSite">Lieu</label>
							<select name ="lieuSite" id="lieuSite">
								<option value="ici">Ici</option>
								<option value="ailleurs">Ailleurs </option>
								<option value="sansImportance" selected="">Sans importance </option><br/>
							</select>
						</div>
						<div classs="cotationFind"> 
						<label for="cotation">Cotation</label>
							<select name ="cotation" id="cotation">
								<option value="3">3</option>
								<option value="4">4 </option>
								<option value="5">5 </option>
								<option value="6">6 </option>
								<option value="7">7 </option>
								<option value="8">8 </option>
								<option value="9">9 </option>
								<option value="sansImportance" selected="">Sans importance </option> <br/>
							</select>
						</div>
						<div class ="nbSecteurFind">
						<label for="nbSecteur">Nombre de Secteurs</label>
							<select name ="nbSecteur" id="nbSecteur">
								<option value="1+">1+</option>
								<option value="2+">2+</option>
								<option value="3+">3+</option>
								<option value="4+">4+ </option>
								<option value="5+">5+ </option>
								<option value="sansImportance" selected="">Sans importance </option> <br/>
							</select>
							</div>
							<div class="nbVoiesFind">		
						<label for="nbVoies">Nombre de Voies</label>
							<select name ="nbSecteur" id="nbSecteur">
								<option value="1+">1+</option>
								<option value="30+">30+</option>
								<option value="50+">50+</option>
								<option value="100+">100+ </option>
								<option value="sansImportance" selected="">Inconnu </option> <br/>
							</select>
							</div>
							<div class ="buttonGOFind">
						<input class="buttonGO"type="submit" value="GO">
						</div>
					</div>
				</fieldset>
			</form>


</body>
</html>