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
	<acme:form-textbox code="administrator.notice.form.label.picture" path="picture"/>
	<jstl:if test="${command !='create'}">
	<acme:form-textbox code="administrator.notice.form.label.creation" path="creation"/>
	</jstl:if>
	<acme:form-textbox code="administrator.notice.form.label.deadline" path="deadline"/>
	<acme:form-textbox code="administrator.notice.form.label.body" path="body"/>
	<acme:form-textbox code="administrator.notice.form.label.optional1" path="optional1"/>
	<acme:form-textbox code="administrator.notice.form.label.optional2" path="optional2"/>
	
	<jstl:if test="${command == 'create' }">
	<acme:form-checkbox code="authenticated.offer.label.accept" path="accept"/>
	</jstl:if>
	
	<jstl:if test="${command == 'create' }">
	<acme:form-submit code="administrator.notice.form.button.create" action="/administrator/notice/create"/>
	</jstl:if>
	<acme:form-return code="administrator.notice.form.button.return"/>
</acme:form>
