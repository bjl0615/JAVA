<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="calc3" method="post">
		<div>
			<label>?Է? : </label>
			<input type = "text" name="v" />
		</div>
		<div>
			<input type="submit" name = "operator" value="+" />
			<input type="submit" name = "operator" value="-" />
			<input type="submit" name = "operator" value="=" />
		</div>
		<div>
			???? : 0
		</div>
	</form>
</body>
</html>