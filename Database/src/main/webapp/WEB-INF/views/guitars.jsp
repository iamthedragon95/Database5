<%@ include file="/WEB-INF/views/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="Stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css"/>">
<link rel="Stylesheet" href="<c:url value="/resources/css/custom.css"/>">
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
<script src="<c:url value="/resources/js/main.js" />"></script>
<spring:url value="/resources/css/main.css" var="mainCss" />
<spring:url value="/resources/js/jquery.1.10.2.min.js" var="jqueryJs" />
<spring:url value="/resources/js/main.js" var="mainJs" />
<script src="<c:url value="/resources/js/respond.js"/>"></script>

<title>carousel</title>
</head>
<body>
<%@ include file="/WEB-INF/views/navi.jsp"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-4">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">
						Acoustic Guitars
					</h3>
				</div>
				<div class="panel-body">
					<a href=guitars><img src="<c:url value="resources/images/gu1-1.jpg"/>"   style="width:100%" alt="Image" ></a>
				</div>
				<div class="panel-footer">
					Panel footer
				</div>
			</div> 
			
		</div>	
		<div class="col-md-4">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">
						Bass Guitars
					</h3>
				</div>
				<div class="panel-body">
			<a href=guitars><img src="<c:url value="resources/images/gu1-2.jpg"/>"   style="width:100%" alt="Image" ></a>
					
				</div>
				<div class="panel-footer">
					Panel footer
				</div>
			</div> 
			
		</div>
		<div class="col-md-4">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">
						Electric Guitars
					</h3>
				</div>
				<div class="panel-body">
		<a href=guitars><img src="<c:url value="resources/images/gu1-3.jpg"/>"   style="width:100%" alt="Image" ></a>
					
				</div>
				<div class="panel-footer">
					Panel footer
				</div>
			</div> 
			
		</div>
	</div>
</div>
<br>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-4">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">
						Classical Guitars
					</h3>
				</div>
				<div class="panel-body">
					<a href=guitars><img src="<c:url value="resources/images/gu2-1.jpg"/>"   style="width:100%" alt="Image" ></a>
				</div>
				<div class="panel-footer">
					Panel footer
				</div>
			</div> 
			
		</div>
		<div class="col-md-4">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">
						Electro-Acoustic Guitars
					</h3>
				</div>
				<div class="panel-body">
			<a href=guitars><img src="<c:url value="resources/images/gu1-2.jpg"/>"   style="width:100%" alt="Image" ></a>
					
				</div>
				<div class="panel-footer">
					Panel footer
				</div>
			</div> 
			
		</div>
		<div class="col-md-4">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">
						Premium Products
					</h3>
				</div>
				<div class="panel-body">
		<a href=guitars><img src="<c:url value="resources/images/gu1-3.jpg"/>"   style="width:100%" alt="Image" ></a>
					
				</div>
				<div class="panel-footer">
					Panel footer
				</div>
			</div> 
			
		</div>
	</div>
</div>
<br>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-4">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">
						Acoustic Guitars
					</h3>
				</div>
				<div class="panel-body">
					<a href=guitars><img src="<c:url value="resources/images/gu1-1.jpg"/>"   style="width:100%" alt="Image" ></a>
				</div>
				<div class="panel-footer">
					Panel footer
				</div>
			</div> 
			
		</div>
		<div class="col-md-4">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">
						Bass Guitars
					</h3>
				</div>
				<div class="panel-body">
			<a href=guitars><img src="<c:url value="resources/images/gu1-2.jpg"/>"   style="width:100%" alt="Image" ></a>
					
				</div>
				<div class="panel-footer">
					Panel footer
				</div>
			</div> 
			
		</div>
		<div class="col-md-4">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">
						Electric Guitars
					</h3>
				</div>
				<div class="panel-body">
		<a href=guitars><img src="<c:url value="resources/images/gu1-3.jpg"/>"   style="width:100%" alt="Image" ></a>
					
				</div>
				<div class="panel-footer">
					Panel footer
				</div>
			</div> 
			
		</div>
	</div>
</div>
<br>

<%@ include file="/WEB-INF/views/footer.jsp"%>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>