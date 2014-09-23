<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
String path = request.getContextPath();
int port = request.getServerPort();
String basePath ="";
if(port==80){
	basePath = request.getScheme()+"://"+request.getServerName()+path+"/";
}else{
   basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
}
%>
<c:set var="ctx" value="<%=basePath%>"/>
	 <script src="${ctx}resources/js/jquery.js"></script>
	 <script src="${ctx}resources/js/validate/jquery.validate.min.js"></script>
	 <script src="${ctx}resources/js/validate/messages_cn.js"></script>
    <script src="${ctx}resources/js/bootstrap-transition.js"></script>
    <script src="${ctx}resources/js/bootstrap-alert.js"></script>
    <script src="${ctx}resources/js/bootstrap-modal.js"></script>
    <script src="${ctx}resources/js/bootstrap-dropdown.js"></script>
    <script src="${ctx}resources/js/bootstrap-scrollspy.js"></script>
    <script src="${ctx}resources/js/bootstrap-tab.js"></script>
    <script src="${ctx}resources/js/bootstrap-tooltip.js"></script>
    <script src="${ctx}resources/js/bootstrap-popover.js"></script>
    <script src="${ctx}resources/js/bootstrap-button.js"></script>
    <script src="${ctx}resources/js/bootstrap-collapse.js"></script>
    <script src="${ctx}resources/js/bootstrap-carousel.js"></script>
    <script src="${ctx}resources/js/bootstrap-typeahead.js"></script>
    <script src="${ctx}resources/js/bootstrap-affix.js"></script>
    