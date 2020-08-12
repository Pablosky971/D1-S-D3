/*
 * AdministratorUserAccountListService.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.authenticated.challenges;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.challenges.Challenges;
import acme.entities.inquiries.Inquiries;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedChallengesListService implements AbstractListService<Authenticated, Challenges> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AuthenticatedChallengesRepository repository;


	

	@Override
	public boolean authorise(final Request<Challenges> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Challenges> request, final Challenges entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		

		request.unbind(entity, model, "title", "deadline", "description", "goal1", "reward1", "goal2", "reward2", "goal3", "reward3");

	}
	

	@Override
	public Collection<Challenges> findMany(final Request<Challenges> request) {
		assert request != null;

		Collection<Challenges> result;

		result = this.repository.findMany();
		
		return result;
	}

}
