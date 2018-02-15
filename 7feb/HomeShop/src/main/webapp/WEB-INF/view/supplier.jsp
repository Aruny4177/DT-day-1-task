<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		<link rel="stylesheet" href="style.css">
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier</title>
</head>
<body>

<%@include file="Header.jsp" %>
	<div class="container">
			<div class="row main">
				<div class="main-login main-center">
				<h1>SUPPLIER</h1>
					<form:form modelAttribute="sup" class="" method="post" action="AddSup">
						
						
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Supplier Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<form:input path="SupName" type="text" class="form-control" name="supname" id="name"  placeholder="Enter your Supplier Name"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Supplier City</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-inr" aria-hidden="true"></i></span>
									<form:input path="SupCity" type="text" class="form-control" name="supcty" id="email"  placeholder="Enter your Supplier City"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="username" class="cols-sm-2 control-label">Supplier Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
									<form:input path="SupEmail" type="text" class="form-control" name="supem" id="username"  placeholder="Enter your Supplier Email"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Supplier Pin</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<form:input path="SupPin" type="text" class="form-control" name="supin" id="password"  placeholder="Enter your Supplier Piin"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Supplier Mobile</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<form:input path="SupMob" type="text" class="form-control" name="supmob" id="password"  placeholder="Enter your Supplier Mobile"/>
								</div>
							</div>
						</div>
						
						<div class="form-group ">
							<input target="_blank" type="submit" id="button" value="Product Add" class="btn btn-primary btn-lg btn-block login-button"></a>
						</div>
						
					</form:form>
				</div>
			</div>
		</div>

		 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
<div class="table-responsive">
    <table class="table">
      <thead>
        <tr>
          <th>Supplier ID</th>
          <th>Supplier Name</th>
          <th>Supplier City</th>
          <th>Supplier Qty</th>
          <th>Supplier Email</th>
          <th>Supplier Pin</th>
          <th>Supplier Mobile</th>
        </tr>
      </thead>
      <tbody>
       
      </tbody>
    </table>
  </div>
</div>
</body>
</html>