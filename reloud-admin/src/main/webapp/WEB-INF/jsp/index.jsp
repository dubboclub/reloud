<%--
  Created by IntelliJ IDEA.
  User: bieber
  Date: 2016/2/24
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="reloud">
<head>
    <title>Reloud(Redis集群管理平台)</title>
</head>
<%@include file="style.jsp"%>
<body>
<header-tpl></header-tpl>

<div class="container-fluid " ng-controller="reloudCtrl">
    <div class="row">
        <div class="col-md-12 col-lg-12 col-xs-12 app-container">
            <div class="row">
                <div class="col-md-12 col-lg-12 col-xs-12" ng-view>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<%@include file="script.jsp"%>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/app/fragments/header.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>

</html>
