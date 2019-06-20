
<!DOCTYPE html>
<html>
    <head>
     <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    </head>
    <body>
    <%@ include file= "menu.jsp" %>
        <h2>Saissisez vos identifiants</h2>
        <form:form method="POST"
          action="/escalade-webapp/displayUser" modelAttribute="Utilisateur">
             <table>
             
              <tr>
                    <td><form:label path="username">username</form:label></td>
                    <td><form:input path="username"/></td>
                </tr>
                
                <tr>
                    <td><form:label path="password">password</form:label></td>
                    <td><form:input path="password"/></td>
                </tr>
               
                
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>