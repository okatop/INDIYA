<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function idcheck(){
	if(document.getElementById("id").value == "") {
		alert("검색 아이디 입력!");
		return;
	} else {
		document.getElementById("act").value ="idsearch";
		document.idform.action = "${root}/user";
		document.idform.submit();
	}
}

function iduse(id){

}
</script>
</head>
<body>
<center>
<form name="idform" method="get" action="" onsubmit="return false;">
<input type="hidden" name="act" value="idsearch">
<h3>아이디 중복 검사</h3>
<table width="350">
<tr>
	<td class="td3">검색할 아이디를 입력하세요</td>
</tr>
<tr>
	<td class="td4" style="text-align: center">
	<input type="text" name="id" id="id" onkeypress="javascript:if(event.keyCode == 13){ idcheck(); }">
	<input type="hidden" name="act" id="act" value="idsearch">
	<input type="button" value="검색" onclick="javascript:idcheck();">
	</td>
</tr>
<tr>
	<td class="td4">
	검색할 아이디를 정확히 입력한 후 검색 버튼을 클릭하세요..
	</td>
</tr>
</table>
</form>
</center>
</body>
</html>