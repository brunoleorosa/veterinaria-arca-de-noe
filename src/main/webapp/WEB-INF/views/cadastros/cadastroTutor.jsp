<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Tutor</title>

<spring:url value="/cadastros/cadastroTutor" var="cadastroTutor"></spring:url>

<link href="/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<jsp:include page="../comum/Navbar.jsp"></jsp:include>
<form>
	<div class="container">
		<h2 align="center">Cadastrar Tutor</h2>
		<form:form modelAtributte="cadastros" action="${cadastroTutor}">
			<div class="form-row">
			  <div class="form-group col-md-6">
			    <label for="nome">Nome</label>
			    <input type="text" class="form-control" id="nome">
			  </div>
			  <div class="form-group col-md-6">
			    <label for="sobrenome">Sobrenome</label>
			    <input type="text" class="form-control" id="sobrenome">
			  </div>
			</div>
			
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="cpf">CPF</label>
					<input type="text" class="form-control" id="cpf">  	
				</div>
				<div class="form-group col-md-6">
					<label for="email">Email</label>
					<input type="email" class="form-control" id="email">
				</div>
			</div>
			<div class="form-row">
			 <div class="form-group col-md-10">
			   <label for="endereco">Endereço</label>
			   <input type="text" class="form-control" id="endereco">
			 </div>
			 <div class="form-group col-md-2">
			     <label for="cep">CEP</label>
			     <input type="text" class="form-control" id="cep">
			 </div>
			</div>
			
			<div class="form-row">
			
			  <div class="form-group col-md-4">
			    <label for="paises">País</label>
			    <input type="hidden" name="id" id="id" value="${tutor.endereco.pais.id}">
			    
			    <select class="form-control" id="paises">			    
			    	<option selected>Escolha o país</option>
			    	<c:forEach var="pais" items="${paises}">
			    		<option value="${pais.id}">${pais.pais}</option>
			    	</c:forEach>
			    </select>
			  </div>
			  
			  <div class="form-group col-md-4">
			    <label for="estados">Estado</label>
			    <input type="hidden" name="id" id="id" value="${tutor.endereco.pais.estado.id}">
			    
			    <select class="form-control" id="estados">
			    	<option selected>Escolha o estado</option>
			    	<c:forEach var="estado" items="${estados}">
			    		<option value="${estado.id}">${estado.estado}</option>
			    	</c:forEach>
			    </select>
			  </div>
			  
			  <div class="form-group col-md-4">
			    <label for="cidade">Cidade</label>
			    <input type="text" class="form-control" id="cidade">
			  </div>
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
			</form:form>
		</div>
</form>
		
<script type="text/javascript" src="/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
</body>
</html>