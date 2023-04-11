<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><a href="/chapter06_SpringWebMaven/"><img src="../image/daram1.jpg" width="50" height="50"></a>회원가입</h3>
<form>
	<label>이름:</label>
		<p>
        <input type="text" name="name"><br>
        <label>아이디:</label>
        <input type="text" name="id"><br>
        </p>
        
        <p>
        <label>비밀번호:</label>
        <input type="password" name="password"><br>
        </p>
        
        <input type="submit" value="등록">
        <input type="reset" value="취소">
</form>
</body>
</html>