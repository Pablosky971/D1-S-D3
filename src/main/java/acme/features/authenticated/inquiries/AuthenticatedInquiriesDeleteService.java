/*
 * AnonymousUserAccountCreateService.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.authenticated.inquiries;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.inquiries.Inquiries;
import acme.entities.technologyRecords.TechnologyRecords;
import acme.features.anonymous.technologyRecords.AnonymousTechnologyRecordsRepository;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractDeleteService;

@Service
public class AuthenticatedInquiriesDeleteService implements AbstractDeleteService<Authenticated, Inquiries> {

	// Internal state ---------------------------------------------------------

	@Autowired
	 AuthenticatedInquiriesRepository repository;


	@Override
	public boolean authorise(final Request<Inquiries> request) {
		assert request != null;

		return true;
	}

	@Override
	public void bind(final Request<Inquiries> request, final Inquiries entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Inquiries> request, final Inquiries entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "deadline", "description", "minMoney", "maxMoney", "email");

		
	}

	@Override
	public Inquiries findOne(final Request<Inquiries> request) {
		assert request != null;

		Inquiries result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOne(id);

		return result;
	}

	@Override
	public void validate(final Request<Inquiries> request, final Inquiries entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

		

	@Override
	public void delete(final Request<Inquiries> request, final Inquiries entity) {
		assert request != null;
		assert entity != null;

		
		this.repository.delete(entity);
		
	}

}
