<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.niit.model.Category"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="cp" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <script src="js/bootstrap.min.js"></script>
<div class="table-responsive">
    <table class="table">
      <thead>
        <tr>
          <th>Category ID</th>
          <th>Category Name</th>
          <th>SubCategory Name</th>
          
        </tr>
      </thead>
      <tbody>
      <c:forEach items="${P}" var="da">
       <tr>
       <td>${da.CatID}</td>
       <td>${da.SubCat}</td>
       </tr>
       
       </c:forEach> -
       
      </tbody>
    </table>
  </div>
</body>
</html>