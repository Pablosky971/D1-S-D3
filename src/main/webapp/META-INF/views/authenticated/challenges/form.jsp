<%--
- form.jsp
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

<acme:form>
	<acme:form-textbox code="authenticated.challenges.form.label.title" path="title"/>
	<acme:form-moment code="authenticated.challenges.form.label.deadline" path="deadline"/>
	<acme:form-textarea code="authenticated.challenges.form.label.description" path="description" />
	<acme:form-textbox code="authenticated.challenges.form.label.goal1" path="goal1" />
	<acme:form-textbox code="authenticated.challenges.form.label.reward1" path="reward1" />
	<acme:form-textbox code="authenticated.challenges.form.label.goal2" path="goal2"/>
	<acme:form-textbox code="authenticated.challenges.form.label.reward2" path="reward2"/>
	<acme:form-textbox code="authenticated.challenges.form.label.goal3" path="goal3"/>
	<acme:form-textbox code="authenticated.challenges.form.label.reward3" path="reward3"/>
	

	<acme:form-submit test="${command == 'show'}" code="authenticated.challenges.form.button.update" action="/authenticated/challenges/update"/>
    <acme:form-submit test="${command == 'show'}" code="authenticated.challenges.form.button.delete" action="/authenticated/challenges/delete"/>
    <acme:form-submit test="${command == 'create'}" code="authenticated.challenges.form.button.create" action="/authenticated/challenges/create"/>
    <acme:form-submit test="${command == 'update'}" code="authenticated.challenges.form.button.update" action="/authenticated/challenges/update"/>
    <acme:form-submit test="${command == 'delete'}" code="authenticated.challenges.form.button.delete" action="/authenticated/challenges/delete"/>
	<acme:form-return code="authenticated.challenges.form.button.return"/>
</acme:form>
