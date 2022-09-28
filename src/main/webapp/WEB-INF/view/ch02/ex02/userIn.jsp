<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8' %>
<form action='userOut' method='post'>
	<label>이름: <input type='text' name='userName'/></label>
	<label>나이: <input type='number' name='age'/></label>
	<label>등록일: <input type='date' name='regDate'/></label>
	<input type='submit'/>
</form>



<%-- sevelet에 작성하는 url은 핸들러의 url이라고 인식해야한다. --%>