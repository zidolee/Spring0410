<%-- <%@page import="java.util.List"%>
<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		a:link {
			text-decoration: none;
			color: black;		
		}
	</style>
</head>
<body>
	<%
		// 세션에 저장된 글 목록을 꺼냄
//		List<BoardVO> boardList = (List)session.getAttribute("boardList");
		/* BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo); */
	%>
	
	<div align="center">
		<h1>글 목록</h1>
		<h3>${userName }님! 환영합니다..<a href="logout.do">Log-out</a></h3>
		
		<form action="getBoardList.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right">
						<select name="searchCondition">
							<c:forEach var="option" items="${conditionMap}">
								<option value="${option.value }">${option.key}
							</c:forEach>
						</select>
						<input name="searchKeyword" type="text">
						<input type="submit" value="검색">
					</td>
				</tr>
			</table>
		</form>
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="orange" width="100">번호</th>
				<th bgcolor="orange" width="200">제목</th>
				<th bgcolor="orange" width="150">작성자</th>
				<th bgcolor="orange" width="150">등록일</th>
				<th bgcolor="orange" width="100">조회수</th>
			<tr>
		<%-- <% for(BoardVO board : boardList){ %> --%>
		<c:forEach items="${boardList }" var="board">
			<tr>
				<td align="center">${board.seq }</td>
				<td align="left">&nbsp;<a href="getBoard.do?seq=${board.seq }">${board.title }</a></td>
				<td align="center">${board.writer }</td>
				<td align="center">${board.regDate }</td>
				<td align="center">${board.cnt }</td>
			</tr>
		</c:forEach>
		<%-- <%} %>	 --%>
		</table>
		<br>
		<a href="insertBoard.jsp">새글 등록</a>
	</div>
</body>
</html>