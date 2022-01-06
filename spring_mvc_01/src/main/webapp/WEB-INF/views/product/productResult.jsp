<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품 등록 결과</title>
	</head>
	<body>
			<h3>상품 정보 등록 결과</h3>
			<table border="1">
				<tr><td>상품번호:</td><td> ${prdNo }</td></tr>
				<tr><td>상품명:</td><td> ${prdName }</td></tr>
				<tr><td>가	격:</td><td> ${prdPrice }</td></tr>
				<tr><td>제조회사:</td><td> ${prdMaker }</td></tr>
				<tr><td>제조일:</td><td> ${prdDate }</td></tr>
				<tr><td>재	고:</td><td> ${qtyNo }</td></tr>
			</table>
	</body>
</html>