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

package acme.features.anonymous.calleBulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.calleBulletin.CalleBulletin;
import acme.entities.shout.Shout;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousCalleBulletinListService implements AbstractListService<Anonymous, CalleBulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousCalleBulletinRepository repository;


	// AbstractListService<Administrator, UserAccount> interface --------------

	@Override
	public boolean authorise(final Request<CalleBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<CalleBulletin> request, final CalleBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		

		request.unbind(entity, model, "title", "artist", "album");

	}
	

	@Override
	public Collection<CalleBulletin> findMany(final Request<CalleBulletin> request) {
		assert request != null;

		Collection<CalleBulletin> result;

		result = this.repository.findMany();
		
		return result;
	}

}
