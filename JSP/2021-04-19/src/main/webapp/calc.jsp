<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="calc" method="post">
		<div>
			<label>x : </label>
			<input type = "text" name="x" />
		</div>
		<div>
			<label>y : </label>
			<input type = "text" name="y">
		</div>
		<div>
			<input type="submit" name = "operator" value="����" />
			<input type="submit" name = "operator" value="����" />
		</div>
		<div>
			��� : 0
		</div>
	</form>
</body>
</html>