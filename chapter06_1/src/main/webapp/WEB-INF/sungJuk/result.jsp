<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>*** ${name } 성적 ***</h3>
<h3>총점 : ${kor + eng + math}</h3>
<h3>평균 : ${(kor + eng + math) / 3.0 }</h3>
</body>
</html>