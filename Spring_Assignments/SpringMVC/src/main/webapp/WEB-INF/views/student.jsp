<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<h2>Form Handling with Spring MVC!</h2>

<form:form action="processForm" modelAttribute="marks">	
		
 <table>
 <tr>
 <td> Science Marks</td>
 <td>  <form:input path="science_marks" /></td>
 </tr>
 <tr>
 <td> Maths Marks </td>
 <td>  <form:input path="maths_marks" /></td>
 </tr>
 <tr>
 <td> English Marks </td>
 <td>  <form:input path="english_marks" /></td>
 </tr></table>
 
 <input type="submit" value="Submit" />
</form:form>
</body>
</html>
