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
	<acme:form-textbox code="authenticated.notice.form.label.picture" path="picture"/>
	<acme:form-textbox code="authenticated.notice.form.label.creation" path="creation"/>
	<acme:form-textbox code="authenticated.notice.form.label.deadline" path="deadline"/>
	<acme:form-textbox code="authenticated.notice.form.label.body" path="body"/>
	<acme:form-textbox code="authenticated.notice.form.label.optional1" path="optional1"/>
	<acme:form-textbox code="authenticated.notice.form.label.optional2" path="optional2"/>
	
<%-- 	<acme:form-submit code="authenticated.notice.form.button.create" action="/authenticated/notice/create"/> --%>
	<acme:form-return code="authenticated.notice.form.button.return"/>
</acme:form>
