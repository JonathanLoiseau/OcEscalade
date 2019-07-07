
<!DOCTYPE html>
<html>
    <head>
     <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    </head>
    <body>
    <%@ include file= "menu.jsp" %>
    
    <c:if test="${ log.equals(false) }" var = "notlog">Identifiant ou mot de passe incorrect<br/></c:if>
     <form:form method="POST"
          action="/escalade-webapp/displayUser" modelAttribute="Utilisateur">
             <table>
             
              <tr>
                    <td><form:label path="id">id</form:label></td>
                    <td><form:input path="id" placeholder ="ex1234"/></td>
                </tr>
                
                <tr>
                    <td><form:label path="password">password</form:label></td>
                    <td><form:input path="password" placeholder ="ex123456" /></td>
                </tr>
               
                
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    
    
        
    </body>
</html>