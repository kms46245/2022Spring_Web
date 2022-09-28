<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8' %>
<form method='post'>	<%--결국은 같은 user에서 사용하므로 action값을 주지않아도된다. --%>
	<label>이름: <input type='text' name='userName'/></label>
	<label>나이: <input type='number' name='age'/></label>
	<label>등록일: <input type='date' name='regDate'/></label>
	<input type='submit'/>
</form>
