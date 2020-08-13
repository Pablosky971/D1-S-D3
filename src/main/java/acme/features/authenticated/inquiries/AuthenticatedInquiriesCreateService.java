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

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.inquiries.Inquiries;
import acme.entities.shout.Shout;
import acme.features.anonymous.shout.AnonymousShoutRepository;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractCreateService;

@Service
public class AuthenticatedInquiriesCreateService implements AbstractCreateService<Authenticated, Inquiries> {

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
	public Inquiries instantiate(final Request<Inquiries> request) {
		assert request != null;

		Inquiries result;
		Date moment;
		
		moment = new Date(System.currentTimeMillis() - 1);
		

		result = new Inquiries();
		
		

		return result;
	}

	@Override
	public void validate(final Request<Inquiries> request, final Inquiries entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

		

	@Override
	public void create(final Request<Inquiries> request, final Inquiries entity) {
		assert request != null;
		assert entity != null;

		Date moment;
		
		moment = new Date(System.currentTimeMillis() - 1);
		entity.setDateOfCreation(moment);
		this.repository.save(entity);
		
	}

}
