<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Pass huu:  ${passwordHuu}
Addr Tuan: ${address_Tuan }
<br />
<%String password = (String)request.getAttribute("passwordVu"); %>
<%= password%>

<jsp:useBean id="stu" class="com.dxc.bean.StudentBean">
	<jsp:setProperty property="fullName" name="stu" value="lyquyduong"/>
</jsp:useBean>

${stu.fullName }
<c:if test="${username != ''}">
      <p>Welcome to ${username} </p>
 </c:if>
 
 <hr/>
 <%
 	List<String> listPos = (List<String>) request.getAttribute("pos");
 
 	for(String str : listPos){
 		out.print("<br/>"+str);
 		
 	}
 
 %>
 <br/><br/><br/><br/>
 
 <c:forEach var = "i" begin = "1" end = "5">
         <strong> <c:out value = "${i}"/><p></strong>
 </c:forEach>
 
 <hr />
 
 ${requestScope}
</body>
</html>