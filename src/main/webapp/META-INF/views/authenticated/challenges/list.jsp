
<%--
- list.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="authenticated.challenges.list.label.title" path="title" width="10%"/>
	<acme:list-column code="authenticated.challenges.list.label.deadline" path="deadline" width="10%"/>
	<acme:list-column code="authenticated.challenges.list.label.description" path="description" width="10%"/>
	<acme:list-column code="authenticated.challenges.list.label.goal1" path="goal1" width="10%"/>	
	<acme:list-column code="authenticated.challenges.list.label.reward1" path="reward1" width="10%"/>	
	<acme:list-column code="authenticated.challenges.list.label.goal2" path="goal2" width="10%"/>
	<acme:list-column code="authenticated.challenges.list.label.reward2" path="reward2" width="10%"/>
	<acme:list-column code="authenticated.challenges.list.label.goal3" path="goal3" width="10%"/>
	<acme:list-column code="authenticated.challenges.list.label.reward3" path="reward3" width="10%"/>
	
</acme:list>


