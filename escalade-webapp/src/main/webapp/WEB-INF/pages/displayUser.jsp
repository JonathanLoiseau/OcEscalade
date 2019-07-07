
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<meta charset="UTF-8">
<title>DisplayUser</title>
</head>

<body>

<%@ include file="menu.jsp" %>



     <h2>données du compte</h2>
	    <table>
	        <tr>
	            <td>password :</td>
	            <td>${password}</td>
	        </tr>
	        
	        <tr>
	            <td>username :</td>
	            <td>${username}</td>
	        </tr>
	        
	        
	        
	    </table>
	    

</body>
</html>