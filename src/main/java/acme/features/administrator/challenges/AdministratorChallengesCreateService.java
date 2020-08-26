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

package acme.features.administrator.challenges;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.challenges.Challenges;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractCreateService;

@Service
public class AdministratorChallengesCreateService implements AbstractCreateService<Administrator, Challenges> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AdministratorChallengesRepository repository;


	@Override
	public boolean authorise(final Request<Challenges> request) {
		assert request != null;

		return true;
	}

	@Override
	public void bind(final Request<Challenges> request, final Challenges entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Challenges> request, final Challenges entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "deadline", "description", "goal1", "reward1", "goal2", "reward2", "goal3", "reward3");


		
	}

	@Override
	public Challenges instantiate(final Request<Challenges> request) {
		assert request != null;

		Challenges result;
		Date moment;
		
		moment = new Date(System.currentTimeMillis() - 1);
		

		result = new Challenges();
		
		

		return result;
	}

	@Override
	public void validate(final Request<Challenges> request, final Challenges entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

		

	@Override
	public void create(final Request<Challenges> request, final Challenges entity) {
		assert request != null;
		assert entity != null;

	
		this.repository.save(entity);
		
	}

}
