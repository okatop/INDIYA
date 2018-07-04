<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/frame/mpheader.jsp"%>
<section id="services" class="service-item">
	<script type="text/javascript">
		function MemberModify() {
			if (document.getElementById("id").value == "") {
				alert("아이디 입력!");
				return;
			} else if (document.getElementById("name").value == "") {
				alert("이름 입력!");
				return;
			} else if (document.getElementById("pass").value == "") {
				alert("비밀번호 입력!");
				return;
			} else if (document.getElementById("pass").value != document
					.getElementById("passcheck").value) {
				alert("비밀번호 확인!");
				return;
			} else {
				document.getElementById("act").value = "MemberModify";
				document.joinform.action = "${root}/user";
				document.joinform.submit();
			}
		}

		function goPopup() {
			var pop = window.open("/Mypage/jusoPopup.jsp", "pop",
					"width=570,height=420, scrollbars=yes, resizable=yes");
		}

		function jusoCallBack(zipNo, roadAddrPart1, addrDetail) {
			document.joinform.zipNo.value = zipNo;
			document.joinform.roadAddrPart1.value = roadAddrPart1;
			document.joinform.addrDetail.value = addrDetail;
		}

		function openidcheck() {
			document.getElementById("act").value = "idcheck";
			document.joinform.action = "${root}/user";
			document.joinform.submit();
		}
	</script>
	<!----------------------------------------------------------------------------------------------------------------------------------------->

	<div class="wrapper row3">
		<main class="hoc container clear">
		<h2>
			<b><font color="black">회원정보수정</font></b>
		</h2>
		<hr style="border-bottom: 2px solid #bbb">
		<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
		<hr>
		<!--------------------------------------------------------------------------------------------------------->
		<center>
			<form name="joinform" method="post" action="">
				<table class="table" width="600" height="700" cellspacing="4"
					cellpadding="5">
					<input type="hidden" name="act" id="act" value="idcheck">
					<input type="hidden" name="act" id="act" value="MemberModify">
					<tr>
						<td class="td2" width="120"><center>아이디(ID)</center></td>
						<td class="td4"><span style="float: left;"><input
								type="text" name="id" id="id" value="" size="12"></span> <span
							style="float: left;">&emsp;</span> <span style="float: left;">
								<a href="javascript:openidcheck()"><input type="button"
									value="중복확인"></a>
						</span> <span style="clear: left;" id="idresult" =span></span></td>
					</tr>
					<tr>
						<td class="td1"><center>비밀번호</center></td>
						<td class="td3"><input type="password" name="pass" id="pass"
							size="12" maxlength="12">&nbsp;&nbsp;<font
							color="#3cb371">6~12</font>자리의 영문(대소문자 구별)이나 숫자</td>
					</tr>

					<tr>
						<td class="td2"><center>비밀번호확인</center></td>
						<td class="td4"><input type="password" name="passcheck"
							id="passcheck" size="12" maxlength="12"></td>
					</tr>

					<tr>
						<td width="120" class="td1"><center>
								비밀번호 재발급<br>질문 선택
							</center></td>
						<td class="td3"><select name="question">
								<option value="">가장 좋아하는 색상은?(예: 빨강)</option>
								<option value="">어릴 적 단짝 친구의 이름은?</option>
								<option value="">가장 좋아하는 음식은?</option>
								<option value="">가장 여행하고 싶은 나라는?</option>
								<option value="">기억에 남는 추억의 장소는?</option>
								<option value="">가장 좋아하는 연예인은?</option>
								<option value="">친구들에게 공개하지 않은 어릴 적 별명이 있다면?</option>
						</select></td>
					</tr>

					<tr>
						<td width="120" class="td2"><center>
								비밀번호 재발급<br>답변 입력
							</center></td>
						<td class="td4"><input type="text" name="answer" size="35"></td>
					</tr>
					<tr>
						<td class="td1"><center>이름</center></td>
						<td class="td3"><input type="text" name="name" id="name"
							value="" size="12"></td>
					</tr>

					<tr>
						<td class="td2"><center>성별</center></td>
						<td class="td4 inline">
							<li style="list-style-type: none;"><input type="radio"
								name="gender" value="남" checked="checked"
								style="display: inline;">남자</li>
							<li style="list-style-type: none;"><input type="radio"
								name="gender" value="여" checked="checked"
								style="display: inline;">여자</li>
						</td>
					</tr>
					<tr id="callBackDiv">
						<td class="td2"><center>우편번호</center></td>
						<td class="td4"><span style="float: left;"><input
								type="text" name="zipNo" id="zipNo" value="" size="12"></span>
							<span style="float: left;">&emsp;</span> <span
							style="float: left;"><input type="button" value="우편번호검색"
								onclick="javascript:goPopup();"></span></td>
					</tr>
					<tr id="callBackDiv">
						<td class="td1"><center>주소</center></td>
						<td class="td3"><input type="text" name="roadAddrPart1"
							id="roadAddrPart1" value="" size="100" readonly="readonly"></td>
					</tr>

					<tr id="callBackDiv">
						<td class="td2"><center>상세주소</center></td>
						<td class="td4"><input type="text" name="addrDetail"
							id="addrDetail" size="100" readonly="readonly"></td>
					</tr>

					<tr>
						<td class="td1"><center>이메일</center></td>
						<td class="td3"><span style="float: left;"><input
								type="text" name="email1" value="" size="12"></span> <span
							style="float: left;">&nbsp;</span> <span style="float: left;">@</span>
							<span style="float: left;">&nbsp;</span> <!--<input type="text" name="direct" value="" size=12>-->
							<span style="float: left;"><select name="email2"></span>
							<!--<option value="naver.com">직접입력</option>-->
							<option value="naver.com">naver.com</option>
							<option value="hanmail.net">hanmail.net</option> </select></td>
					</tr>
					<tr>
						<td class="td1"><center>휴대폰번호</center></td>
						<td class="td3"><span style="float: left;"><select
								name="tel1">
									<option value="">----</option>
									<option value="010">010</option>
									<option value="010">011</option>
									<option value="010">016</option>
									<option value="010">017</option>
									<option value="010">018</option>
							</select></span> <span style="float: left;"> - </span> <span style="float: left;">&nbsp;</span>
							<span style="float: left;"><input type="text" name="tel2"
								value="" size="4" maxlength="4"></span> <span
							style="float: left;">&nbsp;</span> <span style="float: left;">
								- </span> <span style="float: left;">&nbsp;</span> <span
							style="float: left;"><input type="text" name="tel3"
								value="" size="4" maxlength="4"></span> <span
							style="float: left;">&nbsp;</span>
					</tr>
					
				</table>

				<center>
					<span style="float: right;"><input type="reset" value="취소"></span>
					<span style="float: right;">&emsp;</span> <span
						style="float: right;">&emsp;</span> <span style="float: right;">
						<input type="button" value="회원정보수정"
						onclick="javascript:MemberModify();">
					</span>
				</center>
			</form>
		</center>
		</main>
	</div>
	<!----------------------------------------------------------------------------------------------------------------------------------------->
</section>
<!--/#services-->
<%@ include file="/frame/mpfooter.jsp"%>