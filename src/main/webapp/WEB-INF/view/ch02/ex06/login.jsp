<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8' %>
<form method='post'>
	ID: <input type='text' name='userId' value='${user.userId}'/>
	PW: <input type='password' name='pw'/>
	<input type='checkbox' name='rememberMe'/>아이디 저장
	<input type='submit' value='로그인'/>
</form>