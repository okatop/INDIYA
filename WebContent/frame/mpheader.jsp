<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" import="com.indiya.member.model.MemberDto, javax.servlet.http.HttpSession"%>
<%@include file = "/frame/public.jsp"%>
<!DOCTYPE html>
<html>
<link href="${root}/layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<div class="bgded overlay" style="background-image:url(${root}/images/demo/backgrounds/maintitle.png);"> 

  <div class="wrapper row1"> 
    <header id="header" class="hoc clear"> 
 
      <div id="logo" class="fl_left">
         <h1 class="heading"><a href="/Mainpage/main.jsp">INDIYA</a></h1>
      </div>      
      
      <nav id="mainav" class="fl_right">
        <ul class="clear">
			 <li><a href="/Mainpage/recruit.jsp">recruit</a></li>
			 <li><a href="/Mainpage/community.jsp">community</a>
              <li><a href="/Mainpage/stage.jsp">stage</a></li>
              <li><a href="/Mainpage/fundinglist_n_u.jsp">funding</a></li>
              <li><a href="/Mainpage/QNA.jsp">Q&A</a></li>
              <%
      		  MemberDto memberDto = (MemberDto) session.getAttribute("userInfo");
           	  System.out.println("memberDto : "+memberDto);
              if(memberDto == null) {    
              %>
              <li><a href="/Mainpage/loginpage.jsp">LOGIN</a></li>
              <%
              } else {
              %>
              <li><a href="/Mainpage/loginpage.jsp">LOGOUT</a></li>
              <%
              }
              %>
        </ul>
      </nav>
    </header>
  </div>
  </div>