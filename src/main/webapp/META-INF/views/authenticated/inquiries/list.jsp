
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
	<acme:list-column code="authenticated.inquiries.list.label.title" path="title" width="15%"/>
	<acme:list-column code="authenticated.inquiries.list.label.dateOfCreation" path="dateOfCreation" width="15%"/>
	<acme:list-column code="authenticated.inquiries.list.label.deadline" path="deadline" width="15%"/>
	<acme:list-column code="authenticated.inquiries.list.label.description" path="description" width="15%"/>	
	<acme:list-column code="authenticated.inquiries.list.label.minMoney" path="minMoney" width="15%"/>	
	<acme:list-column code="authenticated.inquiries.list.label.maxMoney" path="maxMoney" width="15%"/>
	<acme:list-column code="authenticated.inquiries.list.label.email" path="email" width="15%"/>
</acme:list>


