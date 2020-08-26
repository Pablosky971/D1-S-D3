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

package acme.features.administrator.inquiries;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.inquiries.Inquiries;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractUpdateService;

@Service
public class AdministratorInquiriesUpdateService implements AbstractUpdateService<Administrator, Inquiries> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AdministratorInquiriesRepository repository;


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

		request.bind(entity, errors, "createOfCreation");
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

		boolean  isCurrencyMinEuro, isCurrencyEuroMaxEuro, isMinMax;
		
		// Comprobamos las divisas:
		
				if (!errors.hasErrors("minMoney")) { 
					String currencyMin = entity.getMinMoney().getCurrency();
					isCurrencyMinEuro = currencyMin.equals("€") || currencyMin.equals("EUR");
					errors.state(request, isCurrencyMinEuro, "minMoney", "administrator.inquiries.error.min-euro-currency");
				}

				if (!errors.hasErrors("maxMoney")) {
					String currencyMax = entity.getMaxMoney().getCurrency();
					isCurrencyEuroMaxEuro = currencyMax.equals("€") || currencyMax.equals("EUR");
					errors.state(request, isCurrencyEuroMaxEuro, "maxMoney", "administrator.inquiries.error.max-euro-currency");
				}

				// El máximo del intervalo del dinero debe ser mayor que el mínimo:
				if (!errors.hasErrors("maxMoney") && !errors.hasErrors("minMoney")) {
					Double minAmount = entity.getMinMoney().getAmount();
					Double maxAmount = entity.getMaxMoney().getAmount();
					isMinMax = minAmount < maxAmount;
					errors.state(request, isMinMax, "maxMoney", "administrator.inquiries.error.not-max");
	}
	}
		

	@Override
	public void update(final Request<Inquiries> request, final Inquiries entity) {
		assert request != null;
		assert entity != null;

		
		this.repository.save(entity);
		
	}

}
