<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/frame/mpheader.jsp"%>
<script>
function mchange() {
		if(document.getElementById("name").value == "") {
			alert("이름 입력!");
			return;
		} else if(document.getElementById("genre").value == "") {
			alert("장르 입력!");
			return;
		} else if(document.getElementById("area").value  == "") {
			alert("활동지역 입력!");
			return;
		} else {
			document.getElementById("act").value = "mchange";
			document.joinform.action = "${root}/user";
			document.joinform.submit();
	}
}

</script>
<body>
	<section id="services" class="service-item">

		<!-- - 여기서 작업 -->
		<main class="hoc container clear"> <!-- main body --> <!-- ################################################################################################ -->
		<div class="sidebar one_quarter first">
			<!-- ################################################################################################ -->
			<h6>Lorem ipsum dolor</h6>
			<nav class="sdb_holder">
				<!-- 왼쪽 메뉴 -->
				<ul>
					<li><a href="mypagemodify.jsp">정보수정</a></li>
					<li><a href="mypageschedule.jsp">일정관리</a></li>
					<li><a href="mypage.jsp">찜목록</a></li>
					<li><a href="mypage">결제내역확인</a></li>
					<li><a href="survey.html">펀딩목록확인</a></li>
					<li><a href="Q&A.html">뮤지션 전환</a></li>
					<br>
					<br>
					<li><a href="performanceregister.jsp">공연등록</a></li>
					<li><a href="banner">공연일정관리</a></li>
					<li><a href="banner">홈피수정</a></li>
				</ul>
			</nav>
			<div class="sdb_holder">
				<!-- 왼쪽 사이드바 바로밑 내용 
				<h6>Lorem ipsum dolor</h6>
				<address>
					Full Name<br> Address Line 1<br> Address Line 2<br>
					Town/City<br> Postcode/Zip<br> <br> Tel: xxxx xxxx
					xxxxxx<br> Email: <a href="#">contact@domain.com</a>
				</address>-->
			</div>
			<div class="sdb_holder">
				<!-- 왼쪽 사이드바 바로밑밑 내용 -->
			</div>
			<!-- ################################################################################################ -->
		</div>
		<!-- ################################################################################################ -->
		<!-- ################################################################################################ -->
		<div class="content three_quarter">
			<!-- 메인 내용################################################## -->

			<h1
				style="font-family: Nanum Gothic; font-size: 2.5em; font-weight: bold">뮤지션
				전환</h1>
			<hr>
			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<div class="thumbnail">
							<div class="caption" style="height: 200px;">이미지 등록</div>
							<img src="../images/demo/backgrounds/01.png" alt="">
							<form action="uploadAction.jsp" method="post"
								enctype="multipart/form-data">
								<input type="file" name="file"><br>
								 <input type="submit" value="업로드"><br>
							</form>
						</div>
					</div>
<input type="hidden" name="act" id="mchange">
					<div class="col-md-9">

						<form action="#" method="post">
							<div class="one_third">
								<div class="input-group">
									<span class="input-group-addon" id="">뮤&nbsp;지&nbsp;션&nbsp;이&nbsp;름
										:</span> <input class="form-control input-sm" type="text" id="name"
										name="name">
								</div>
								<br>
								<div class="input-group">
									<span class="input-group-addon" id="">&nbsp;&nbsp;&nbsp;장&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;르&nbsp;&nbsp;&nbsp;&nbsp;
										:</span> <input class="form-control input-sm" type="text" id="genre"
										name="genre">
								</div>
								<br>
								<div class="input-group">
									<span class="input-group-addon" id="">활&nbsp;&nbsp;동&nbsp;&nbsp;&nbsp;&nbsp;지&nbsp;&nbsp;역
										:</span><input class="form-control input-sm" type="text" id="area"
										name="area">
									<!-- 금액  -->
								</div>
								<br><br><br>

								<div class="form-group">
									<label for="comment">뮤지션 소개</label>
									<hr>
									<textarea class="form-control" rows="5" id="comment"></textarea>
								</div>
								<br>
							</div>
							<div class="one_third first">
								<!-- 위치지정 용 -->
								<div>&nbsp;</div>
							</div>
						</form>					
					</div>
					<br><br><br>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" class="btn btn-default btn-lg" value="전환하기" onclick="javascript:mchange();">
				</div>
			</div>
		</div>
	
		</main>
		<!-- ################################################################################################ -->


		<!-- ################################################################################################ -->
		<!-- / main body -->
		<div class="clear"></div>
	</section>
	<!--/#services-->
	<%@include file="/frame/mpfooter.jsp"%>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->